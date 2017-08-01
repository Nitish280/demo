package com.example.nitishsingh.android101;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nitish Singh on 01-08-2017.
 */

public class SimpleAddition extends Fragment {
    int i=1;
    EditText edt;
    Button btn;
    TextView txt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_main,container,false);
        edt=(EditText)view.findViewById(R.id.editText2);
        btn=(Button)view.findViewById(R.id.button2);
        txt=(TextView)view.findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(edt.getText().toString());
            }
        });
        return view;

    }
}
