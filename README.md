## Product Api in Notification service Using feign client


### NotificationApiApplication
```NotificationApiApplication
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients

public class NotificationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApiApplication.class, args);
	}

}
```
---
## ProductApi...Interface
```ProductApi ...Interface
@FeignClient(name ="PRODUCT-SERVER")
public interface ProductAPI {


    @GetMapping("/product")
    public String invokeProductApi();

    @GetMapping("/product/{name}")
    public String invokeProductApiWithName(@PathVariable("name") String name);
}
```
---
### NotificationController
```Controller
@Autowired
private ProductAPI productAPI;


@GetMapping("/notification/pro")
public String getPro(){
    String s1 = "Hello From notification API :: \n";
    String s2 = productAPI.invokeProductApi();

    return s1+s2;
}

@GetMapping("/notification/pro/{name}")
public String getProName(@PathVariable String name){
    String s1 = "Hello From notification API :: \n";
    String s2 = productAPI.invokeProductApiWithName(name);

    return s1+s2;
}

```
## Load Balancer 
<img width="1600" height="900" alt="image" src="https://github.com/user-attachments/assets/9c69eb66-8820-4337-9940-3d574b88642c" />
<img width="1600" height="900" alt="image" src="https://github.com/user-attachments/assets/63436d1e-8f52-4449-a2a2-e36583524eb7" />
