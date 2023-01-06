package com.example.framwork_tasks.FragmentAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.framwork_tasks.FragmentModel.FragmentModel;
import com.example.framwork_tasks.R;

import java.util.ArrayList;

public class Fragmentadapter extends RecyclerView.Adapter<Fragmentadapter.FragmentViewHolder>
{

    ArrayList<FragmentModel>list;
    Context context;

    public Fragmentadapter(ArrayList<FragmentModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.fragment_list_item,parent,false);
        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentViewHolder holder, int position) {
        FragmentModel fragmentModellist= list.get(position);
        holder.textone.setText(fragmentModellist.getItemname());
        holder.texttwo.setText(fragmentModellist.getDate());
        holder.imageView.setImageResource(fragmentModellist.getImage());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class FragmentViewHolder extends RecyclerView.ViewHolder {

        TextView textone,texttwo;
        ImageView imageView;
        public FragmentViewHolder(@NonNull View itemView) {
            super(itemView);

            textone=itemView.findViewById(R.id.tv_one);
            texttwo=itemView.findViewById(R.id.tv_two);
            imageView=itemView.findViewById(R.id.image_view);

        }
    }
}
