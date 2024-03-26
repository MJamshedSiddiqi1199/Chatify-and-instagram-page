package com.example.chatify;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assuming you have a Toolbar with an ID of "toolbar" in your activity_main.xml
        ImageButton imgBackButton = findViewById(R.id.imgbackbutton);
        Button backbutton= findViewById(R.id.btnexit);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform your desired operation when the back button is clicked
                onBackPressed();
            }
        });
        imgBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform your desired operation when the back button is clicked
                onBackPressed();
            }
        });
    }
}