package oop;

import oop.encaps.EncapsulationEmployee;

public class OOPExecutions {

    public static void main(String[] args) {

//        NokiaN95 nokiaN95 = new NokiaN95();
//        nokiaN95.internet();
//        nokiaN95.phoneCall();
//
//        Phone phone = new Phone();
//        phone.message();
//        phone.phoneCall();
//
//        SamsungS5 samsungS5 = new SamsungS5();
//        samsungS5.internet();

        EncapsulationEmployee ee = new EncapsulationEmployee();

        ee.setFirstName("Amran");
        System.out.println(ee.getFirstName());


    }
}
