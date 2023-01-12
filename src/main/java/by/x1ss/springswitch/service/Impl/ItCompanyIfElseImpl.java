package by.x1ss.springswitch.service.Impl;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.model.employee.BackEndDeveloper;
import by.x1ss.springswitch.model.employee.DefaultEmployee;
import by.x1ss.springswitch.model.employee.FrontEndDeveloper;
import by.x1ss.springswitch.service.ItCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ItCompanyIfElseImpl implements ItCompany {
    @Autowired
    private BackEndDeveloper backEndDeveloper;
    @Autowired
    private FrontEndDeveloper frontEndDeveloper;
    @Autowired
    private DefaultEmployee defaultEmployee;

    public void processClient(Client client) {
        System.out.println("Processing client with if else: " + client.getName());
        if ("back-end".equals(client.getTask())) {
            backEndDeveloper.processTask(client);
        } else if ("front-end".equals(client.getTask())) {
            frontEndDeveloper.processTask(client);
        } else {
            defaultEmployee.processTask(client);
        }
    }
}
