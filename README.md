# Team Information MCP Service

A super simple Spring Boot application that serves as an **MCP (Model Context Protocol) service** to provide team information.

## What is this?

This project demonstrates how to configure a Spring Boot application as an MCP service. The sole purpose is to show how MCP works and how you can use it.

## What does this service do?

The service provides one simple function:
- **getAllTeams()** - Returns a list of fictional teams

## MCP Configuration

The application is configured as an MCP server via:
- `spring-ai-starter-mcp-server-webmvc` dependency
- MCP server configuration in `application.properties`
- `@Tool` annotation on service methods

## How to use

1. **Start the application:**
   ```bash
   ./gradlew bootRun
   ```

2. **The service runs on:**
   ```
   http://localhost:8082
   ```

3. **MCP endpoint:**
   ```
   http://localhost:8082/mcp
   ```

## Tool available via MCP

- `getAllTeams` - Retrieves all available teams

## Requirements

- Java 21
- Spring Boot 3.5.5
- Spring AI 1.0.1

This is purely a demonstration project to showcase MCP functionality!