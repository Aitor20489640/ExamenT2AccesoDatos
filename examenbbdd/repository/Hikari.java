package examenbbdd.repository;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

public class Hikari {
    private HikariDataSource dataSource;
    private final String host = "database-1.cf3lbfs1lyrq.us-east-1.rds.amazonaws.com:3306";
    private final String db = "empresaAitor";
    private final String dbUrl = "jdbc:mariadb://" + host + "/" + db;
    private final String user = "aitor";
    private final String psswd = "password";
    public Hikari() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        config.setUsername(user);
        config.setPassword(psswd);
        config.addDataSourceProperty("minimumIdle", "5");
        config.addDataSourceProperty("maximumPoolSize", "20");

        dataSource = new HikariDataSource(config);
    }

    public HikariDataSource getDataSource() {
        return dataSource;
    }
}
