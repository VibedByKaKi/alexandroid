package com.bugsnag.android.performance.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012)\u0010\u0006\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007j\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/performance/internal/ConnectivityApi31;", "Lcom/bugsnag/android/performance/internal/ConnectivityApi24;", "context", "Landroid/content/Context;", "cm", "Landroid/net/ConnectivityManager;", "callback", "Lkotlin/Function1;", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "Lkotlin/ParameterName;", "name", "status", "", "Lcom/bugsnag/android/performance/internal/NetworkChangeCallback;", "(Landroid/content/Context;Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function1;)V", "meteringFor", "Lcom/bugsnag/android/performance/internal/ConnectionMetering;", "capabilities", "Landroid/net/NetworkCapabilities;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectivityApi31 extends ConnectivityApi24 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityApi31(@NotNull Context context, @NotNull ConnectivityManager connectivityManager, @Nullable Function1<? super ConnectivityStatus, Unit> function1) {
        super(context, connectivityManager, function1);
        context.getClass();
        connectivityManager.getClass();
    }

    @Override // com.bugsnag.android.performance.internal.ConnectivityApi24
    @NotNull
    public ConnectionMetering meteringFor(@NotNull NetworkCapabilities capabilities) {
        capabilities.getClass();
        return (capabilities.hasCapability(11) || capabilities.hasCapability(25)) ? ConnectionMetering.UNMETERED : super.meteringFor(capabilities);
    }
}
