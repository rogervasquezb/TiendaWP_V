/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author rvasq
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception{
   auth.inMemoryAuthentication()
           .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN","VENDEDOR","USER")
           .and()
           .withUser("vendedor")
                .password("{noop}123")
                .roles("VENDEDOR", "USER")
           .and()
           .withUser("USER")
                .password("{noop}123")
                .roles("USER");
           
   }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/articulo/nuevo",         "/articulo/guardar",
                             "/articulo/modificar/**",  "/articulo/eliminar/**",
                             "/categoria/nuevo",        "/categoria/guardar",
                             "/categoria/modificar/**", "/categoria/eliminar/**",
                             "/cliente/nuevo",          "/cliente/guardar",
                             "/cliente/modificar/**",   "/cliente/eliminar/**")
                    .hasRole("ADMIN")
                .antMatchers("/articulo/listado",         "/cliente/listado",
                             "/categoria/listado")
                    .hasAnyRole("ADMIN", "VENDEDOR")
                .antMatchers("/")
                    .hasAnyRole("ADMIN", "VENDEDOR", "USER")
                .and()
                    .formLogin()
                    .loginPage("/login")
                .and()
                    .exceptionHandling().accessDeniedPage("/errores/403");
    }
   
}
