
package com.redsocial.repository;

import com.redsocial.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{
      
    @Query("SELECT u FROM Usuario u WHERE u.correo = :correo")
    public Usuario buscarPorEmail(@Param("correo") String correo);
}
