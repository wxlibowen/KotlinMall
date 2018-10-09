package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.usercenter.R
import com.kotlin.usercenter.presenter.RegisterPresenter
import com.kotlin.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


/**
 * 登录页面
 */
class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initView()
        onClick()


    }
    //初始化
    private fun initView() {
        mPresenter=RegisterPresenter()
        mPresenter.mView=this

    }

    //点击事件
    private fun onClick() {
        //获取验证码按钮
        mAuthCodeBtn.setOnClickListener {
        toast("获取验证码")
        }
        //注册按钮
        mRegisterBtn.setOnClickListener {
//            Toast.makeText(this,"注册",Toast.LENGTH_SHORT).show()
//        toast("注册!")
//            startActivity<TestActivity>("id" to "300","name" to "欢迎来到跳转的activity","age" to 18)
            mPresenter.register("","","")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        if (result){
            toast("注册成功")
        }else{
            toast("注册失败")
        }
    }

}
