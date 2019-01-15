package com.mayakplay.web;

import com.mayakplay.domain.Realization;
import com.mayakplay.service.IRealizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

/**
 * Created by Mayakplay on 12.01.2019.
 */
@RestController
public class RealizationController {

    private final IRealizationService realizations;

    @Autowired
    public RealizationController(IRealizationService realizations) {
        this.realizations = realizations;
    }

    @GetMapping("/")
    public List<Realization> getAll() {
        return this.realizations.getAll();
    }

    @GetMapping("/apply")
    public Realization apply(@RequestParam String managerName, @RequestParam Date date, @RequestParam int saleSum) {
        return realizations.apply(new Realization(managerName, date, saleSum));
    }

    @GetMapping("/getSum")
    public int getManagerSum(@RequestParam String managerName, @RequestParam Date firstDate, @RequestParam Date secondDate) {
        return realizations.getManagerSum(managerName, firstDate, secondDate);
    }

}
