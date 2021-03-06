//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;enumeration value="AdultOther"/>
 *     &lt;enumeration value="AdoptedChild"/>
 *     &lt;enumeration value="AdoptedDaughter"/>
 *     &lt;enumeration value="AdoptedSon"/>
 *     &lt;enumeration value="AdoptiveFather"/>
 *     &lt;enumeration value="AdoptiveMother"/>
 *     &lt;enumeration value="AdoptiveParent"/>
 *     &lt;enumeration value="AgencyRepresentative"/>
 *     &lt;enumeration value="Applicant"/>
 *     &lt;enumeration value="Aunt"/>
 *     &lt;enumeration value="AuthorizedDesignate"/>
 *     &lt;enumeration value="Brother"/>
 *     &lt;enumeration value="BrotherInLaw"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="BusinessAssociate"/>
 *     &lt;enumeration value="BusinessPartner"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="CollateralDependent"/>
 *     &lt;enumeration value="CommonLawSpouse"/>
 *     &lt;enumeration value="CourtAppointedGuardian"/>
 *     &lt;enumeration value="Cousin"/>
 *     &lt;enumeration value="Daughter"/>
 *     &lt;enumeration value="DaughterInLaw"/>
 *     &lt;enumeration value="Dependent"/>
 *     &lt;enumeration value="DependentOfMinorDependent"/>
 *     &lt;enumeration value="DomesticPartner"/>
 *     &lt;enumeration value="EmancipatedMinor"/>
 *     &lt;enumeration value="EmergencyContact"/>
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="Employer"/>
 *     &lt;enumeration value="ExHusband"/>
 *     &lt;enumeration value="ExSpouse"/>
 *     &lt;enumeration value="ExWife"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="FatherInLaw"/>
 *     &lt;enumeration value="Fiance"/>
 *     &lt;enumeration value="Fiancee"/>
 *     &lt;enumeration value="FosterChild"/>
 *     &lt;enumeration value="FosterDaughter"/>
 *     &lt;enumeration value="FosterFather"/>
 *     &lt;enumeration value="FosterMother"/>
 *     &lt;enumeration value="FosterParent"/>
 *     &lt;enumeration value="FosterSon"/>
 *     &lt;enumeration value="Friend"/>
 *     &lt;enumeration value="GodDaughter"/>
 *     &lt;enumeration value="GodFather"/>
 *     &lt;enumeration value="GodMother"/>
 *     &lt;enumeration value="GodParent"/>
 *     &lt;enumeration value="GodSon"/>
 *     &lt;enumeration value="GrandChild"/>
 *     &lt;enumeration value="GrandDaughter"/>
 *     &lt;enumeration value="GrandFather"/>
 *     &lt;enumeration value="GrandMother"/>
 *     &lt;enumeration value="GrandParent"/>
 *     &lt;enumeration value="GrandSon"/>
 *     &lt;enumeration value="GreatAunt"/>
 *     &lt;enumeration value="GreatUncle"/>
 *     &lt;enumeration value="Guardian"/>
 *     &lt;enumeration value="HalfBrother"/>
 *     &lt;enumeration value="HalfSister"/>
 *     &lt;enumeration value="HandicappedDependent"/>
 *     &lt;enumeration value="Husband"/>
 *     &lt;enumeration value="LifePartner"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="MotherInLaw"/>
 *     &lt;enumeration value="Neighbor"/>
 *     &lt;enumeration value="Nephew"/>
 *     &lt;enumeration value="Niece"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Parents"/>
 *     &lt;enumeration value="Partner"/>
 *     &lt;enumeration value="RelationshipOther"/>
 *     &lt;enumeration value="Relative"/>
 *     &lt;enumeration value="Self"/>
 *     &lt;enumeration value="Sibling"/>
 *     &lt;enumeration value="SignificantOther"/>
 *     &lt;enumeration value="Sister"/>
 *     &lt;enumeration value="SisterInLaw"/>
 *     &lt;enumeration value="Son"/>
 *     &lt;enumeration value="SonInLaw"/>
 *     &lt;enumeration value="Sponsor"/>
 *     &lt;enumeration value="SponsoredDependent"/>
 *     &lt;enumeration value="Spouse"/>
 *     &lt;enumeration value="StepBrother"/>
 *     &lt;enumeration value="StepChild"/>
 *     &lt;enumeration value="StepDaughter"/>
 *     &lt;enumeration value="StepFather"/>
 *     &lt;enumeration value="StepMother"/>
 *     &lt;enumeration value="StepParent"/>
 *     &lt;enumeration value="StepSister"/>
 *     &lt;enumeration value="StepSon"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="Uncle"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Ward"/>
 *     &lt;enumeration value="Widow"/>
 *     &lt;enumeration value="Widower"/>
 *     &lt;enumeration value="Wife"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationshipCodeType")
