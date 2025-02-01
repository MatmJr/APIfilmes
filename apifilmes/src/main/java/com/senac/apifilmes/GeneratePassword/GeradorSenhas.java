package com.senac.apifilmes.GeneratePassword;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenhas {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senhaCriptografada = encoder.encode("aA784633_yhtg!");
        System.out.println("Senha criptografada: " + senhaCriptografada);
    }
}
