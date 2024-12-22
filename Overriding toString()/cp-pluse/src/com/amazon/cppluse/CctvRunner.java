package com.amazon.cppluse;

import com.amazon.cppluse.cctv.Cctv;

public class CctvRunner {
    public static void main(String[] args) {
        Cctv cctv = new Cctv();
        cctv.setId(3);
        cctv.setBrand("CP Pluse");
        cctv.setModelName("CP");
        cctv.setConnectivityTechnology("Wireless");

        System.out.println(cctv);

    }
}
