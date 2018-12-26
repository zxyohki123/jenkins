package com.yunagile.gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		   List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
	       resources.add(swaggerResource("业务系统", "/notice/v2/api-docs", "2.0"));
	       resources.add(swaggerResource("接口系统", "/feign/v2/api-docs", "2.0"));
	       return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
	
}
