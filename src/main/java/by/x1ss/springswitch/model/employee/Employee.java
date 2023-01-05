package by.x1ss.springswitch.model.employee;

import by.x1ss.springswitch.model.Client;

public interface Employee {
    void processTask(Client client);

    String getEmployeeType();
}
