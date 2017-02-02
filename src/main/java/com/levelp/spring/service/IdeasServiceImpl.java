package com.levelp.spring.service;

import com.levelp.spring.dao.IdeasDAO;
import com.levelp.spring.dto.IdeaDTO;
import com.levelp.spring.model.Idea;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anastasiya Solodkaya.
 */
public class IdeasServiceImpl implements IdeasService {
    @Autowired
    IdeasDAO dao;

    public int add(IdeaDTO idea) {
        return dao.add(convert(idea));
    }

    public int update(IdeaDTO idea) {
        return dao.update(convert(idea));
    }

    public int delete(int id) {
        return dao.delete(id);
    }

    public IdeaDTO get(int id) {
        return convert(dao.get(id));
    }

    public List<IdeaDTO> list() {
        return dao.list().stream().map(IdeasServiceImpl::convert).collect(Collectors.toList());
    }

    private static Idea convert(IdeaDTO idea) {
        Idea modelIdea = new Idea();
        modelIdea.setId(idea.getId());
        modelIdea.setContent(idea.getContent());
        modelIdea.setCaption(idea.getCaption());
        modelIdea.setDislikes(idea.getDislikes());
        modelIdea.setLikes(idea.getLikes());
        return modelIdea;
    }

    private static IdeaDTO convert(Idea idea) {
        IdeaDTO ideaDTO = new IdeaDTO();
        ideaDTO.setId(idea.getId());
        ideaDTO.setContent(idea.getContent());
        ideaDTO.setCaption(idea.getCaption());
        ideaDTO.setDislikes(idea.getDislikes());
        ideaDTO.setLikes(idea.getLikes());
        return ideaDTO;
    }
}
