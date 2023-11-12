package com.example.tema6app6

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.tema6app6.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDefecto.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Esto es un mensaje de alerta.")
                .setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialog, i ->
                    //Código a ejecutar en caso de Aceptar
                    dialog.cancel()
                })
                .setNegativeButton("Cancelar", null)
                .show()
        }
        
        binding.btnAlertaSelec.setOnClickListener {
            val items = arrayOf("Inglés", "Español", "Francés")
            
            MaterialAlertDialogBuilder(this)
                .setTitle("¿Seleccione un idioma?")
                .setItems(items, DialogInterface.OnClickListener { dialog, i ->
                    when(i){
                        0 -> confirmSelection()
                        1 -> Toast.makeText(this, "Spanish", Toast.LENGTH_SHORT).show()
                        2 ->Toast.makeText(this, "Francés", Toast.LENGTH_SHORT).show()
                    }
                }).show()
        }

        binding.btnAlertaPerso.setOnClickListener {
            //Inflamos la vista personalizada
            val dialogView = layoutInflater.inflate(R.layout.dialog_perso, null)

            //Con el setView le pasamos la vista
            MaterialAlertDialogBuilder(this)
                .setTitle("Esto es un diálogo personalizado")
                .setView(dialogView)
                .setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialog, i ->
                    //Código a ejecutar en caso de Aceptar
                    dialog.cancel()
                })
                .setCancelable(false)//No podrá desaparecer el diálogo por ningún motivo
                .show()
        }
    }

    fun confirmSelection(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Esto es un mensaje de alerta.")
            .setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialog, i ->
                //Código a ejecutar en caso de Aceptar
                dialog.cancel()
            })
            .setNegativeButton("Cancelar", null)
            .show()
    }
}