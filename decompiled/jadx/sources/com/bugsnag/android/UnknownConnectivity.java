package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/UnknownConnectivity;", "Lcom/bugsnag/android/Connectivity;", "()V", "hasNetworkConnection", "", "registerForNetworkChanges", "", "retrieveNetworkAccessState", "", "unregisterForNetworkChanges", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class UnknownConnectivity implements Connectivity {

    @NotNull
    public static final UnknownConnectivity INSTANCE = new UnknownConnectivity();

    private UnknownConnectivity() {
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        return true;
    }

    @Override // com.bugsnag.android.Connectivity
    @NotNull
    public String retrieveNetworkAccessState() {
        return "unknown";
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
    }
}
