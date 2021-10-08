package com.bt.logprocessor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.logprocessor.bean.LogBean;
import com.bt.logprocessor.dao.LogRepository;
import com.bt.logprocessor.entity.Log;

@Service
public class LogService {

	@Autowired
	private LogRepository logRepo;

	//
	public LogBean getLog(Integer id) {
		Log log = logRepo.getOne(id);

		LogBean logBean = new LogBean();
		logBean.setFlag(log.getFlag());
		logBean.setName(log.getName());
		logBean.setId(log.getLogId());

		return logBean;
	}

	public String saveLog(LogBean logBean) {
		Log log = new Log();
		log.setFlag(logBean.getFlag());
		log.setName(logBean.getName());
		log.setLogId(logBean.getId());

		Log savedLog = logRepo.save(log);

		if (savedLog.getLogId() > 0) {
			return "Saved Successfully";
		} else {
			return "Saved Failed";
		}

	}

}
