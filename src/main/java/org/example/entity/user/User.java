package org.example.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Class that represent a domain user
 *
 * @author Shalaiev Ivan.
 * @version 1.0.0 09.11.2023
 */
@Data
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return
                "name: " + name +
                        "\nlastName: " + lastName;
    }
}
