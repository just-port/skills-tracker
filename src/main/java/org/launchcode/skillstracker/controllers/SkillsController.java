package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listMain() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>Python</li>" +
                            "<li>PHP</li>" +
                        "<ol/>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String userSelectForm() {
        return "<html>" +
                    "<body>" +
                        "<form action = 'form' method = 'post'>" +
                            "<label for = 'name'>Name:</label>" +
                            "<br>" +
                            "<input type='text' name = 'name' >" +
                            "<br>" +
                            "<label for = 'favLanguageOne' >My favorite language</label>" +
                            "<br>" +
                            "<select name = 'favLanguageOne' id = 'favLanguageOne' >" +
                                "<option value = 'JavaScript' >JavaScript</option>" +
                                "<option value = 'Java' >Java</option>" +
                                "<option value = 'Python' >Python</option>" +
                                "<option value = 'Ruby' >Ruby</option>" +
                                "<option value = 'SQL' >SQL</option>" +
                                "<option value = 'C++' >C++</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for = 'favLanguageTwo' >My second favorite language</label>" +
                            "<br>" +
                            "<select name = 'favLanguageTwo' id = 'favLanguageTwo' >" +
                                "<option value = 'JavaScript' >JavaScript</option>" +
                                "<option value = 'Java' >Java</option>" +
                                "<option value = 'Python' >Python</option>" +
                                "<option value = 'Ruby' >Ruby</option>" +
                                "<option value = 'SQL' >SQL</option>" +
                                "<option value = 'C++' >C++</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for = 'favLanguageThree' >My third favorite language</label>" +
                            "<br>" +
                            "<select name = 'favLanguageThree' id = 'favLanguageThree' >" +
                                "<option value = 'JavaScript' >JavaScript</option>" +
                                "<option value = 'Java' >Java</option>" +
                                "<option value = 'Python' >Python</option>" +
                                "<option value = 'Ruby' >Ruby</option>" +
                                "<option value = 'SQL' >SQL</option>" +
                                "<option value = 'C++' >C++</option>" +
                            "</select>" +
                            "<br>" +
                            "<input type = 'submit' value = 'Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";

    }

    @PostMapping("form")
    public String userList(@RequestParam String name, String favLanguageOne, String favLanguageTwo, String favLanguageThree) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                            "<ol>" +
                                "<li>" + favLanguageOne + "</li>" +
                                "<li>" + favLanguageTwo + "</li>" +
                                "<li>" + favLanguageThree + "</li>" +
                            "<ol/>" +
                    "</body>" +
                "</html>";

    }

}
