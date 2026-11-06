package com.amazon.coral.org.json;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class JSONException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public JSONException(Throwable th) {
        super(th.getMessage(), th);
    }

    public JSONException(String str, Throwable th) {
        super(str, th);
    }

    public JSONException(String str) {
        super(str);
    }
}
