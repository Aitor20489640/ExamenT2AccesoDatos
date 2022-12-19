package examenbbdd.repository;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

import java.nio.file.Path;

public class Hikari {
    private HikariDataSource dataSource;
    private final String RUTABASE = Path.of("examenbbdd/bd/examen.db").toString();

    public Hikari() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:sqlite:" + RUTABASE);
        config.addDataSourceProperty("minimumIdle", "5");
        config.addDataSourceProperty("maximumPoolSize", "10");

        dataSource = new HikariDataSource(config);
    }

    public HikariDataSource getDataSource() {
        return dataSource;
    }
}
