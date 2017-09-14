package com.myairtel.framework;

/**
 * Created by B0095770 on 19/08/17.
 */

    public class TestInfo {

    private static String
            TIMESTAMP,
            SUITE,
            ID,
            NAME,
            NOTES,
            EXPECTED,
            ACTUAL,
            VERSION,
            OS;

    public static String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public static void setTIMESTAMP(String TIMESTAMP) {
        TestInfo.TIMESTAMP = TIMESTAMP;
    }

    public static String getSUITE() {
        return SUITE;
    }

    public static void setSUITE(String SUITE) {
        TestInfo.SUITE = SUITE;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        TestInfo.ID = ID;
    }

    public static String getNAME() {
        return NAME;
    }

    public static void setNAME(String NAME) {
        TestInfo.NAME = NAME;
    }

    public static String getNOTES() {
        return NOTES;
    }

    public static void setNOTES(String NOTES) {
        TestInfo.NOTES = NOTES;
    }

    public static String getEXPECTED() {
        return EXPECTED;
    }

    public static void setEXPECTED(String EXPECTED) {
        TestInfo.EXPECTED = EXPECTED;
    }

    public static String getACTUAL() {
        return ACTUAL;
    }

    public static void setACTUAL(String ACTUAL) {
        TestInfo.ACTUAL = ACTUAL;
    }

    public static String getVERSION() {
        return VERSION;
    }

    public static void setVERSION(String VERSION) {
        TestInfo.VERSION = VERSION;
    }

    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        TestInfo.OS = OS;
    }

    public void reset() {
        TIMESTAMP = null;
        SUITE = null;
        ID = null;
        NAME = null;
        NOTES = null;
        EXPECTED = null;
        ACTUAL = null;
        VERSION = null;
        OS = null;

    }

}

