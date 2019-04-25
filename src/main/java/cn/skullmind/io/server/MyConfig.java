package cn.skullmind.io.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ImportAutoConfiguration
/***
 * @EnablleAutoConfiguration 基于依赖自动配置到应用,必须应用到@Configuration的类上
 * @SpringBootApplication
 */
public class MyConfig {
}
