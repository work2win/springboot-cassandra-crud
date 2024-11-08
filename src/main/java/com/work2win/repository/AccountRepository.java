package com.work2win.repository;

import javax.transaction.Transactional;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.work2win.model.Account;

public interface AccountRepository extends CassandraRepository<Account, Integer> {
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "update account set balance = balance + :balance where accountnum = :accountnum"
	 * , nativeQuery = true) int deposit(int accountnum, Float balance);
	 * 
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "update account set balance = balance - :balance where accountnum = :accountnum"
	 * , nativeQuery = true) int withdraw(int accountnum, float balance);
	 */

}
