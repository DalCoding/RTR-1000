package org.techtown.test1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RoadListAdapter extends RecyclerView.Adapter<RoadListAdapter.ViewHolder> {
    ArrayList<RoadList> items = new ArrayList<RoadList>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.main_road_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RoadList item = items.get(position);
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(RoadList item) {
        items.add(item);
    }

    public void setItems(ArrayList<RoadList>items) {
        this.items = items;
    }

    public RoadList getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, RoadList item) {
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView road_title;
        TextView road_tag;
        TextView road_period;

        public ViewHolder(View itemView) {
            super(itemView);

            road_title = itemView.findViewById(R.id.mainRoadTitle);
            road_tag = itemView.findViewById(R.id.mainRoadTag);
            road_period = itemView.findViewById(R.id.mainRoadPeriod);
        }

        public void setItem(RoadList item) {
            road_title.setText(item.getRoadTitle());
            road_tag.setText(item.getRoadTag());
            road_period.setText(item.getRoadPeriod());
        }
    }
}
