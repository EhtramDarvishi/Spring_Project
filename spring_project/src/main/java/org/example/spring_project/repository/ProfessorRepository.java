package org.example.spring_project.repository;

import org.example.spring_project.entity.Professor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends UserRepository<Professor>{
    Optional<Professor> findByCode(int code);
}
