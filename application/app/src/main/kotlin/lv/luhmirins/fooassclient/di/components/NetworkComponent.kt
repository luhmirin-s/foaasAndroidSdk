package lv.luhmirins.fooassclient.di.components

import dagger.Component
import lv.luhmirins.fooassclient.operations.CommandsListActivity
import lv.luhmirins.fooassclient.di.modules.AppModule
import lv.luhmirins.fooassclient.di.modules.FoassModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class, FoassModule::class))
interface NetworkComponent {

  fun inject(activity: CommandsListActivity)

}