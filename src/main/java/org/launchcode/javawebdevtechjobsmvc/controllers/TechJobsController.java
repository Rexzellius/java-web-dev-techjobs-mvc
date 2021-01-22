package org.launchcode.javawebdevtechjobsmvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;

public class TechJobsController {
    static Map<String, String> actionChoices = new HashMap<String, String>();
    static Map<String, String> columnChoices = new HashMap<>();

    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actions")
    public static Map<String, String> getActionChoices() {
        return actionChoices;
    }

    @ModelAttribute("columns")
    public static Map<String, String> getColumnChoices() {
        return columnChoices;
    }


}
