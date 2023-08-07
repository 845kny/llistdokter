package com.telkommedika.ListDokter.Controller;

import com.telkommedika.ListDokter.Jwt.JwtResponse;
import com.telkommedika.ListDokter.Jwt.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/authenticate")
public class authController {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @GetMapping
    public ResponseEntity<?> createAuthenticationToken() throws Exception {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", "ADMIN");
        final String token = jwtTokenUtil.doGenerateToken(claims,"alfian");

        return ResponseEntity.ok(new JwtResponse(token));
    }
}
