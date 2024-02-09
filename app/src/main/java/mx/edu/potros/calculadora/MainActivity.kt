package mx.edu.potros.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0: nada, 1: suma, 2: resta, 3: multiplicacion, 4: division
    var oper: Int=0
    var num1: Double = 0.0
    lateinit var tvnum1: TextView
    lateinit var tvnum2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvnum1 = findViewById(R.id.tvnum1)
        tvnum2 = findViewById(R.id.tvnum2)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnResultado:Button = findViewById(R.id.btnResultado)

        btnResultado.setOnClickListener{
            var num2: Double = tvnum2.text.toString().toDouble()
            var resp: Double = 0.0

            when(oper){
                1 -> resp = num1 + num2
                2 -> resp = num1 - num2
                3 -> resp = num1 * num2
                4 -> resp = num1 / num2
            }

            tvnum2
        }
    }

    fun presionarDigito(view: View){
        //val tvnum2: TextView = findViewById(R.id.tvnum2)
        var num2: String = tvnum2.text.toString()

        when(view.id){
            R.id.btnNo0 -> tvnum2.setText(num2 + "0")
            R.id.btnNo1 -> tvnum2.setText(num2 + "1")
            R.id.btnNo2 -> tvnum2.setText(num2 + "2")
            R.id.btnNo3 -> tvnum2.setText(num2 + "3")
            R.id.btnNo4 -> tvnum2.setText(num2 + "4")
            R.id.btnNo5 -> tvnum2.setText(num2 + "5")
            R.id.btnNo6 -> tvnum2.setText(num2 + "6")
            R.id.btnNo7 -> tvnum2.setText(num2 + "7")
            R.id.btnNo8 -> tvnum2.setText(num2 + "8")
            R.id.btnNo9 -> tvnum2.setText(num2 + "9")
            R.id.btnDecimal -> tvnum2.setText(num2 + ".")
        }
    }

    fun clicOperacion(view: View){
      num1 = tvnum2.text.toString().toDouble()
      var num2text: String = tvnum2.text.toString()
        tvnum2.setText("")
        when(view.id){
            R.id.btnSuma ->{
                tvnum1.setText(num2text + "+")
                oper = 1
            }
            R.id.btnResta ->{
                tvnum1.setText(num2text + "-")
                oper = 2
            }
            R.id.btnMulti ->{
                tvnum1.setText(num2text + "*")
                oper = 3
            }
            R.id.btnDivision ->{
                tvnum1.setText(num2text + "/")
                oper = 4
            }
        }

    }
}