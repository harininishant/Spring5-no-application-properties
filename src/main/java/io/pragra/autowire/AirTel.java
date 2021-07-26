package io.pragra.autowire;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AirTel implements Sim{
    @Override
    public void calling() {
        System.out.println("AirTel Phone");
    }

    public void getAirtel(){
        System.out.println("Airtel Method");
    }
}
