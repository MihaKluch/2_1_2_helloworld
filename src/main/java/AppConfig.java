import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloworld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello, Spring!");
        return helloWorld;
    }

    @Bean
    @Scope("prototype")
    public Cat cat() {
        return new Cat("Барсик");
    }
}