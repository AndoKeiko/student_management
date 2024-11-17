package raisetech.student.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World";
	}
	@GetMapping("/hello02")
	public String hello02() {
		return "Hello, World02";
	}
	@GetMapping("/hello04")
	public String hello04() {
		return "Hello, World04";
	}
	@GetMapping("/hello05")
	public String hello05() {
		return "Hello, World05";
	}
}
