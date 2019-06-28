package com.semmletestproj;

import java.sql.DatabaseMetaData;
import java.sql.SQLData;
import java.sql.SQLInput;

public class Car extends Vehicles {

    public String name = "Car";

    @Override
    public int go() {
        return super.go();
    }

    @Override
    public String stop(String userId) {
        String userno = userId;
        String sql = "SELECT * from Users WHERE userId = @0";

        return sql;
    }

    @Override
    public int left() {
        return super.left();
    }

    @Override
    public int right() {
        return super.right();
    }
}
