package cn.skullmind.io.mobile.controller.login

import cn.skullmind.io.mobile.beans.Order
import cn.skullmind.io.base.http.Resp
import cn.skullmind.io.mobile.service.OrderServiceImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.sql.Timestamp
import java.util.*

@RestController
class OrderController{
    @Autowired var service:OrderServiceImp?=null

    @GetMapping(value = ["/order/{id}"])
    fun findOrder(@PathVariable id:String): Resp<Order?>{
        val order = service?.findById(id)
        return Resp(200,"",order)
    }

    @PostMapping(value = ["/order"])
    fun createOrder(@RequestParam totalValue: Int,@RequestParam status: Int ):Resp<Order?>{
        val order = Order(totalValue,status, Timestamp(Date().time))
        val insertOrder = service?.insertByOrder(order)
        return Resp(200,"",insertOrder)
    }
}