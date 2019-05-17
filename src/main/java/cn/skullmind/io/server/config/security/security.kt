package cn.skullmind.io.server.config.security

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.web.util.matcher.AntPathRequestMatcher


@Configuration
@Order(1)
open class AcutatorSecurity: WebSecurityConfigurerAdapter(){
    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()
                ?.antMatchers("/css/**","/images/**","/login")?.permitAll()
                ?.anyRequest()?.fullyAuthenticated()
                ?.and()
                ?.formLogin()?.loginPage("/login")?.failureUrl("/login?error")
                ?.and()
                ?.logout()?.logoutRequestMatcher(AntPathRequestMatcher("/logout"))
                ?.and()
                ?.exceptionHandling()?.accessDeniedPage("/access?error")
    }

    /***
     *
     */
    override fun configure(auth: AuthenticationManagerBuilder?) {
        val encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()
        val pwd = encoder.encode("123456")
        auth?.inMemoryAuthentication()
                ?.passwordEncoder(encoder)
                ?.withUser("user")?.password("123")?.roles("USER")
                ?.and()
                ?.withUser("admin")?.password(pwd)?.roles("ADMIN","USER")
    }

}

@Configuration
@Order(2)
open class ActuatorSecurity : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        // @formatter:off
        http.requestMatcher(EndpointRequest.toAnyEndpoint()).authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
        // @formatter:on
    }

}


