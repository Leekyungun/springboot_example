package org.example.webserver.service;

import lombok.RequiredArgsConstructor;
import org.example.webserver.domain.posts.PostsRepository;
import org.example.webserver.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestsDto){
        return postsRepository.save(requestsDto.toEntity()).getId();
    }
}
