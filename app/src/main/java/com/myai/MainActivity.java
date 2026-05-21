package com.myai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Brain brain;
    private Memory memory;
    private Interface aiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brain = new Brain();
        memory = new Memory();
        aiInterface = new Interface(brain, memory);

        Button button = findViewById(R.id.button);
        final EditText input = findViewById(R.id.input);
        final TextView output = findViewById(R.id.output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = input.getText().toString();
                if (!userText.isEmpty()) {
                    String response = aiInterface.getResponse(userText);
                    output.setText(response);
                    input.setText("");
                }
            }
        });
    }
}
