package cn.skullmind.io.mobile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/***
 * @ConfigrationProperties 是外部扩展的属性注解,还具有自动方便的binding功能,但需要满足一定的命名规则
 * 例如在application.yml文件中定义server-config 则会自动关联ServerConfig 这个类，从而具有@Bean的效果
 * @Configuration 是表示这是个配置类，以便主类扫描加载。
 * @Profile 是为了标识区分不同环境的配置这里只能在application.property文件中的spring.profile.active =dev
 * 的时候ServerConfig才会生效
 */
@ConfigurationProperties(prefix = "mobile-config")
@Configuration
@Profile("dev")
public class ServerConfig {
    private String name;
    private ConfigInfo configInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigInfo getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(ConfigInfo configInfo) {
        this.configInfo = configInfo;
    }
}
