package net.bairuha.springboot.repositories;

import net.bairuha.springboot.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}