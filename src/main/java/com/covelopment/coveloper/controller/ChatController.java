package com.covelopment.coveloper.controller;

import com.covelopment.coveloper.dto.ChatMessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // /app/chat으로 전송된 메시지는 여기서 처리됨
    @MessageMapping("/chat")
    @SendTo("/topic/team")
    public ChatMessageDTO send(ChatMessageDTO message) {
        return message;  // 메시지를 팀 채널에 다시 브로드캐스팅
    }
}
