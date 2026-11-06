package com.amazon.comms.calling.sipclient;

import org.joda.time.DateTime;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CallDetails {
    private DateTime callCompletedTime;
    private DateTime callConnectedTime;
    private DateTime callStartTime;

    public DateTime getCallCompletedTime() {
        return this.callCompletedTime;
    }

    public DateTime getCallConnectedTime() {
        return this.callConnectedTime;
    }

    public DateTime getCallStartTime() {
        return this.callStartTime;
    }

    public void setCallCompletedTime(DateTime dateTime) {
        this.callCompletedTime = dateTime;
    }

    public void setCallConnectedTime(DateTime dateTime) {
        this.callConnectedTime = dateTime;
    }

    public void setCallStartTime(DateTime dateTime) {
        this.callStartTime = dateTime;
    }
}