@XmlEnum
public enum RelationshipCodeType {

    @XmlEnumValue("AdultOther")
    ADULT_OTHER("AdultOther"),
    @XmlEnumValue("AdoptedChild")
    ADOPTED_CHILD("AdoptedChild"),
    @XmlEnumValue("AdoptedDaughter")
    ADOPTED_DAUGHTER("AdoptedDaughter"),
    @XmlEnumValue("AdoptedSon")
    ADOPTED_SON("AdoptedSon"),
    @XmlEnumValue("AdoptiveFather")
    ADOPTIVE_FATHER("AdoptiveFather"),
    @XmlEnumValue("AdoptiveMother")
    ADOPTIVE_MOTHER("AdoptiveMother"),
    @XmlEnumValue("AdoptiveParent")
    ADOPTIVE_PARENT("AdoptiveParent"),
    @XmlEnumValue("AgencyRepresentative")
    AGENCY_REPRESENTATIVE("AgencyRepresentative"),
    @XmlEnumValue("Applicant")
    APPLICANT("Applicant"),
    @XmlEnumValue("Aunt")
    AUNT("Aunt"),
    @XmlEnumValue("AuthorizedDesignate")
    AUTHORIZED_DESIGNATE("AuthorizedDesignate"),
    @XmlEnumValue("Brother")
    BROTHER("Brother"),
    @XmlEnumValue("BrotherInLaw")
    BROTHER_IN_LAW("BrotherInLaw"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("BusinessAssociate")
    BUSINESS_ASSOCIATE("BusinessAssociate"),
    @XmlEnumValue("BusinessPartner")
    BUSINESS_PARTNER("BusinessPartner"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("CollateralDependent")
    COLLATERAL_DEPENDENT("CollateralDependent"),
    @XmlEnumValue("CommonLawSpouse")
    COMMON_LAW_SPOUSE("CommonLawSpouse"),
    @XmlEnumValue("CourtAppointedGuardian")
    COURT_APPOINTED_GUARDIAN("CourtAppointedGuardian"),
    @XmlEnumValue("Cousin")
    COUSIN("Cousin"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("DaughterInLaw")
    DAUGHTER_IN_LAW("DaughterInLaw"),
    @XmlEnumValue("Dependent")
    DEPENDENT("Dependent"),
    @XmlEnumValue("DependentOfMinorDependent")
    DEPENDENT_OF_MINOR_DEPENDENT("DependentOfMinorDependent"),
    @XmlEnumValue("DomesticPartner")
    DOMESTIC_PARTNER("DomesticPartner"),
    @XmlEnumValue("EmancipatedMinor")
    EMANCIPATED_MINOR("EmancipatedMinor"),
    @XmlEnumValue("EmergencyContact")
    EMERGENCY_CONTACT("EmergencyContact"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Employer")
    EMPLOYER("Employer"),
    @XmlEnumValue("ExHusband")
    EX_HUSBAND("ExHusband"),
    @XmlEnumValue("ExSpouse")
    EX_SPOUSE("ExSpouse"),
    @XmlEnumValue("ExWife")
    EX_WIFE("ExWife"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("FatherInLaw")
    FATHER_IN_LAW("FatherInLaw"),
    @XmlEnumValue("Fiance")
    FIANCE("Fiance"),
    @XmlEnumValue("Fiancee")
    FIANCEE("Fiancee"),
    @XmlEnumValue("FosterChild")
    FOSTER_CHILD("FosterChild"),
    @XmlEnumValue("FosterDaughter")
    FOSTER_DAUGHTER("FosterDaughter"),
    @XmlEnumValue("FosterFather")
    FOSTER_FATHER("FosterFather"),
    @XmlEnumValue("FosterMother")
    FOSTER_MOTHER("FosterMother"),
    @XmlEnumValue("FosterParent")
    FOSTER_PARENT("FosterParent"),
    @XmlEnumValue("FosterSon")
    FOSTER_SON("FosterSon"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("GodDaughter")
    GOD_DAUGHTER("GodDaughter"),
    @XmlEnumValue("GodFather")
    GOD_FATHER("GodFather"),
    @XmlEnumValue("GodMother")
    GOD_MOTHER("GodMother"),
    @XmlEnumValue("GodParent")
    GOD_PARENT("GodParent"),
    @XmlEnumValue("GodSon")
    GOD_SON("GodSon"),
    @XmlEnumValue("GrandChild")
    GRAND_CHILD("GrandChild"),
    @XmlEnumValue("GrandDaughter")
    GRAND_DAUGHTER("GrandDaughter"),
    @XmlEnumValue("GrandFather")
    GRAND_FATHER("GrandFather"),
    @XmlEnumValue("GrandMother")
    GRAND_MOTHER("GrandMother"),
    @XmlEnumValue("GrandParent")
    GRAND_PARENT("GrandParent"),
    @XmlEnumValue("GrandSon")
    GRAND_SON("GrandSon"),
    @XmlEnumValue("GreatAunt")
    GREAT_AUNT("GreatAunt"),
    @XmlEnumValue("GreatUncle")
    GREAT_UNCLE("GreatUncle"),
    @XmlEnumValue("Guardian")
    GUARDIAN("Guardian"),
    @XmlEnumValue("HalfBrother")
    HALF_BROTHER("HalfBrother"),
    @XmlEnumValue("HalfSister")
    HALF_SISTER("HalfSister"),
    @XmlEnumValue("HandicappedDependent")
    HANDICAPPED_DEPENDENT("HandicappedDependent"),
    @XmlEnumValue("Husband")
    HUSBAND("Husband"),
    @XmlEnumValue("LifePartner")
    LIFE_PARTNER("LifePartner"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("MotherInLaw")
    MOTHER_IN_LAW("MotherInLaw"),
    @XmlEnumValue("Neighbor")
    NEIGHBOR("Neighbor"),
    @XmlEnumValue("Nephew")
    NEPHEW("Nephew"),
    @XmlEnumValue("Niece")
    NIECE("Niece"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Parents")
    PARENTS("Parents"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("RelationshipOther")
    RELATIONSHIP_OTHER("RelationshipOther"),
    @XmlEnumValue("Relative")
    RELATIVE("Relative"),
    @XmlEnumValue("Self")
    SELF("Self"),
    @XmlEnumValue("Sibling")
    SIBLING("Sibling"),
    @XmlEnumValue("SignificantOther")
    SIGNIFICANT_OTHER("SignificantOther"),
    @XmlEnumValue("Sister")
    SISTER("Sister"),
    @XmlEnumValue("SisterInLaw")
    SISTER_IN_LAW("SisterInLaw"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("SonInLaw")
    SON_IN_LAW("SonInLaw"),
    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("SponsoredDependent")
    SPONSORED_DEPENDENT("SponsoredDependent"),
    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("StepBrother")
    STEP_BROTHER("StepBrother"),
    @XmlEnumValue("StepChild")
    STEP_CHILD("StepChild"),
    @XmlEnumValue("StepDaughter")
    STEP_DAUGHTER("StepDaughter"),
    @XmlEnumValue("StepFather")
    STEP_FATHER("StepFather"),
    @XmlEnumValue("StepMother")
    STEP_MOTHER("StepMother"),
    @XmlEnumValue("StepParent")
    STEP_PARENT("StepParent"),
    @XmlEnumValue("StepSister")
    STEP_SISTER("StepSister"),
    @XmlEnumValue("StepSon")
    STEP_SON("StepSon"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    @XmlEnumValue("Uncle")
    UNCLE("Uncle"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Ward")
    WARD("Ward"),
    @XmlEnumValue("Widow")
    WIDOW("Widow"),
    @XmlEnumValue("Widower")
    WIDOWER("Widower"),
    @XmlEnumValue("Wife")
    WIFE("Wife");
    private final String value;

    RelationshipCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipCodeType fromValue(String v) {
        for (RelationshipCodeType c: RelationshipCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
