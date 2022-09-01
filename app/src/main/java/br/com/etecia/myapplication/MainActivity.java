package br.com.etecia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import chtgupta.quantitycounter.QuantityCounterView;

public class MainActivity extends AppCompatActivity {

    TextView qtd;
    ImageView plus, minus;
    String quantidade;
    int qtdProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qtd = findViewById(R.id.qtd);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               quantidade = String.valueOf(qtd.getText());
               qtdProd = Integer.parseInt(quantidade);
               qtdProd++;
               qtd.setText(String.valueOf(qtdProd));

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                quantidade = String.valueOf(qtd.getText());
                qtdProd = Integer.parseInt(quantidade);
                if (qtdProd>0)
                {
                    qtdProd--;
                }

                qtd.setText(String.valueOf(qtdProd));
            }
        });

    }
}