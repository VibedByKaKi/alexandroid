package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class State {
    public static final String CONNECTED = "CONNECTED";
    public static final String DISCOVERED = "DISCOVERED";
    public static final String DONE = "DONE";
    public static final String REGISTERED = "REGISTERED";
    public static final String REGISTRATION_COMPLETE = "REGISTRATION_COMPLETE";
    public static final String TOKEN_REDEEMED = "TOKEN_REDEEMED";
    public static final String SECURE_CHANNEL_ESTABLISHED = "SECURE_CHANNEL_ESTABLISHED";
    public static final String RETRIEVED_PROVISIONING_DETAILS = "RETRIEVED_PROVISIONING_DETAILS";
    public static final String PROVISIONED = "PROVISIONED";
    public static final String NETWORKED = "NETWORKED";
    public static final String PROVISIONER_COMPLETE = "PROVISIONER_COMPLETE";
    public static final String STARTED_AUTHENTICATION = "STARTED_AUTHENTICATION";
    public static final String FINALIZED_AUTHENTICATION = "FINALIZED_AUTHENTICATION";
    public static final String GET_CREDENTIALS = "GET_CREDENTIALS";
    public static final String SAVED_NETWORK = "SAVED_NETWORK";
    public static final String EXPIRED = "EXPIRED";
    private static final String[] values = {"DISCOVERED", "CONNECTED", SECURE_CHANNEL_ESTABLISHED, RETRIEVED_PROVISIONING_DETAILS, PROVISIONED, NETWORKED, "REGISTERED", "DONE", PROVISIONER_COMPLETE, "REGISTRATION_COMPLETE", "TOKEN_REDEEMED", STARTED_AUTHENTICATION, FINALIZED_AUTHENTICATION, GET_CREDENTIALS, SAVED_NETWORK, EXPIRED};

    private State() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
