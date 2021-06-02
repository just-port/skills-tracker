package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String mainPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li></li>" +
                    "<li></li>" +
                    "<li></li>" +
                "<ol/>" +
                "</body>" +
                "</html>";
    }

}
