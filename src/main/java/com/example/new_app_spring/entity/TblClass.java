package com.example.new_app_spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_class")
public class TblClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String room;
    private String note;
    @OneToMany(mappedBy = "tbl_class",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Set<TblStudent> tblStudentSet;
}
