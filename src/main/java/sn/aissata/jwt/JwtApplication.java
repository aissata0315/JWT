package sn.aissata.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sn.aissata.jwt.dao.TaskRepository;
import sn.aissata.jwt.entities.AppRole;
import sn.aissata.jwt.entities.AppUser;
import sn.aissata.jwt.entities.Task;
import sn.aissata.jwt.service.AccountService;

import java.util.stream.Stream;

@SpringBootApplication
public class JwtApplication  implements CommandLineRunner {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class, args);
    }
    @Bean
    public BCryptPasswordEncoder getBCPE(){
        return new BCryptPasswordEncoder();
    }
    @Override
    public void run(String... args) throws Exception {
      /*  accountService.saveUser(new AppUser(null, "admin","1234",null));
        accountService.saveUser(new AppUser(null, "user","1234",null));
        accountService.saveRole(new AppRole(null, "ADMIN"));
        accountService.saveRole(new AppRole(null, "USER"));
        accountService.addRoleToUser("admin", "ADMIN");
        accountService.addRoleToUser("user", "USER");

        Stream.of("T1","T2","T3").forEach(t->{
            taskRepository.save(new Task(null,t));

        });
        taskRepository.findAll().forEach(t->{
            System.out.println(t.getTaskName());
        });

       */

    }
}
