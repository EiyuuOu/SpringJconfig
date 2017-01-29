import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.fdmgroup.repository.CustomerRepository;
import com.fdmgroup.repository.HibernateCustomerRepositoryImpl;
import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.fdmgroup"})
//used to store machine specific data like DB connection 
//and passwords
//@PropertySource("app.properties")
public class AppConfig {

	//for app.properties
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	
	
	//everything commented out
	//and annotated in CustomerService as a service
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService(){
//		//commented out to test no argument constructor
//		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		
//		//commented out due to constructor injection
//		//service.setCustomerRepository(getCustomerRepository());
//		
//		//no args constructor test
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		//service.setCustomerRepository(getCustomerRepository());
//		
//		return service;
//	}
	//commented out through repository scanner
	//in HibernateCustomer class
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}

}
