package cn.skullmind.io.mobile.controller.login

import cn.skullmind.io.mobile.beans.UserInfo
import cn.skullmind.io.mobile.http.Resp
import cn.skullmind.io.mobile.service.UserInfoServiceImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class LoginController {
    @Autowired
    var service:UserInfoServiceImp?=null

    /***
     * 用户注册String
     * @return
     */
    @RequestMapping(value = ["/user"],method = [RequestMethod.POST],
            produces = ["application/json;charset=UTF-8"])
    @ResponseBody
    fun addUser(@RequestParam wechatId:String,
                @RequestParam mobile:String,
                @RequestParam password:String):Resp<UserInfo?>{

        val user = UserInfo(mobile,wechatId,password)
        val insertUser = service?.insertByUserInfo(user)
        return Resp(200,"register success",insertUser)
    }

    @RequestMapping(value = ["/user/{userId}"],method = [RequestMethod.GET])
    fun  queryUser(@PathVariable  userId:Int):Resp<UserInfo?>{
         val user = service?.findById(userId)
         return Resp(200,"query success",user)
    }

    @RequestMapping(value = ["/user/{userId}"],method = [RequestMethod.DELETE])
    fun  deleteUser(@PathVariable  userId:Int):Resp<UserInfo?>{
        service?.delete(userId)
        return Resp(200,"delete success",null)
    }

}
