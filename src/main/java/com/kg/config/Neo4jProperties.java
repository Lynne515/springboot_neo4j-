package com.kg.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "neo4j.datasource")
public class Neo4jProperties {
    private String uri;
    private String username;
    private String password;


}
