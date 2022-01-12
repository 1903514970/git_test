package com.dj.jetpackdemo.livedata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import com.dj.jetpackdemo.R;

/**
 * Time: 2022/1/11
 * Author: dengj
 * Description:
 */
public class OneFragment extends Fragment {
    private TextView tv;
    private MutableLiveData<Integer> liveData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        liveData = new ViewModelProvider(getActivity()).get(ShareDataLiveDataViewModel.class).getLiveData();
        tv = view.findViewById(R.id.tv_one);
        view.findViewById(R.id.change_btn).setOnClickListener(v->{
            liveData.setValue((int) (Math.random()*1000));
        });
        //哈哈
        liveData.observe(getActivity(),integer -> tv.setText("值："+integer));
        return view;
    }
}
