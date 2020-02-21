package com.javastudio.tutorial.configuration;

public class WebMvcConfig {

}

/*
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    private static final Logger logger = Logger.getLogger(WebMvcConfig.class.getName());

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        logger.info("Enable default servlet handler configurer");
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("Add interceptor for detecting parameter change");
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        registry.addInterceptor(interceptor).addPathPatterns("/*");
    }
}
*/