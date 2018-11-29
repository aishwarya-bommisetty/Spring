import org.springframework.context.annotation.*;

import com.plural.service.CustomerService;
import com.plural.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}
	
	
}
