package cn.skullmind.io.web.controller.index;

import cn.skullmind.io.web.Arguments;
import cn.skullmind.io.web.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private Arguments applicationArguments;

    @Autowired
    private ServerConfig config;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("title","spring boot");
        modelAndView.addObject("arguments",applicationArguments.getMode());
        modelAndView.addObject("config",config.getConfigInfo().getServers().get(0).getUrl());
        modelAndView.addObject("address",applicationArguments.getAddress());
        return modelAndView;
    }
}
