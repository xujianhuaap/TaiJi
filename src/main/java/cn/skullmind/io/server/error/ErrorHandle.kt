package cn.skullmind.io.server.error

import org.springframework.boot.autoconfigure.web.ErrorProperties
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes
import org.springframework.boot.web.servlet.error.ErrorAttributes
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

val errorViewResolvers = listOf(CustomerErrorViewResolver())
val errorAttributes = DefaultErrorAttributes()
val errorProperties = ErrorProperties()

@Controller
class ErrorHandle
    : BasicErrorController(errorAttributes,errorProperties,errorViewResolvers)