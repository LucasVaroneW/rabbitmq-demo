package com.producerRabbit.rabbit_publisher.controller;

import com.producerRabbit.rabbit_publisher.model.Notification;
import com.producerRabbit.rabbit_publisher.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notification")
    public String notification(@RequestBody Notification notification){
        notificationService.enviar(notification);
        return "Notificación enviada correctamente!";
    }
}
