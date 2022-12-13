package com.mipaquete.MiLoginNuevo.security;

import com.mipaquete.MiLoginNuevo.entidad.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;

public class UserDetailsImp implements UserDetails {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nombre;
    private String password;
    private String rol;

    public UserDetailsImp(Integer id, String nombre, String password,String rol) {

        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;

    }


    public static UserDetailsImp build(User user) {

        return new UserDetailsImp(user.getId(),
                user.getNombre(),user.getPassword(), user.getRol());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
