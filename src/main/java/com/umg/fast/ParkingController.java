/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.fast;

import com.umg.fast.crud.Usuario;
import com.umg.fast.crud.UsuarioRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nestor Gaitan
 */
@RestController
public class ParkingController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("parking/controller/info")
    public Map info(@RequestBody Map request) {
        Map response = new HashMap();
        response.put("success", true);
        System.out.println("controller info " + request);
        Usuario usuario = usuarioRepository.findById(1l).orElse(new Usuario());
        System.out.println("reposotory  " + usuario.getNombre());
        return response;
    }

    @PostMapping(value = "parking/controller/login", produces = "application/json")
    public Map login(@RequestBody Map request) {
        System.out.println("controller login " + request);

        Map response = new HashMap();
        response.put("success", false);
        response.put("mensaje", "usuario no existe");

        String usuario = String.valueOf(request.get("usuario"));
        String password = String.valueOf(request.get("password"));
        List<Usuario> usuarios = usuarioRepository.findByUsuario(usuario);

        if (usuarios != null && usuarios.size() > 0) {
            response.put("success", true);
            response.put("mensaje", "bienvenido al sistema");
        }
        System.out.println("response " + response);
        return response;
    }

    @PostMapping(value = "parking/controller/register", produces = "application/json")
    public Map register(@RequestBody Map request) {
        System.out.println("controller login " + request);
        Map response = new HashMap();
        response.put("success", false);
        String usuario = String.valueOf(request.get("usuario"));
        String password = String.valueOf(request.get("password"));
        String nombre = String.valueOf(request.get("nombre"));
        Usuario usuario1 = new Usuario();
        
        usuario1.setNombre(nombre);
        usuario1.setPassword(password);
        usuario1.setUsuario(usuario);
        usuarioRepository.save(usuario1);

        response.put("success", true);
        response.put("mensaje", "Usuario creado exitosamente");

        System.out.println("response " + response);
        return response;
    }

    @PostMapping(value = "parking/controller/registrotkt", produces = "application/json")
    public Map registrotkt(@RequestBody Map request) {
        System.out.println("controller login " + request);
        Map response = new HashMap();
        response.put("success", false);
        String hora_entrada = String.valueOf(request.get("hora_entrada"));
        String hora_salida = String.valueOf(request.get("hora_salida"));
        String monto = String.valueOf(request.get("monto"));
        String usuario_id = String.valueOf(request.get("usuario_id"));
        String tipo_pago_id = String.valueOf(request.get("tipo_pago_id"));
        String vehiculo_placa = String.valueOf(request.get("vehiculo_placa"));

        System.out.println("response " + response);
        return response;
    }

    @PostMapping(value = "parking/controller/retorntkt", produces = "application/json")
    public Map retorntkt(@RequestBody Map request) {
        System.out.println("controller login " + request);
        Map response = new HashMap();
        response.put("success", false);
        String rticket = String.valueOf(request.get("rticket"));
    
        System.out.println("response " + response);
        return response;
    }
}
