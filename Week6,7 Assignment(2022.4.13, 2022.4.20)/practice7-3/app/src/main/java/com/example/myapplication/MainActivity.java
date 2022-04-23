package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tvName, tvEmail;
    Button button1;
    EditText dlgEditName, dlgEditEmail;
    TextView toastText;
    View dialogView, toastView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력(2020039048 김강민)");

        this.tvName = findViewById(R.id.tvName);
        this.tvEmail = findViewById(R.id.tvEmail);
        this.button1 = findViewById(R.id.button1);

        this.button1.setOnClickListener(view ->
        {
            this.dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null);
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle("사용자 정보 입력");
            dlg.setView(this.dialogView);
            dlg.setPositiveButton("확인", (dialog, which) ->
            {
               this.dlgEditName = dialogView.findViewById(R.id.dlgEdit1);
               this.dlgEditEmail = dialogView.findViewById(R.id.dlgEdit2);

               this.tvName.setText(dlgEditName.getText().toString());
               this.tvEmail.setText(dlgEditEmail.getText().toString());
            });
            dlg.setNegativeButton("취소", (dialog, which) ->
            {
                Toast toast = new Toast(MainActivity.this);
                this.toastView = View.inflate(MainActivity.this, R.layout.toast1, null);
                this.toastText = toastView.findViewById(R.id.ToastText1);
                this.toastText.setText("취소했습니다.");
                toast.setView(this.toastView);
                toast.show();
            });
            dlg.show();
        });

    }
}