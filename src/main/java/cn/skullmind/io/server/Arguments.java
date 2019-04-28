package cn.skullmind.io.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/***
 * java -jar server.jar version_code=10 version_name=magic
 */
@Component
public class Arguments {
    @Value("${mode}")
    private String mode;

    /***
     * 从配置文件读取属性值
     */
    @Value("${server.address}")
    private String address;

    @Autowired
    public Arguments(ApplicationArguments arguments) {
        boolean debug = arguments.containsOption("debug");
        List<String> strings = arguments.getNonOptionArgs();
        System.out.println("=====arguments=====");
        for(String s:strings){
            System.out.println("arguments===>"+s);
        }

    }

    public String getMode() {
        return mode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
