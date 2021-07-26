package com.wt.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * @Configuration
 * 声明这是一个配置类 在spring中可以代替xml文件
 * @ConfigurationProperties("vegetables")
 * 这是配置文件类 并且声明前缀
 * @PropertySource("")
 *
 */
@Configuration
@ConfigurationProperties("vegetables")
@PropertySource("vegetables.properties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VegetablesConfig {

    private String potato;
    private String eggplane;
    private String greenpeper;

}
