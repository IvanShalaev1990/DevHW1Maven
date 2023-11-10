package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.example.entity.user.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(new User("Ivan", "Shalaiev")));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
