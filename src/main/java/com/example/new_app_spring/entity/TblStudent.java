package com.example.new_app_spring.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_student")
public class TblStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String gender;
    private String note;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private TblClass tblClass;
}
