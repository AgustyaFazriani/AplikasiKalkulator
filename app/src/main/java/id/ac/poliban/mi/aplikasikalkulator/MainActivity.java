package id.ac.poliban.mi.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAngkake1 = findViewById(R.id.etAngkake1);
        EditText etAngkake2 = findViewById(R.id.etAngkake2);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        TextView tvHasilSeluruh = findViewById(R.id.tvHasilSeluruh);

        btTambah.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama + aKedua;
            tvHasilSeluruh.setText(Integer.toString(hasilnya));
        });

        btKurang.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama - aKedua;
            tvHasilSeluruh.setText(Integer.toString(hasilnya));
        });

        btKali.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama * aKedua;
            tvHasilSeluruh.setText(Integer.toString(hasilnya));
        });

        btBagi.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama / aKedua;
            tvHasilSeluruh.setText(Integer.toString(hasilnya));
        });

        btBersihkan.setOnClickListener(v -> {
            etAngkake1.setText("");
            etAngkake2.setText("");
            etAngkake1.requestFocus();
            tvHasilSeluruh.setText("0");
        });
    }
}
