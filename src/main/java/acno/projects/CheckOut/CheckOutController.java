package acno.projects.CheckOut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckOutController {

    @GetMapping("/")
    public String startHomePage(Model model){
        model.addAttribute("product", new Product());
        return "checkoutform";
    }

    @PostMapping("/")
    public String kassieren(Model model,Product product ){
        model.addAttribute("product",product);
        System.out.println(product);
        return "checkoutform";
    }

}

