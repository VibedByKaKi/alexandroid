package com.amazon.alexa.mobilytics.identity;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsCredentialKeyProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MobilyticsRegions {
        US_EAST_1("us-east-1"),
        US_WEST_2("us-west-2"),
        EU_WEST_1("eu-west-1"),
        EU_SOUTH_2("eu-south-2");

        private final String name;

        MobilyticsRegions(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    Map<MobilyticsRegions, String> credentialKeys();
}
