package org.example.spring_project.dto.student;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.user.UpdateUserDTO;

@Setter
@Getter
public class UpdateStudentDTO extends UpdateUserDTO {
    @NotBlank
    private String academicLevel;
}
