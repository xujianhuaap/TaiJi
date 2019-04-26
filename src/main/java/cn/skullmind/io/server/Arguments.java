package cn.skullmind.io.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/***
 * java -jar server.jar version_code=10 version_name=magic
 */
@Component
public class Arguments {
    @Autowired
    public Arguments(ApplicationArguments arguments) {
        boolean debug = arguments.containsOption("debug");
        List<String> strings = arguments.getNonOptionArgs();
        System.out.println("=====arguments=====");
        for(String s:strings){
            System.out.println("arguments===>"+s);
        }

    }
}
