package com.kotlin.usercenter.service

import io.reactivex.Observable
import java.util.*

/**
 *作者 LiBW
 *创建时间 2018/10/9
 *描述:
 */
interface UserService {
    fun register(mobile:String,VerifyCode:String,pwd:String):Observable<Boolean>
}