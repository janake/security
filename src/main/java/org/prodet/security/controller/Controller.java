package org.prodet.security.controller;

import com.security.openapi.api.SecurityApi;
import com.security.openapi.model.BubuPrivateModel;
import com.security.openapi.model.BubuPublicModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements SecurityApi {

    @Override
    public ResponseEntity<BubuPrivateModel> getPrivate(BubuPrivateModel param) {
        System.out.println("Incoming string: " + param.getTag());
        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(jwt.getClaims());
        return new ResponseEntity<>(param, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BubuPublicModel> getPublic(BubuPublicModel param) {
        System.out.println("Incoming string: " + param.getTag());
        return new ResponseEntity<>(param, HttpStatus.OK);
    }

}
