package by.x1ss.springswitch.service.Impl;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.model.employee.BackEndDeveloper;
import by.x1ss.springswitch.model.employee.DefaultEmployee;
import by.x1ss.springswitch.model.employee.FrontEndDeveloper;
import by.x1ss.springswitch.service.ItCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItCompanySwitchImpl implements ItCompany {
    @Autowired
    private BackEndDeveloper backEndDeveloper;
    @Autowired
    private FrontEndDeveloper frontEndDeveloper;
    @Autowired
    private DefaultEmployee defaultEmployee;

    public void processClient(Client client) {
        System.out.println("Processing client with switch: " + client.getName());
        switch (client.getTask()) {
            case "back-end":
                backEndDeveloper.processTask(client);
                break;
            case "front-end":
                frontEndDeveloper.processTask(client);
                break;
            default:
                defaultEmployee.processTask(client);
        }
    }
}
