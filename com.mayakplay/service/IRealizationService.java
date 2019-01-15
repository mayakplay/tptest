package com.mayakplay.service;

import com.mayakplay.domain.Realization;

import java.sql.Date;
import java.util.List;

/**
 * Created by Mayakplay on 12.01.2019.
 */
public interface IRealizationService  {

    Realization apply(Realization realization);

    List<Realization> getAll();

    int getManagerSum(String managerName, Date firstDate, Date secondDate);

}
