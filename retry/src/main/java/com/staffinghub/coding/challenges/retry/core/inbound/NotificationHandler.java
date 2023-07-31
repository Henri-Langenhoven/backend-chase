package com.staffinghub.coding.challenges.retry.core.inbound;

import com.staffinghub.coding.challenges.retry.core.entities.EmailNotification;

public interface NotificationHandler {

    EmailNotification processEmailNotification(EmailNotification emailNotification);
}
