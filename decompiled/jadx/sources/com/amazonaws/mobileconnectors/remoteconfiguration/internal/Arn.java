package com.amazonaws.mobileconnectors.remoteconfiguration.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Arn {
    private final String account;
    private final String id;
    private final String region;
    private final String type;
    private final String vendor;

    public Arn(String str, String str2, String str3, String str4, String str5) {
        this.vendor = str;
        this.region = str2;
        this.account = str3;
        this.type = str4;
        this.id = str5;
    }

    public static Arn fromArn(String str) {
        String[] split = str.split(":", 6);
        if (split.length == 6) {
            String[] split2 = split[5].split("[:/]", 2);
            return new Arn(split[2], split[3], split[4], split2[0], split2[1]);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid ARN");
        return null;
    }

    public String getAccount() {
        return this.account;
    }

    public String getId() {
        return this.id;
    }

    public String getRegion() {
        return this.region;
    }

    public String getType() {
        return this.type;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String toArn() {
        String str = this.vendor;
        String str2 = this.region;
        String str3 = this.account;
        String str4 = this.type;
        String str5 = this.id;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("arn:aws:", str, ":", str2, ":");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ":", str4, ":");
        m.append(str5);
        return m.toString();
    }
}
