package com.jskno.f_interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A1SocialNetworkConnectivityTest {

    @Test
    public void test_A1SocialNetworkConnectivity() {

        A1_SocialNetworkConnectivity a1SocialNetworkConnectivity = new A1_SocialNetworkConnectivity(13);

        String timestamp = a1SocialNetworkConnectivity.earliestDateAllMembersConnected("socialNetworkConnectivityLog.txt");

        Assertions.assertEquals("2025:02:23T10:08:15", timestamp);
    }

}
