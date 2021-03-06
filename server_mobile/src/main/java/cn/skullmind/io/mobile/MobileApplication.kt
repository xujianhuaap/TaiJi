package cn.skullmind.io.mobile

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/***
 * kotlin 调用 java api
 */
fun main( args:Array<String>) {
    SpringApplication.run(MobileApplication::class.java, *args)
}
/***
 * @SpringBootApplication 包含三个注解
 * 1> @Configuration 表明该类是一个配置信息的，意味着包含一个或多个@Bean 注解的方法
 * 2>@ComponentScan 用于检索配置注解@Configuration
 * 3>@EnableAutoConfiguration 自动配置
 */

@SpringBootApplication
open class MobileApplication

