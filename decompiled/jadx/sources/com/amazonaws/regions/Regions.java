package com.amazonaws.regions;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Regions {
    GovCloud("us-gov-west-1"),
    US_GOV_EAST_1("us-gov-east-1"),
    US_EAST_1("us-east-1"),
    US_EAST_2("us-east-2"),
    US_WEST_1("us-west-1"),
    US_WEST_2("us-west-2"),
    EU_SOUTH_1("eu-south-1"),
    EU_SOUTH_2("eu-south-2"),
    EU_WEST_1("eu-west-1"),
    EU_WEST_2("eu-west-2"),
    EU_WEST_3("eu-west-3"),
    EU_CENTRAL_1("eu-central-1"),
    EU_CENTRAL_2("eu-central-2"),
    EU_NORTH_1("eu-north-1"),
    AP_EAST_1("ap-east-1"),
    AP_SOUTH_1("ap-south-1"),
    AP_SOUTHEAST_1("ap-southeast-1"),
    AP_SOUTHEAST_2("ap-southeast-2"),
    AP_NORTHEAST_1("ap-northeast-1"),
    AP_NORTHEAST_2("ap-northeast-2"),
    SA_EAST_1("sa-east-1"),
    CA_CENTRAL_1("ca-central-1"),
    CN_NORTH_1("cn-north-1"),
    CN_NORTHWEST_1("cn-northwest-1"),
    ME_SOUTH_1("me-south-1"),
    AF_SOUTH_1("af-south-1"),
    AP_SOUTHEAST_3("ap-southeast-3"),
    ME_CENTRAL_1("me-central-1");

    private final String name;
    public static final Regions DEFAULT_REGION = US_WEST_2;

    Regions(String str) {
        this.name = str;
    }

    public static Regions fromName(String str) {
        for (Regions regions : values()) {
            if (str.equals(regions.getName())) {
                return regions;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot create enum from ", str, " value!"));
        return null;
    }

    public String getName() {
        return this.name;
    }
}
