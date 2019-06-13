package cn.skullmind.io.geek.model

import java.io.Serializable
import java.sql.Timestamp

data class Article(val title:String,val id:Int?,val updateTimestamp: Timestamp?,val content:String):Serializable{
    constructor( title:String, content: String):this(title,null,null,content)
}