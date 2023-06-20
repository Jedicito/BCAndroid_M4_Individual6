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

        Button btn_crearCuenta = findViewById(R.id.btn_crearCuenta);
        btn_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensajeToast = verificaEntradas();

                if(mensajeToast.isEmpty()) {
                    mensajeToast = getString(R.string.toast_usuarioCreado);
                } else {
                    mensajeToast = getString(R.string.toast_faltanParametros) + mensajeToast;
                }

                Toast tostada = new Toast(getBaseContext());
                tostada.setText(mensajeToast);
                tostada.setDuration(Toast.LENGTH_SHORT);
                tostada.show();
            }
        });
    }

    private String verificaEntradas() {
        TextView eTx_nombre = findViewById(R.id.eTx_nombre);
        TextView eTx_apellidos = findViewById(R.id.eTx_apellidos);
        TextView eTx_correo = findViewById(R.id.eTx_correo);
        TextView eTx_clave = findViewById(R.id.eTx_clave);

        String nombre = "";
        String apellidos = "";
        String correo = "";
        String clave = "";

        Boolean pasaNoPasa = true;

        nombre = eTx_nombre.getText().toString();
        apellidos = eTx_apellidos.getText().toString();
        correo = eTx_correo.getText().toString();
        clave = eTx_clave.getText().toString();

        String mensajeToast = "";

        if(nombre.trim().isEmpty()){
            mensajeToast = getString(R.string.faltaNombre);
        }
        if(apellidos.trim().isEmpty()) {
            mensajeToast += ", " + getString(R.string.faltaApellidos);
        }
        if(correo.trim().isEmpty()) {
            mensajeToast += ", " + getString(R.string.faltaCorreo);
        }
        if(clave.trim().isEmpty()) {
            mensajeToast += ", " + getString(R.string.faltaClave);
        }

        return mensajeToast;
    }
}