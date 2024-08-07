package com.bakerhughes.notificationservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping("/email")
    public String sendEmailNotification(@RequestBody String emailDetails) {
        // Logic to send email notification
        return "Email notification sent: " + emailDetails;
    }

    @PostMapping("/sms")
    public String sendSmsNotification(@RequestBody String smsDetails) {
        // Logic to send SMS notification
        return "SMS notification sent: " + smsDetails;
    }

    @PostMapping("/push")
    public String sendPushNotification(@RequestBody String pushDetails) {
        // Logic to send push notification
        return "Push notification sent: " + pushDetails;
    }

    @GetMapping("/history/{userId}")
    public String getNotificationHistory(@PathVariable String userId) {
        // Logic to retrieve notification history for a user
        return "Notification history for user: " + userId;
    }

    @GetMapping("/settings/{userId}")
    public String getNotificationSettings(@PathVariable String userId) {
        // Logic to retrieve notification settings for a user
        return "Notification settings for user: " + userId;
    }

    @PutMapping("/settings/{userId}")
    public String updateNotificationSettings(@PathVariable String userId, @RequestBody String settings) {
        // Logic to update notification settings for a user
        return "Updated notification settings for user: " + userId + " with: " + settings;
    }
}