package io.pragra.autowire;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Vodaphone implements Sim {
    @Override
    public void calling() {
        System.out.println("Vodaphone Phone");
    }
}
