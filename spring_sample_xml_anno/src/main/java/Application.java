import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.plural.service.CustomerService;
import com.plural.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		 
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = appContext.getBean("customerService",CustomerServiceImpl.class);
		
		System.out.println(service.findAll().get(0).getFirstname());

	}

}
