package by.x1ss.springswitch.service.Impl;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.model.employee.Employee;
import by.x1ss.springswitch.service.ItCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Primary
public class ItCompanyImpl implements ItCompany {
    @Autowired
    @Qualifier("employeeMap")
    private Map<String, Employee> map;

    public void processClient(Client client) {
        System.out.println("Processing client " + client.getName());
        Employee employee = map.getOrDefault(client.getTask(), map.get("default"));
        employee.processTask(client);
    }
}
