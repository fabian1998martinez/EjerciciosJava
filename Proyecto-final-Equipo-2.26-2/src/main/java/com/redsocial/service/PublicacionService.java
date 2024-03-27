
package com.redsocial.service;

import com.redsocial.repository.PublicacionRepository;
import com.redsocial.entidades.Comentario;
import com.redsocial.entidades.Publicacion;
import com.redsocial.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PublicacionService {
    
    @Autowired
    private PublicacionRepository publicacionRepository;
    
   
    public Publicacion guardarPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }
     public List<Publicacion> obtenerPublicacionesPorMeGusta() {
        // Obtener las publicaciones ordenadas por la cantidad de "me gusta" de mayor a menor
        return publicacionRepository.findAllByOrderByCantidadMeGustaDesc();
    }
    
   
    public List<Publicacion> obtenerTodasPublicaciones() {
        return publicacionRepository.findAll();
    }
    
   
    public Publicacion buscarPublicacionPorId(String id) {
        
        Publicacion respuesta = publicacionRepository.obtenerPorId(id);
        
        return respuesta; 
    }
    public void eliminarPublicacionPorId(String id) {
        publicacionRepository.deleteById(id);
    }
    
    
    public void agregarComentario(Publicacion publicacion, Comentario comentario) {
        publicacion.getComentarios().add(comentario);
        comentario.setPublicacion(publicacion);
        publicacionRepository.save(publicacion);
    }
    
    
    public List<Publicacion> obtenerPublicacionesPorUsuario(Usuario usuario) {
        return publicacionRepository.findByUsuario(usuario);
    }
    
    public void actualizarCantidadMeGusta(Publicacion publicacion, int cantidad) {
        publicacion.setCantidadMeGusta(publicacion.getCantidadMeGusta() + cantidad);
        publicacionRepository.save(publicacion);
    }
    

    
}

