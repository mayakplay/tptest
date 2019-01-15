package com.mayakplay.service;

import com.google.common.collect.Lists;
import com.mayakplay.domain.Realization;
import com.mayakplay.repository.IRealizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by Mayakplay on 12.01.2019.
 */
@Service
public class RealizationServiceImlp implements IRealizationService {

    @Autowired
    IRealizationRepository repository;

    @Override
    public Realization apply(Realization realization) {
        return this.repository.save(realization);
    }

    @Override
    public List<Realization> getAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public int getManagerSum(String managerName, Date firstDate, Date secondDate) {

        int sum = 0;
        for (Realization realization : repository.findByManagerName(managerName)) {
            Date realizationDate = realization.getDate();

            if (realizationDate.after(firstDate) && realizationDate.before(secondDate)) {
                sum += realization.getSaleSum();
            }
        }

        return sum;
    }
}
