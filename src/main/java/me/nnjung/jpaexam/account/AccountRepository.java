package me.nnjung.jpaexam.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.annotation.Native;

//Repository sql처리
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(nativeQuery = true, value="select * from account where username = :username")
    Account findByUsername(String username);

}
