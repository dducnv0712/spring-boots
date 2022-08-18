package com.example.new_app_spring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TblStudentDto {
    private String name;
    private String phone;
    private String gender;
    private String note;
}
