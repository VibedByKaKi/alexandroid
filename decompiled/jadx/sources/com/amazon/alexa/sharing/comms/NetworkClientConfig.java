package com.amazon.alexa.sharing.comms;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NetworkClientConfig {

    @NonNull
    private String host;

    @NonNull
    private String source;

    @NonNull
    private int timeoutInSecs;

    public NetworkClientConfig(@NonNull String str, @NonNull String str2, @NonNull int i) {
        this.source = str;
        this.host = str2;
        this.timeoutInSecs = i;
    }

    @NonNull
    public String getHost() {
        return this.host;
    }

    @NonNull
    public String getSource() {
        return this.source;
    }

    public int getTimeout() {
        return this.timeoutInSecs;
    }

    public void setHost(@NonNull String str) {
        this.host = str;
    }

    public void setSource(@NonNull String str) {
        this.source = str;
    }

    public void setTimeout(int i) {
        this.timeoutInSecs = i;
    }
}
