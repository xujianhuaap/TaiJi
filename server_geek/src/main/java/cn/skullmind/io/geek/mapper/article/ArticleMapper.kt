package cn.skullmind.io.geek.mapper.article

import cn.skullmind.io.geek.mapper.BaseMapper
import cn.skullmind.io.geek.model.Article
import org.apache.ibatis.annotations.*
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Mapper
@Component
interface ArticleMapper: BaseMapper<Int, Article>