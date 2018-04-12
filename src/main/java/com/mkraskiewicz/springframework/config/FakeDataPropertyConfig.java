package com.mkraskiewicz.springframework.config;

import com.mkraskiewicz.springframework.beans.JmsUserBean;
import com.mkraskiewicz.springframework.beans.UserBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Maciej on 09/04/2018
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:fakeData.properties"),
        @PropertySource("classpath:fakeData.jms.properties")
        })
public class FakeDataPropertyConfig {

    @Value("${mkraskiewicz.username}")
    String username;
    @Value("${mkraskiewicz.password}")
    String password;
    @Value("${mkraskiewicz.url}")
    String url;

    @Value("${mkraskiewicz.jms.username}")
    String jmsUsername;
    @Value("${mkraskiewicz.jms.password}")
    String jmsPassword;
    @Value("${mkraskiewicz.jms.url}")
    String jmsUrl;

    @Bean
    public UserBean typicalUser(){
        UserBean userBean = new UserBean(username,password,url);
        return userBean;
    }

    @Bean
    public JmsUserBean someJmsUser(){
        JmsUserBean jmsUserBean = new JmsUserBean(jmsUsername,jmsPassword,jmsUrl);
        return jmsUserBean;
    }



    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
