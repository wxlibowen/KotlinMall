package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 *作者 LiBW
 *创建时间 2018/10/9
 *描述:函数扩展 减少代码冗余
 */

/**
 * Observable扩展
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}

