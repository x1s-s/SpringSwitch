package by.x1ss.springswitch.service.Impl;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.model.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ItCompanyImpl {
    @Autowired
    @Qualifier("employeeMap")
    private Map<String, Employee> map;

    public void processClient(Client client) {
        System.out.println("Processing client " + client.getName());
        Employee employee = map.getOrDefault(client.getTask(), map.get("default"));
        employee.processTask(client);
    }
}
