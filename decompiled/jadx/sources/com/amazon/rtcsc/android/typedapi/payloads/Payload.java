package com.amazon.rtcsc.android.typedapi.payloads;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Payload {
    private transient Gson gson;
    private transient GsonBuilder gsonBuilder;
    protected String sessionDomain;
    protected String sessionId;

    public Payload() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        this.gsonBuilder = gsonBuilder;
        this.gson = gsonBuilder.create();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Payload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) obj;
        if (!payload.canEqual(this)) {
            return false;
        }
        String str = this.sessionId;
        String str2 = payload.sessionId;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.sessionDomain;
        String str4 = payload.sessionDomain;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public String getSerializedPayload() {
        return this.gson.toJson(this);
    }

    public int hashCode() {
        String str = this.sessionId;
        int hashCode = str == null ? 43 : str.hashCode();
        String str2 = this.sessionDomain;
        return ((hashCode + 59) * 59) + (str2 != null ? str2.hashCode() : 43);
    }
}
