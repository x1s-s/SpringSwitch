package by.x1ss.springswitch.model.employee;

import by.x1ss.springswitch.model.Client;
import org.springframework.stereotype.Component;

@Component("default")
public class DefaultEmployee implements Employee {
    @Override
    public void processTask(Client client) {
        System.out.println("Default employee is processing task for client " + client.getName());
    }
}

