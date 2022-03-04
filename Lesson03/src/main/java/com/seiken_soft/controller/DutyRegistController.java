package com.seiken_soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/duty")
@RequestMapping("/registDuty")
public class DutyRegistController {
//	（勤怠画面用のコントローラー）
//	init()
	    @RequestMapping(method=RequestMethod.GET)
	    public String home() {
	    	System.out.println("合計=");
	        return "registDuty";
	    }
}
