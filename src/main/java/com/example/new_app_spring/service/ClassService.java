package com.example.new_app_spring.service;


import com.example.new_app_spring.dto.TblClassDto;
import com.example.new_app_spring.entity.TblClass;
import com.example.new_app_spring.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ClassService {
    @Autowired
    ClassRepository classRepository;

    public TblClassDto save(TblClassDto tblClassDto) {
        TblClass tblClass = TblClass.builder()
                .name(tblClassDto.getName())
                .room(tblClassDto.getRoom())
                .note(tblClassDto.getNote())
                .build();
        classRepository.save(tblClass);
        return tblClassDto;
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

    public void delete(Long id){
        classRepository.deleteById(id);
    }

    public TblClass findById(Long id){
        return classRepository.findById(id);
    }
}
