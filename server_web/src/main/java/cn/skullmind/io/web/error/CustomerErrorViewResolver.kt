package cn.skullmind.io.web.error

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver
import org.springframework.http.HttpStatus
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

open class CustomerErrorViewResolver:ErrorViewResolver{
    override fun resolveErrorView(request: HttpServletRequest?, status: HttpStatus?, model: MutableMap<String, Any>?): ModelAndView {
        val value = status?.value()
        val errorView = ModelAndView()
        if(value==404) errorView.viewName = "/error/404"
        return errorView
    }
}