package by.x1ss.springswitch.model.employee;

import by.x1ss.springswitch.model.Client;
import org.springframework.stereotype.Component;

@Component
public class FrontEndDeveloper implements Employee {
    @Override
    public void processTask(Client client) {
        System.out.println("Front-end developer create UI for " + client.getName());
    }

    @Override
    public String getEmployeeType() {
        return "front-end";
    }
}
