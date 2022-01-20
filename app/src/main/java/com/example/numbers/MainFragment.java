package com.example.numbers;

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

    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    private ArrayList<Contact> list;


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
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter=new ContactAdapter(list);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        list=new ArrayList<>();
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
        list.add(new Contact("name_person","+996557237799"));
    }
}