package lv.luhmirins.fooassclient.di

import android.app.Application
import lv.luhmirins.fooassclient.di.components.DaggerNetworkComponent
import lv.luhmirins.fooassclient.di.components.NetworkComponent
import lv.luhmirins.fooassclient.di.modules.AppModule
import lv.luhmirins.fooassclient.di.modules.FoassModule


class ClientApplication : Application() {

  companion object {
    lateinit var networkComponent: NetworkComponent
  }

  override fun onCreate() {
    super.onCreate()

    networkComponent = DaggerNetworkComponent.builder()
        .appModule(AppModule(this))
        .foassModule(FoassModule())
        .build()

  }
}