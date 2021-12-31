package com.burakaycicek.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //Dispatchers
    //Dispatchers.Default -> CPU Intesive (CPU yogun islerde kullaniyor mesela görsel isleme cok uzun bir diziyi dizme.İslemciyi yoracak islemlerde kullanilir )
    //Dispatchers.IO -> Input/ Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher

    runBlocking {

        launch (Dispatchers.Main){
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name} ")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name} ")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name} ")
        }
    }
}