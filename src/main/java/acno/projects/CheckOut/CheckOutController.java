package acno.projects.CheckOut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckOutController {

    @GetMapping("/")
    public String startHomePage(){
        return "checkoutform";
    }
    /*
    @PostMapping("/")
    public String kassieren(Model model, ){}
    */
}

