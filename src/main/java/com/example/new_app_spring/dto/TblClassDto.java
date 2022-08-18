package com.example.new_app_spring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TblClassDto {
    private String name;
    private String room;
    private String note;
}
