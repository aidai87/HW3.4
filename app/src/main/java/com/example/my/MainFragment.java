
package com.example.my;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private ArrayList<String> data;
    private RecyclerView recyclerView;
    private MainAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView=view.findViewById(R.id.recycler);
        adapter = new MainAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");
        data.add("08092348324");


    }

}
