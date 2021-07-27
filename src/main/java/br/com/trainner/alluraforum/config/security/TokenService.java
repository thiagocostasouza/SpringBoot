package br.com.trainner.alluraforum.config.security;


import br.com.trainner.alluraforum.modelo.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {


    @Value("${forum.jwt.expiration}")
    private String expiration;

    @Value("${forum.jwt.secret}")
    private String secret;

    public String gerarToken(Authentication authentication) {
      Usuario logado = (Usuario) authentication.getPrincipal();
      Date hoje = new Date();
      Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(expiration));
        return Jwts.builder()
                .setIssuer("API do Forum da Allura")
                .setSubject(logado.getId().toString())
                .setIssuedAt(hoje)
                .setExpiration(dataExpiracao)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
