package cn.skullmind.io.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/***
 * kotlin 调用 java api
 */
fun main( args:Array<String>) {
    SpringApplication.run(ServerApplication::class.java, *args)
}
/***
 * @SpringBootApplication 包含三个注解
 * 1> @Configuration 表明该类是一个配置信息的，意味着包含一个或多个@Bean 注解的方法
 * 2>@ComponentScan 用于检索配置注解@Configuration
 * 3>@EnableAutoConfiguration 自动配置
 */

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
open class ServerApplication:WebMvcConfigurer {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        super.addViewControllers(registry)
    }

}

