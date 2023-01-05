package by.x1ss.springswitch.configuration;

import by.x1ss.springswitch.model.employee.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class CompanyConfig {
    @Bean
    public Map<String, Employee> employeeMap(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::getEmployeeType, Function.identity()));
    }
}
