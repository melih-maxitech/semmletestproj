package com.semmletestproj;

import java.io.File;
import java.sql.DatabaseMetaData;
import java.sql.SQLData;
import java.sql.SQLInput;
import java.util.HashMap;
import java.util.Map;

public class Car extends Vehicles {

    private static final String FILE_SEPARATOR = "-";
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
    public String left(String userId) {
        String userno = userId;
        String sql = "SELECT * from Users WHERE userId = @0";

        return sql;
    }

    @Override
    public int right() {
        private Map<String, String> spoutMap = new HashMap<String, String>();
        return super.right();
    }

    public static File getWorkerDirFromRoot(String logRoot, String id, Integer port) {
        return new File((logRoot + FILE_SEPARATOR + id + FILE_SEPARATOR + port));
    }
}
