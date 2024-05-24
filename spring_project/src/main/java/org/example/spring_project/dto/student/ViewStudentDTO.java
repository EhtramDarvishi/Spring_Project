package org.example.spring_project.dto.student;

import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.user.ViewUserDTO;

import java.util.List;

@Setter
@Getter
public class ViewStudentDTO extends ViewUserDTO {
    private long stdNumber;
    private String academicLevel;
    private List<Integer> courseCodes;
}
