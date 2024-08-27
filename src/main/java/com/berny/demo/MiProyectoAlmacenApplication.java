package com.berny.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiProyectoAlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiProyectoAlmacenApplication.class, args);
	}

}


/**GENERA CLAVES ENCRIPTADAS**/
/*
package com.berny.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MiProyectoAlmacenApplication implements CommandLineRunner{
	
	@Bean
	public BCryptPasswordEncoder passwordCodifica1() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MiProyectoAlmacenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		String password = "almacenSPRING2021";
		for(int i=0; i<4; i++) {
			PasswordEncoder encoder = passwordCodifica1();
			String passEnc = encoder.encode(password);
			System.out.println(passEnc);
		}		
	}
}
*/
