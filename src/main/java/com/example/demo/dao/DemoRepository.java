package com.example.demo.dao;

import com.example.demo.bean.Demo;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends CrudRepository<Demo, Long> {

}
