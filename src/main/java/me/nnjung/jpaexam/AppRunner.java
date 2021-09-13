package me.nnjung.jpaexam;

import me.nnjung.jpaexam.account.Account;
import me.nnjung.jpaexam.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;


//테스트용 러너
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Connection connection = dataSource.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        System.out.println(metaData.getURL());
        System.out.println(metaData.getDriverName());
        System.out.println(metaData.getUserName());
        Account account = new Account();
        account.setId(1);
        //account.setUsername("name");
        //account.setPassword("pass");

      //  Account newAccount = accountRepository.save(account);

       System.out.println( accountRepository.findById(account.getId()).get().getPassword());

        System.out.println( accountRepository.findByUsername("name").getPassword());

    }
}
