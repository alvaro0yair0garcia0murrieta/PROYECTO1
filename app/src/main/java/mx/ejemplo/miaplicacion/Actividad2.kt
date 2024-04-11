package mx.ejemplo.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)
        val tvBienvenida = findViewById<TextView>(R.id.tv_bienvenida)

        val nombreUusuario = intent.getStringExtra("usaurio")
        val share = this.getSharedPreferences("j", MODE_PRIVATE)
        val apodo  = share.getString("apodo","")
        tvBienvenida.append(" "+nombreUusuario)

    }
}