package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012>\u0010\u0004\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005j\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/ConnectivityCompat;", "Lcom/bugsnag/android/Connectivity;", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "hasConnection", "", "networkState", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "cm", "Landroid/net/ConnectivityManager;", "connectivity", "hasNetworkConnection", "registerForNetworkChanges", "retrieveNetworkAccessState", "unregisterForNetworkChanges", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ConnectivityCompat implements Connectivity {
    private final ConnectivityManager cm;
    private final Connectivity connectivity;

    public ConnectivityCompat(@NotNull Context context, @Nullable Function2<? super Boolean, ? super String, Unit> function2) {
        context.getClass();
        ConnectivityManager connectivityManagerFrom = ContextExtensionsKt.getConnectivityManagerFrom(context);
        this.cm = connectivityManagerFrom;
        this.connectivity = connectivityManagerFrom == null ? UnknownConnectivity.INSTANCE : new ConnectivityApi24(connectivityManagerFrom, function2);
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(Boolean.valueOf(this.connectivity.hasNetworkConnection()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m25297exceptionOrNullimpl(m25294constructorimpl) != null) {
            m25294constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) m25294constructorimpl).booleanValue();
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.connectivity.registerForNetworkChanges();
            Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.bugsnag.android.Connectivity
    @NotNull
    public String retrieveNetworkAccessState() {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(this.connectivity.retrieveNetworkAccessState());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m25297exceptionOrNullimpl(m25294constructorimpl) != null) {
            m25294constructorimpl = "unknown";
        }
        return (String) m25294constructorimpl;
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.connectivity.unregisterForNetworkChanges();
            Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
    }
}
