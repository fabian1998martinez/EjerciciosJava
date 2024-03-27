
package com.redsocial.repository;

import com.redsocial.entidades.Publicacion;
import com.redsocial.entidades.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, String> {

    public List<Publicacion> findByUsuario(Usuario usuario);
   @Query("SELECT p FROM Publicacion p WHERE p.id = :id")
    Publicacion obtenerPorId(@Param("id") String id);
    
    List<Publicacion> findAllByOrderByCantidadMeGustaDesc();
    
}
