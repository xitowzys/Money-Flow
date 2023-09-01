package me.xitowzys.coreDomain.entities;

import lombok.Data;
import me.xitowzys.coreDomain.interfaces.Entity;

/**
 * Represents a user.
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
public class User implements Entity {
    /**
     * The unique identifier of the user.
     */
    private Long id;

    /**
     * The name of the user.
     */
    private String name;

    /**
     * The email address of the user.
     */
    private String email;

    /**
     * The password of the user.
     */
    private String password;
}
