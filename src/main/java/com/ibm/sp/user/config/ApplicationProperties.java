package com.ibm.sp.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to My UAA 02.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
