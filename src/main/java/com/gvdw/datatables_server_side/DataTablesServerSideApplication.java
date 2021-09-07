package com.gvdw.datatables_server_side;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DataTablesServerSideApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataTablesServerSideApplication.class, args);
    }

}
