package com.bach.curso.springboot.app.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@PropertySources({
	@PropertySource(value="classpath:values.properties", encoding = "UTF-8"), //para utilizar tildes o caracteres especiales
})
@Configuration
public class ValuesConfig {

}
