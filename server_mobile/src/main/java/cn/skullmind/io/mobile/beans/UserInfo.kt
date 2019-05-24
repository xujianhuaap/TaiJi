package cn.skullmind.io.mobile.beans

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "user")
data class UserInfo  constructor( @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                                  var id:Int?,
                                  var mobile:String,
                                  @Column(name = "wechat_id",nullable = false)
                                  var wechatId:String,
                                  var password:String,
                                  @Column(name = "update_time")
                                  @UpdateTimestamp
                                  var updateTime:Timestamp?):Serializable{
    constructor(  mobile:String,
                  wechatId:String,
                  password:String):this(null,mobile,wechatId,password,null)
    constructor():this("default","default","default")
}

@Repository
interface UserInfoRepo:JpaRepository<UserInfo,Int>

