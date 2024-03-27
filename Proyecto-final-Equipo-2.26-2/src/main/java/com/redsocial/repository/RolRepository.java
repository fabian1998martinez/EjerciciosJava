
package com.redsocial.repository;

import com.redsocial.entidades.Rol;
import com.redsocial.enumeracion.TipoRol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolRepository extends JpaRepository<Rol, String> {

    public Optional<Rol> findByTipoRol(TipoRol tipoRol);

   
}
