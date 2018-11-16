package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 *作者 LiBW
 *创建时间 2018/10/8
 *描述:
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(),BaseView {
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }


}