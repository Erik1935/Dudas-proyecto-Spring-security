package com.mipaquete.MiLoginNuevo.service;

import com.mipaquete.MiLoginNuevo.entidad.User;
import com.mipaquete.MiLoginNuevo.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioUser {
    @Autowired
    private UserRepositorio repositorio;

    public User obtenerUsuarioPorNombre(String nombre){
        return repositorio.findByNombre(nombre);
    }
}
