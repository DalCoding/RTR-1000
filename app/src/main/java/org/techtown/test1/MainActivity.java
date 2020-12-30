package org.techtown.test1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);


        RecyclerView recyclerView = findViewById(R.id.mainRoadList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        RoadListAdapter adapter = new RoadListAdapter();

        adapter.addItem(new RoadList("제목1", "#맑음", "30분"));
        adapter.addItem(new RoadList("제목2", "#사진", "1시간 10분"));
        adapter.addItem(new RoadList("제목3", "#하늘", "50분"));
        adapter.addItem(new RoadList("제목4", "#핫플레이스", "40분"));
        adapter.addItem(new RoadList("제목제목제목", "#눈", "25분"));
        adapter.addItem(new RoadList("제목5", "#공부", "10분"));

        recyclerView.setAdapter(adapter);


        FloatingActionButton button = findViewById(R.id.mainFloatingBtn);


    }
}