package mx.ejemplo.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ActividadPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)
    val botonSiguente = findViewById<Button>(R.id.btn_sigiente)
        val ptUsuario = findViewById<EditText>(R.id.pt_ususario)
        val ptContraseña = findViewById<EditText>(R.id.pt_contrasena)
        val ptApodo = findViewById<EditText>(R.id.et_apodo3)
        botonSiguente.setOnClickListener{
            val usuario = ptUsuario.text.toString()
            val contraseña = ptContraseña.text.toString()
            val apodo = ptApodo.text.toString()
            if (usuario == "alessandra"){
                if (contraseña=="1234"){
                    val Intent = Intent(this,Actividad2::class.java)
                    Intent.putExtra("usaurio",usuario)

                    val share = this.getSharedPreferences("j", MODE_PRIVATE)

                    with(share.edit()){
                        putString("apodo",apodo)
                        apply()
                    }

                    startActivity(Intent)

                }else{
                    Toast.makeText(this,"cotraseña incorrectas",Toast.LENGTH_SHORT).show()

                }

            }else{
                Toast.makeText(this,"usuario incorrectas",Toast.LENGTH_SHORT).show()
            }

        }
    }
}