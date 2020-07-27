package com.example.amichat.Activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.amichat.Entidades.Usuario;
import com.example.amichat.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistroActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtCorreo;
    private EditText txtContrasena;
    private EditText getTxtContrasenaRepetida;
    private Button btnRegistrar;
    private FirebaseAuth mAuth;
    private FirebaseDatabase database;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombre = (EditText)findViewById(R.id.idRegistroNombre);
        txtCorreo = (EditText)findViewById(R.id.idRegistroCorreo);
        txtContrasena = (EditText)findViewById(R.id.idRegistroContraseña);
        getTxtContrasenaRepetida = (EditText)findViewById(R.id.idRegistroContraseñaRepetida);
        btnRegistrar = (Button)findViewById(R.id.idRegistroRegistrar);
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String correo = txtCorreo.getText().toString();
                final String nombre = txtNombre.getText().toString();
                if (isValidEmail(correo)&&validarContrasena() && validarNombre(nombre)){
                    String contrasena = txtContrasena.getText().toString();
                    mAuth.createUserWithEmailAndPassword(correo, contrasena)
                            .addOnCompleteListener(RegistroActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(RegistroActivity.this,"Resgistro Correcto",Toast.LENGTH_SHORT).show();
                                        Usuario usuario = new Usuario();
                                        usuario.setCorreo(correo);
                                        usuario.setNombre(nombre);
                                        FirebaseUser currentUser = mAuth.getCurrentUser();
                                        DatabaseReference reference = database.getReference("Usuarios/"+currentUser.getUid());
                                        reference.setValue(usuario);
                                        finish();
                                    } else {
                                        Toast.makeText(RegistroActivity.this,"Error De Registro",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }else {
                    Toast.makeText(RegistroActivity.this,"Validacion Correcta",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    public boolean validarContrasena(){
        String contrasena;
        String contrasenaRepetida;
        contrasena = txtContrasena.getText().toString();
        contrasenaRepetida=getTxtContrasenaRepetida.getText().toString();
        if (contrasena.equals(contrasenaRepetida)){
            if (contrasena.length()>=8 && contrasena.length()<=16){
                return true;
            }else return false;
        }else return false;
    }
    public boolean validarNombre(String nombre){

        return !nombre.isEmpty();
    }
}
