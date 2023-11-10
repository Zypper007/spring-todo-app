package io.github.zypper007.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface Task extends JpaRepository<io.github.zypper007.todoapp.model.Task, Integer> {
}
