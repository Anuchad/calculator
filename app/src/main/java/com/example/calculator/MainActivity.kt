package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

//import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var loopaddnumber = 1
    var number1 = 0
    var number2 = 0
    var number3 = 0
    var checkloop = 0
    var looptotal = 0
    var total = 0
    var loopcal1 = ""
    var loopcal2 = ""
    var checkcal = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bsero.setOnClickListener {
            addnumber(number = 0)
        }

        bone.setOnClickListener {
            addnumber(number = 1)
        }

        btwo.setOnClickListener {
            addnumber(number = 2)
        }

        btree.setOnClickListener {
            addnumber(number = 3)
        }

        bfour.setOnClickListener {
            addnumber(number = 4)
        }

        bfive.setOnClickListener {
            addnumber(number = 5)
        }

        bsix.setOnClickListener {
            addnumber(number = 6)
        }

        bseven.setOnClickListener {
            addnumber(number = 7)
        }

        beight.setOnClickListener {
            addnumber(number = 8)
        }

        bnine.setOnClickListener {
            addnumber(number = 9)
        }

        bdel.setOnClickListener {
            var name = textView3.text.dropLast(1)
            var name1 = textView4.text.dropLast(1)


            if (this.textView3.text.length.toString() > "0") {

                //var strText1Tmp = textView3.text.toString().substring(0, textView3.text.toString().dropLast(1))
                if (this.textView3.text.length.toString() < "2") {
                    textView3.setText("0")
                    textView4.setText(name1)
                } else {
                    textView3.setText(name)
                    textView4.setText(name1)
                }
            }
        }

        bplush.setOnClickListener {
            sumcal(loopsum = 1, cal = "+")
        }

        bminus.setOnClickListener {
            sumcal(loopsum = 2, cal = "-")
        }

        bmultiplied.setOnClickListener {
            sumcal(loopsum = 3, cal = "*")
        }

        bdivided.setOnClickListener {
            sumcal(loopsum = 4, cal = "/")
        }

        mod.setOnClickListener {
            sumcal(loopsum = 5, cal = "%")
        }

        btotal.setOnClickListener {
            if (looptotal == 1) {

                if (checkcal == 1) {
                    number3 = textView3.text.toString().toInt()
                    total = total + number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "+") {
                    number2 = textView3.text.toString().toInt()
                    total = number1 + number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            } else if (looptotal == 2) {
                if (checkcal == 1) {
                    number3 = textView3.text.toString().toInt()
                    total = total - number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "-") {
                    number2 = textView3.text.toString().toInt()
                    total = number1 - number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }

            } else if (looptotal == 3) {
                if (checkcal == 1) {
                    number3 = textView3.text.toString().toInt()
                    total = total * number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "*") {
                    number2 = textView3.text.toString().toInt()
                    total = number1 * number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            } else if (looptotal == 4) {
                if (checkcal == 1) {
                    number3 = textView3.text.toString().toInt()
                    total = total / number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (textView3.text.toString() == "0") {
                    textView3.setText("ERROR")
                    textView4.setText("")
                } else if (loopcal2 == "/") {
                    number2 = textView3.text.toString().toInt()
                    total = number1 / number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            } else if (looptotal == 5) {
                if (checkcal == 1) {
                    number3 = textView3.text.toString().toInt()
                    total = total % number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "%") {
                    number2 = textView3.text.toString().toInt()
                    total = number1 % number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            }
        }

        bac.setOnClickListener {
            textView3.setText("0")
            textView4.setText("")
            checkloop = 0
            total = 0
            looptotal = 0
            loopaddnumber = 1
            number1 = 0
            number2 = 0
            number3 = 0
            total = 0
            loopcal1 = ""
            loopcal2 = ""
            checkcal = 0
        }
    }
    fun addnumber(number: Int) {
        if (this.textView3.text.toString() == "0") {
            textView3.setText(number.toString())
            textView4.setText(number.toString())
        } else if (loopaddnumber == 0) {
            textView3.setText(number.toString())
            textView4.append(number.toString())
            loopaddnumber = 1

        } else {
            textView3.append(number.toString())
            textView4.append(number.toString())
        }

    }

    fun sumcal(cal: String, loopsum: Int) {
        loopaddnumber = 0
        looptotal = loopsum
        loopcal1 = loopcal2
        loopcal2 = cal

        if (checkloop == 0) {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("0")
                checkloop = checkloop + 1

            } else {
                number1 = textView3.text.toString().toInt()
                textView4.append(cal)
                checkloop = checkloop + 1

            }
        } else {
            if (checkcal == 0) {
                if (loopcal1 == "+") {
                    textView4.append(cal)
                    number2 = textView3.text.toString().toInt()
                    total = number1 + number2
                    textView3.setText(total.toString())
                    checkcal = 1

                } else if (loopcal1 == "-") {
                    textView4.append(cal)
                    number2 = textView3.text.toString().toInt()
                    total = number1 - number2
                    textView3.setText(total.toString())
                    checkcal = 1

                } else if (loopcal1 == "*") {
                    textView4.append(cal)
                    number2 = textView3.text.toString().toInt()
                    total = number1 * number2
                    textView3.setText(total.toString())
                    checkcal = 1

                } else if (loopcal1 == "/") {
                    textView4.append(cal)
                    number2 = textView3.text.toString().toInt()
                    total = number1 / number2
                    textView3.setText(total.toString())
                    checkcal = 1

                } else if (loopcal1 == "%") {
                    textView4.append(cal)
                    number2 = textView3.text.toString().toInt()
                    total = number1 % number2
                    textView3.setText(total.toString())
                    checkcal = 1
                }

            } else if (checkcal == 1) {
                if (loopcal1 == "+") {
                    textView4.append(cal)
                    number3 = textView3.text.toString().toInt()
                    total = total + number3
                    textView3.setText(total.toString())

                } else if (loopcal1 == "-") {
                    textView4.append(cal)
                    number3 = textView3.text.toString().toInt()
                    total = total - number3
                    textView3.setText(total.toString())


                } else if (loopcal1 == "*") {
                    textView4.append(cal)
                    number3 = textView3.text.toString().toInt()
                    total = total * number3
                    textView3.setText(total.toString())

                } else if (loopcal1 == "/") {
                    if (textView3.text.toString() == "0") {
                        textView3.setText("ERROR")
                        textView4.setText("")
                        total = 0
                        checkloop = 0
                    } else {

                        textView4.append(cal)
                        number3 = textView3.text.toString().toInt()
                        total = total / number3
                        textView3.setText(total.toString())
                    }

                } else if (loopcal1 == "%") {
                    textView4.append(cal)
                    number3 = textView3.text.toString().toInt()
                    total = total % number3
                    textView3.setText(total.toString())
                    checkcal = 1
                }
            }
        }

    }
}