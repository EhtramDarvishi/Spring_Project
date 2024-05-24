package org.example.spring_project.mapper;

import lombok.AllArgsConstructor;
import org.example.spring_project.dto.course.AddCourseDTO;
import org.example.spring_project.dto.course.UpdateCourseDTO;
import org.example.spring_project.dto.course.ViewCourseDTO;
import org.example.spring_project.entity.Course;
import org.example.spring_project.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CourseMapper {

    private final ModelMapper mapper;

    public Course toEntity(AddCourseDTO addCourseDTO) {
        return mapper.map(addCourseDTO, Course.class);
    }

    public Course toEntity(UpdateCourseDTO updateCourseDTO) {
        return mapper.map(updateCourseDTO, Course.class);
    }

    public ViewCourseDTO toViewDto(Course course) {
        ViewCourseDTO viewCourseDTO = mapper.map(course, ViewCourseDTO.class);

        if (course.getProfessor() != null) {
            String professor = course.getProfessor().getName() + " " + course.getProfessor().getFamily();
            viewCourseDTO.setNameProfessor(professor);
        }

        List<Long> studentNumbers = course.getStudents().stream()
                .map(Student::getStdNumber)
                .toList();

        viewCourseDTO.setStudentNumbers(studentNumbers);

        return viewCourseDTO;
    }

    public List<ViewCourseDTO> toListViewDTO(List<Course> courseList) {
        return courseList.stream().map(this::toViewDto).toList();
    }
}
