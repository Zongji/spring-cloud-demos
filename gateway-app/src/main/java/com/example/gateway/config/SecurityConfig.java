//package com.example.gateway.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    public SecurityConfig() {
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//
//        successHandler.setTargetUrlParameter("redirectTo");
//        http.authorizeRequests().antMatchers("/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage("/login")
//                .successHandler(successHandler)
//                .and()
//                .logout().logoutUrl("/logout")
//                .and()
//                .httpBasic()
//                .and()
//                .csrf().disable();
//    }
//}
