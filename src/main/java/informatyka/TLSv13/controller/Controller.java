package informatyka.TLSv13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/a")
    @ResponseBody
    public String home(){

        return "To jest test";
    }
}
