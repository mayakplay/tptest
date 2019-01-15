package com.mayakplay.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Mayakplay on 12.01.2019.
 */
@Entity(name = "realization")
public class Realization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String managerName;
    private Date date;
    private int saleSum;

    public Realization() {

    }

    public Realization(String managerName) {
        this.managerName = managerName;
    }

    public Realization(final int id) {
        this();
        this.id = id;
    }

    public Realization(String managerName, Date date) {
        this();
        this.managerName = managerName;
        this.date = date;
    }

    public Realization(String managerName, Date date, int saleSum) {
        this();
        this.managerName = managerName;
        this.date = date;
        this.saleSum = saleSum;
    }

    @Override
    public String toString() {
        return "Realization{" +
                "id=" + id +
                ", managerName='" + managerName + '\'' +
                ", date=" + date +
                ", saleSum=" + saleSum +
                '}';
    }

    public int getId() {
        return id;
    }

    public Realization setId(int id) {
        this.id = id;
        return this;
    }

    public String getManagerName() {
        return managerName;
    }

    public Realization setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }

    public int getSaleSum() {
        return saleSum;
    }

    public Realization setSaleSum(int saleSum) {
        this.saleSum = saleSum;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Realization setDate(Date date) {
        this.date = date;
        return this;
    }



}
