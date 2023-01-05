package by.x1ss.springswitch.model.employee;

import by.x1ss.springswitch.model.Client;

public interface Employee {
    void processTask(Client client);

    String BACK_END = "back-end";
    String FRONT_END = "front-end";
}
