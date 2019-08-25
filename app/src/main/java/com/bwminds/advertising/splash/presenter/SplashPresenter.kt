package com.bwminds.advertising.splash.presenter

import android.content.Context
import com.bwminds.advertising.HelloSceneformActivity
import com.bwminds.advertising.splash.interfaces.ISplash

class SplashPresenter (private val view: ISplash.View,
                       private val context: Context
):ISplash.Presenter,ISplash.Listener{
    override fun splashShowed() {
        view.redirectTo(HelloSceneformActivity::class.java)
    }

    override fun onValidSession() {
    }

    override fun onInvalidSession() {
    }


}