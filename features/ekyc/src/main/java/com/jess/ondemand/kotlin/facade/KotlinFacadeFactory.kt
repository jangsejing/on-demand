package com.jess.ondemand.kotlin.facade

import android.content.Context
import android.content.Intent
import com.jess.ondemand.facade.kotlin.EkycFacade
import com.jess.ondemand.kotlin.EkycSampleActivity
import com.linecorp.lich.component.DelegatedComponentFactory

class EkycFacadeFactory : DelegatedComponentFactory<EkycFacade>() {

    override fun createComponent(context: Context): EkycFacade = EkycFacadeImpl()
}

internal class EkycFacadeImpl : EkycFacade {

    override val isModuleLoaded: Boolean = true

    override fun getIntent(
        context: Context
    ): Intent = EkycSampleActivity.newIntent(context)


}