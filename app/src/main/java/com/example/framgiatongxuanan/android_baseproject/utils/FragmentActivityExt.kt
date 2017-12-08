package com.example.framgiatongxuanan.android_baseproject.utils

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.FragmentActivity
import com.example.framgiatongxuanan.android_baseproject.Constants.EXTRA_ARGS
import kotlin.reflect.KClass

/**
 * Created by FRAMGIA\tong.xuan.an on 27/11/2017.
 */
fun <T : Activity> FragmentActivity.rootTo(cls: KClass<T>, requestCode: Int, bundle: Bundle? = null,
                                           parcelable: Parcelable? = null) {
    intent = Intent(this, cls.java)
    if (bundle != null) intent.putExtra(EXTRA_ARGS, bundle);
    if (parcelable != null) intent.putExtra(EXTRA_ARGS, parcelable)
    startActivity(intent)

}