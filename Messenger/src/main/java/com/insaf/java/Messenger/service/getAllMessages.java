package com.insaf.java.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import com.insaf.java.Messenger.model.Messages;

public class getAllMessages {
	public List<Messages> name2() {
		Messages m1 = new Messages(2L, "1insaf", "Hi", "Good");
		Messages m2 = new Messages(3L, "2insaf", "Hi2", "Good2");
		Messages m3 = new Messages(4L, "3insaf", "Hi3", "Good3");
		List<Messages> list = new ArrayList<Messages>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		return list;
	}
}
