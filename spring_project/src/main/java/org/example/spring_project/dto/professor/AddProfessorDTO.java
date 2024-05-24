package org.example.spring_project.dto.professor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.user.AddUserDTO;

@Setter
@Getter
public class AddProfessorDTO extends AddUserDTO {
    @Positive
    private int code;

    @NotBlank
    private String academicRank;
}
