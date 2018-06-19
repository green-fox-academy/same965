package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Todo;
import com.greenfoxacademy.todosql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    public final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    public void create() {
        add(new Todo("finish this exercise", true, false));
        add(new Todo("really finish this exercise", true, false));
        add(new Todo("rewrite this class, bah", true, true));
        add(new Todo("finish all data integration exercise", true, false));
        add(new Todo("start programmer fox club exercise", false, false));
    }

    public void saveFromForm(String title, boolean urgent, boolean done) {
        add(new Todo(title, urgent, done));
    }

    public List<Todo> listTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> listUnDoneTodos(boolean done) {
        List<Todo> undoneTodos = new ArrayList<>();
        List<Todo> allTodos = listTodos();
        for (Todo todo: allTodos) {
            if (todo.getDone() != done) {
                undoneTodos.add(todo);
            }
        }
        return undoneTodos;
    }
}
