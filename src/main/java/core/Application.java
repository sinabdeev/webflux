package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("reactor.netty.ioWorkerCount", "500");
		SpringApplication.run(Application.class, args);
	}

}
