package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Registration state of a device")
/* loaded from: classes5.dex */
public class DeviceRegistrationState {
    public static final String NOT_REGISTERED = "NOT_REGISTERED";
    public static final String RECENTLY_REGISTERED = "RECENTLY_REGISTERED";
    public static final String PAST_REGISTERED = "PAST_REGISTERED";
    private static final String[] values = {"NOT_REGISTERED", RECENTLY_REGISTERED, PAST_REGISTERED};

    private DeviceRegistrationState() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
