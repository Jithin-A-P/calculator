package com.calculator

class Calculator {
    var a = 0.0
    var b = 0.0
    var op = ""
    var tmp = ""
    var eqPressed = false
    var decPressed = false

    fun input(str: String) {
        if (str == "+" || str == "-" || str == "*" || str == "/") {
            decPressed = false
            op = str
            if(!eqPressed) {
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
            }
        } else if (str == "=") {
            b = tmp.toDouble()
            tmp = calculate().toString()
            eqPressed = true
        } else {
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
                tmp = ""
                eqPressed = true
                tmp = str
            }
        }
    }

    fun del() {
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
    }

    fun calculate(): Double {
        when(op){
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