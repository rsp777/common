package com.pawar.app.healthcheck.dto;

import java.lang.reflect.Method;

public record ServerStatusDto(String status) {

	public static ServerStatusDto fromEnum(Object serverStatus) {
		try {
			Method nameMethod = serverStatus.getClass().getMethod("name");
			return new ServerStatusDto((String) nameMethod.invoke(serverStatus));
		} catch (Exception e) {
			throw new RuntimeException("Invalid server status", e);
		}
	}

	public static Object toEnum(String status) {
		try {
			Class<?> clazz = Class.forName("com.example.server.status.ServerStatus");
			Method valueOf = clazz.getMethod("valueOf", String.class);
			return valueOf.invoke(null, status.toUpperCase());
		} catch (Exception e) {
			throw new RuntimeException("Invalid status value: " + status, e);
		}
	}

}