package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController extends TechJobsController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("title", "Search");
        return "search";
    }



    // TODO #3 - Create a handler to process a search request and render the updated search view.
    @RequestMapping(value = "results", method = RequestMethod.POST)
    public String displaySearchResults(Model model, String searchType, String searchTerm) {
        model.addAttribute("currentSelection", searchType);
        ArrayList<Job> jobs = searchType.equals("all") ? JobData.findAll() : JobData.findByColumnAndValue(searchType, searchTerm);
        model.addAttribute("jobs", jobs);
        model.addAttribute("title", "Search Results");
        return "search";
    }

}
