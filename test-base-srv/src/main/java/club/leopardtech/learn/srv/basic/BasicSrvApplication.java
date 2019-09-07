package club.leopardtech.learn.srv.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSrvApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(BasicSrvApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BasicSrvApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Application started...");

    }
}