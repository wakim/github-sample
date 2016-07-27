package br.com.github.sample.dagger

import br.com.github.sample.dagger.modules.ApiModule
import br.com.github.sample.dagger.modules.AppModule
import br.com.github.sample.dagger.modules.TestAppModule
import br.com.github.sample.tests.MainActivityTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TestAppModule::class, ApiModule::class))
interface TestComponent: AppComponent {
    fun inject(mainActivityTest: MainActivityTest)
}