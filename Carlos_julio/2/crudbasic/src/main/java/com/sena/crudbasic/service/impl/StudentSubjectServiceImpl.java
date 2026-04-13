package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.StudentSubjectDto;
import com.sena.crudbasic.model.Student;
import com.sena.crudbasic.model.StudentSubject;
import com.sena.crudbasic.model.Subject;
import com.sena.crudbasic.repository.StudentRepository;
import com.sena.crudbasic.repository.StudentSubjectRepository;
import com.sena.crudbasic.repository.SubjectRepository;
import com.sena.crudbasic.service.StudentSubjectService;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {

    @Autowired
    private StudentSubjectRepository repo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private SubjectRepository subjectRepo;

    // DTO -> Model
    private StudentSubject dtoToModel(StudentSubjectDto dto) {
        StudentSubject ss = new StudentSubject();
        ss.setId(dto.getId());

        Student student = studentRepo.findById(dto.getIdStudent()).orElse(null);
        Subject subject = subjectRepo.findById(dto.getIdSubject()).orElse(null);

        ss.setStudent(student);
        ss.setSubject(subject);

        return ss;
    }

    @Override
    public List<StudentSubject> findAll() {
        return repo.findAll();
    }

    @Override
    public StudentSubject findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String save(StudentSubjectDto dto) {
        StudentSubject ss = dtoToModel(dto);
        repo.save(ss);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
