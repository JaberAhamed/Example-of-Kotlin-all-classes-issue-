package com.example.myapplicationtest

import android.app.Person
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationtest.CustomInterface.Callll
import com.example.myapplicationtest.dataclass.PersonUser
import com.example.myapplicationtest.util.Connection
import com.example.myapplicationtest.util.Host
import com.example.myapplicationtest.util.SingleIndPredicate

class MainActivity : AppCompatActivity() {
    var singleAbsInteface = object : SingleIndPredicate {
        override fun accept(a: Int): Boolean {

            return true
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        var person2 = person.copy()
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


    }


//callback function
    fun mainFunciotn(a:Int, myCallbach: (result: Int) -> Unit){
        Log.d("TAG","Main function "+a.toString())
         myCallbach.invoke(455)
    }




}