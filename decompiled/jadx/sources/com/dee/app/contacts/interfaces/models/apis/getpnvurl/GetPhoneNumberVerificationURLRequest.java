package com.dee.app.contacts.interfaces.models.apis.getpnvurl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPhoneNumberVerificationURLRequest {
    private GetPhoneNumberVerificationURLBody body;

    public GetPhoneNumberVerificationURLRequest(GetPhoneNumberVerificationURLBody getPhoneNumberVerificationURLBody) {
        this.body = getPhoneNumberVerificationURLBody;
    }

    public GetPhoneNumberVerificationURLBody getBody() {
        return this.body;
    }

    public void setBody(GetPhoneNumberVerificationURLBody getPhoneNumberVerificationURLBody) {
        this.body = getPhoneNumberVerificationURLBody;
    }
}
