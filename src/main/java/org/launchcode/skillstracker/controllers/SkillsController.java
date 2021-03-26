package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String skillList(){
        return "<html>" +
                "<body>" +
                "<form id='skillListing'>" +
                "<h1>Skills Tracker" +
                "</h1>" +
                "<h2>We have few skills we would like to learn.Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>Java"  +
                "</li>" +
                "<li>JavaScript" +
                "</li>" +
                "<li>Python" +
                "</li>" +
                "</ol>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST} )
    public String skillListO(@RequestParam String choice1 , String choice2  ,String choice3){
        return "<html>" +
                "<body>" +
                "<form id='skillListing'>" +
                "<h1>Skills Tracker" +
                "</h1>" +
                "<h2>We have few skills we would like to learn.Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>" + choice1 +
                "</li>" +
                "<li>" + choice2 +
                "</li>" +
                "<li>" + choice3 +
                "</li>" +
                "</ol>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @GetMapping("form")
    public String skillForm(){
        return "<html>" +
                "<body>" +
                "<form action='/skillListO' >" +
                "<label>Name:</label>" +
                "<br>" +
                "<input type='text' name='name'>" +
                "<br>" +
                "<label>My favorite language:</label>" +
                "<br>" +
                "<select name='choice1' id='skill-select'>" +
                "<option value='Java'>" +
                "Java" +
                "</option>" +
                "<option value='JavaScript'>" +
                "Javascript" +
                "</option>" +
                "<option value='Python'>" +
                "Python" +
                "</option>" +
                "</select>" +
                "<br>" +

                "<label>My second favorite language:</label>" +
                "<br>" +
                "<select name='choice2' id='skill-select'>" +
                "<option value='Java'>" +
                "Java" +
                "</option>" +
                "<option value='JavaScript'>" +
                "Javascript" +
                "</option>" +
                "<option value='Python'>" +
                "Python" +
                "</option>" +
                "</select>" +
                "<br>" +

                "<label>My third favorite language:</label>" +
                "<br>" +
                "<select name='choice3' id='skill-select'>" +
                "<option value='Java'>" +
                "Java" +
                "</option>" +
                "<option value='JavaScript'>" +
                "Javascript" +
                "</option>" +
                "<option value='Python'>" +
                "Python" +
                "</option>" +
                "</select>" +
                "<br>" +

                "<input type='submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
