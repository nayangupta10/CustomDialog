package com.nayan.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibSnackBar.setOnClickListener {
            Snackbar.make(it, "You have clicked Image Button", Snackbar.LENGTH_SHORT).show()
        }

        btnAlertDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert")
            builder.setMessage("This is a Alert Dialog which is used to show alert dialog.")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") { dialogInterface, _ ->
                Toast.makeText(applicationContext, "Clicked Yes", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()

            }

            builder.setNeutralButton("Cancel") { dialogInterface, _ ->
                Toast.makeText(
                    applicationContext,
                    "Click Cancel\n Operation Cancel",
                    Toast.LENGTH_SHORT
                ).show()
                dialogInterface.dismiss()
            }

            builder.setNegativeButton("No") { dialogInterface, _ ->
                Toast.makeText(applicationContext, "Click No", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}