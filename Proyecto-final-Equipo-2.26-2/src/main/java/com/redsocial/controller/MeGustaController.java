
package com.redsocial.controller;

import com.redsocial.entidades.Publicacion;
import com.redsocial.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class MeGustaController {
    
    @Autowired
    private PublicacionService publicacionService;
     
        @PostMapping("/Publicacion/megusta")
    public String darMeGusta(@RequestParam String idPublicacion) {
        Publicacion publicacion = publicacionService.buscarPublicacionPorId(idPublicacion);
        if (publicacion != null) {
            // Incrementa la cantidad de "Me gusta"
            publicacion.setCantidadMeGusta(publicacion.getCantidadMeGusta() + 1);
            // Guarda la publicación actualizada en la base de datos
            publicacionService.guardarPublicacion(publicacion);
           return "redirect:/Publicaciones/listaPublicaciones";
        }
        return "redirect:/Publicaciones/listaPublicaciones";
    }
}
