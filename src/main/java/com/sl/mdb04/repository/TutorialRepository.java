package com.sl.mdb04.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sl.mdb04.utils.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
