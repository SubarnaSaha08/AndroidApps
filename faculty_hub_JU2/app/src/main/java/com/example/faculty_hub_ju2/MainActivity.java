package com.example.faculty_hub_ju2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onShowDepartments(View view) {
        Spinner FacultySpinner = (Spinner) findViewById(R.id.facultySpinner);
        String selectedFaculty = String.valueOf(FacultySpinner.getSelectedItem());
        Intent intent = new Intent(this, DepartmentViewerActivity.class);
        intent.putExtra("faculty", selectedFaculty);
        startActivity(intent);
    }
}