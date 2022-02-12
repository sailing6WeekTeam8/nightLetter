package project.nightletter.testdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import project.nightletter.model.User;
import project.nightletter.repository.UserRepository;
import project.nightletter.service.UserService;

@Component
public class TestDataRunner implements ApplicationRunner {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        User testUser1 = new User("dss1234", "12345", "das212");
        testUser1 = userRepository.save(testUser1);
    }
}
