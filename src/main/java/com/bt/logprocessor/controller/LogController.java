package com.bt.logprocessor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bt.logprocessor.bean.LogBean;
import com.bt.logprocessor.service.LogService;

@RestController
public class LogController {

	@Autowired
	private LogService logService;

	@GetMapping("/getlog")
	public LogBean getLog(@RequestParam Integer id) {
		LogBean logBean = logService.getLog(id);
		return logBean;
	}

	@PostMapping("/savelog")
	public String saveLog(@RequestBody LogBean logBean) {
		String message = logService.saveLog(logBean);
		return message;
	}

}
