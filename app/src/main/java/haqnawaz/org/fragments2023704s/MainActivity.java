package haqnawaz.org.fragments2023704s;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.buttonFragmentOne);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentOne fragmentOne = new FragmentOne();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });
    }
}