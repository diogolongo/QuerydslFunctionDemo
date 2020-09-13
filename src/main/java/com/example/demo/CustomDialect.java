package com.example.demo;

import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class CustomDialect extends MySQL5Dialect {
    public CustomDialect() {
        super();
        this.registerFunction("match", new SQLFunctionTemplate(StandardBasicTypes.DOUBLE,"MATCH (?1, ?2) AGAINST (?3 in boolean mode)"));
    }
}
