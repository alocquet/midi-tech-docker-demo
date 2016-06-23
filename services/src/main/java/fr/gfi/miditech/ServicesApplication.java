package fr.gfi.miditech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Main Application
 */
@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("fr.gfi.miditech")
@EnableSwagger2
@EnableTransactionManagement
@Slf4j
public class ServicesApplication {

	/**
	 * main
	 * 
	 * @param args
	 *            args
	 */
	public static void main(final String... args) {
		log.debug("Démarrage de l'application '%s'.", args.length == 0 ? "undefined" : args[0]);
		SpringApplication.run(ServicesApplication.class, args);
	}
}
