package lv.luhmirins.fooassclient.operations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.foass.Foass
import kotlinx.android.synthetic.main.activity_commands_list.*
import lv.luhmirin.foaasclient.R
import lv.luhmirins.fooassclient.di.ClientApplication
import javax.inject.Inject

class CommandsListActivity : AppCompatActivity() , CommandsListContract {

  @Inject
  lateinit var foass: Foass

  @Inject
  lateinit var presenter: CommandsListPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_commands_list)
    ClientApplication.networkComponent.inject(this)
    presenter.view = this

    setSupportActionBar(toolbar)

    presenter.getMessage()

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

  override fun showMessage(message: String) {
    Log.i("TAG", message.toString())
  }
}

