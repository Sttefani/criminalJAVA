package com.criminal.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.criminal.model.Autoridade;

@Repository
@Transactional
public interface AutoridadeRepository extends CrudRepository<Autoridade, Long>{

	
}
