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


public class Report extends Fragment {

    private View view;
    private ArrayList<ReportData> arrayList;
    private ReportAdapter reportAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.report, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.ReportRv);
        linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        reportAdapter = new ReportAdapter(arrayList);
        recyclerView.setAdapter(reportAdapter);

        //임시 데이터
        arrayList.add(new ReportData("제목", "날짜", "닉네임"));
        arrayList.add(new ReportData("제목1", "날짜1", "닉네임1"));
        arrayList.add(new ReportData("제목2", "날짜2", "닉네임2"));
        arrayList.add(new ReportData("제목3", "날짜3", "닉네임3"));
        arrayList.add(new ReportData("제목4", "날짜4", "닉네임4"));
        arrayList.add(new ReportData("제목5", "날짜5", "닉네임5"));
        arrayList.add(new ReportData("제목6", "날짜6", "닉네임6"));


        return view;
    }

}





