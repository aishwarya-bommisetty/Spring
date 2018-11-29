import com.plural.service.CustomerService;
import com.plural.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		 
	   CustomerService service = new CustomerServiceImpl();
	   
	   System.out.println(service.findAll().get(0).getFirstname());

	}

}
