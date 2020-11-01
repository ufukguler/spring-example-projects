package com.rabbit.app.listener;

import com.rabbit.app.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * created by: ufuk on 5.10.2020 23:20
 * kuyruktan notificationlari dinleyecek
 */

@Service
public class NotificationListener {

    @RabbitListener(queues = "queue")
    public void handleMessage(Notification notification) {
        System.out.println("notification received...");
        System.out.println(notification.toString());
    }
}
