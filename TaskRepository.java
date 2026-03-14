
package com.example.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.usermanagement.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
