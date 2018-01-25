//package com.codeup.springbootblog;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    private UserDetailsLoader userDetailsLoader;
//}
//
//public SecurityConfiguration(UserDetailsLoader userDetailsLoader) {
//    this.userDetailsLoader = userDetailsLoader;
//}
//
//@Bean
//public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//}
//
//@Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth
//            .userDetailsService(userDetailsLoader)
//            .passwordEncoder(passwordEncoder())
//            ;
//}
//
//@Override
//protected void configure(HttpSecurity http) throws Exception {
//    http
//            .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/login?logout")
//            .and()
//                .authorizeRequests()
//                .antMatchers("/", "/ads")
//                .permitAll()
//            .and()
//                .authorizeRequests()
//                .antMatchers(
//                        "/posts/create",
//                        "/posts/{id}/edit",
//                        "/ads/new",
//                        "/ads/create"
//                )
//            .authenticated()
//            ;
//
//}