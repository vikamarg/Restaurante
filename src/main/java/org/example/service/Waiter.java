package org.example.service;

import org.example.enums.Roles;

import java.util.ArrayList;
import java.util.List;

public class Waiter extends BaseStaff {
    List<Table> tables ;
    private int tips;

    public Waiter(String name, boolean availability){
        super(name , Roles.WAITER, availability );
        tables = new ArrayList<>();
        tips = 0;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public int getTips() {
        return tips;
    }

    public void setTips(final int tips) {
        this.tips = tips;
    }
}
