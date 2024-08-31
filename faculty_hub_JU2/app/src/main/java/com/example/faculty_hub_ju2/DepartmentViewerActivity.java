package com.example.faculty_hub_ju2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DepartmentViewerActivity extends AppCompatActivity {

    private final DepartmentFinder finder = new DepartmentFinder();
    public static final String EXTRA_MESSAGE = "faculty";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_departments_viewer);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        String Faculty = intent.getStringExtra(EXTRA_MESSAGE);
        assert Faculty != null;

        List<String> departmentList = finder.getDepartments(Faculty);
        TextView DepartmentTextView = (TextView)findViewById(R.id.DepartmentTextView);
        if (departmentList == null || departmentList.isEmpty()) {
            DepartmentTextView.setText(getResources().getString(R.string.emptyText));
        }
        else {
            StringBuilder departmentsFormatted = new StringBuilder();
            for (String department : departmentList) {
                departmentsFormatted.append(department).append('\n');
            }
            DepartmentTextView.setText(departmentsFormatted);
        }
    }
}