package com.dee.app.contacts.interfaces.models.apis.getpnvurl;

import com.dee.app.contacts.interfaces.models.data.enums.NextStepEnum;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPhoneNumberVerificationURLResponse {
    private NextStepEnum nextStep;
    private String redirectUrl;

    public GetPhoneNumberVerificationURLResponse(NextStepEnum nextStepEnum, String str) {
        this.nextStep = nextStepEnum;
        this.redirectUrl = str;
    }

    public NextStepEnum getNextStep() {
        return this.nextStep;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public GetPhoneNumberVerificationURLResponse() {
    }
}
