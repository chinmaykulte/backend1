package com.example.ChinmayKulteProject.Repo;

import com.example.ChinmayKulteProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {

}
