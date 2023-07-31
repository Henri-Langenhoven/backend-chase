package com.staffinghub.coding.challenges.dependency.notifications

import com.staffinghub.coding.challenges.dependency.inquiry.Inquiry
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class PushNotificationHandler {
    fun sendNotification(inquiry: Inquiry) {
        logger.info {
            "Sending push notification for: $inquiry"
        }
    }
}
