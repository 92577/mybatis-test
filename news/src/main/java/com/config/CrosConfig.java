package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfig implements WebMvcConfigurer
{
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		// springboot2.4之后配置跨域用allowOriginPatterns代替
		registry.addMapping("/**")
				// 设置允许跨域请求的域名
				.allowedOriginPatterns("*")
				// 是否允许证书（cookies）
				.allowCredentials(true)
				// 设置允许的方法
				.allowedMethods("*")
				.allowedHeaders("*")
				// 跨域允许时间
				.maxAge(3600);
	}
}
