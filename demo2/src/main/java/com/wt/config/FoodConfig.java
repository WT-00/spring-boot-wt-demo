package com.wt.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties
 * 声明这是一个配置文件对应的类
 * prefix是前缀指向的一级目录
 */

@ConfigurationProperties(prefix = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodConfig {

    private String name;
    private Float price;
    private String[]sauce;



}
