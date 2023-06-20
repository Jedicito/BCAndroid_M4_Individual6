package chl.ancud.m4_individual6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickListeners();
    }

    private void clickListeners() {
        TextView eTx_nombre = findViewById(R.id.eTx_nombre);
        TextView eTx_apellidos = findViewById(R.id.eTx_apellidos);
        TextView eTx_correo = findViewById(R.id.eTx_correo);
        TextView eTx_clave = findViewById(R.id.eTx_clave);

        String nombre = "", falta_nombre = "";
        String apellidos = "", falta_apellidos = "";
        String correo = "", falta_correo = "";
        String clave = "", falta_clave = "";




        Button btn_crearCuenta = findViewById(R.id.btn_crearCuenta);
        btn_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tostada = new Toast(getBaseContext());
                tostada.setText("Usuario creado");
                tostada.setDuration(Toast.LENGTH_SHORT);
                tostada.show();
            }
        });
    }
}