package com.work2win.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import com.work2win.model.Account;

public interface AccountRepository extends CassandraRepository<Account, Integer> {

}
