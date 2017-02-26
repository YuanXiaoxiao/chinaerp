package cn.china.erp.index.config;

import cn.china.erp.index.security.SecurityConfiguration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by lixiang on 17/2/24.
 *
 * 1. Automatically register the springSecurityFilterChain Filter for every URL in your application
 * 2. Add a ContextLoaderListener that loads the SecurityConfig.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(SecurityConfiguration.class);
    }
}
