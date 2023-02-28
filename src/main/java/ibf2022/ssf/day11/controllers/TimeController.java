package ibf2022.ssf.day11.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// Tell Spring Boot this is the controller
@Controller
// what noun to map
@RequestMapping(path = {"/time"})  // path can take more than one path
public class TimeController {
    
    // GET /time
    // what verb to map
    @GetMapping  // can have parameter to map sub-resource
    public String getTime(Model model){

        Date date = new Date();
        //String currentTime = date.toString();  // this is the data, need to put in a model

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");

        System.out.printf(">>the current time is %s\n",formatter.format(date));

        // Add the time to model
        model.addAttribute("time", date);

        return "time";

    }
}
