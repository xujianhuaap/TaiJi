package cn.skullmind.io.web.error

import org.springframework.boot.autoconfigure.web.ErrorProperties
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes
import org.springframework.stereotype.Controller

val errorViewResolvers = listOf(CustomerErrorViewResolver())
val errorAttributes = DefaultErrorAttributes()
val errorProperties = ErrorProperties()

@Controller
class ErrorHandle
    : BasicErrorController(errorAttributes, errorProperties, errorViewResolvers)