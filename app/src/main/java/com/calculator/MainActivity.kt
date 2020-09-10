package com.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = Calculator()

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
            calculator.reset()
            opDis.text = calculator.op
        }

        b1.setOnClickListener {
            calculator.input("1")
            dis.text = calculator.tmp
        }

        b2.setOnClickListener {
            calculator.input("2")
            dis.text = calculator.tmp
        }

        b3.setOnClickListener {
            calculator.input("3")
            dis.text = calculator.tmp
        }

        b4.setOnClickListener {
            calculator.input("4")
            dis.text = calculator.tmp
        }

        b5.setOnClickListener {
            calculator.input("5")
            dis.text = calculator.tmp
        }

        b6.setOnClickListener {
            calculator.input("6")
            dis.text = calculator.tmp
        }

        b7.setOnClickListener {
            calculator.input("7")
            dis.text = calculator.tmp
        }

        b8.setOnClickListener {
            calculator.input("8")
            dis.text = calculator.tmp
        }

        b9.setOnClickListener {
            calculator.input("9")
            dis.text = calculator.tmp
        }

        b0.setOnClickListener {
            calculator.input("0")
            dis.text = calculator.tmp
        }

        btnDec.setOnClickListener {
            calculator.input(".")
            dis.text = calculator.tmp
        }

        btnEql.setOnClickListener {
            calculator.input("=")
            dis.text = calculator.tmp
        }

        btnAdd.setOnClickListener {
            calculator.input("+")
            opDis.text = calculator.op
        }

        btnSub.setOnClickListener {
            calculator.input("-")
            opDis.text = calculator.op
        }

        btnMul.setOnClickListener {
            calculator.input("*")
            opDis.text = calculator.op
        }

        btnDiv.setOnClickListener {
            calculator.input("/")
            opDis.text = calculator.op
        }
    }
}