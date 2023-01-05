package by.x1ss.springswitch.model.employee;

import by.x1ss.springswitch.model.Client;
import org.springframework.stereotype.Component;

@Component(Employee.BACK_END)
public class BackEndDeveloper implements Employee {
    @Override
    public void processTask(Client client) {
        System.out.println("Back-end developer create back-end for " + client.getName());
    }
}

