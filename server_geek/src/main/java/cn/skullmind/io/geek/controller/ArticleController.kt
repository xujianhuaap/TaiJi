package cn.skullmind.io.geek.controller

import cn.skullmind.io.base.http.Resp
import cn.skullmind.io.geek.mapper.article.ArticleMapper
import cn.skullmind.io.geek.model.Article
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController{
    @Autowired
    var article: ArticleMapper?=null

    @GetMapping
    fun findArticle(@RequestParam("id")id:Int): Resp<Article?> {
        val articles = article?.findById(id)
        return Resp(200,"",articles)
    }
}