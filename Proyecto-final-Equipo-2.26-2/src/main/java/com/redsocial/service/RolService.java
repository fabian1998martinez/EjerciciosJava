
package com.redsocial.service;

import com.redsocial.repository.RolRepository;
import com.redsocial.entidades.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public List<Rol> listarRol(){
    
      return rolRepository.findAll();
    }
}
