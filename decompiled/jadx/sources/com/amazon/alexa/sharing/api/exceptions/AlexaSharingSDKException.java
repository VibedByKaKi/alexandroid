package com.amazon.alexa.sharing.api.exceptions;

import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaSharingSDKException extends AlexaSharingException {
    static final String TYPE = "SharingSDKException";
    final String code;
    final String message;

    public AlexaSharingSDKException(String str, String str2) {
        super(str);
        this.message = str;
        this.code = str2;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException
    public String getCode() {
        return this.code;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException
    public String getErrorMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException
    public HashMap<String, String> getMetadata() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", this.code);
        hashMap.put("message", this.message);
        hashMap.put("type", TYPE);
        return hashMap;
    }

    public AlexaSharingSDKException(String str) {
        super(str);
        this.message = str;
        this.code = str;
    }
}
