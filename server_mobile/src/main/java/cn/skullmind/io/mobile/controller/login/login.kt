//package cn.skullmind.io.mobile.controller.login
//
//import org.springframework.security.access.annotation.Secured
//import org.springframework.stereotype.Controller
//import org.springframework.mobile.bind.annotation.GetMapping
//import org.springframework.mobile.bind.annotation.RequestMapping
//import org.springframework.mobile.servlet.ModelAndView
//import java.util.*
//
//@Controller
//open class LoginSecurityController{
//    @RequestMapping(value = "/login")
//    fun login():ModelAndView{
//        val view = ModelAndView()
//        view.viewName = "login"
//        return view
//    }
//
//    @RequestMapping(value = "/access")
//    fun access():ModelAndView{
//        val view = ModelAndView()
//        view.viewName = "access"
//        return view
//    }
//
//    @GetMapping("/home")
//    @Secured("ROLE_ADMIN")
//    fun home(model:MutableMap<String,Any>):ModelAndView{
//        model["message"]= "Hello World"
//        model["title"]="Hello Home"
//        model["date"]= Date()
//        var view = ModelAndView()
//        view.addAllObjects(model)
//        view.viewName = "home"
//        return view
//    }
//}