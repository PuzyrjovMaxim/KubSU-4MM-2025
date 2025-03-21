package ru.kubsu.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kubsu.telegrambot.controller.TestController;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {
		TestController controller = new TestController();
		String hello = controller.hello("name");
		System.out.println(hello);

		SpringApplication.run(TelegrambotApplication.class, args);
	}

}
