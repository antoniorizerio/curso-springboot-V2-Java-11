package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;


/**
 * Classe auxiliar que vai fazer algumas configurações em minha aplicação.
 * @Configuration: indica ao Spring que essa é uma classe de configuração.
 * @Profile("test"): indica ao Spring para rodar essas configurações no perfil de teste.
 * @author Antonio Rizério JR
 *
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired // Injeção de Dependência //
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
