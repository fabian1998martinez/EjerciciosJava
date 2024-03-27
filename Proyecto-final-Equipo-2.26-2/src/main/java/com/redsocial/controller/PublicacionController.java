package com.redsocial.controller;

import com.redsocial.Service.ComentarioService;
import com.redsocial.entidades.Comentario;
import com.redsocial.entidades.Publicacion;
import com.redsocial.service.PublicacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Controller
@RequestMapping("/Publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;
    
     @Autowired
    private ComentarioService comentarioService;
     

    
    @GetMapping("/listaPublicaciones")
    public String listarPublicaciones(Model model) {
    List<Publicacion> publicaciones = publicacionService.obtenerTodasPublicaciones();
     
    
    model.addAttribute("publicaciones", publicaciones);
    return "publicacion";
    }
    
    @GetMapping("/formularioDePublicacion")
    public String formularioDePublicacion(Model model){
          model.addAttribute("nuevaPublicacion", new Publicacion());
         return "crearPublicacion";    
    }
    
    @GetMapping("/carrusel")
    public String mostrarCarrusel(Model model) {
        // Obtener las publicaciones ordenadas por la cantidad de "me gusta"
        List<Publicacion> publicaciones = publicacionService.obtenerPublicacionesPorMeGusta();

        // Agregar las publicaciones al modelo
        model.addAttribute("publicaciones", publicaciones);

        // Renderizar la vista que contiene el carrusel
        return "carrusel";
    }
 
   @PostMapping("/crear")
    public String crearPublicacion(@RequestParam("imagen") MultipartFile imagen,
                                   @RequestParam("nombre") String nombre,
                                   @RequestParam("descripcion") String descripcion) throws IOException {
            // Crear una nueva instancia de Publicacion
            Publicacion nuevaPublicacion = new Publicacion();
            nuevaPublicacion.setNombre(nombre);
            nuevaPublicacion.setDescripcion(descripcion);


        if (!imagen.isEmpty()) {
            Path ruta = Paths.get( "src//main//resources//static/img");
               try {
                 byte[] bytes = imagen.getBytes();
                 Path rutaAbsoluta = Paths.get(ruta+"//"+imagen.getOriginalFilename());
                 Files.write(rutaAbsoluta, bytes);
                 nuevaPublicacion.setImagen(imagen.getOriginalFilename());
            
        } catch (IOException e) {
            e.printStackTrace();
         
            return "redirect:/error";
        }
        }
      
            publicacionService.guardarPublicacion(nuevaPublicacion);

         
            return "redirect:/Publicaciones/listaPublicaciones";
    
    }
    @GetMapping("/{id}/eliminar")
    public String eliminarPublicacion(@PathVariable String id) {
        // Lógica para eliminar la publicación de la base de datos
        publicacionService.eliminarPublicacionPorId(id);
        // Redirige a la página de lista de publicaciones
        return "redirect:/Publicaciones/listaPublicaciones";
    }
   
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable String id,Model model){
    
       Publicacion respuesta = publicacionService.buscarPublicacionPorId(id);
  
           model.addAttribute("publicacion",respuesta);
           return "editarPublicacion";
              
   
    }
    @PostMapping("/editarPublicacion/{id}")
    public String editarPublicacion(@RequestParam("imagen") MultipartFile imagen,
                                   @RequestParam("nombre") String nombre,
                                   @RequestParam("descripcion") String descripcion,
                                   @PathVariable("id") String id){
    
       Publicacion respuesta = publicacionService.buscarPublicacionPorId(id);
       
           respuesta.setDescripcion(descripcion);
           respuesta.setNombre(nombre);
           
            if (!imagen.isEmpty()) {
            Path ruta = Paths.get( "src//main//resources//static/img");
               try {
                 byte[] bytes = imagen.getBytes();
                 Path rutaAbsoluta = Paths.get(ruta+"//"+imagen.getOriginalFilename());
                 Files.write(rutaAbsoluta, bytes);
                 respuesta.setImagen(imagen.getOriginalFilename());
            
                 } catch (IOException e) {
                      e.printStackTrace();
         
              return "redirect:/error";
              }
               
             }
           publicacionService.guardarPublicacion(respuesta);
             return "redirect:/Publicaciones/listaPublicaciones";
       } 
     @PostMapping("/comentar/{publicacionId}")
    public String comentar(@PathVariable("publicacionId") String publicacionId,
                           @RequestParam("comentario") String comentarioText,
                           Model model) {
        // Guardar el comentario
        Comentario comentario = new Comentario();
        comentario.setTexto(comentarioText);

        // Obtener la publicación por su ID
        Publicacion publicacion = publicacionService.buscarPublicacionPorId(publicacionId);

        // Asociar el comentario a la publicación
        comentario.setPublicacion(publicacion);

        // Guardar el comentario en la base de datos
        comentarioService.registrarComentario(comentario);

        // Obtener los comentarios actualizados para la publicación
        List<Comentario> comentarios = comentarioService.obtenerComentariosPorPublicacion(publicacion);

        // Pasar la publicación y los comentarios al modelo
        model.addAttribute("publicacion", publicacion);
        model.addAttribute("comentarios", comentarios);

        // Redirigir a la vista de la publicación con los comentarios actualizados
        return  "redirect:/Publicaciones/listaPublicaciones";
    }
        
    }

