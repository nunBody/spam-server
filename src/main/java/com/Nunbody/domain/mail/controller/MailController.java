package com.Nunbody.domain.Mail.controller;

import com.Nunbody.domain.Mail.domain.MailList;
import com.Nunbody.domain.Mail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/mail")
public class MailController {
    private final MailService mailService;
    @GetMapping("/mails")
    @ResponseBody
    public MailList getMail(@RequestParam("host") String host) {
        final MailList mailList = mailService.getMail(host);
        return mailList;
    }



}

