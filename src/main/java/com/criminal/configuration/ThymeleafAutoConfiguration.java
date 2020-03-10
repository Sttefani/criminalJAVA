package com.criminal.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods=false)
@EnableConfigurationProperties(value=ThymeleafProperties.class)
@ConditionalOnClass(value={org.thymeleaf.templatemode.TemplateMode.class,org.thymeleaf.spring5.SpringTemplateEngine.class})
@AutoConfigureAfter(value={WebMvcAutoConfiguration.class,WebFluxAutoConfiguration.class})

public class ThymeleafAutoConfiguration extends Object{

}
