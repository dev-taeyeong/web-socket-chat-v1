package com.taeyeong.chat.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class ChatController {

    @GetMapping("chat")
    public String chat() {

        return "chat";
    }

    @GetMapping("signup")
    public String signup() {

        return "sign-up";
    }
}
