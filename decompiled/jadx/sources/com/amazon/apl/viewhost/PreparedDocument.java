package com.amazon.apl.viewhost;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class PreparedDocument {
    public abstract DocumentHandle getHandle();

    public abstract String getToken();

    public abstract String getUniqueID();

    public abstract boolean hasToken();

    public abstract boolean isReady();

    public abstract boolean isValid();
}
