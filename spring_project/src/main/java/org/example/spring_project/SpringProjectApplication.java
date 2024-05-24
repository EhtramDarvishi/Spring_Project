package org.example.spring_project;

import lombok.AllArgsConstructor;
import org.example.spring_project.entity.Course;
import org.example.spring_project.entity.Student;
import org.example.spring_project.enums.AcademicLevel;
import org.example.spring_project.enums.Gender;
import org.example.spring_project.service.CourseService;
import org.example.spring_project.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class SpringProjectApplication implements CommandLineRunner {

    private final CourseService courseService;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args){
        if(courseService.findAll().isEmpty()){
            Course course = new Course();
            course.setCode(4);
            course.setTitle("course4");
            course.setUnits(3);
            course = courseService.save(course);

            Student student = new Student();
            student.setName("name1");
            student.setFamily("family1");
            student.setBirthDay(new Date());
            student.setGender(Gender.FEMALE);
            student.setStdNumber(1234567890L);
            student.setAcademicLevel(AcademicLevel.PHD);
            student.setNationalCode(9876543210L);
            student.setUsername("username1");
            student.setPassword("password1");
            studentService.save(student);

            course.getStudents().add(student);
            courseService.update(course);
        }

    }
}
