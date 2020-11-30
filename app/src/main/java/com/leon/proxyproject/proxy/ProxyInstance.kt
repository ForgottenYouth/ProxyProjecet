/*
* FileName: ProxyInstance
* Author: shiwenliang
* Date: 2020/11/30 11:54
* Description: 代理实例
*/
package com.leon.proxyproject.proxy

import android.util.Log

class ProxyInstance : ProxyInterface {
    val TAG = "ProxyInstance";

    var mRealInstance: RealInstance? = null

    fun ProxyInterface(realInstance: RealInstance) {
        mRealInstance = realInstance;
    }

    override fun confirmAction(inputString: String) {
        TODO("Not yet implemented")
        Log.e(TAG, "我是代理，我的confirmAction被调用")
        mRealInstance?.confirmAction(inputString)
    }
}