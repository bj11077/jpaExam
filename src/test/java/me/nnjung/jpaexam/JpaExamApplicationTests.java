package me.nnjung.jpaexam;

import me.nnjung.jpaexam.account.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@DataJpaTest
class JpaExamApplicationTests {

   @Autowired
    DataSource dataSource;

   @Autowired
    JdbcTemplate jdbcTemplate;

   @Autowired
    AccountRepository accountRepository;

   @Test
    public void di(){

   }

}
