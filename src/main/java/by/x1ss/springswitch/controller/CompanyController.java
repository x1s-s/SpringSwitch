package by.x1ss.springswitch.controller;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.service.ItCompanyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private ItCompanyImpl itCompany;

    @GetMapping("/process")
    @SuppressWarnings("rawtypes")
    public ResponseEntity processClient(@RequestBody Client client) {
        itCompany.processClient(client);
        return ResponseEntity.ok().build();
    }
}
