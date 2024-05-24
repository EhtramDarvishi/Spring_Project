package org.example.spring_project.dto.user;

import lombok.Getter;
import lombok.Setter;
import org.example.spring_project.dto.base.ViewBaseDTO;

@Setter
@Getter
public class ViewUserDTO extends ViewBaseDTO {
    private String name;
    private String family;
    private long nationalCode;
    private String genderString;
    private Long birthDayTimeStamp;
    private String username;
}
