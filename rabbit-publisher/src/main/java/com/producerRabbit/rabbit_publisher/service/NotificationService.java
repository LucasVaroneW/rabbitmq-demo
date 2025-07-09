package com.producerRabbit.rabbit_publisher.service;

import com.producerRabbit.rabbit_publisher.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviar(Notification notification){
        String exchange = "notifications-exchange";
        String routingKey = "notification.nueva";

        rabbitTemplate.convertAndSend(exchange, routingKey, notification.getMensaje());
    }
}
