package hcmute.edu.vn.firstweekexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    int a,b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        Button button = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("Event Handling", "Button 2 clicked");
            }
        });
    }
    //public void sendMessage(View view)
    //{
        //Do something in respond to button click
    //    Log.i("Event Handling","Welcome to my handling exercise");
    //}
}