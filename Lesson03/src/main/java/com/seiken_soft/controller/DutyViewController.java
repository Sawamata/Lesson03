package com.seiken_soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/ichiran")
@RequestMapping("/viewDuty")
public class DutyViewController {
//	（勤怠管理一覧画面用のコントローラー）


    @RequestMapping(method=RequestMethod.GET)
    public String home() {
        return "viewDuty";
    }
}
