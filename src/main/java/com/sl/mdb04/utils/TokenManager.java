package com.sl.mdb04.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class TokenManager {
	private Map<UUID, String> tokenMap = new HashMap<UUID, String>();

	public void addUser(UUID uuid, String email) {
		tokenMap.put(uuid, email);
	}

	public void removeUser(UUID uuid) {
		tokenMap.remove(uuid);
	}

//	public boolean validateUser(UUID uuid, UserType userType) {
	public boolean validateUser(UUID uuid) {
//			return tokenMap.containsKey(uuid) && tokenMap.get(uuid).getUserType() == userType;
		return tokenMap.containsKey(uuid);
	}

	public String getUserEmail(UUID uuid) {
		return tokenMap.get(uuid);
	}
}
