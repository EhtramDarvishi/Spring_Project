package org.example.spring_project.dto.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.example.spring_project.dto.base.AddBaseDTO;

@Setter
@Getter
public class AddCourseDTO extends AddBaseDTO {
    @Positive
    private int code;

    @NotBlank
    private String title;

    @Positive
    private int units;
}
