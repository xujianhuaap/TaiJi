package cn.skullmind.io.geek

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args:Array<String>){
    SpringApplication.run(GeekApplication::class.java,*args)
}

@SpringBootApplication
open class GeekApplication