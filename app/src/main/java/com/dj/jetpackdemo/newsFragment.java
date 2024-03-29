package com.dj.jetpackdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dj.jetpackdemo.livedata.Activity2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link newsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class newsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public newsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment newsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static newsFragment newInstance(String param1, String param2) {
        newsFragment fragment = new newsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        view.findViewById(R.id.btn_next).setOnClickListener(v->{
            Bundle bundle = new Bundle();
            bundle.putDouble("value",Math.random());
            Navigation.findNavController(v).navigate(R.id.action_newsFragment_to_shopFragment,bundle);
        });
        view.findViewById(R.id.btn_next_activity).setOnClickListener( v -> startActivity(new Intent(getContext(), Activity2.class)));
        return view;
    }
}