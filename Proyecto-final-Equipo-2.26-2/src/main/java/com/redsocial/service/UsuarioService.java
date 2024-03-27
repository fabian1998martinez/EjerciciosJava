
package com.redsocial.service;

import com.redsocial.repository.RolRepository;
import com.redsocial.repository.UsuarioRepository;
import com.redsocial.entidades.Rol;
import com.redsocial.entidades.Usuario;
import com.redsocial.enumeracion.TipoRol;
import jakarta.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService{
    
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Transactional
    public void crearUsuario(String nombre, String contrasena, String correo, String tipoRol) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setContrasena(contrasena);
        nuevoUsuario.setCorreo(correo);

        // Buscar el rol por el nombre
        Optional<Rol> rolOptional = rolRepository.findByTipoRol(TipoRol.valueOf(tipoRol.toUpperCase()));

        if (rolOptional.isPresent()) {
            // Si el rol existe, asociarlo al usuario
            nuevoUsuario.setRol(rolOptional.get());
        } else {
            // Si el rol no existe, crearlo y luego asociarlo al usuario
            Rol nuevoRol = new Rol();
            nuevoRol.setTipoRol(TipoRol.valueOf(tipoRol.toUpperCase()));
            rolRepository.save(nuevoRol);

            nuevoUsuario.setRol(nuevoRol);
        }

        usuarioRepository.save(nuevoUsuario);
    }
     public Usuario findByEmail(String correo) {
        Usuario optionalUsuario = usuarioRepository.buscarPorEmail(correo);
        return optionalUsuario;
    }

    @Transactional
    public void actualizarUsuario(String id, String nombre, String contrasena, String correo, String tipoRol) {
        Optional<Usuario> respuesta = usuarioRepository.findById(id);

        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setContrasena(contrasena);
            usuario.setCorreo(correo);

            // Buscar el rol por el nombre
            Optional<Rol> rolOptional = rolRepository.findByTipoRol(TipoRol.valueOf(tipoRol.toUpperCase()));


            if (rolOptional.isPresent()) {
                // Si el rol existe, asociarlo al usuario
                usuario.setRol(rolOptional.get());
            } else {
                // Si el rol no existe, crearlo y luego asociarlo al usuario
                Rol nuevoRol = new Rol();
                nuevoRol.setTipoRol(TipoRol.valueOf(tipoRol.toUpperCase()));
                rolRepository.save(nuevoRol);

                usuario.setRol(nuevoRol);
            }

            usuarioRepository.save(usuario);
        }
    }
    
    public Optional<Usuario> obtenerUsuarioPorId(String id) {
        return usuarioRepository.findById(id);
    }

    public Set<Usuario> listarUsuarios() {
        return new HashSet<>(usuarioRepository.findAll());
    }

    @Transactional
    public void darBajaUsuario(String id) {
        Optional<Usuario> respuesta = usuarioRepository.findById(id);

        respuesta.ifPresent(usuario -> {
            usuario.setDarBaja(false);
            usuarioRepository.save(usuario);
        });
    }
}
