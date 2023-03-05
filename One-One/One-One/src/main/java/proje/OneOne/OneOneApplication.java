package proje.OneOne;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneOneApplication.class, args);
	}
@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
}
}
