package com.calculator

class Calculator {
    var a = 0.0
    var b = 0.0
    var op = ""
    var tmp = ""
    var eqPressed = false
    var decPressed = false
    var opSelected = false

    fun input(str: String) {
        if (str == "+" || str == "-" || str == "*" || str == "/") {
            op = str
            if(!opSelected) {
                opSelected = true
                if (!eqPressed) {
                    if (a == 0.0) {
                        a = tmp.toDouble()
                        tmp = ""
                    } else {
                        b = tmp.toDouble()
                        a = calculate()
                        tmp = ""
                    }
                } else {
                    a = tmp.toDouble()
                    b = 0.0
                    tmp = ""
                }
            }
            eqPressed = false
            decPressed = false
        } else if (str == "=") {
            b = tmp.toDouble()
            tmp = calculate().toString()
            eqPressed = true
            if(opSelected)
                opSelected = false
        } else {
            if(opSelected)
                opSelected = false
            if(!eqPressed) {
                if(str == ".") {
                    if(!decPressed) {
                        decPressed = true
                        tmp += str
                    }
                } else {
                    tmp += str
                }
            } else {
                tmp = str
            }
        }
    }

    fun del() {
        if(opSelected)
            opSelected = false
        if(tmp.substring(tmp.length-1) == ".") {
            decPressed = false
        }
        tmp = tmp.substring(0, tmp.length - 1)
    }

    fun reset() {
        a = 0.0
        b = 0.0
        op = ""
        tmp = ""
        eqPressed = false
        decPressed = false
        opSelected = false
    }

    fun calculate(): Double {
        when(op) {
            "+" -> return a + b
            "-" -> return a - b
            "*" -> return a * b
            "/" -> return a / b
        }
        return 0.0
    }

    fun getA(): String {
        if(a == 0.0)
            return ""
        else
            return a.toString()
    }

    fun getB(): String {
        if(b == 0.0)
            return ""
        else
            return b.toString()
    }
}