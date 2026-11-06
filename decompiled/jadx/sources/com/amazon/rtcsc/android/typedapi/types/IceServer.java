package com.amazon.rtcsc.android.typedapi.types;

import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IceServer {
    private String credential;

    @NonNull
    private String url;
    private String username;

    public IceServer(@NonNull String str, String str2, String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("url is marked non-null but is null");
            throw null;
        }
        this.url = str;
        this.username = str2;
        this.credential = str3;
    }

    public String getCredential() {
        return this.credential;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public IceServer(@NonNull String str) {
        if (str != null) {
            this.url = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("url is marked non-null but is null");
            throw null;
        }
    }
}
