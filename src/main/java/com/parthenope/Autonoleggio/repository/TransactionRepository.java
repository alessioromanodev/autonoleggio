package com.parthenope.Autonoleggio.repository;

import com.parthenope.Autonoleggio.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
