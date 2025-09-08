package com.wallway.teaminformation;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class TeamInformationService {

    @Tool(description = "Get a list of all teams")
    public List<Team> getAllTeams() {
        return List.of(new Team("1", "Flying Meatballs United", "Alice, Bob"),
                       new Team("2", "Banana Boots FC", "Charlie, David"),
                       new Team("3", "Goalpost Goblins", "Eve, Frank"));
    }

    public record Team(String id, String name, String members) {}
}
