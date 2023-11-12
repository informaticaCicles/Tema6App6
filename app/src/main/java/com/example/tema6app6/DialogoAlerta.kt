package com.example.tema6app6

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

public class DialogoAlerta: DialogFragment() {

    /*override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        fun mostrarAlerta(
            titulo: String,
            mensaje: String,
            textoBotonAceptar: String = "Aceptar",
            textoBotonCancelar: String? = null,
            onAceptarClick: (() -> Unit)? = null,
            onCancelarClick: (() -> Unit)? = null
        ) {
            val builder = AlertDialog.Builder(context)
            builder.setTitle(titulo)
            builder.setMessage(mensaje)

            builder.setPositiveButton(textoBotonAceptar) { dialog, which ->
                onAceptarClick?.invoke()
            }

            if (textoBotonCancelar != null) {
                builder.setNegativeButton(textoBotonCancelar) { dialog, which ->
                    onCancelarClick?.invoke()
                }
            }

            val alertDialog = builder.create()
            alertDialog.show()
        }

        return super.onCreateDialog(savedInstanceState)
    }*/

}