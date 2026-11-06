package com.bugsnag.android.performance.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/performance/internal/Connectivity;", "", "connectivityStatus", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "getConnectivityStatus", "()Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "registerForNetworkChanges", "", "unregisterForNetworkChanges", "Factory", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Connectivity {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062)\u0010\u0007\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/performance/internal/Connectivity$Factory;", "", "()V", SmartFragmentEventProcessor.NEW_INSTANCE, "Lcom/bugsnag/android/performance/internal/Connectivity;", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "Lkotlin/ParameterName;", "name", "status", "", "Lcom/bugsnag/android/performance/internal/NetworkChangeCallback;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.bugsnag.android.performance.internal.Connectivity$Factory, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Connectivity newInstance(@NotNull Context context, @Nullable Function1<? super ConnectivityStatus, Unit> callback) {
            context.getClass();
            ConnectivityManager connectivityManagerFrom = ContextExtensionsKt.getConnectivityManagerFrom(context);
            return connectivityManagerFrom == null ? UnknownConnectivity.INSTANCE : Build.VERSION.SDK_INT >= 31 ? new ConnectivityApi31(context, connectivityManagerFrom, callback) : new ConnectivityApi24(context, connectivityManagerFrom, callback);
        }
    }

    @NotNull
    ConnectivityStatus getConnectivityStatus();

    void registerForNetworkChanges();

    void unregisterForNetworkChanges();
}
