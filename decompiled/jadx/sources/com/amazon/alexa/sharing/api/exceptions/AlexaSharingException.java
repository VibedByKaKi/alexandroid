package com.amazon.alexa.sharing.api.exceptions;

import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaSharingException extends Exception {
    static final String TYPE = "Exception";
    final String code;
    final String message;

    public AlexaSharingException(BridgeError bridgeError) {
        super(bridgeError.message());
        this.message = bridgeError.message();
        this.code = bridgeError.code();
    }

    public String getCode() {
        return this.code;
    }

    public HashMap<String, Object> getContent() {
        return new HashMap<>();
    }

    public String getErrorMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public HashMap<String, String> getMetadata() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", this.code);
        hashMap.put("message", this.message);
        hashMap.put("type", TYPE);
        return hashMap;
    }

    public AlexaSharingException(String str, String str2) {
        super(str);
        this.message = str;
        this.code = str2;
    }

    public AlexaSharingException(String str) {
        super(str);
        this.message = str;
        this.code = str;
    }
}
