package hk.hku.cs.msccs_hku_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout programoverview, courses, classschedule, compositionfee, onlineapplication, infosession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        programoverview = findViewById(R.id.programoverview);
        courses = findViewById(R.id.courses);
        classschedule = findViewById(R.id.classschedule);
        compositionfee = findViewById(R.id.compositionfee);
        onlineapplication = findViewById(R.id.onlineapplication);
        infosession = findViewById(R.id.infosession);
        programoverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, programOverviewPage.class);
                startActivity(intent);
            }
        });
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, coursesPage.class);
                startActivity(intent);
            }
        });
        classschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, classSchedulePage.class);
                startActivity(intent);
            }
        });
        compositionfee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, compositionFeePage.class);
                startActivity(intent);
            }
        });
        onlineapplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, onlineRegistrationPage.class);
                startActivity(intent);
            }
        });
        infosession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, infoSessionPage.class);
                startActivity(intent);
            }
        });

    }
}
