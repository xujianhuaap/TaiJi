package cn.skullmind.io.server.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private ApplicationArguments applicationArguments;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("title","spring boot");
        modelAndView.addObject("arguments",applicationArguments.getNonOptionArgs());
        return modelAndView;
    }
}
