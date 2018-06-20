package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoServiceInt {
    public void add(Todo todo);
    public void create();
    public void saveFromForm(String title, boolean urgent, boolean done);
    public List<Todo> listTodos();
    public List<Todo> listUnDoneTodos(boolean done);
    public void delete(Long id);
    public Todo getTodoById(Long id);
    public void saveById(Long id, String title, Boolean urgent, Boolean done);
}
