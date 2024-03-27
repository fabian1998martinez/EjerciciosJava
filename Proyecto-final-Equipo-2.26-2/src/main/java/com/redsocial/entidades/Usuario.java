/*
Juan Ignacio: Checkeo Entidad Usuario con boolean de diseñador por simplicidad
 */
package com.redsocial.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy="uuid2" )
    private String id;
        
    
    private String nombre;
    private String contrasena;
    private String correo;
    
    private boolean darBaja;
    
    @ManyToOne
    @JoinColumn(name="tipo_rol_id")
    private Rol rol;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publicacion> publicaciones = new ArrayList<>();

    public Usuario(){
    }
    
}
