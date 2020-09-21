package android.myproject.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText etitem;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        etitem = findViewById(R.id.etitem);
        btnsave = findViewById(R.id.btnsave);

        getSupportActionBar().setTitle("Edit Item");
    }
}