package ink.bignose.catmall.order.listener;

import com.rabbitmq.client.Channel;
import ink.bignose.catmall.order.entity.OrderEntity;
import ink.bignose.catmall.order.service.OrderService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/27  16:15
 * DESCRIPTION:
 **/
@Service
@RabbitListener(queues = {"order.release.order.queue"})
public class OrderCloseListener {

    @Resource
    private OrderService orderService;

    @RabbitHandler
    public void listener(OrderEntity entity, Channel channel, Message message) throws IOException {
        try {
            orderService.closeOrder(entity);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            // 修改失败 拒绝消息 使消息重新入队
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        }
    }

}
