package org.bbmp.bbmportal;

import org.bbmp.bbmportal.guidlines.*;
import org.bbmp.bbmportal.publicfacilities.*;

public class Runner {
    public static void main(String[] args) {
        HospitalGuidlines hospitalGuidlines = new ApolloHospital();
        hospitalGuidlines.indianPublicHealthStandards();
        hospitalGuidlines.laws();
        hospitalGuidlines.hospitalDesign();

        System.out.println("-----------------------");

        BankGuidlines bankGuidlines = new KotakBank();
        bankGuidlines.knowYourCustome();
        bankGuidlines.digitalBankingGuidelines();
        bankGuidlines.grievanceRedressalMechanism();
        bankGuidlines.knowYourCustome();
        bankGuidlines.safeDepositLockers();
        bankGuidlines.AML();
        bankGuidlines.CAR();
        bankGuidlines.CRR();
        bankGuidlines.PSL();
        bankGuidlines.lending();
        bankGuidlines.NPAmanagement();
        bankGuidlines.SLR();
        bankGuidlines.riskBasedPricingForLoans();
        bankGuidlines.fairLendingPractices();
        bankGuidlines.interestRateGuidelines();
        bankGuidlines.disclosureOfFeesAndCharges();

        System.out.println("-----------------------");

        CollegeGuidlines collegeGuidlines = new RVCollege();
        collegeGuidlines.processAdmission();
        collegeGuidlines.createGrievanceRedressalSystem();
        collegeGuidlines.defineExaminationGuidelines();
        collegeGuidlines.discloseFeeStructure();
        collegeGuidlines.enforceAntiRagging();
        collegeGuidlines.setHostelRules();
        collegeGuidlines.setCodeOfConduct();
        collegeGuidlines.monitorAttendance();
        collegeGuidlines.implementAntiDiscriminationPolicies();
        collegeGuidlines.discloseFeeStructure();
        collegeGuidlines.ensureStudentSafety();
        System.out.println("--------------------------");

        RailwayStationGuidlines railwayGuidlines = new KSR();
        railwayGuidlines.ensureSafety();
        railwayGuidlines.enforceAntiRagging();
        railwayGuidlines.enforceSmokingBan();
        railwayGuidlines.handleLostItems();
        railwayGuidlines.maintainDiscipline();
        railwayGuidlines.ensureEmergencyPreparedness();
        railwayGuidlines.handleLostItems();
        railwayGuidlines.maintainCleanliness();
        railwayGuidlines.manageQueues();
        railwayGuidlines.manageTicketing();
        railwayGuidlines.monitorBaggage();
        railwayGuidlines.monitorBehavior();
        railwayGuidlines.provideAccessibility();
        railwayGuidlines.provideInformation();
        railwayGuidlines.provideWaitingArea();
        railwayGuidlines.regulateSchedules();

        System.out.println("-------------------------");

        TempleGuidlines templeGuidlines = new Iskcon();
        templeGuidlines.ensureSafety();
        templeGuidlines.maintainDiscipline();
        templeGuidlines.provideAccessibility();
        templeGuidlines.distributePrasada();
        templeGuidlines.ensureCleanliness();
        templeGuidlines.maintainDressCode();
        templeGuidlines.organizeEvents();
        templeGuidlines.manageQueues();
        templeGuidlines.regulateEntry();
        templeGuidlines.manageDonations();

        System.out.println("-----------------------");

        TrafficGuidlines trafficGuidlines = new BangaloreTrafficPolice();
        trafficGuidlines.regulateTrafficSignal();
        trafficGuidlines.enforceSpeedLimit();
        trafficGuidlines.monitorLaneDiscipline();
        trafficGuidlines.controlTrafficDuringRushHour();
        trafficGuidlines.controlTrafficDuringRushHour();
        trafficGuidlines.enforceNoEntryZone();
        trafficGuidlines.ensureClearVisibilityAtIntersections();
        trafficGuidlines.ensureParkingRegulation();
        trafficGuidlines.implementOneWayStreet();
        trafficGuidlines.imposeTrafficViolationFines();
        trafficGuidlines.maintainPedestrianSafety();
        trafficGuidlines.manageEmergencyVehicleAccess();
        trafficGuidlines.regulatePublicTransportRoute();
        trafficGuidlines.promoteHelmetAndSeatbeltUsage();
        trafficGuidlines.monitorIllegalParking();
        trafficGuidlines.managePedestrianCrossing();
    }

}
