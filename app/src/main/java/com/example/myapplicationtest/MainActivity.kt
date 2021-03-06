package com.example.myapplicationtest

import android.app.Person
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationtest.CustomInterface.Callll
import com.example.myapplicationtest.SealedClassDescription.Colure
import com.example.myapplicationtest.SealedClassDescription.Shape
import com.example.myapplicationtest.dataclass.PersonUser
import com.example.myapplicationtest.delegateexample.ModifyArraylist
import com.example.myapplicationtest.generic.*
import com.example.myapplicationtest.objectPackeOrSingleTone.Singletone
import com.example.myapplicationtest.util.Connection
import com.example.myapplicationtest.util.Host
import com.example.myapplicationtest.util.SingleIndPredicate
import kotlin.math.sqrt
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    var singleAbsInteface = object : SingleIndPredicate {
        override fun accept(a: Int): Boolean {

            return true
        }

    }
    val lazyValue: String by lazy {
        println("computed!")
        "Hello858"
    }

    private val valuee:String by lazyValue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvext = findViewById<TextView>(R.id.tv)
        Log.d("TAG","delegate === "+valuee.toString())
        // call back funcion implement
        mainFunciotn(45){result: Int ->

            Log.d("TAG","Second function uyu "+result.toString())

        }


        // example of lamda interface , here calll is interface of CustomInterface
        // class and we implement this lamda expression
        // its like view onclick listener

        var customInterface = CustomInterface(this)
        customInterface.getCall(object : Callll {
            override fun clikkk() {
                Log.d("TAG","Second functio=== ")
            }
       })



       // example of single abstract interface function and accept method return true
        Toast.makeText(applicationContext, singleAbsInteface.accept(5).toString(), Toast.LENGTH_SHORT).show()

        // its for extension function use class lavel as a member field
        // here host is a call and connection is method of connection class
        Connection(Host("hose"),421).connection()

       // example of data class when you use data class
    // you can copy ,equals,tostring, destruction  parameter

        var person = PersonUser("karim",45)
        var person2 = person
        var personInfo = person.toString()

        var person3 = PersonUser("Alal",30)

        //destruction
        var (nam,aga) = person


        Log.d("TAG","Person2 Copy "+person2.toString()+"'\'"
                +" Personinfo  "+ personInfo.toString()+" '\' "
                + " name and age  "+nam.toString()+" "+aga.toString()+"'\""
                +person.equals(person3).toString())
        //print
        //Person2 Copy PersonUser(name=karim, age=45)''
    // Personinfo  PersonUser(name=karim, age=45) ''
    // name and age  karim 45'"
    // false
// selead example
        val r = Colure.Red()
        eval(r)

 // selead example two
        val circle = Shape.Circle(5.0)
        Log.d("TAG","Main function "+  circle.takeArea().toString())
        val rentable = Shape.Rentangle(5.0,5.0)
        Log.d("TAG","Main function "+  rentable.takeArea().toString())
        val squre = Shape.Squre(5.0)
        Log.d("TAG","Main function "+  squre.takeArea().toString())


// generic


       val box =  Box<Int>(5)

       val tox = Box<String>("5")

        val fox = Box(7)
        Log.d("TAG","Generic    "+   box.value+"  "+ tox.value+"  "+ fox.value)

        var production1: ProduceInterface<Food> = Foodstore()
        var production2: ProduceInterface<Food> = FastFoodStore()
        var production3: ProduceInterface<Food> = BurgerStore()

        // errore   because food or fastFood is not just a burger production.
       /* var production1: ProduceInterface<Burger> = Foodstore()
        var production2: ProduceInterface<Burger> = FastFoodStore()
        var production3: ProduceInterface<Burger> = BurgerStore()*/



        //singletone or  object for more  https://medium.com/androiddevelopers/the-one-and-only-object-5dfd2cf7ab9b
        val helloworld = object {
            val hellow = "hellow"
            val world = "world"
            var count = 0


            override fun toString(): String {
                count +=1
                Log.d("TAG","Object "+"$hellow  $world $count")
                return  "ta]"
            }
        }




        tvext.setOnClickListener {
            helloworld.toString()
            Singletone.count()

        }

        // using delegation modify the system array list remove
        // method , delegation is alternative of inheritance you use property and class deligation
        // more link is https://medium.com/androiddevelopers/delegating-delegates-to-kotlin-ee0a0b21c52b


         var list = ArrayList<String>()
        list.add("dal")
        list.add("kal")
        list.add("chal")

        val modifyArraylist = ModifyArraylist<String>(list)
        modifyArraylist.remove("dal")

        Log.d("TAG","delegate  "+list.size.toString()+" "+modifyArraylist.recover())





    }



    //callback function
    fun mainFunciotn(a:Int, myCallbach: (result: Int) -> Unit){
        Log.d("TAG","Main function "+a.toString())
         myCallbach.invoke(455)
    }


    fun eval(c: Colure) =
        when (c) {
            is Colure.Red ->  Log.d("TAG","Paint in Red Color")
            is Colure.Orange ->  Log.d("TAG","Paint in Orange Color")
            is Colure.Blue ->  Log.d("TAG","Paint in Blue Color")

        }

    fun Shape.takeArea():Double {
        return when(this){
            is Shape.Circle ->Math.PI * sqrt(this.radius)
            is Shape.Squre -> sqrt(this.length)
            is Shape.Rentangle -> this.breth * this.length

        }

    }

    inline class Taka(val price: Float) {
        inline fun getTaka(): Float = price * 71.62f
    }

    private operator fun String.getValue(thisRef: Any?, property: KProperty<*>): String = lazyValue

}


