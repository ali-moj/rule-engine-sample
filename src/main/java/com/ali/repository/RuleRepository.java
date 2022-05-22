package com.ali.repository;

import com.ali.model.CustomRule;
import org.springframework.data.repository.CrudRepository;

public interface RuleRepository extends CrudRepository<CustomRule, Long> {

}
