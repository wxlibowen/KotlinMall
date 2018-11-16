package com.kotlin.base.presenter

import android.widget.ActionMenuView
import com.kotlin.base.presenter.view.BaseView

/**
 * MVP模式共用的Presenter
 */
open class BasePresenter<T : BaseView> {
        lateinit var mView:T

}