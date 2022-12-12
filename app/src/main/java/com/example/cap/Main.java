package com.example.cap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Main extends Fragment {

    private View view;
    private ArrayList<MainData> arrayList;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.main, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.MainRv);
        //linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);

        //임시 데이터
        arrayList.add(new MainData("#해시태그", "제목", "날짜", "닉네임"));
        arrayList.add(new MainData("#커피", "아아 사주세요", "11/1", "가희"));
        arrayList.add(new MainData("#제1실습관", "충전기 빌려주세요", "11/2", "지수"));
        arrayList.add(new MainData("#화장실", "휴지 갖다주세요", "11/3", "호준"));
        arrayList.add(new MainData("#바울관", "연필 빌려주세요", "11/4", "인찬"));
        arrayList.add(new MainData("#해시태그1", "캡스톤", "대출해주세요", "이찬"));
        arrayList.add(new MainData("#해시태그2", "제목1", "날짜1", "닉네임1"));

        return view;
    }

}




