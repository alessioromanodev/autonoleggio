package com.parthenope.Autonoleggio.dto;
import com.parthenope.Autonoleggio.models.Car;
import com.parthenope.Autonoleggio.models.User;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class TransactionDto {
    private Long id;
    private User user;
    private Car car;
    private String type;
    private Date startDate;
    private Date endDate;
}