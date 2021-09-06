package com.zaurtregulov.spring.mvc_hibernate_aop.controller;
 
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Books;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Car;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import com.zaurtregulov.spring.mvc_hibernate_aop.service.BookService;
import com.zaurtregulov.spring.mvc_hibernate_aop.service.CarService;
import com.zaurtregulov.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class MyController {
    
    @RequestMapping("/")
    public String showMainPage(){
        return "index";
    }
    
    @Autowired
    private CarService carService;
    
    @RequestMapping("/allcars")
    public String getAllCars(Model model){
        List<Car> allCar = carService.getAllCars();
        model.addAttribute("allCar", allCar);
        return "allcars";
    }
    
    @Autowired
    private BookService bookService;
    @RequestMapping("/allbook")
    public String showAllBooks(Model model){
     List<Books> allBooks = bookService.showAllBooks();
    model.addAttribute("allBooks", allBooks);
     return "allbook";
    }   
    
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/allemployee")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees =employeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "allemployees";
    }
    
    @RequestMapping("/addnewemployee")
    public String addNewEmployee(Model model){
        
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        
        return "emloyeeinfo";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId")int id, Model model){
        
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        
        return "emloyeeinfo";
    }
    
    @RequestMapping("/saveemployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        
        employeeService.saveEmployee(employee);
        
        return "redirect:/";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmolyee(@RequestParam("empId") int id){
        employeeService.deleteEmolyee(id);
        return "redirect:/";
    }
}