package com.example.lab7_20221747.controller;
import com.example.lab7_20221747.entity.Trabajadores;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.lab7_20221747.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/Trabajadores")
public class TrabajadoresController {
    final TrabajadoresRepository trabajadoresRepository;
    public TrabajadoresController(TrabajadoresRepository trabajadoresRepository){
        this.trabajadoresRepository = trabajadoresRepository;
    }
    @GetMapping(value = {"", "/", "list"})
    public String listarEmpleados(Model model) {
        model.addAttribute("listaEmpleados", trabajadoresRepository.findAll());
        return "trabajadores/list";
    }
}
