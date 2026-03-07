package com.example.week8;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textInput1=findViewById(R.id.InputTextField1);
        textInput2=findViewById(R.id.InputTextField2);

        textOutput=findViewById(R.id.outputTextField);


    }
    public void addition(View view){
        String input1 = textInput1.getText().toString();
        String input2 = textInput2.getText().toString();

        int calc1 = Integer.parseInt(input1);
        int calc2 = Integer.parseInt(input2);

        textOutput.setText(String.valueOf(calc1 + calc2));
    }

    public void subtraction(View view){
        String input1 = textInput1.getText().toString();
        String input2 = textInput2.getText().toString();

        int calc1 = Integer.parseInt(input1);
        int calc2 = Integer.parseInt(input2);

        textOutput.setText(String.valueOf(calc1 - calc2));

    }

    public void multiplication(View view){
        String input1 = textInput1.getText().toString();
        String input2 = textInput2.getText().toString();

        int calc1 = Integer.parseInt(input1);
        int calc2 = Integer.parseInt(input2);

        textOutput.setText(String.valueOf(calc1 * calc2));

    }

    public void division(View view){
        String input1 = textInput1.getText().toString();
        String input2 = textInput2.getText().toString();

        int calc1 = Integer.parseInt(input1);
        int calc2 = Integer.parseInt(input2);

        textOutput.setText(String.valueOf(calc1 / calc2));

    }

}