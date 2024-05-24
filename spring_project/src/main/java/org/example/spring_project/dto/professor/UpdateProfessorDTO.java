package org.example.spring_project.dto.professor;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.user.UpdateUserDTO;

@Setter
@Getter
public class UpdateProfessorDTO extends UpdateUserDTO {
    @NotBlank
    private String academicRank;
}
