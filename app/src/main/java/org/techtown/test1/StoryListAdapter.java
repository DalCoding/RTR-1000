package org.techtown.test1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryListAdapter extends RecyclerView.Adapter<StoryListAdapter.ViewHolder> {
    ArrayList<StoryList> items = new ArrayList<StoryList>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.main_story_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StoryList item = items.get(position);
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(StoryList item) {
        items.add(item);
    }

    public void setItems(ArrayList<StoryList> items) {
        this.items = items;
    }

    public StoryList getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, StoryList item) {
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView storyTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            storyTitle = itemView.findViewById(R.id.mainStoryTitle);
        }

        public void setItem(StoryList item) {
            storyTitle.setText(item.getStoryTitle());
        }
    }
}