package gr.nsyriza.computerization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class CommunaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunaApplication.class, args);
	}
}

@RestController
class GreetingController {

	@RequestMapping("/hello/hi")
	String hello( ) {
		return "Hello, xx!";
	}
}