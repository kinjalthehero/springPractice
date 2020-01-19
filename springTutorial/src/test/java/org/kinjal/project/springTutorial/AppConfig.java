package org.kinjal.project.springTutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Samsung.class, Snapdragon.class})
public class AppConfig {}
