package com.example.demo;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chi  2017-10-30 15:16
 **/
@Configuration
public class RibbonConfiguration {
    @Autowired
    private SpringClientFactory springClientFactory;

    @Bean
    public IRule ribbonRule() {
        //TODO CHI 随机
        return new RandomRule();
    }
}
