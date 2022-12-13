package com.mipaquete.MiLoginNuevo.controlador;


import com.mipaquete.MiLoginNuevo.security.request.Request;
import com.mipaquete.MiLoginNuevo.security.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class loginController {

 private final AuthenticationManager authenticationManager;
 private final UserDetailsService userDetailsService;
 private final JwtUtil jwtUtil;

    @PostMapping ("/log")
    public ResponseEntity<String> login(@RequestBody Request request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword())
        );
        final UserDetails user = userDetailsService.loadUserByUsername(request.getUsername());
        if(user != null){
            return ResponseEntity.ok(jwtUtil.generateToken(user));
        }
        return ResponseEntity.ok("No se encontro el usuario");
    }


}
