package com.example.spring5.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages ="com.example.spring5.beans") // inorder to scan the values from package
@Configuration
public class Appconf {
}
