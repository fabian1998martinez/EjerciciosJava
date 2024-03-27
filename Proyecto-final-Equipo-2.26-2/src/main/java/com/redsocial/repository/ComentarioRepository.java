
package com.redsocial.repository;

import com.redsocial.entidades.Comentario;
import com.redsocial.entidades.Publicacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ComentarioRepository extends JpaRepository<Comentario, String>{
    
     
     @Query("SELECT p FROM Publicacion p WHERE p.id = :id")
    Publicacion obtenerPorId(@Param("id") String id);

    public List<Comentario> findByPublicacion(Publicacion publicacion);
}
