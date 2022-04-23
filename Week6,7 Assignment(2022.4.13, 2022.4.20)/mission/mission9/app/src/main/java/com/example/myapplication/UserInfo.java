package com.example.myapplication;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UserInfo extends Fragment
{
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.user_info, container, false);
        Button buttonBirth = rootView.findViewById(R.id.ButtonBirth);
        Button buttonSave = rootView.findViewById(R.id.ButtonSave);
        Calendar calendar = Calendar.getInstance();
        Date currentDate = Calendar.getInstance().getTime();
        buttonBirth.setText(new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(currentDate));

        DatePickerDialog.OnDateSetListener dpDialog = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONDAY, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
                updateDate();
            }

            private void updateDate() {
                String birth = "yyyy/MM/dd";
                SimpleDateFormat sdf = new SimpleDateFormat(birth, Locale.KOREA);
                Button btnDoB = rootView.findViewById(R.id.ButtonBirth);
                btnDoB.setText(sdf.format(calendar.getTime()));
            }

        };

        buttonBirth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                new DatePickerDialog(getContext(),android.R.style.Theme_Holo_Light_Dialog_NoActionBar, dpDialog,calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtName, edtAge;
                edtName = rootView.findViewById(R.id.EditName);
                edtAge = rootView.findViewById(R.id.EditAge);

                String name = edtName.getText().toString();
                String age = edtAge.getText().toString();
                String date = buttonBirth.getText().toString();

                if(name.replace(" ", "").equals("") || age.replace(" ", "").equals("")) {
                    Toast.makeText(getContext(), "정보를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getContext(), "이름 : " + name + "/ 나이 : " + age + " / " + date, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }
}
