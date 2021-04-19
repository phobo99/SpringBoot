package com.topCar.Bai1.controller;

import com.topCar.Bai1.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/car")
    public String getCar(Model model){
        Car[] cars= {new Car("BUGATTI CHIRON","bugatti",2000000,"bugatti_chiron.jpg") ,
                new Car("GORDON MURRAY T.50","GORDON MURRAY",30000000,"gordon_murray.jpg"),
                new Car("Koenigsegg Jesko","Koenigsegg",25000000,"koenigsegg_jesko.jpg"),
                new Car("Mercedes AMG One","Mercedes",1500000,"mercedes_AMG_one.jpeg"),
                new Car("Pagani Huayra Roadster B.C.","Pagani",210000000,"pagani.jpg")
        };
        model.addAttribute("cars",cars);
        return "car";
    }

}
