package com.donishchenko.webbudget.config;

import com.donishchenko.webbudget.services.UserDetailsServiceImpl;
import com.donishchenko.webbudget.services.UserService;
import com.donishchenko.webbudget.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

// Говорим, что это конфигурация
@Configuration
// Включаем MVC
@EnableWebMvc
// Указываем где искать контроллеры и остальные компоненты
@ComponentScan("com.donishchenko.webbudget")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        // указываем где будут лежать наши веб-страницы
        resolver.setPrefix("/WEB-INF/pages/");
        // формат View который мы будем использовать
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

    @Bean
    public UserDetailsServiceImpl getUserDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
