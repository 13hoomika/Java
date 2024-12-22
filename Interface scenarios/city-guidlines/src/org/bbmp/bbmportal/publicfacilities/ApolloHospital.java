package org.bbmp.bbmportal.publicfacilities;

import org.bbmp.bbmportal.guidlines.HospitalGuidlines;
import org.bbmp.bbmportal.guidlines.TrafficGuidlines;

public abstract class ApolloHospital implements HospitalGuidlines {
    @Override
    public void indianPublicHealthStandards() {
        System.out.println("Apollo follow The IPHS (CHC) guideline.");
    }

    @Override
    public void laws() {
        System.out.println("Apollo follow laws under hospital guidelines");
    }

    @Override
    public void hospitalDesign() {
        System.out.println("Apollo follow The World Health Organization (WHO).");
    }
}
