package message

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    fun message(postMessage: PostMessage): Message {
        Thread.sleep(1000)
        return Message(postMessage.name)
    }
}