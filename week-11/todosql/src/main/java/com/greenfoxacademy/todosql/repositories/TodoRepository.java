package com.greenfoxacademy.todosql.repositories;

import com.greenfoxacademy.todosql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
