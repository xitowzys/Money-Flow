package me.xitowzys.coreDomain.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a currency.
 * <p>
 * This class uses Lombok's {@code @Data} annotation to generate
 * common methods like getters, setters, equals, hashcode, and toString.
 *
 * @author Kalinka George
 * @version 1.0.0
 * @see lombok.Data
 * @since 0.0.1-SNAPSHOT
 */
@Data
public class Currency {
    /**
     * The unique identifier of the currency.
     */
    private Long id;

    /**
     * The code that represents the currency.
     */
    private String code;

    /**
     * The name of the currency.
     */
    private String name;
}
