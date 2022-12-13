package com.mipaquete.MiLoginNuevo.repositorio;

import com.mipaquete.MiLoginNuevo.entidad.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositorio extends JpaRepository<User,Integer> {

    User findByNombre(String nombre);
    //Boolean findByNombre(String nombre);
}
