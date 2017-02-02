package com.levelp.spring.service;

import com.levelp.spring.dto.IdeaDTO;

import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
public interface IdeasService {
    int add(IdeaDTO idea);

    int update(IdeaDTO idea);

    int delete(int id);

    IdeaDTO get(int id);

    List<IdeaDTO> list();
}
