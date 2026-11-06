package com.bugsnag.android;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/EndpointConfiguration;", "", "notify", "", "sessions", "(Ljava/lang/String;Ljava/lang/String;)V", "getNotify", "()Ljava/lang/String;", "getSessions", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class EndpointConfiguration {

    @NotNull
    private final String notify;

    @NotNull
    private final String sessions;

    public /* synthetic */ EndpointConfiguration(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://notify.bugsnag.com" : str, (i & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }

    @NotNull
    public final String getNotify() {
        return this.notify;
    }

    @NotNull
    public final String getSessions() {
        return this.sessions;
    }

    public EndpointConfiguration(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.notify = str;
        this.sessions = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndpointConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
