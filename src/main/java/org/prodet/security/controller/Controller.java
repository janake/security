package org.prodet.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/public")
    public String getPublic() {
        return "Public";
    }

    @GetMapping("/private")
    public String getPrivate() {
        return "Private";
    }

}
