package peteri.oauthproba.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.antMatcher("/**").authorizeRequests()                  //we dont need to restrict any specific HTTP method
                .antMatchers("/").permitAll()            // the "/" URL is allowed for everyone
                .anyRequest().authenticated()
                .and()
                .oauth2Login();                                     //when we try to access a protected URL,
                                                                    // the application will display an auto-generated
                                                                    // login page with a clients
    }
}
