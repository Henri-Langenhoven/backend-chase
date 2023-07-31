package com.staffinghub.coding.challenges.retry.inbound;

import com.staffinghub.coding.challenges.retry.core.entities.EmailNotification;
import com.staffinghub.coding.challenges.retry.core.inbound.NotificationHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/emails")
public class EmailController {

    private NotificationHandler notificationHandler;

    public EmailController(NotificationHandler notificationHandler) {
        this.notificationHandler = notificationHandler;
    }

    @PostMapping
    public ResponseEntity<EmailNotification> createEmailNotification(@RequestBody EmailNotification emailNotification) {
        EmailNotification emailNotificationResult = notificationHandler.processEmailNotification(emailNotification);
        return ResponseEntity.ok(emailNotificationResult);
    }
}
