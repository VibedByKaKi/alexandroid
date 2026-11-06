package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class RegistrationState {
    public static final String NOT_REGISTERED = "NOT_REGISTERED";
    public static final String REGISTERED = "REGISTERED";
    public static final String REGISTRATION_COMPLETE = "REGISTRATION_COMPLETE";
    public static final String COMPLETING_REGISTRATION = "COMPLETING_REGISTRATION";
    public static final String REGISTRATION_FAILED_TOKEN_INVALID = "REGISTRATION_FAILED_TOKEN_INVALID";
    public static final String REGISTRATION_FAILED_TOKEN_EXPIRED = "REGISTRATION_FAILED_TOKEN_EXPIRED";
    public static final String REGISTRATION_FAILED_SERVER_NOT_REACHABLE = "REGISTRATION_FAILED_SERVER_NOT_REACHABLE";
    public static final String REGISTRATION_FAILED_SERVER_ERROR = "REGISTRATION_FAILED_SERVER_ERROR";
    public static final String REGISTRATION_FAILED_OTHER = "REGISTRATION_FAILED_OTHER";
    private static final String[] values = {"NOT_REGISTERED", COMPLETING_REGISTRATION, "REGISTRATION_COMPLETE", REGISTRATION_FAILED_TOKEN_INVALID, REGISTRATION_FAILED_TOKEN_EXPIRED, REGISTRATION_FAILED_SERVER_NOT_REACHABLE, REGISTRATION_FAILED_SERVER_ERROR, REGISTRATION_FAILED_OTHER, "REGISTERED"};

    private RegistrationState() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
