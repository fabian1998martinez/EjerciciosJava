
package com.redsocial.Service;
import com.redsocial.entidades.Comentario;
import com.redsocial.entidades.Publicacion;
import com.redsocial.repository.ComentarioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ComentarioService {
    
    @Autowired
    ComentarioRepository comentarioRepository;
    
    @Transactional
    public void registrarComentario(Comentario comentario){
       
       comentarioRepository.save(comentario);
       
    }
    
  public Comentario buscarPorId(String id) {
        return comentarioRepository.findById(id).orElse(null);
    }
   public List<Comentario> obtenerComentariosPorPublicacion(Publicacion publicacion) {
        return comentarioRepository.findByPublicacion(publicacion);
    }
    
    @Transactional
    public void actualizar(String id,String texto){
    
        Optional<Comentario> respuesta = comentarioRepository.findById(id);
        
        if(respuesta.isPresent()){
           
            Comentario comentario = respuesta.get();
            
            comentario.setId(id);
            comentario.setTexto(texto);
            
            comentarioRepository.save(comentario);
            
        }
    }    
    
    public void darBaja(String id){
        
       Optional<Comentario> respuesta = comentarioRepository.findById(id);
       
       if(respuesta != null){
        Comentario comentario = respuesta.get();
        
        comentario.setId(id);
        
        comentarioRepository.save(comentario);
       }
       
    }
    
    
    
}
