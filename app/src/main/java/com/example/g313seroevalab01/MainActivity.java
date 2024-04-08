package com.example.g313seroevalab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txtA);
        tb = findViewById(R.id.txtB);
        lr = findViewById(R.id.labC);
    }

    public void  my_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        int num1 = Integer.parseInt(sa);
        int num2 = Integer.parseInt(sb);

        int res = num1 + num2;

        String sc = String.valueOf(res);

        lr.setText(sc);
    }

    public void  my_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        int num1 = Integer.parseInt(sa);
        int num2 = Integer.parseInt(sb);

        int res = num1 - num2;

        String sc = String.valueOf(res);

        lr.setText(sc);
    }

    public void  my_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        int num1 = Integer.parseInt(sa);
        int num2 = Integer.parseInt(sb);

        int res = num1 * num2;

        String sc = String.valueOf(res);

        lr.setText(sc);
    }

    public void  my_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        int num1 = Integer.parseInt(sa);
        int num2 = Integer.parseInt(sb);

        int res = num1 / num2;

        String sc = String.valueOf(res);

        lr.setText(sc);
    }
}