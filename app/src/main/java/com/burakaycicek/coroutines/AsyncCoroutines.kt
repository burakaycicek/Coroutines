package com.burakaycicek.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {
       val downloadedName = async {
           downloadName()
       }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()  // await-> threadi bloklamadan downladların inmesini bekliyor. Bitince yazdiracal
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")

    }

}

suspend fun downloadName() : String{
    delay(2000)
    val userName = "Burak"
    println("userName download")
    return userName
}

suspend fun downloadAge(): Int{
    delay(4000)
    val userAge = 24
    println("userage download")
    return userAge
}