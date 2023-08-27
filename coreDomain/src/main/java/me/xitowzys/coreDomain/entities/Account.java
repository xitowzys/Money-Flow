package me.xitowzys.coreDomain.entities;

import lombok.Data;

/**
 * Represents an account.
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
public class Account {
    /**
     * The unique identifier of the account.
     */
    private Long id;

    /**
     * The name of the account.
     */
    private String name;

    /**
     * The currency associated with the account.
     */
    private Currency currency;
}