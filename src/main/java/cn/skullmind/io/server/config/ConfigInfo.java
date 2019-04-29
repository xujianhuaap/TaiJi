package cn.skullmind.io.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

/***
 * @EnableConfigurationProperties 是对@ConfigurationProperties的支持，
 * 快速将@ConfigurationProperties注解的类下的方法注册为@bean
 */
@ConfigurationProperties(prefix ="config-info")
@EnableConfigurationProperties(value = ConfigInfo.class)
public class ConfigInfo {
    private String name;
    private List<ServerInfo> servers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServerInfo> getServers() {
        return servers;
    }

    public void setServers(List<ServerInfo> servers) {
        this.servers = servers;
    }
}
