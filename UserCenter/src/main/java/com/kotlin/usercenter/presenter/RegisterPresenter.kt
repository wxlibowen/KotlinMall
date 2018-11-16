package com.kotlin.usercenter.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.usercenter.presenter.view.RegisterView
import com.kotlin.usercenter.service.impl.UserServiceImpl
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 *作者 LiBW
 *创建时间 2018/10/8
 *描述:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile : String,verifyCode : String,pwd : String){
        /*
           业务逻辑
         */
        val  userService=UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
                .execute(object : BaseSubscriber<Boolean>(){
            override fun onNext(t: Boolean) {
                mView.onRegisterResult(t)
            }
        })


    }
}