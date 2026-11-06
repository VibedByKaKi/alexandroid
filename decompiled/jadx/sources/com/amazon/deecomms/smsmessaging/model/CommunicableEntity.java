package com.amazon.deecomms.smsmessaging.model;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommunicableEntity {
    public String address;
    public EntityFormat addressType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EntityFormat {
        PhoneNumberAddress,
        EmailAddress,
        skype,
        a2a
    }

    public CommunicableEntity(@NonNull String str, @NonNull EntityFormat entityFormat) {
        this.address = str;
        this.addressType = entityFormat;
    }
}
