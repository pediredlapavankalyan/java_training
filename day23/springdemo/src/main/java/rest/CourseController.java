package rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	 @GetMapping("/courses")
	 public List<Course> getCourses() {
		 return List.of( new Course("Java SE", 10000), new Course("Python", 8000));
	 }

	 @GetMapping("/dealCourse")
	 public Course getDealCourses() {
		 return  new Course("Data Science", 10000);
	 }
}
