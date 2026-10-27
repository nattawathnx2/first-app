package th.ac.utc.first_app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppController {
    @GetMapping("/")
    public String home(){
        return "Hello Spring boot!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "none") String name){
        return "สวัสดี " + name + " ยินดีต้อนรับสู่ Spring boot!";
    }

    @GetMapping("/about")
    public String about(){
        return "This is My FirstApp Version 0.1";
    }
}