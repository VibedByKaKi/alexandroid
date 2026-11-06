package com.mapbox.common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import com.dee.app.metrics.MetricsConstants;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/HttpSslConfig;", "", "()V", "<set-?>", "", "allowOverride", "getAllowOverride", "()Z", "context", "Landroid/content/Context;", "", "generation", "getGeneration", "()I", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", MetricsConstants.Method.CACHE_GET, "Lkotlin/Pair;", "set", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class HttpSslConfig {
    private static volatile boolean allowOverride;

    @NotNull
    private static final Context context;

    @Nullable
    private static volatile SSLSocketFactory sslSocketFactory;

    @Nullable
    private static volatile X509TrustManager trustManager;

    @NotNull
    public static final HttpSslConfig INSTANCE = new HttpSslConfig();
    private static volatile int generation = -1;

    static {
        Context context2 = MapboxSDKCommon.INSTANCE.getContext();
        context = context2;
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        if (resources != null) {
            int identifier = resources.getIdentifier("com.mapbox.common.http.subdomain_override", "bool", packageName);
            int identifier2 = resources.getIdentifier("com.mapbox.common.http.subdomain_override_staging", "bool", packageName);
            if (identifier != 0 && resources.getBoolean(identifier)) {
                allowOverride = true;
            }
            if (identifier2 == 0 || !resources.getBoolean(identifier2)) {
                return;
            }
            allowOverride = true;
        }
    }

    private HttpSslConfig() {
    }

    @Nullable
    public final synchronized Pair<SSLSocketFactory, X509TrustManager> get() {
        Pair<SSLSocketFactory, X509TrustManager> pair = null;
        if (!allowOverride) {
            return null;
        }
        SSLSocketFactory sSLSocketFactory = sslSocketFactory;
        X509TrustManager x509TrustManager = trustManager;
        if (sSLSocketFactory != null && x509TrustManager != null) {
            pair = TuplesKt.to(sSLSocketFactory, x509TrustManager);
        }
        return pair;
    }

    public final boolean getAllowOverride() {
        return allowOverride;
    }

    public final int getGeneration() {
        return generation;
    }

    public final synchronized void set(@NotNull SSLSocketFactory sslSocketFactory2, @NotNull X509TrustManager trustManager2) {
        sslSocketFactory2.getClass();
        trustManager2.getClass();
        if (allowOverride) {
            sslSocketFactory = sslSocketFactory2;
            trustManager = trustManager2;
            generation++;
        }
    }
}
