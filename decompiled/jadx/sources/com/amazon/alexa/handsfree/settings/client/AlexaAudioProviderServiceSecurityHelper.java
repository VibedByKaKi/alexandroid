package com.amazon.alexa.handsfree.settings.client;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAudioProviderServiceSecurityHelper {
    private static final String METRIC_NAME_FORMAT_INVALID_PACKAGE = "InsecurePackageName:%s";
    private static final String METRIC_SOURCE = "AlexaAudioProviderServiceSecurityHelper";
    private static final String OEM_SIGNED_PACKAGE = "android";
    private static final String TAG = "AlexaAudioSvcSecurity";
    private Context mContext;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Priority {
        OEM_SIGNATURE_SECURE_PRIORITY,
        SYSTEM_SECURE_PRIORITY
    }

    public AlexaAudioProviderServiceSecurityHelper(@NonNull Context context) {
        this(context, MetricsBuilderProvider.getInstance(context));
    }

    @Nullable
    public ResolveInfo getSecureResolveInfo(@NonNull Intent intent) {
        PackageManager packageManager = this.mContext.getPackageManager();
        if (packageManager == null) {
            Log.e(TAG, "Failed to get secure resolve info because package manager is null");
            return null;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        EnumMap enumMap = new EnumMap(Priority.class);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (this.mContext.getPackageName().equals(resolveInfo.serviceInfo.packageName)) {
                    Log.d(TAG, "Found a resolveInfo with the same package name [" + this.mContext.getPackageName() + MarkdownConstants.RIGHT_BRACKET);
                    return resolveInfo;
                }
                if (packageManager.checkSignatures(OEM_SIGNED_PACKAGE, resolveInfo.serviceInfo.packageName) == 0) {
                    Log.d(TAG, "Found a resolveInfo with the same OEM signature");
                    enumMap.putIfAbsent(Priority.OEM_SIGNATURE_SECURE_PRIORITY, resolveInfo);
                } else {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if ((serviceInfo.applicationInfo.flags & 1) != 0) {
                        Log.d(TAG, "Found a resolveInfo with system flag");
                        enumMap.putIfAbsent(Priority.SYSTEM_SECURE_PRIORITY, resolveInfo);
                    } else {
                        Locale locale = Locale.US;
                        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(METRIC_SOURCE, a$$ExternalSyntheticOutline0.m("InsecurePackageName:", serviceInfo.packageName)).emit(this.mContext);
                    }
                }
            }
        }
        return (ResolveInfo) Optional.ofNullable((ResolveInfo) enumMap.get(Priority.OEM_SIGNATURE_SECURE_PRIORITY)).orElse((ResolveInfo) Optional.ofNullable((ResolveInfo) enumMap.get(Priority.SYSTEM_SECURE_PRIORITY)).orElse(null));
    }

    @VisibleForTesting
    public AlexaAudioProviderServiceSecurityHelper(@NonNull Context context, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        this.mContext = context;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }
}
