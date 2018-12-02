package hk.hku.cs.msccs_hku_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class coursesPage extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_page);
        description = (TextView) findViewById(R.id.courses_des);
        spinner = (Spinner) findViewById(R.id.spinner_course);
        adapter = ArrayAdapter.createFromResource(coursesPage.this,R.array.course_selection,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        description.setText(R.string.cyber_security);
                        break;
                    case 1:
                        description.setText(R.string.financial_computing);
                        break;
                    case 2:
                        description.setText(R.string.multimedia_computing);
                        break;
                    case 3:
                        description.setText(R.string.other_courses);
                        break;
                    case 4:
                        description.setText(R.string.capstone_experience);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

