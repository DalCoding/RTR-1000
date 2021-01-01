 package org.techtown.test1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.big_map_page);


        /*RecyclerView roadRecyclerView = findViewById(R.id.mainRoadList);

        LinearLayoutManager roadLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        roadRecyclerView.setLayoutManager(roadLayoutManager);
        RoadListAdapter roadAdapter = new RoadListAdapter();

        roadAdapter.addItem(new RoadList("제목1", "#맑음", "30분"));
        roadAdapter.addItem(new RoadList("제목2", "#사진", "1시간 10분"));
        roadAdapter.addItem(new RoadList("제목3", "#하늘", "50분"));
        roadAdapter.addItem(new RoadList("제목4", "#핫플레이스", "40분"));
        roadAdapter.addItem(new RoadList("제목제목제목", "#눈", "25분"));
        roadAdapter.addItem(new RoadList("제목5", "#공부", "10분"));

        roadRecyclerView.setAdapter(roadAdapter);


        RecyclerView storyRecyclerView = findViewById(R.id.mainStoryList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        storyRecyclerView.setLayoutManager(layoutManager);
        StoryListAdapter adapter = new StoryListAdapter();

        adapter.addItem(new StoryList("제목1"));
        adapter.addItem(new StoryList("제목2"));
        adapter.addItem(new StoryList("제목3"));
        adapter.addItem(new StoryList("제목4"));
        adapter.addItem(new StoryList("제목제목제목"));
        adapter.addItem(new StoryList("제목5"));

        storyRecyclerView.setAdapter(adapter);*/


        /*RecyclerView recyclerView = findViewById(R.id.DtrRoadList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        RoadListAdapter adapter = new RoadListAdapter();

        adapter.addItem(new RoadList("제목1", "30분", "username1"));
        adapter.addItem(new RoadList("제목2", "60분", "username2"));
        adapter.addItem(new RoadList("제목3", "1시간 10분", "username3"));
        adapter.addItem(new RoadList("제목4", "15분", "username4"));
        adapter.addItem(new RoadList("제목제목제목", "20분", "username5"));
        adapter.addItem(new RoadList("제목5", "45분", "username6"));
        adapter.addItem(new RoadList("제목5", "45분", "username6"));
        adapter.addItem(new RoadList("제목5", "45분", "username6"));
        adapter.addItem(new RoadList("제목5", "45분", "username6"));
        adapter.addItem(new RoadList("제목5", "45분", "username6"));


        recyclerView.setAdapter(adapter);*/

    }
}