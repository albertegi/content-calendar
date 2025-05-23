package com.alvirg.content_calendar.repository;

import com.alvirg.content_calendar.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class ContentJdbcTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

//    private static Content mapRow(ResultSet resultSet, int rowNum) throws Exception{
//        return new Content(resultSet.getInt("id"),
//            resultSet.getString("title"),
//            resultSet.getString("description"),
//            resultSet.getString("status"),
//            resultSet.getString("content_type"),
//            resultSet.getTimestamp("date_created"),
//            resultSet.getTimestamp("date_updated"),
//            resultSet.getString("url"));
//    }

//    public List<Content> getAllContent(){
//        String sql = "SELECT * FROM Content";
//        List<Content> contents = jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
//        return contents;
//
//    }

//    public void createContent(String title, String description, String status, String contentType, String URL){
//        String sql = "INSERT INTO Content(title, description, status, content_type, date_created, URL) VALUES(?,?,?,?, NOW(), ?)";
//        jdbcTemplate.update(sql, title, description, status, contentType, URL);
//
//    }

//    public void updateContent(String title, String description, String status, String contentType, String URL){
//        String sql = "UPDATE Content SET title=?, description=?, status=?, content_type=?, date_created=NOW(), url=? WHERE id=?";
//        jdbcTemplate.update(sql, title, description, status, contentType, URL);
//
//    }

//    public void deleteContent(int id){
//        String sql = "DELETE FROM Content WHERE id=?";
//        jdbcTemplate.update(sql, id);
//    }

//    public Content getContent(int id){
//        String sql = "SELECT * FROM Content WHERE id=?";
//        Content content = jdbcTemplate.queryForObject(sql, new Object[]{id}, ContentJdbcTemplateRepository::mapRow);
//        return content;
//    }


}
