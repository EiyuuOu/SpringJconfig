import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.repository.CustomerRepository;
import com.fdmgroup.repository.HibernateCustomerRepositoryImpl;
import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}

}
