package cn.skullmind.io.geek.controller

import cn.skullmind.io.base.http.Resp
import cn.skullmind.io.geek.mapper.article.ArticleMapper
import cn.skullmind.io.geek.model.Article
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ArticleController{
    @Autowired
    var articleMapper: ArticleMapper?=null

    @GetMapping(value = ["/article"])
    fun findArticle(@RequestParam("id")id:Int): Resp<Article?> {
        val articles = articleMapper?.findById(id)
        return Resp(200,"",articles)
    }

    @PostMapping("/article")
    fun publishArticle(@RequestParam("title")title:String,@RequestParam("content")content:String):Resp<Int?>{
        val article = Article(title,content)
        val insert = articleMapper?.insert(article)
        return Resp(200,"",insert)
    }
    @PutMapping("/article")
    fun updateArticle(@RequestParam("title")title:String,
                      @RequestParam("id")id:Int,
                      @RequestParam("content")content:String):Resp<Int?>{
        var article = Article(title,id,null,content)
        val update = articleMapper?.update(article)
        return Resp(200,"",update)
    }

    @DeleteMapping("article")
    fun deleteArticle(@RequestParam("id")id: Int):Resp<Int?>{
        val i = articleMapper?.delete(id)
        return Resp(200,"",i)
    }
    @GetMapping("/articles")
    fun findAllArticles():Resp<List<Article>?>{
        val map = mapOf("start" to 1,"limit" to 10)
        val articles = articleMapper?.findAllByFilter(map)
        return Resp(200,"",articles)
    }
}