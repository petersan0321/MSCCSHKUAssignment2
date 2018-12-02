package hk.hku.cs.msccs_hku_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class onlineRegistrationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_registration_page);
        TextView text = (TextView) findViewById(R.id.link_reg);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }


}
