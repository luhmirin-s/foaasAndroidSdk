package lv.luhmirins.fooassclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.foass.model.Field
import com.foass.Foass
import com.foass.model.Operation
import kotlinx.android.synthetic.main.activity_commands_list.*
import lv.luhmirin.foaasclient.R
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class CommandsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commands_list)

        setSupportActionBar(toolbar)


        val foass = Foass()

        val operation = Operation(
                name = "a",
                url = "/anyway/:company/:from",
                fields = listOf(
                        Field(name = "Company", field = "company", value = "John Doe"),
                        Field(name = "From", field = "from", value = "Jess Doe")
                )
        )

        foass.getMessage(operation)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        { message ->
                            Log.i("TAG", message.toString())
                        },
                        { e ->
                            Log.e("TAG", "error error")
                        }
                )

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_commands_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
