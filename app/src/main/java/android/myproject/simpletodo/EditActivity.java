package android.myproject.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        etitem.setText(getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT));

        //When the user is done editing, they click the save button
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a intent which will contain the results
                Intent intent = new Intent();
                // Pass the data
                intent.putExtra(MainActivity.KEY_ITEM_TEXT, etitem.getText().toString());
                intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));
                // Set the result of the intent
               setResult(RESULT_OK, intent);
                //Finish activity, close the screen and go back
                finish();
            }
        });

    }
}