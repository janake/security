package org.prodet.security.service;

import lombok.RequiredArgsConstructor;
import org.prodet.security.entity.Note;
import org.prodet.security.persistence.NoteRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public String addNewNote(String aPublic) {
        Note n = new Note();
        n.setText(aPublic);
        noteRepository.save(n);
        return "Sikeres mentés";
    }
}
