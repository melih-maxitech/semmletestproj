package com.semmletestproj;

import java.io.File;
import java.sql.DatabaseMetaData;
import java.sql.SQLData;
import java.sql.SQLInput;
import java.util.HashMap;
import java.util.Map;

public class Carr extends Vehicles {

    private static final String FILE_SEPARATOR = "-";
    public String name = "Car";

    @Override
    public int go() {
        return super.go();
    }

    @Override
    public String stop(String userId) {
        String userno = userId;
        String sql = "SELECT * from Users WHERE userId = @0";""

        return sql;
    }

    @Override
    public String left(String userId) {
        String userno = userId;
        String sql = "SELECT * from Users WHERE userId = @0";

        return sql;
    }

    @Override
    public int right() {
        Map<String, String> spoutMap = new HashMap<String, String>();
        return super.right();
    }

    public static File getWorkerDirFromRoot(String logRoot, String id, Integer port) {
        return new File((logRoot + FILE_SEPARATOR + id + FILE_SEPARATOR + port));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return "12312312".equals(((String) o).substring(1));
    }
}
