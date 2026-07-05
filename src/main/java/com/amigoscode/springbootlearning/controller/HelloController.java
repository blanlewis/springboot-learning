package com.amigoscode.springbootlearning.controller;
import com.amigoscode.springbootlearning.hardcoded.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

// STEP : 1
//@RestController
//public class HelloController {
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello Spring Boot!";
//    }
//}

// STEP : 2
//@RestController
//public class HelloController {
//
//    @CrossOrigin(origins = "http://localhost:5000")
//    @GetMapping("/user")
//    public User getUser() {
//        return new User(
//                "Chethan",
//                "Frontend Developer"
//        );
//    }
//}

// STEP : 3
@RestController
public class HelloController {

   @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(
                new User("Chethan", "Frontend Developer"),
                new User("Rahul", "Backend Developer"),
                new User("Ankit", "QA Engineer"),
                new User("Priya", "UI Designer"),
                new User("Amit", "DevOps Engineer"),
                new User("Sneha", "Business Analyst"),
                new User("Vikram", "Backend Developer"),
                new User("Neha", "Frontend Developer"),
                new User("Karan", "QA Engineer"),
                new User("Pooja", "Project Manager"),
                new User("Rohan", "Backend Developer"),
                new User("Aisha", "UI Designer"),
                new User("Arjun", "Frontend Developer"),
                new User("Meera", "Business Analyst"),
                new User("Nikhil", "DevOps Engineer"),
                new User("Kavya", "QA Engineer"),
                new User("Varun", "Backend Developer"),
                new User("Ananya", "Frontend Developer"),
                new User("Siddharth", "Project Manager"),
                new User("Ishita", "UI Designer"),
                new User("Harsha", "Backend Developer"),
                new User("Deepika", "QA Engineer"),
                new User("Manoj", "DevOps Engineer"),
                new User("Shreya", "Frontend Developer"),
                new User("Abhishek", "Business Analyst"),
                new User("Ritika", "UI Designer"),
                new User("Akash", "Backend Developer"),
                new User("Divya", "Project Manager"),
                new User("Suraj", "Frontend Developer"),
                new User("Nisha", "QA Engineer"),
                new User("Yash", "Backend Developer"),
                new User("Tanvi", "Business Analyst"),
                new User("Aditya", "DevOps Engineer"),
                new User("Preeti", "UI Designer"),
                new User("Rakesh", "Frontend Developer"),
                new User("Madhuri", "QA Engineer"),
                new User("Gaurav", "Backend Developer"),
                new User("Swathi", "Project Manager"),
                new User("Lokesh", "DevOps Engineer"),
                new User("Bhavana", "Business Analyst"),
                new User("Pradeep", "Frontend Developer"),
                new User("Aparna", "UI Designer"),
                new User("Chirag", "Backend Developer"),
                new User("Sonal", "QA Engineer"),
                new User("Naveen", "Project Manager"),
                new User("Keerthi", "Business Analyst"),
                new User("Tarun", "DevOps Engineer"),
                new User("Lavanya", "Frontend Developer"),
                new User("Vivek", "Backend Developer"),
                new User("Monika", "UI Designer"),
                new User("Aarav", "Frontend Developer"),
                new User("Vivaan", "Backend Developer"),
                new User("Aditya", "QA Engineer"),
                new User("Arjun", "DevOps Engineer"),
                new User("Sai", "UI Designer"),
                new User("Krishna", "Full Stack Developer"),
                new User("Rohan", "Backend Developer"),
                new User("Karthik", "Frontend Developer"),
                new User("Nikhil", "QA Engineer"),
                new User("Varun", "DevOps Engineer"),
                new User("Manoj", "Frontend Developer"),
                new User("Akash", "Backend Developer"),
                new User("Deepak", "QA Engineer"),
                new User("Harsha", "Frontend Developer"),
                new User("Vikram", "Full Stack Developer"),
                new User("Pranav", "Backend Developer"),
                new User("Abhishek", "DevOps Engineer"),
                new User("Siddharth", "Frontend Developer"),
                new User("Yash", "QA Engineer"),
                new User("Raj", "Backend Developer"),
                new User("Kiran", "Frontend Developer"),
                new User("Naveen", "Full Stack Developer"),
                new User("Suraj", "DevOps Engineer"),
                new User("Pavan", "Backend Developer"),
                new User("Ajay", "QA Engineer"),
                new User("Tarun", "Frontend Developer"),
                new User("Rakesh", "Backend Developer"),
                new User("Ashwin", "DevOps Engineer"),
                new User("Dinesh", "Full Stack Developer"),
                new User("Shyam", "QA Engineer"),
                new User("Mohan", "Frontend Developer"),
                new User("Ganesh", "Backend Developer"),
                new User("Vinay", "QA Engineer"),
                new User("Lokesh", "DevOps Engineer"),
                new User("Tejas", "Frontend Developer"),
                new User("Sandeep", "Backend Developer"),
                new User("Bhavesh", "Full Stack Developer"),
                new User("Chirag", "QA Engineer"),
                new User("Nitin", "Frontend Developer"),
                new User("Uday", "Backend Developer"),
                new User("Kunal", "DevOps Engineer"),
                new User("Hemant", "QA Engineer"),
                new User("Parth", "Frontend Developer"),
                new User("Rituraj", "Backend Developer"),
                new User("Ansh", "Full Stack Developer"),
                new User("Dhruv", "QA Engineer"),
                new User("Aryan", "DevOps Engineer"),
                new User("Tushar", "Frontend Developer"),
                new User("Jatin", "Backend Developer"),
                new User("Mayank", "Full Stack Developer"),
                new User("Aditi", "Frontend Developer"),
                new User("Sanya", "Backend Developer"),
                new User("Isha", "QA Engineer"),
                new User("Riya", "DevOps Engineer"),
                new User("Pallavi", "UI Designer"),
                new User("Nandini", "Full Stack Developer"),
                new User("Anusha", "Backend Developer"),
                new User("Keerthana", "Frontend Developer"),
                new User("Bhavya", "QA Engineer"),
                new User("Shruti", "DevOps Engineer"),
                new User("Pooja", "Frontend Developer"),
                new User("Megha", "Backend Developer"),
                new User("Lavanya", "QA Engineer"),
                new User("Divya", "Frontend Developer"),
                new User("Swathi", "Full Stack Developer"),
                new User("Aparna", "Backend Developer"),
                new User("Sneha", "DevOps Engineer"),
                new User("Rashmi", "Frontend Developer"),
                new User("Monika", "QA Engineer"),
                new User("Shalini", "Backend Developer"),
                new User("Kavya", "Frontend Developer"),
                new User("Ananya", "Full Stack Developer"),
                new User("Deepika", "DevOps Engineer"),
                new User("Nisha", "Backend Developer"),
                new User("Priyanka", "QA Engineer"),
                new User("Madhuri", "Frontend Developer"),
                new User("Sowmya", "Backend Developer"),
                new User("Aishwarya", "DevOps Engineer"),
                new User("Chaitra", "Full Stack Developer"),
                new User("Namrata", "QA Engineer"),
                new User("Vaishnavi", "Frontend Developer"),
                new User("Harini", "Backend Developer"),
                new User("Sanjana", "QA Engineer"),
                new User("Nikitha", "DevOps Engineer"),
                new User("Prerana", "Frontend Developer"),
                new User("Akshata", "Backend Developer"),
                new User("Tejaswini", "Full Stack Developer"),
                new User("Ramya", "QA Engineer"),
                new User("Pavithra", "Frontend Developer"),
                new User("Sushmita", "Backend Developer"),
                new User("Amrutha", "DevOps Engineer"),
                new User("Kruthika", "QA Engineer"),
                new User("Neetha", "Frontend Developer"),
                new User("Bhavana", "Backend Developer"),
                new User("Shilpa", "Full Stack Developer"),
                new User("Geetha", "QA Engineer"),
                new User("Usha", "DevOps Engineer"),
                new User("Rekha", "Frontend Developer"),
                new User("Jyothi", "Backend Developer"),
                new User("Sindhu", "Full Stack Developer")
        );
    }
}