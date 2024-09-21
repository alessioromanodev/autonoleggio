package com.parthenope.Autonoleggio.services;
import com.parthenope.Autonoleggio.dto.TransactionDto;
import java.util.List;

public interface TransactionService {
    List<TransactionDto> findAllTransactions();
}
