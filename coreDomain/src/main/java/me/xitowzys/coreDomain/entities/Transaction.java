package me.xitowzys.coreDomain.entities;

import lombok.Data;
import me.xitowzys.coreDomain.interfaces.Entity;

import java.time.LocalDateTime;

@Data
public class Transaction implements Entity {
    private Long id;
    private LocalDateTime date;
    private String note;
    private Account account;
}
