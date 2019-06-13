package cn.skullmind.io.geek.model

import java.sql.Timestamp

data class Article(val title:String,val id:Int,val updateTimestamp: Timestamp,val content:String)