package com.staffinghub.coding.challenges.retry.configuration;

import com.staffinghub.coding.challenges.retry.core.inbound.NotificationHandler;
import com.staffinghub.coding.challenges.retry.core.logic.NotificationService;
import com.staffinghub.coding.challenges.retry.core.outbound.NotificationSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalBeanConfiguration {

    @Bean
    public NotificationHandler notificationHandler(NotificationSender notificationSender) {
        return new NotificationService(notificationSender);
    }
}
