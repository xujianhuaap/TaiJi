package cn.skullmind.io.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/***
 * @ConfigrationProperties 是外部扩展的属性注解
 * @Configuration 是表示这是个配置类，以便主类扫描加载。
 */
@ConfigurationProperties(prefix = "server-config")
@Configuration
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
