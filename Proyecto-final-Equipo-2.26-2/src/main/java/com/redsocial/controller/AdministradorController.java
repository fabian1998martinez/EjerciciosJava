
package com.redsocial.controller;

import com.redsocial.entidades.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdministradorController {
    
   @GetMapping("/")
    public String index(){
       return "index";   
    }
    @GetMapping("/login")
    public String showForm(Model model){
        model.addAttribute("nuevoUsuario", new Usuario());
        return "login";        
        }
    
    
    @GetMapping("/buscador")
    public String buscardor(){
    
        return "search";
    }
}
