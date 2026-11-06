package com.amazon.identity.auth.accounts;

import com.amazon.appmanager.lib.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AmazonAccountManager$AccountRegistrationStatus {
    Registered("Registered"),
    Deregistering("Deregistering"),
    NotFound(Constants.NOT_FOUND);

    private final String mValue;

    AmazonAccountManager$AccountRegistrationStatus(String str) {
        this.mValue = str;
    }

    public static AmazonAccountManager$AccountRegistrationStatus fromValue(String str) {
        for (AmazonAccountManager$AccountRegistrationStatus amazonAccountManager$AccountRegistrationStatus : values()) {
            if (amazonAccountManager$AccountRegistrationStatus.getValue().equals(str)) {
                return amazonAccountManager$AccountRegistrationStatus;
            }
        }
        return null;
    }

    public String getValue() {
        return this.mValue;
    }
}
