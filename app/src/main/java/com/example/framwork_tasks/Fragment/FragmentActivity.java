package com.example.framwork_tasks.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.framwork_tasks.FragmentAdapter.Fragmentadapter;
import com.example.framwork_tasks.FragmentModel.FragmentModel;
import com.example.framwork_tasks.MainActivity;
import com.example.framwork_tasks.R;

import java.util.ArrayList;


public class FragmentActivity extends Fragment {

    RecyclerView recyclerView;
    ArrayList<FragmentModel> list=new ArrayList<>();
    Fragmentadapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentactivity, container, false);

      // remove recycler

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list.add(new FragmentModel("blackpanther","2015",R.drawable.blackpanther));
        list.add(new FragmentModel("Avatar","2012",R.drawable.avatar));
        list.add(new FragmentModel("Thor","2021",R.drawable.thor));
        list.add(new FragmentModel("BlackAdam","2002",R.drawable.blackadam));
        list.add(new FragmentModel("Smile","2010",R.drawable.smile));


        LinearLayoutManager obj = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(obj);
        adapter=new Fragmentadapter(list,getContext());
        recyclerView.setAdapter(adapter);



        return view;

    }


}
