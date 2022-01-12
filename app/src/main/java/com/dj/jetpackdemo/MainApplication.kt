package com.dj.jetpackdemo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

/**
 * Time: 2022/1/11
 * Author: dengj
 * Description:
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(ApplicationLifecycleObserver())
    }
}