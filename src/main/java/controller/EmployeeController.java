package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/showform",method = RequestMethod.GET)
    public String showForm(ModelMap modelMap){
        modelMap.addAttribute("employee",new Employee());
        return "create";
    }

    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, BindingResult result,ModelMap modelMap){
        modelMap.addAttribute("name",employee.getName());
        modelMap.addAttribute("contactNumber",employee.getContactNumber());
        modelMap.addAttribute("id",employee.getId());
        return "info";
    }
}
