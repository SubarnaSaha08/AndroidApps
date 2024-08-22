package com.example.faculty_hub_ju;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final DepartmentFinder finder = new DepartmentFinder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindDepartment(View view) {
        Spinner FacultySpinner = (Spinner) findViewById(R.id.facultySpinner);
        String SelectedFaculty = String.valueOf(FacultySpinner.getSelectedItem());
        TextView DepartmentTextView = (TextView) findViewById(R.id.DepartmentTextView);

        List<String> departmentList = finder.getDepartments(SelectedFaculty);
        if (departmentList == null || departmentList.isEmpty()) {
            DepartmentTextView.setText(getResources().getString(R.string.emptyText));
            DepartmentTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            DepartmentTextView.setTextSize(14);
            DepartmentTextView.setTextColor(getResources().getColor(R.color.black, null));
        }
        else {
            StringBuilder departmentsFormatted = new StringBuilder();
            for (String department : departmentList) {
                departmentsFormatted.append(department).append('\n');
            }
            DepartmentTextView.setText(departmentsFormatted);
            DepartmentTextView.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
            DepartmentTextView.setTextSize(16);
            DepartmentTextView.setTextColor(getResources().getColor(R.color.deep_green, null));
        }
    }
}