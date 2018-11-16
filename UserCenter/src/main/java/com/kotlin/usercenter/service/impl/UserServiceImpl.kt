package com.kotlin.usercenter.service.impl

import com.kotlin.usercenter.service.UserService
import io.reactivex.Observable


/**
 *作者 LiBW
 *创建时间 2018/10/9
 *描述:
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, VerifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }


}