package springboot.project.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class MainApplication {
 public static void main(String[] args) {
     SpringApplication.run(MainApplication.class, args);
 }
 @Bean
 public CacheManager cacheManager() {
     return new ConcurrentMapCacheManager("reportCache"); 
 }
}
