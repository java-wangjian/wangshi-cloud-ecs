package com.wangshi.rabbitmq.listener;

import com.wangshi.rabbitmq.entity.Mail;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Author: wangjian
 * Date:   19-12-13
 * Time:   下午1:24
 * Description:
 */
@Component
public class QueueListener1 {

    @RabbitListener(queues = "myqueue")
    public void displayMail(Mail mail) throws Exception {
        System.out.println("队列监听器1号收到消息" + mail.toString());
    }
}
