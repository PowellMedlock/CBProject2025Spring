package com.example.cbproject.service;

import com.example.cbproject.domain.Link;
import com.example.cbproject.repository.LinkRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class LinkService {
    private final LinkRepository linkRepository;

    @Transactional
    public Link create(Link link){
        return linkRepository.save(link);
    }
}
