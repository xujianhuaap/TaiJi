package cn.skullmind.io.mobile.beans

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Document(collection = "order")
data class Order(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                 val id:String?,
                 @Column(name = "total_value", nullable = false) val totalValue:Int,
                 val status:Int,
                 @Column(name = "update_time",nullable = false)
                 val updateTime:Timestamp
    ):Serializable{
    constructor(totalValue: Int,status: Int ,updateTime:Timestamp):this(null,totalValue,status,updateTime)
}

@Repository
interface OrderRepo: MongoRepository<Order, String>