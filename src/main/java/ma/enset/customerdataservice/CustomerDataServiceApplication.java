package ma.enset.customerdataservice;

import ma.enset.customerdataservice.entities.Customer;
import ma.enset.customerdataservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("Hassan").email("Hassan@gmail.com").build());
			customerRepository.save(Customer.builder().name("Younes").email("Younes@gmail.com").build());
			customerRepository.save(Customer.builder().name("Ali").email("Ali@gmail.com").build());
		};
	}

}
