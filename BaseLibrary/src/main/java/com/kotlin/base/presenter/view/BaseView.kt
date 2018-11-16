package com.kotlin.base.presenter.view

/**
 * MVP模式其他模块共用
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()

}