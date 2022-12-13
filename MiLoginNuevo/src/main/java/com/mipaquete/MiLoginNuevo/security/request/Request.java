package com.mipaquete.MiLoginNuevo.security.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Request {
    //Con esta clase se recibiran los valores de usuario y contraseña
    private String username;
    private String password;
}
