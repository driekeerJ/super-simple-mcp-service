package com.wallway.teaminformation;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeaminformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeaminformationApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider teamTools(TeamInformationService teamInformationService) {
		return MethodToolCallbackProvider.builder().toolObjects(teamInformationService).build();
	}
}
