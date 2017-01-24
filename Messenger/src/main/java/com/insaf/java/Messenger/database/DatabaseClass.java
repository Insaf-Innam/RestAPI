package com.insaf.java.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.insaf.java.Messenger.model.Messages;
import com.insaf.java.Messenger.model.Profile;
import com.sun.prism.RTTexture;

public class DatabaseClass {

	 private static Map<Long, Messages> messages = new HashMap<>();
	 private static Map<Long, Profile> profiles = new HashMap<>();
	 
	 public static Map<Long, Messages> getAllMessages() {
		return messages;
		 
	}
	 
	 public static Map<Long, Profile> getAllProfiles() {
			return profiles;
		 
		}
	
	
}
