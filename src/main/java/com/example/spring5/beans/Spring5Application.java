package com.example.spring5.beans;



import com.example.spring5.beans.Service.EmployeeService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// 2 injections-- setter based injection
//setter base injection and constructor base injection.
@SpringBootApplication
//@Setter - lombok
public class Spring5Application {
    //@Autowired // for setter base
	private static EmployeeService service;// autowire is receiving the bean object from Employeeservice class.
	// autowire is only used for classes.

	public Spring5Application(EmployeeService service) {// constructor
		this.service = service;}


		public static void main(String[] args){
	 	 SpringApplication.run(Spring5Application.class,args);

			System.out.println("this method is using context based and no setter or constructor injection");
//		EmployeeService service1 = context.getBean("employeeService", EmployeeService.class);
//		service1.createEmployee(Employee.builder().name("harini").build());
//		service1.createEmployee(Employee.builder().name("rutika").build());
//		System.out.println(service1.getEMployees());

//			System.out.println("constructor base using static variable service");
//			service.createEmployee((Employee.builder().name("harini").build()));
//			service.createEmployee((Employee.builder().name("rutika").build()));
//     Spring5Application application = new Spring5Application(service);
//     		System.out.println(application.service.getEMployees());


//		System.out.println("scope explanation ");
//		ApplicationContext context = SpringApplication.run(Spring5Application.class, args);
//		EmployeeService service = context.getBean("employeeService", EmployeeService.class);
//		System.out.println(service);
//		EmployeeService service2 = context.getBean("employeeService", EmployeeService.class);
//		System.out.println(service2);
	}
	@Bean
	public CommandLineRunner CommandLineRunner(){ // this is an interface for setter base and constructor base
		return args->{
			service.createEmployee(Employee.builder().name("harini").build());
			service.createEmployee(Employee.builder().name("Adhvik").build());
			System.out.println(service.getEMployees());
		};}}


/* by default all beans have a singleton method, and it will only
have one copy of the same object in the context as bean has been marked as singleton.*/

//four scopes
// singleton,
//prototype -everytime spring will give you new bean
//request - valid for MVC,spring will create new bean or every request
//session  - valid for http session
