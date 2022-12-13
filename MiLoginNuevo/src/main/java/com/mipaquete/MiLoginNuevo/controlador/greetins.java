package com.mipaquete.MiLoginNuevo.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/saludo")
public class greetins {
    @GetMapping("/inicio")
    public ResponseEntity<String> inicio() {
        return ResponseEntity.ok("Hola mundo");
    }
}
