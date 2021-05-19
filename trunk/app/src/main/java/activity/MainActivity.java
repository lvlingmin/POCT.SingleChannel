package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.cnbiobasepoct.R;

import bean.FragmentState;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rbtnTest = findViewById(R.id.rbtnTest);
        RadioButton rbtnSearch = findViewById(R.id.rbtnSearch);
        RadioButton rbtnSetting = findViewById(R.id.rbtnSetting);
        rbtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "1", Toast.LENGTH_SHORT).show();
            }
        });
        rbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "2", Toast.LENGTH_SHORT).show();
            }
        });
        rbtnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "3", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setFragment(String fragment) {

        switch (fragment) {
            case "test":
                break;
            case "search":
                break;
            case "setting":
                break;
        }
    }

    private void replaceFragment(){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
    }
}