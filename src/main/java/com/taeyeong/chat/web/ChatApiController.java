package com.taeyeong.chat.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatApiController {

    @PostMapping("signup")
    public void s(
            SignUpDto signUpDto
    ) {
    }
}
