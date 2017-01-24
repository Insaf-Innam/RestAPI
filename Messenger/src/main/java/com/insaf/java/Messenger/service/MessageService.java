package com.insaf.java.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.insaf.java.Messenger.database.DatabaseClass;
import com.insaf.java.Messenger.model.Messages;

public class MessageService {

	private Map<Long, Messages> messages = DatabaseClass.getAllMessages();

	public MessageService() {
		messages.put(1L, new Messages(1, "ksdnkl", "lksjdcks", "kjvlifs"));
		messages.put(2L, new Messages(2, "ksdnkl2", "lksjdcks2", "kjvlifs2"));
		messages.put(3L, new Messages(3, "ksdnkl3", "lksjdcks3", "kjvlifs3"));
	}

	public List<Messages> getAllMessages() {
		return new ArrayList<Messages>(messages.values());
	}

	public Messages getMessage(long id) {
		return messages.get(id);
	}

	public Messages addMessage(Messages message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Messages updateMessage(Messages message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Messages removeMessage(long id) {
		return messages.remove(id);
	}

}
