
package com.redsocial.controller;



import com.redsocial.entidades.Rol;
import com.redsocial.service.UsuarioService;
import com.redsocial.entidades.Usuario;
import com.redsocial.enumeracion.TipoRol;
import com.redsocial.repository.RolRepository;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    
     @Autowired
    private UsuarioService usuarioServicio;
     
     @Autowired
     private RolRepository rolRepository;
     

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("nuevoUsuario", new Usuario());
       
        
        return "crearUsuario";
    }

    @PostMapping("/crear")
    public String crearUsuario(@ModelAttribute("nuevoUsuario") Usuario nuevoUsuario,
                               @RequestParam("rol") String tipoRol) {
        usuarioServicio.crearUsuario(
                nuevoUsuario.getNombre(),
                nuevoUsuario.getContrasena(),
                nuevoUsuario.getCorreo(),
                tipoRol
        );
        return "redirect:/login";
    }

 @PostMapping("/login")
 public String login(@RequestParam String correo, @RequestParam String contrasena, Model model) {
    Usuario usuario = usuarioServicio.findByEmail(correo);
        Optional<Rol> rolComunOptional = rolRepository.findByTipoRol(TipoRol.COMUN);
        Optional<Rol> rolDisenadorOptional = rolRepository.findByTipoRol(TipoRol.DISEÑADOR);
    
        if(usuario != null && usuario.getContrasena().equals(contrasena)) {
           if (rolComunOptional.isPresent() && usuario.getRol().equals(rolComunOptional.get())) {
               return "redirect:/usuarios/formulario";
              } else if (rolDisenadorOptional.isPresent() && usuario.getRol().equals(rolDisenadorOptional.get())) {
                  return "redirect:/buscador";
               }
           }
                return "redirect:/...";
}

    @GetMapping("/listar")
    public String listarUsuarios(Model model) {
        Set<Usuario> usuarios = usuarioServicio.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "listado";
    }
}