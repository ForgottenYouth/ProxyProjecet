/*
* FileName: RealInstance
* Author: shiwenliang
* Date: 2020/11/30 11:49
* Description: 真实实例
*/
package com.leon.proxyproject.proxy

import android.util.Log

class RealInstance : ProxyInterface {

    private val TAG  = "RealInstance";
    override fun confirmAction(inputString: String) {
        TODO("Not yet implemented")
        Log.e(TAG,"真实实例对象----"+"调用confirmAction()")
    }
}