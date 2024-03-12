package Aaron.Garcia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 -variables aquellas que su valor cambian
        var dia: String // letras
        var edad: Int // enteros
        var velocidad: Double // decimal
        var temperatura: Float  = 30.9f// decimal de menor precisión siempre poner una f al final los datos al momento de asignar un valor
        0
        //2- Valores (constantes) que nunca van a cambiar
        val numeroPi:Double = 3.1416342
        val DUI: String = "243435-1"
        val fechaNacimiento: String = "29 de julio del 99"

        //arreglos arrayOF

        //3- Variables nulas
        var telefono: Int? = null
    //Para declarar una variable como nula se pone "?" al final del tipo de dato y luego poner =  null
        //? = comprobar si la variable es nula, si tiene el símbolo de pregunta esta variable puede contener valores nulos PERO primero comprueban si es nulo o no para que la aplicación no se cierre 4

        val objCalculadora = Calculadora()
        objCalculadora.sumar(2,4)
        objCalculadora.restar(2,4)
        objCalculadora.multiplicación(2,4)
        objCalculadora.dividir(2,4)
        println( objCalculadora.sumar(2,4)
        )
        println( objCalculadora.restar(2,4)
        )
        println( objCalculadora.multiplicación(2,4)
        )
        println( objCalculadora.dividir(2,4)
        )
    }
}
    //4- clases no se pueden crear clases en funciones ior los que nos salimos de oncreate
