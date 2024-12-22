package org.bbmp.bbmportal.publicfacilities;

import org.bbmp.bbmportal.guidlines.BankGuidlines;

public class KotakBank implements BankGuidlines {
    @Override
    public void knowYourCustome() {
        System.out.println("Kotak follow KYC");
    }

    @Override
    public void AML() {
        System.out.println("Kotak follow Anti-Money Laundering (AML)");
    }

    @Override
    public void CAR() {
        System.out.println("Kotak follow Capital Adequacy Ratio (CAR)");
    }

    @Override
    public void PSL() {
        System.out.println("Kotak follow Priority Sector Lending (PSL)");
    }

    @Override
    public void CRR() {
        System.out.println("Kotak follow Cash Reserve Ratio (CRR)");
    }

    @Override
    public void SLR() {
        System.out.println("Kotak follow Statutory Liquidity Ratio (SLR)");
    }

    @Override
    public void NPAmanagement() {
        System.out.println("Kotak follow Non-Performing Assets (NPA) Management");
    }

    @Override
    public void lending() {
        System.out.println("Kotak follow Loan Documentation and Disclosure");
    }

    @Override
    public void riskBasedPricingForLoans() {
        System.out.println("Kotak follow Risk-Based Pricing for Loans");
    }

    @Override
    public void grievanceRedressalMechanism() {
        System.out.println("Kotak follow Grievance Redressal Mechanism");
    }

    @Override
    public void fairLendingPractices() {
        System.out.println("Kotak follow Fair Lending Practices");
    }

    @Override
    public void digitalBankingGuidelines() {
        System.out.println("Kotak follow Digital Banking Guidelines");
    }

    @Override
    public void safeDepositLockers() {
        System.out.println("Kotak follow guidelines for safe deposit lockers");
    }

    @Override
    public void interestRateGuidelines() {
        System.out.println("Kotak ensure transparency in their interest rate structures");

    }

    @Override
    public void disclosureOfFeesAndCharges() {
        System.out.println("Kotak clearly disclose all associated fees, charges, and terms for banking services");
    }
}
