package com.wt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration
 * 首先声明是配置文件类
 * @EnableSwagger2
 * 开启swagger功能
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 使用swagger需要创建一个摘要 Docket
     * 摘要参数如下:
     *  文档类型-使用swagger2    DocumentationType.SWAGGER_2
     *  文档通过一系列的选择器组成  api path
     *  select() 设置apis() 和paths()
     *  apis哪些controller接口
     *  path    在查找出来的接口中进行筛选
     * @return
     */

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){

        return new ApiInfoBuilder().title("spring-boot-demo-swagger")
                .description("这是一个简单的swagger的demo")
                .version("1.0")
                .build();
    }
}
