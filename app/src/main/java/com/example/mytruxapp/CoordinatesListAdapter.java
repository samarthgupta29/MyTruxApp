package com.example.mytruxapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CoordinatesListAdapter extends RecyclerView.Adapter<CoordinatesListAdapter.CoordinatesListViewHolder> {

    public List<CoordinatesEntity> coordinatesEntityList;

    public CoordinatesListAdapter(List<CoordinatesEntity> coordinatesEntityList){
        this.coordinatesEntityList = coordinatesEntityList;
    }

    @NonNull
    @Override
    public CoordinatesListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_coordinates_list_item,viewGroup,false);
        return new CoordinatesListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CoordinatesListViewHolder coordinatesListViewHolder, int i) {
        coordinatesListViewHolder.latlongTv.setText(coordinatesEntityList.get(i).getLat() + " " +
                coordinatesEntityList.get(i).getLon());
    }


    @Override
    public int getItemCount() {
        return coordinatesEntityList.size();
    }

    public class CoordinatesListViewHolder extends RecyclerView.ViewHolder {

        public TextView latlongTv;

        public CoordinatesListViewHolder(View view){
            super(view);
            latlongTv = view.findViewById(R.id.latlongTv);
        }

    }
}
