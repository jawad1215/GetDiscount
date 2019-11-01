package com.example.getdiscount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    CheckBox checkBox1;
    CheckBox checkBox2;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        checkBox1=(CheckBox) findViewById(R.id.checkbox1);
        checkBox2=(CheckBox) findViewById(R.id.checkbox2);
        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.textView);

      //


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               int age=Integer.parseInt(editText.getText().toString());
               double discount;
               String dDiscount;
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                //paymentString = currency.format(payment);

               if (age <18)
               {
                   if (checkBox1.isChecked())
                   {
                       discount=500-(0.10*500);
                       dDiscount = currency.format(discount);

                       textView.setText("Your Bill is "+dDiscount + " you got 10% discount");
                   }
                   else if (checkBox2.isChecked())
                   {
                       textView.setText("You can only Watch Animated Movie");
                   }

               }
               else if (age>=60)
               {
                   if (checkBox1.isChecked())
                   {
                       discount=500-(0.50*500);
                       dDiscount = currency.format(discount);
                       textView.setText("Your Bill is " +dDiscount+ " you got 50% Discount on Animated Movie ");
                   }
                   else if (checkBox2.isChecked())
                   {
                       discount=500-(0.20*500);
                       dDiscount = currency.format(discount);
                       textView.setText("Your bill is "+dDiscount+" you got 20% Discount Because of OLD Age benefit");
                   }

               }
               else if (age>=18 || age <60)
               {
                   if (checkBox1.isChecked())
                   {
                       discount=500-(0.20*500);
                       dDiscount = currency.format(discount);
                       textView.setText("Your Bill is " +dDiscount+ " you got 20% Discount on Animated Movie ");
                   }
                   else if (checkBox2.isChecked())
                   {
                       discount=500-(0.05*500);
                       dDiscount = currency.format(discount);
                       textView.setText("Your Bill is "+dDiscount+" you got 5% discount");
                   }

               }

            }
        });



    }
}
