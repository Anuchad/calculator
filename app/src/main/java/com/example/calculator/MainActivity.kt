package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

//import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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




        bsero.setOnClickListener {
            //nam.append("0")
            if (this.textView3.text.toString() == "0") {
                textView3.setText("0")
                textView4.setText("0")
            } else if(loopaddnumber == 0){
                textView3.setText("0")
                textView4.append("0")
                loopaddnumber = 1

            } else {
                textView3.append("0")
                textView4.append("0")
            }
        }

        bone.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("1")
                textView4.setText("1")
            } else if(loopaddnumber == 0){
                textView3.setText("1")
                textView4.append("1")
                loopaddnumber = 1

            } else {
                textView3.append("1")
                textView4.append("1")
            }
        }

        btwo.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("2")
                textView4.setText("2")
            } else if(loopaddnumber == 0){
                textView3.setText("2")
                textView4.append("2")
                loopaddnumber = 1

            } else {
                textView3.append("2")
                textView4.append("2")
            }
        }

        btree.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("3")
                textView4.setText("3")
            } else if(loopaddnumber == 0){
                textView3.setText("3")
                textView4.append("3")
                loopaddnumber = 1

            } else {
                textView3.append("3")
                textView4.append("3")
            }
        }

        bfour.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("4")
                textView4.setText("4")
            } else if(loopaddnumber == 0){
                textView3.setText("4")
                textView4.append("4")
                loopaddnumber = 1

            } else {
                textView3.append("4")
                textView4.append("4")
            }
        }

        bfive.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("5")
                textView4.setText("5")
            } else if(loopaddnumber == 0){
                textView3.setText("5")
                textView4.append("5")
                loopaddnumber = 1

            } else {
                textView3.append("5")
                textView4.append("5")
            }
        }

        bsix.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("6")
                textView4.setText("6")
            } else if(loopaddnumber == 0){
                textView3.setText("6")
                textView4.append("6")
                loopaddnumber = 1

            } else {
                textView3.append("6")
                textView4.append("6")
            }
        }

        bseven.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("7")
                textView4.setText("7")
            } else if(loopaddnumber == 0){
                textView3.setText("7")
                textView4.append("7")
                loopaddnumber = 1

            } else {
                textView3.append("7")
                textView4.append("7")
            }
        }

        beight.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("8")
                textView4.setText("8")
            } else if(loopaddnumber == 0){
                textView3.setText("8")
                textView4.append("8")
                loopaddnumber = 1

            } else {
                textView3.append("8")
                textView4.append("8")
            }
        }

        bnine.setOnClickListener {
            if (this.textView3.text.toString() == "0") {
                textView3.setText("9")
                textView4.setText("9")
            } else if(loopaddnumber == 0){
                textView3.setText("9")
                textView4.append("9")
                loopaddnumber = 1

            } else {
                textView3.append("9")
                textView4.append("9")
            }
        }



        bdel.setOnClickListener{
            var name = textView3.text.dropLast(1)
            var name1 = textView4.text.dropLast(1)


            if(this.textView3.text.length.toString() > "0"){

                //var strText1Tmp = textView3.text.toString().substring(0, textView3.text.toString().dropLast(1))
                if(this.textView3.text.length.toString() < "2"){
                    textView3.setText("0")
                    textView4.setText(name1)
                }else{
                    textView3.setText(name)
                    textView4.setText(name1)
                }
            }
        }



        bplush.setOnClickListener {
            loopaddnumber = 0
            looptotal = 1
            loopcal1 = loopcal2
            loopcal2 = "+"



            if (checkloop == 0) {
                if (this.textView3.text.toString() == "0") {
                    textView3.setText("0")
                    checkloop = checkloop + 1



                } else {
                    number1 = textView3.text.toString().toInt()
                    textView4.append("+")
                    checkloop = checkloop + 1


                }
            }  else {
                if (checkcal == 0) {
                    if(loopcal1 == "+"){
                        textView4.append("+")
                        number2 = textView3.text.toString().toInt()
                        total = number1 + number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "-") {
                        textView4.append("+")
                        number2 = textView3.text.toString().toInt()
                        total = number1 - number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "*") {
                        textView4.append("+")
                        number2 = textView3.text.toString().toInt()
                        total = number1 * number2
                        textView3.setText(total.toString())
                        checkcal = 1



                    }else if (loopcal1 == "/") {
                        textView4.append("+")
                        number2 = textView3.text.toString().toInt()
                        total = number1 / number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }else if (loopcal1 == "%") {
                        textView4.append("+")
                        number2 = textView3.text.toString().toInt()
                        total = number1 % number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }

                } else if (checkcal == 1) {
                    if (loopcal1 == "+") {
                        textView4.append("+")
                        number3 = textView3.text.toString().toInt()
                        total = total + number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "-") {
                        textView4.append("+")
                        number3 = textView3.text.toString().toInt()
                        total = total - number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "*") {
                        textView4.append("+")
                        number3 = textView3.text.toString().toInt()
                        total = total * number3
                        textView3.setText(total.toString())



                    } else if (loopcal1 == "/") {
                        if(textView3.text.toString() == "0"){
                            textView3.setText("ERROR")
                            textView4.setText("")
                            total = 0
                            checkloop = 0
                        }else{
                            textView4.append("+")
                            number3 = textView3.text.toString().toInt()
                            total = total / number3
                            textView3.setText(total.toString())
                        }

                    }else if (loopcal1 == "%") {
                        textView4.append("+")
                        number3 = textView3.text.toString().toInt()
                        total = total % number3
                        textView3.setText(total.toString())
                        checkcal = 1
                    }
                }
                }

            }


        bminus.setOnClickListener {
            loopaddnumber = 0
            looptotal = 2
            loopcal1 = loopcal2
            loopcal2 = "-"


            if (checkloop == 0) {
                if (this.textView3.text.toString() == "0") {
                    textView3.setText("0")
                    checkloop = checkloop + 1


                } else {
                    number1 = textView3.text.toString().toInt()
                    textView4.append("-")
                    checkloop = checkloop + 1


                }
            } else {
                if (checkcal == 0) {
                    if(loopcal1 == "+"){
                        textView4.append("-")
                        number2 = textView3.text.toString().toInt()
                        total = number1 + number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "-") {
                        textView4.append("-")
                        number2 = textView3.text.toString().toInt()
                        total = number1 - number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "*") {
                        textView4.append("-")
                        number2 = textView3.text.toString().toInt()
                        total = number1 * number2
                        textView3.setText(total.toString())
                        checkcal = 1



                    }else if (loopcal1 == "/") {
                        textView4.append("-")
                        number2 = textView3.text.toString().toInt()
                        total = number1 / number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }else if (loopcal1 == "%") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 % number2
                        textView3.setText(total.toString())
                        checkcal = 1
                    }

                } else if (checkcal == 1) {
                    if (loopcal1 == "+") {
                        textView4.append("-")
                        number3 = textView3.text.toString().toInt()
                        total = total + number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "-") {
                        textView4.append("-")
                        number3 = textView3.text.toString().toInt()
                        total = total - number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "*") {
                        textView4.append("-")
                        number3 = textView3.text.toString().toInt()
                        total = total * number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "/") {
                        if(textView3.text.toString() == "0"){
                            textView3.setText("ERROR")
                            textView4.setText("")
                            total = 0
                            checkloop = 0
                        }else{
                            textView4.append("-")
                            number3 = textView3.text.toString().toInt()
                            total = total / number3
                            textView3.setText(total.toString())
                        }
                    }else if (loopcal1 == "%") {
                        textView4.append("-")
                        number3 = textView3.text.toString().toInt()
                        total = total % number3
                        textView3.setText(total.toString())
                        checkcal = 1
                    }
                }


            }
        }



        bmultiplied.setOnClickListener {
            loopaddnumber = 0
            looptotal = 3
            loopcal1 = loopcal2
            loopcal2 = "*"

            if (checkloop == 0) {
                if (this.textView3.text.toString() == "0") {
                    textView3.setText("0")
                    checkloop = checkloop + 1

                } else {
                    number1 = textView3.text.toString().toInt()
                    textView4.append("*")
                    checkloop = checkloop + 1

                }
            }   else {
                if (checkcal == 0) {
                    if(loopcal1 == "+"){
                        textView4.append("*")
                        number2 = textView3.text.toString().toInt()
                        total = number1 + number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "-") {
                        textView4.append("*")
                        number2 = textView3.text.toString().toInt()
                        total = number1 - number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "*") {
                        textView4.append("*")
                        number2 = textView3.text.toString().toInt()
                        total = number1 * number2
                        textView3.setText(total.toString())
                        checkcal = 1



                    }else if (loopcal1 == "/") {
                        textView4.append("*")
                        number2 = textView3.text.toString().toInt()
                        total = number1 / number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }else if (loopcal1 == "%") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 % number2
                        textView3.setText(total.toString())
                        checkcal = 1
                    }

                } else if (checkcal == 1) {
                    if (loopcal1 == "+") {
                        textView4.append("*")
                        number3 = textView3.text.toString().toInt()
                        total = total + number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "-") {
                        textView4.append("*")
                        number3 = textView3.text.toString().toInt()
                        total = total - number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "*") {
                        textView4.append("*")
                        number3 = textView3.text.toString().toInt()
                        total = total * number3
                        textView3.setText(total.toString())



                    } else if (loopcal1 == "/") {
                        if(textView3.text.toString() == "0"){
                            textView3.setText("ERROR")
                            textView4.setText("")
                            total = 0
                            checkloop = 0
                        }else{
                            textView4.append("*")
                            number3 = textView3.text.toString().toInt()
                            total = total / number3
                            textView3.setText(total.toString())
                        }

                    }else if (loopcal1 == "%") {
                        textView4.append("*")
                        number3 = textView3.text.toString().toInt()
                        total = total % number3
                        textView3.setText(total.toString())
                        checkcal = 1
                    }
                }

            }
        }

        bdivided.setOnClickListener {
            loopaddnumber = 0
            looptotal = 4
            loopcal1 = loopcal2
            loopcal2 = "/"

            if (checkloop == 0) {
                if (this.textView3.text.toString() == "0") {
                    textView3.setText("0")
                    checkloop = checkloop + 1

                } else {
                    number1 = textView3.text.toString().toInt()
                    textView4.append("/")
                    checkloop = checkloop + 1

                }
            }   else {
                if (checkcal == 0) {
                    if(loopcal1 == "+"){
                        textView4.append("/")
                        number2 = textView3.text.toString().toInt()
                        total = number1 + number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "-") {
                        textView4.append("/")
                        number2 = textView3.text.toString().toInt()
                        total = number1 - number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "*") {
                        textView4.append("/")
                        number2 = textView3.text.toString().toInt()
                        total = number1 * number2
                        textView3.setText(total.toString())
                        checkcal = 1



                    }else if (loopcal1 == "/") {
                        textView4.append("/")
                        number2 = textView3.text.toString().toInt()
                        total = number1 / number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }else if (loopcal1 == "%") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 % number2
                        textView3.setText(total.toString())
                        checkcal = 1
                    }


                } else if (checkcal == 1) {
                    if (loopcal1 == "+") {
                        textView4.append("/")
                        number3 = textView3.text.toString().toInt()
                        total = total + number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "-") {
                        textView4.append("/")
                        number3 = textView3.text.toString().toInt()
                        total = total - number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "*") {
                        textView4.append("/")
                        number3 = textView3.text.toString().toInt()
                        total = total * number3
                        textView3.setText(total.toString())



                    } else if (loopcal1 == "/") {
                        if(textView3.text.toString() == "0"){
                            textView3.setText("ERROR")
                            textView4.setText("")
                            total = 0
                            checkloop = 0
                        }else{
                            textView4.append("/")
                            number3 = textView3.text.toString().toInt()
                            total = total / number3
                            textView3.setText(total.toString())
                        }

                    }else if (loopcal1 == "%") {
                        textView4.append("/")
                        number3 = textView3.text.toString().toInt()
                        total = total % number3
                        textView3.setText(total.toString())
                        checkcal = 1
                    }
                }
            }
        }

        mod.setOnClickListener {
            loopaddnumber = 0
            looptotal = 5
            loopcal1 = loopcal2
            loopcal2 = "%"

            if (checkloop == 0) {
                if (this.textView3.text.toString() == "0") {
                    textView3.setText("0")
                    checkloop = checkloop + 1

                } else {
                    number1 = textView3.text.toString().toInt()
                    textView4.append("%")
                    checkloop = checkloop + 1

                }
            }   else {
                if (checkcal == 0) {
                    if(loopcal1 == "+"){
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 + number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "-") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 - number2
                        textView3.setText(total.toString())
                        checkcal = 1


                    }else if (loopcal1 == "*") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 * number2
                        textView3.setText(total.toString())
                        checkcal = 1



                    }else if (loopcal1 == "/") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 / number2
                        textView3.setText(total.toString())
                        checkcal = 1

                    }else if (loopcal1 == "%") {
                        textView4.append("%")
                        number2 = textView3.text.toString().toInt()
                        total = number1 % number2
                        textView3.setText(total.toString())
                        checkcal = 1
                    }


                } else if (checkcal == 1) {
                    if (loopcal1 == "+") {
                        textView4.append("%")
                        number3 = textView3.text.toString().toInt()
                        total = total + number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "-") {
                        textView4.append("%")
                        number3 = textView3.text.toString().toInt()
                        total = total - number3
                        textView3.setText(total.toString())


                    } else if (loopcal1 == "*") {
                        textView4.append("%")
                        number3 = textView3.text.toString().toInt()
                        total = total * number3
                        textView3.setText(total.toString())



                    } else if (loopcal1 == "/") {
                        if(textView3.text.toString() == "0"){
                            textView3.setText("ERROR")
                            textView4.setText("")
                            total = 0
                            checkloop = 0
                        }else{
                            textView4.append("%")
                            number3 = textView3.text.toString().toInt()
                            total = total / number3
                            textView3.setText(total.toString())
                        }

                    }else if (loopcal1 == "%") {
                        textView4.append("%")
                        number3 = textView3.text.toString().toInt()
                        total = total % number3
                        textView3.setText(total.toString())
                        checkcal = 1
                    }
                }
            }
        }



        btotal.setOnClickListener {
            if (looptotal == 1) {

                if (checkcal  == 1){
                    number3 = textView3.text.toString().toInt()
                    total = total + number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0


                } else if (loopcal2 == "+"){

                    number2 = textView3.text.toString().toInt()
                    total = number1 + number2
                    textView3.setText(total.toString())
                    looptotal = 0


                }
            } else if (looptotal == 2) {
                if  (checkcal  == 1){
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
                if  (checkcal == 1){
                    number3 = textView3.text.toString().toInt()
                    total = total * number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "*"){
                    number2 = textView3.text.toString().toInt()
                    total = number1 * number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            } else if(looptotal == 4){
                if  (checkcal == 1){
                    number3 = textView3.text.toString().toInt()
                    total = total / number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if(total == 0){
                   textView3.setText("ERROR")
                    textView4.setText("")
                }  else if (loopcal2 == "/"){
                    number2 = textView3.text.toString().toInt()
                    total = number1 / number2
                    textView3.setText(total.toString())
                    looptotal = 0

                }
            }else if (looptotal == 5) {
                if  (checkcal == 1){
                    number3 = textView3.text.toString().toInt()
                    total = total % number3
                    textView3.setText(total.toString())
                    looptotal = 0
                    checkcal = 0

                } else if (loopcal2 == "%"){
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



        //textView4.setText(namber1.toString() + "+")


    }

}






