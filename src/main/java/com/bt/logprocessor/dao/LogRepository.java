package com.bt.logprocessor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.logprocessor.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer>{

}
