package ts.rocket.rocket_shop_backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RocketShopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketShopBackendApplication.class, args);
	}

	@GetMapping("get")
	public String get() {
		return connectionString;
	}

	@Value("${connectionString}")
	private String connectionString;

	public void run(String... varl) throws Exception {
		System.out.printf("\nConnection String stored in Azure Key Vault:\n%s\n%n",connectionString);
	}
}
