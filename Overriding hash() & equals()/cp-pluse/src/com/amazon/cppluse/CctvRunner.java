package com.amazon.cppluse;

import com.amazon.cppluse.cctv.Cctv;

public class CctvRunner {
    public static void main(String[] args) {
        Cctv cctv = new Cctv();
        cctv.setId(3);
        cctv.setBrand("CP Pluse");
        cctv.setModelName("CP");
        cctv.setConnectivityTechnology("Wireless");

        Cctv cctv1 = new Cctv();
        cctv1.setId(3);
        cctv1.setBrand("CP Pluse");
        cctv1.setModelName("CP");
        cctv1.setConnectivityTechnology("Wireless");

        System.out.println(cctv);

        System.out.println("Cctv: "+ cctv.hashCode());
        System.out.println("Cctv1: "+ cctv1.hashCode());

        boolean same = cctv.equals(cctv1);
        System.out.println(same);



    }
}
