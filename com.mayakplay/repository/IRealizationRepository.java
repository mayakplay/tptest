package com.mayakplay.repository;

import com.mayakplay.domain.Realization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Mayakplay on 12.01.2019.
 */
@Component
public interface IRealizationRepository extends CrudRepository<Realization, Integer> {

    List<Realization> findByManagerName(String managerName);

}
