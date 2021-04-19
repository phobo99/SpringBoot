package com.example.Bai3.controller;

import com.example.Bai3.model.CarCSV;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/csv")
    public String getCSV(Model model){
//        List<List<String>> records = new ArrayList<>();
        List<CarCSV> records2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\SpringBoot\\Buoi1\\Bai3\\src\\main\\resources\\static\\books.csv"))) {
            String line ="";
            while ((line=br.readLine())!=null) {
                String[] values = line.split(",");
                System.out.println(values[0]);
                System.out.println(values[1]);
                System.out.println(values[2]);
//                records.add(Arrays.asList(values));
                records2.add(new CarCSV(values[0],values[1],values[2],values[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        model.addAttribute("records",records)  ;
        model.addAttribute("carcsv" , records2);
        return "csv";
    }
}
