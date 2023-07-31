package com.staffinghub.coding.challenges.auth.configuration;

import com.staffinghub.coding.challenges.auth.core.logic.DoorService;
import com.staffinghub.coding.challenges.auth.core.outbound.DoorDatabaseProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalBeanConfiguration {

    @Bean(name = "doorService")
    public DoorService doorService(DoorDatabaseProvider doorDatabaseProvider) {
        return new DoorService(doorDatabaseProvider);
    }

}
