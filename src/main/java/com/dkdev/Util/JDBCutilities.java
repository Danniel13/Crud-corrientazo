package com.dkdev.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutilities {

  private static final String DATABASE = "D:\\Users\\Danniel\\Documents\\D3r1ck\\Cursos\\Mision TIC 2022\\Programacion\\Repositorios Git\\Repo varios\\crud_corrientazo\\src\\main\\java\\com\\dkdev\\Resources\\corrientazo.db";
  public static Connection getConnection() throws SQLException {
    var url = "jdbc:sqlite:" + DATABASE;
    return DriverManager.getConnection(url);
}
}

