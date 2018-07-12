package com.service;

import java.util.List;

import com.dao.MessageDao;
import com.po.Message;

public class ListService {
	public List<Message> queryMessageList(String command,String description) {
		MessageDao messageDao = new MessageDao();
		// 查询并返回结果
		return messageDao.queryMessageList(command,description);
	}

}
