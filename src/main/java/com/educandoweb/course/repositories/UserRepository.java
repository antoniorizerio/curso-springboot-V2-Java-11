package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.User;

/**
 * Spring JPA ja tem uma implementação padrão para a interface criada, no caso UserRepository.
 * Com isso criamos uma série de métodos padrão para manipular operações relacionadas a
 * User.
 * 
 * @author Antonio Rizério JR
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
