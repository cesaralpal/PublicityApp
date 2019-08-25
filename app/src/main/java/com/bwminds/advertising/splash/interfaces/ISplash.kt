package com.bwminds.advertising.splash.interfaces

import com.polimentes.utilitieskotlin.interfaces.view.IView

interface ISplash {
    interface View : IView {
    }

    interface Presenter {
        fun splashShowed()
    }

    interface Listener {
        fun onValidSession()
        fun onInvalidSession()
    }

    interface Interactor {
        fun checkSession()
    }
}