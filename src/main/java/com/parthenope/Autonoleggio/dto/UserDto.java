package com.parthenope.Autonoleggio.dto;
import com.parthenope.Autonoleggio.models.Transaction;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class UserDto {
    private Long id;
    private List<Transaction> transactions;
    private boolean premium;
}
