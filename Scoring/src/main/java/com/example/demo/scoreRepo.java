package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface scoreRepo extends CrudRepository<Score, Long>{

}
