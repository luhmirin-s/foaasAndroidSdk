package lv.luhmirins.fooassclient.operations

import android.util.Log
import com.foass.Foass
import com.foass.model.Field
import com.foass.model.Operation
import com.foass.model.predefined.Operations
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import javax.inject.Inject

/**
 */
class CommandsListPresenter
@Inject
constructor(internal val foass: Foass) {

  var view: CommandsListContract? = null
   
  fun getMessage() {
      
    foass.getMessage(Operations.awesome("John Doe"))
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribe(
            { message ->
              view?.showMessage(message.toString())

            },
            { e ->
              Log.e("TAG", "error error")
            }
        )
  }

}
