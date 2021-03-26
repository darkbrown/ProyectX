package com.proyectx.demo.services;

import com.proyectx.demo.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface UsuarioService {
    ArrayList<UsuarioModel> obtenerUsuarios();
    UsuarioModel guardarUsuario(UsuarioModel usuario);
    Optional<UsuarioModel> obtenerPorId(Long id);
    ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad);
    boolean eliminarUsuario(Long id);

}
