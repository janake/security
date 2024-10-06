package org.prodet.security.controller;

import lombok.RequiredArgsConstructor;
import org.prodet.security.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final NoteService noteService;

    @GetMapping("/public")
    public String getPublic() {
        return "Public";
    }

    @PostMapping("/private")
    public String addPublic() {
        return noteService.addNewNote("Private");
    }

    @GetMapping("/private")
    public String getPrivate() {
        return "Private";
    }

}
