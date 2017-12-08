package com.example.framgiatongxuanan.android_baseproject.data.remote.middleware

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.support.v4.content.LocalBroadcastManager
import com.example.framgiatongxuanan.android_baseproject.utils.rootTo

/**
 * Created by FRAMGIA\tong.xuan.an on 27/11/2017.
 */
class UnauthorizedBroadcast(private val mContext: Context,
                            val lifecycle: Lifecycle) : LifecycleObserver {
    private val localBm by lazy {
        LocalBroadcastManager.getInstance(mContext)
    }
    private val mBoadcastReceiver by lazy {
        object :BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                (mContext as? FragmentActivity)?.rootTo
            }

        }
    }
}