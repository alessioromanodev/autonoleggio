package com.parthenope.Autonoleggio.services.impl;

import com.parthenope.Autonoleggio.dto.TransactionDto;
import com.parthenope.Autonoleggio.models.Transaction;
import com.parthenope.Autonoleggio.repository.TransactionRepository;
import com.parthenope.Autonoleggio.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionDto> findAllTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream().map(this::mapToTransactionDto).collect(Collectors.toList());
    }

    private TransactionDto mapToTransactionDto(Transaction transaction) {
        return TransactionDto.builder()
                .id(transaction.getId())
                .user(transaction.getUser())
                .car(transaction.getCar())
                .type(transaction.getType())
                .startDate(transaction.getStartDate())
                .endDate(transaction.getEndDate())
                .build();
    }
}
