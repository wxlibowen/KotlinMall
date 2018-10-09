package com.kotlin.base.rx

import android.widget.Toast
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

/**
 *作者 LiBW
 *创建时间 2018/10/9
 *描述:观察者(数据接受者)
 */
open class BaseSubscriber<T> :Observer<T> {
    override fun onComplete() {
        //onNext后调用
    }

    override fun onSubscribe(d: Disposable) {
        //构造方法
    }

    override fun onNext(t: T) {
        //数据接收完毕后调用
    }

    override fun onError(e: Throwable) {
        //发生错误时候调用

    }

}