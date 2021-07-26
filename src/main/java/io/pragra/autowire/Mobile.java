package io.pragra.autowire;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")// this will create new bean object everytime we run the program
public class Mobile {


    private Sim sim1;
    private Sim sim2;
    private AirTel airTel;


//    public Mobile(@Qualifier("airTel") Sim sim1, @Qualifier("vodaphone")Sim sim2) { // constructor base method
//        this.sim1 = sim1;
//        this.sim2 = sim2;
//    }


    public Mobile(@Qualifier("airTel") Sim sim1, @Qualifier("vodaphone")Sim sim2, AirTel airTel) {
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.airTel = airTel;
    }

    public void getAirtelFromMobile(){
      airTel.getAirtel();
    }

    //    @Autowired
//    @Qualifier("airTel")
//    public void setSim1(Sim sim1) { // manual setter
//        this.sim1 = sim1;
//    }
//    @Autowired
//    @Qualifier("vodaphone")
//    public void setSim2(Sim sim2) {
//        this.sim2 = sim2;
//    }


    public Sim receivedCall()
    {
        return Math.random()*5>10?sim2:sim1;
        //return sim2;
    }

}
