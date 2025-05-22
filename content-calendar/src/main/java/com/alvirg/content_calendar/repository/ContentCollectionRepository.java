package com.alvirg.content_calendar.repository;

import com.alvirg.content_calendar.model.Content;
import com.alvirg.content_calendar.model.Status;
import com.alvirg.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        /*
        method to list all contents
        **/
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        /*
        method to get a particular content by an id
        **/
        return contentList.stream().filter(c->c.id().equals(id)).findFirst();
    }


    public void save(Content content){
        contentList.removeIf(c->c.id().equals(content.id()));
        contentList.add(content);

    }

    public boolean existById(Integer id){
        return contentList.stream().filter(c->c.id().equals(id)).count()==1;
    }

    public void delete(Integer id){
        contentList.removeIf(c->c.id().equals(id));
    }

    @PostConstruct
    public void init(){
        Content content = new Content(1,
                "My First Blog Post",
                "This is my first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(content);
    }


}
