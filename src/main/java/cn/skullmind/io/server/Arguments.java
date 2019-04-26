package cn.skullmind.io.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Arguments {
    @Autowired
    public Arguments(ApplicationArguments arguments) {
        boolean debug = arguments.containsOption("debug");
        List<String> strings = arguments.getNonOptionArgs();
        for(String s:strings){
            System.out.println(s);
        }

    }
}
