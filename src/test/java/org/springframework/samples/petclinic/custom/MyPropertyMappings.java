package org.springframework.samples.petclinic.custom;

import org.springframework.boot.test.context.PropertyMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyPropertyMappings {

	@PropertyMapping("spring.datasource.username")
	String username() default "";

	@PropertyMapping("spring.datasource.password")
	String password() default "";

	@PropertyMapping("spring.datasource.url")
	String url() default "";
}
