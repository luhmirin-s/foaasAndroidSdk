package lv.luhmirins.fooassclient.di.modules

import com.foass.Foass
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class FoassModule() {

  @Provides
  @Singleton
  fun providesFoass() = Foass()

}