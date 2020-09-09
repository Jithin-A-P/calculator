package com.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var decIsActive = false

        val dis = findViewById<TextView>(R.id.mainDisplay)
        val opDis = findViewById<TextView>( R.id.opDisplay)

        val b7 = findViewById<Button>(R.id.n1)
        val b8 = findViewById<Button>(R.id.n2)
        val b9 = findViewById<Button>(R.id.n3)
        val btnClr = findViewById<Button>(R.id.n4)

        val b4 = findViewById<Button>(R.id.n5)
        val b5 = findViewById<Button>(R.id.n6)
        val b6 = findViewById<Button>(R.id.n7)
        val btnDiv = findViewById<Button>(R.id.n8)
        val btnMul = findViewById<Button>(R.id.n12)

        val b1 = findViewById<Button>(R.id.n9)
        val b2 = findViewById<Button>(R.id.n10)
        val b3 = findViewById<Button>(R.id.n11)
        val btnAdd = findViewById<Button>(R.id.n16)

        val b0 = findViewById<Button>(R.id.n13)
        val btnDec = findViewById<Button>(R.id.n14)
        val btnSub = findViewById<Button>(R.id.n15)
        val btnEql = findViewById<Button>(R.id.n17)

        btnClr.setOnClickListener {
            dis.text = ""

            decIsActive = false
        }

        b1.setOnClickListener {
            dis.text = dis.text.toString() + '1'
        }

        b2.setOnClickListener {
            dis.text = dis.text.toString() + '2'
        }

        b3.setOnClickListener {
            dis.text = dis.text.toString() + '3'
        }

        b4.setOnClickListener {
            dis.text = dis.text.toString() + '4'
        }

        b5.setOnClickListener {
            dis.text = dis.text.toString() + '5'
        }

        b6.setOnClickListener {
            dis.text = dis.text.toString() + '6'
        }

        b7.setOnClickListener {
            dis.text = dis.text.toString() + '7'
        }

        b8.setOnClickListener {
            dis.text = dis.text.toString() + '8'
        }

        b9.setOnClickListener {
            dis.text = dis.text.toString() + '9'
        }

        b0.setOnClickListener {
            dis.text = dis.text.toString() + '0'
        }

        btnDec.setOnClickListener {
            if (!decIsActive) {
                dis.text = dis.text.toString() + '.'
                decIsActive = true
            }
        }

        btnEql.setOnClickListener {
            var str = dis.text.toString() + '='
            decIsActive = true
        }

        btnAdd.setOnClickListener {
            opDis.text = "+"
        }

        btnSub.setOnClickListener {
            opDis.text = "-"
        }

        btnMul.setOnClickListener {
            opDis.text = "*"
        }

        btnDiv.setOnClickListener {
            opDis.text = "/"
        }

        fun opSelected(c: String) {
            opDis.text = c
        }
    }
}