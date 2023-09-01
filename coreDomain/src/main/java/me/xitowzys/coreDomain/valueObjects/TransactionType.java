package me.xitowzys.coreDomain.valueObjects;

import lombok.Data;
import me.xitowzys.coreDomain.interfaces.ValueObject;

@Data
public class TransactionType implements ValueObject {
    private final String type;
}
