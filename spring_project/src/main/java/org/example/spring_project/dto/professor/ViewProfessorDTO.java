package org.example.spring_project.dto.professor;
import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.user.ViewUserDTO;

import java.util.List;

@Setter
@Getter
public class ViewProfessorDTO extends ViewUserDTO {
    private long code;
    private String academicRank;
    private List<Integer> courseCodes;
}
