package com.example.framgiatongxuanan.android_baseproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }
    fun test(){
        val str=".........."
        var result=str.let{
            Log.e("this: ",""+this)
            Log.e("it: ",""+it)

        }
        var a=result;
        print(a)
    }

}
