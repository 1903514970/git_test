package com.dj.jetpackdemo.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Time: 2022/1/11
 * Author: dengj
 * Description:
 */
public class ShareDataLiveDataViewModel extends ViewModel {
    private MutableLiveData<Integer> liveData;

    public MutableLiveData<Integer> getLiveData() {
        if(liveData == null){
            liveData = new MutableLiveData<>();
        }
        return liveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        liveData = null;
    }
}
