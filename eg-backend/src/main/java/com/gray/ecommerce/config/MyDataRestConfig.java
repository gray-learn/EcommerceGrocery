package com.gray.ecommerce.config;

import com.gray.ecommerce.entity.Grocery;
import com.gray.ecommerce.entity.GroceryCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
        //405 Method Not Allowedc
        // disable  HTTP methods for Pruduct: PUT,POST, DELETE
        config.getExposureConfiguration().forDomainType(Grocery.class)
                .withItemExposure((metedata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metedata, httpMethods) -> httpMethods.disable(theUnsupportedActions));


        // disable  HTTP methods for Pruduct: PUT,POST, DELETE
        config.getExposureConfiguration().forDomainType(GroceryCategory.class)
                .withItemExposure((metedata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metedata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
