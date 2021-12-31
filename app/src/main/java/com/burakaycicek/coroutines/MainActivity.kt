package com.burakaycicek.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
        /*
        GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }

         */

        //Scope-Kapsam
        //Global Scope - Bütün Uygulamanın kendisinde (tamaminda) kapsamda aciliyor
        //runBlocking
        //CourutineScope

        /*
        //runBlocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")  //sonradan gelen islemleri sirasiyla yapiyor globalde öyle degil
            }
        }
        println("run blocking end")

         */

        /*
        //GlobalScope

        println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("global scope end")

         */


        //CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")





    }
}