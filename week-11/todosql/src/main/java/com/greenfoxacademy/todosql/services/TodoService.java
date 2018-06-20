package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Todo;
import com.greenfoxacademy.todosql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements TodoServiceInt {

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

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    public void saveById(Long id, String title, Boolean urgent, Boolean done) {
        Todo editedTodo = todoRepository.findById(id).get();
        editedTodo.setTitle(title);
        editedTodo.setUrgent(urgent);
        editedTodo.setDone(done);
        todoRepository.save(editedTodo);
    }
}
