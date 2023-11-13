package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    public TaskList toDoList() {
        return new TaskList();
    }
    public TaskList doneList() {
        return new TaskList();
    }
    public TaskList  inProgressList() {
        return new TaskList();
    }
    @Bean
    public Board getLists() {
        return new Board(toDoList(), doneList(), inProgressList());
    }
}