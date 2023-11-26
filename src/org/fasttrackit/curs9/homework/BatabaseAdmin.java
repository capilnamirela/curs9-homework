package org.fasttrackit.curs9.homework;

import java.time.LocalDate;

public class BatabaseAdmin extends Employee {
    private final String dbTechnology;
    public BatabaseAdmin(LocalDate dateOfEmployment, String position, String firstName, LocalDate birthday, String dbTechnology) {
        super(dateOfEmployment, position, firstName, birthday);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
