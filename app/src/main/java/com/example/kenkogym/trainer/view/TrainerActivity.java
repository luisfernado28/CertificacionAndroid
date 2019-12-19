package com.example.kenkogym.trainer.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.kenkogym.R;
import com.example.kenkogym.trainer.viewModel.TrainerViewModel;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TrainerActivity extends AppCompatActivity {
    private TrainerViewModel viewModel;

    Button buttonSave;
    RecyclerView recyclerViewExc;
    LinearLayoutManager linearLayoutManager;
    TrainerExcerciseSelectionAdapter adapter;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);
        viewModel= new ViewModelProvider(this).get(TrainerViewModel.class);
    }

    public void setExercise(ArrayList<String> exercises,Long id){
        viewModel.setExercises(exercises,id);

        buttonSave = findViewById(R.id.button_trainer_save);
        recyclerViewExc = findViewById(R.id.recycler_excercises);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        List<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");

        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewExc.setLayoutManager(linearLayoutManager);
        adapter = new TrainerExcerciseSelectionAdapter(activity,strings);
        recyclerViewExc.setAdapter(adapter);
    }
}
