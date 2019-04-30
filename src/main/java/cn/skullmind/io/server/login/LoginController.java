package cn.skullmind.io.server.login;

import cn.skullmind.io.server.beans.User;
import cn.skullmind.io.server.http.Resp;
import org.apache.juli.logging.Log;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class LoginController {

    /***
     * 用户注册String
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Resp<User> addUser(@RequestParam String name,@RequestParam String mobile,
                        @RequestParam long userId,@RequestParam boolean gender){
        User user = new User();
        user.setName(name);
        user.setMobile(mobile);
        user.setGender(gender);
        user.setUserId(userId);
        Resp<User> resp = new Resp<>(200,"register success",user);
        return resp;
    }

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    public Resp<User> queryUser(@PathVariable long userId){
        User user = new User();
        user.setName("xujianhua");
        user.setMobile("18512177309");
        user.setGender(false);
        user.setUserId(userId);
        Resp<User> resp = new Resp<>(200,"query success",user);
        return resp;
    }

}
