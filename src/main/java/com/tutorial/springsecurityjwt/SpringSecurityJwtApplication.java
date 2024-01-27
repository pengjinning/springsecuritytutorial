/*
 * @Author: jack ning github@bytedesk.com
 * @Date: 2024-01-27 18:10:45
 * @LastEditors: jack ning github@bytedesk.com
 * @LastEditTime: 2024-01-27 18:21:08
 * @FilePath: /springsecuritytutorial/src/main/java/com/tutorial/springsecurityjwt/SpringSecurityJwtApplication.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.tutorial.springsecurityjwt;

import com.tutorial.springsecurityjwt.config.RsaKeyConfigProperties;
import com.tutorial.springsecurityjwt.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableConfigurationProperties(RsaKeyConfigProperties.class)
@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeUser(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		return args -> {

			// User user = new User();
			// user.setUsername("exampleuser");
			// user.setEmail("example@gmail.com");
			// user.setPassword(passwordEncoder.encode("examplepassword"));

			// // Save the user to the database
			// userRepository.save(user);

		};
	}

}
