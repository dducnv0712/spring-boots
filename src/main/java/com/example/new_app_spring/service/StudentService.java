package com.example.new_app_spring.service;

import com.example.new_app_spring.dto.TblClassDto;
import com.example.new_app_spring.dto.TblStudentDto;
import com.example.new_app_spring.entity.TblClass;
import com.example.new_app_spring.entity.TblStudent;
import com.example.new_app_spring.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public TblStudentDto save(TblStudentDto tblStudentDto) {
        TblStudent tblStudent = TblStudent.builder()
                .name(tblStudentDto.getName())
                .phone(tblStudentDto.getPhone())
                .gender(tblStudentDto.getGender())
                .note(tblStudentDto.getNote())
                .build();

        studentRepository.save(tblStudent);
        return tblStudent;
    }

    public List<TblClass> findAll() {
        return classRepository.findAll();
    }

    public TblClass update(Long id, TblClass tblClass) {
        TblClass tblClassUpdate = classRepository.findById(id);
        tblClassUpdate.setName(tblClass.getName());
        tblClassUpdate.setRoom(tblClass.getRoom());
        tblClassUpdate.setNote(tblClass.getNote());
        classRepository.save(tblClassUpdate);
        return tblClass;
    }

    public void delete(Long id) {
        classRepository.deleteById(id);
    }

    public TblClass findById(Long id) {
        return classRepository.findById(id);
    }
}
