package com.bugsnag.android.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.EndpointsBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Delivery;
import com.bugsnag.android.DeliveryHeadersKt;
import com.bugsnag.android.DeliveryParams;
import com.bugsnag.android.EndpointConfiguration;
import com.bugsnag.android.ErrorTypes;
import com.bugsnag.android.EventPayload;
import com.bugsnag.android.Logger;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import com.bugsnag.android.ThrowableUtils;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B±\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\u0018\u0012\u0006\u0010$\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020\u0018\u0012\u0006\u0010&\u001a\u00020\u0018\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u00101J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010^J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u001bHÆ\u0003J\t\u0010h\u001a\u00020\u001dHÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020 HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\"HÆ\u0003J\t\u0010m\u001a\u00020\u0018HÆ\u0003J\t\u0010n\u001a\u00020\u0018HÆ\u0003J\t\u0010o\u001a\u00020\u0018HÆ\u0003J\t\u0010p\u001a\u00020\u0018HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020)0(HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010/HÆ\u0003J\t\u0010v\u001a\u00020\u0007HÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\nHÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jö\u0002\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001¢\u0006\u0002\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u00020\u00052\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0014\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0001J\n\u0010\u0086\u0001\u001a\u00030\u0083\u0001H\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0018HÖ\u0001J\u0010\u0010\u0088\u0001\u001a\u00020\u00052\u0007\u0010\u0089\u0001\u001a\u00020\u0011J\u001a\u0010\u008a\u0001\u001a\u00020\u00052\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0003\b\u008c\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\u00052\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0001¢\u0006\u0003\b\u008c\u0001J\u0007\u0010\u008f\u0001\u001a\u00020\u0005J\u0012\u0010\u0090\u0001\u001a\u00020\u00052\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003J\u0011\u0010\u0090\u0001\u001a\u00020\u00052\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u0010\u0010\u0091\u0001\u001a\u00020\u00052\u0007\u0010\u0092\u0001\u001a\u00020\u0005J\n\u0010\u0093\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010@R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010#\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010$\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0011\u0010%\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0011\u0010&\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bP\u0010MR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00109R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010BR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010_\u001a\u0004\b]\u0010^¨\u0006\u0094\u0001"}, d2 = {"Lcom/bugsnag/android/internal/ImmutableConfig;", "", "apiKey", "", "autoDetectErrors", "", "enabledErrorTypes", "Lcom/bugsnag/android/ErrorTypes;", "autoTrackSessions", "sendThreads", "Lcom/bugsnag/android/ThreadSendPolicy;", "discardClasses", "", "enabledReleaseStages", "projectPackages", "enabledBreadcrumbTypes", "", "Lcom/bugsnag/android/BreadcrumbType;", "telemetry", "Lcom/bugsnag/android/Telemetry;", "releaseStage", "buildUuid", "appVersion", "versionCode", "", "appType", "delivery", "Lcom/bugsnag/android/Delivery;", EndpointsBundleKeys.ENDPOINTS, "Lcom/bugsnag/android/EndpointConfiguration;", "persistUser", "launchDurationMillis", "", "logger", "Lcom/bugsnag/android/Logger;", "maxBreadcrumbs", "maxPersistedEvents", "maxPersistedSessions", "maxReportedThreads", "persistenceDirectory", "Lkotlin/Lazy;", "Ljava/io/File;", "sendLaunchCrashesSynchronously", "attemptDeliveryOnCrash", "packageInfo", "Landroid/content/pm/PackageInfo;", "appInfo", "Landroid/content/pm/ApplicationInfo;", "redactedKeys", "(Ljava/lang/String;ZLcom/bugsnag/android/ErrorTypes;ZLcom/bugsnag/android/ThreadSendPolicy;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/Delivery;Lcom/bugsnag/android/EndpointConfiguration;ZJLcom/bugsnag/android/Logger;IIIILkotlin/Lazy;ZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)V", "getApiKey", "()Ljava/lang/String;", "getAppInfo", "()Landroid/content/pm/ApplicationInfo;", "getAppType", "getAppVersion", "getAttemptDeliveryOnCrash", "()Z", "getAutoDetectErrors", "getAutoTrackSessions", "getBuildUuid", "getDelivery", "()Lcom/bugsnag/android/Delivery;", "getDiscardClasses", "()Ljava/util/Collection;", "getEnabledBreadcrumbTypes", "()Ljava/util/Set;", "getEnabledErrorTypes", "()Lcom/bugsnag/android/ErrorTypes;", "getEnabledReleaseStages", "getEndpoints", "()Lcom/bugsnag/android/EndpointConfiguration;", "getLaunchDurationMillis", "()J", "getLogger", "()Lcom/bugsnag/android/Logger;", "getMaxBreadcrumbs", "()I", "getMaxPersistedEvents", "getMaxPersistedSessions", "getMaxReportedThreads", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "getPersistUser", "getPersistenceDirectory", "()Lkotlin/Lazy;", "getProjectPackages", "getRedactedKeys", "getReleaseStage", "getSendLaunchCrashesSynchronously", "getSendThreads", "()Lcom/bugsnag/android/ThreadSendPolicy;", "getTelemetry", "getVersionCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLcom/bugsnag/android/ErrorTypes;ZLcom/bugsnag/android/ThreadSendPolicy;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/Delivery;Lcom/bugsnag/android/EndpointConfiguration;ZJLcom/bugsnag/android/Logger;IIIILkotlin/Lazy;ZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)Lcom/bugsnag/android/internal/ImmutableConfig;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getErrorApiDeliveryParams", "Lcom/bugsnag/android/DeliveryParams;", "payload", "Lcom/bugsnag/android/EventPayload;", "getSessionApiDeliveryParams", "hashCode", "shouldDiscardBreadcrumb", "type", "shouldDiscardByErrorClass", "errorClass", "shouldDiscardByErrorClass$bugsnag_android_core_release", "exc", "", "shouldDiscardByReleaseStage", "shouldDiscardError", "shouldDiscardSession", "autoCaptured", "toString", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class ImmutableConfig {

    @NotNull
    private final String apiKey;

    @Nullable
    private final ApplicationInfo appInfo;

    @Nullable
    private final String appType;

    @Nullable
    private final String appVersion;
    private final boolean attemptDeliveryOnCrash;
    private final boolean autoDetectErrors;
    private final boolean autoTrackSessions;

    @Nullable
    private final String buildUuid;

    @NotNull
    private final Delivery delivery;

    @NotNull
    private final Collection<String> discardClasses;

    @Nullable
    private final Set<BreadcrumbType> enabledBreadcrumbTypes;

    @NotNull
    private final ErrorTypes enabledErrorTypes;

    @Nullable
    private final Collection<String> enabledReleaseStages;

    @NotNull
    private final EndpointConfiguration endpoints;
    private final long launchDurationMillis;

    @NotNull
    private final Logger logger;
    private final int maxBreadcrumbs;
    private final int maxPersistedEvents;
    private final int maxPersistedSessions;
    private final int maxReportedThreads;

    @Nullable
    private final PackageInfo packageInfo;
    private final boolean persistUser;

    @NotNull
    private final Lazy<File> persistenceDirectory;

    @NotNull
    private final Collection<String> projectPackages;

    @NotNull
    private final Collection<String> redactedKeys;

    @Nullable
    private final String releaseStage;
    private final boolean sendLaunchCrashesSynchronously;

    @NotNull
    private final ThreadSendPolicy sendThreads;

    @NotNull
    private final Set<Telemetry> telemetry;

    @Nullable
    private final Integer versionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableConfig(@NotNull String str, boolean z, @NotNull ErrorTypes errorTypes, boolean z2, @NotNull ThreadSendPolicy threadSendPolicy, @NotNull Collection<String> collection, @Nullable Collection<String> collection2, @NotNull Collection<String> collection3, @Nullable Set<? extends BreadcrumbType> set, @NotNull Set<? extends Telemetry> set2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @NotNull Delivery delivery, @NotNull EndpointConfiguration endpointConfiguration, boolean z3, long j, @NotNull Logger logger, int i, int i2, int i3, int i4, @NotNull Lazy<? extends File> lazy, boolean z4, boolean z5, @Nullable PackageInfo packageInfo, @Nullable ApplicationInfo applicationInfo, @NotNull Collection<String> collection4) {
        str.getClass();
        errorTypes.getClass();
        threadSendPolicy.getClass();
        collection.getClass();
        collection3.getClass();
        set2.getClass();
        delivery.getClass();
        endpointConfiguration.getClass();
        logger.getClass();
        lazy.getClass();
        collection4.getClass();
        this.apiKey = str;
        this.autoDetectErrors = z;
        this.enabledErrorTypes = errorTypes;
        this.autoTrackSessions = z2;
        this.sendThreads = threadSendPolicy;
        this.discardClasses = collection;
        this.enabledReleaseStages = collection2;
        this.projectPackages = collection3;
        this.enabledBreadcrumbTypes = set;
        this.telemetry = set2;
        this.releaseStage = str2;
        this.buildUuid = str3;
        this.appVersion = str4;
        this.versionCode = num;
        this.appType = str5;
        this.delivery = delivery;
        this.endpoints = endpointConfiguration;
        this.persistUser = z3;
        this.launchDurationMillis = j;
        this.logger = logger;
        this.maxBreadcrumbs = i;
        this.maxPersistedEvents = i2;
        this.maxPersistedSessions = i3;
        this.maxReportedThreads = i4;
        this.persistenceDirectory = lazy;
        this.sendLaunchCrashesSynchronously = z4;
        this.attemptDeliveryOnCrash = z5;
        this.packageInfo = packageInfo;
        this.appInfo = applicationInfo;
        this.redactedKeys = collection4;
    }

    public static /* synthetic */ ImmutableConfig copy$default(ImmutableConfig immutableConfig, String str, boolean z, ErrorTypes errorTypes, boolean z2, ThreadSendPolicy threadSendPolicy, Collection collection, Collection collection2, Collection collection3, Set set, Set set2, String str2, String str3, String str4, Integer num, String str5, Delivery delivery, EndpointConfiguration endpointConfiguration, boolean z3, long j, Logger logger, int i, int i2, int i3, int i4, Lazy lazy, boolean z4, boolean z5, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection collection4, int i5, Object obj) {
        Collection collection5;
        ApplicationInfo applicationInfo2;
        Delivery delivery2;
        EndpointConfiguration endpointConfiguration2;
        String str6;
        boolean z6;
        long j2;
        Logger logger2;
        int i6;
        int i7;
        int i8;
        Lazy lazy2;
        boolean z7;
        boolean z8;
        PackageInfo packageInfo2;
        int i9;
        boolean z9;
        ErrorTypes errorTypes2;
        boolean z10;
        ThreadSendPolicy threadSendPolicy2;
        Collection collection6;
        Collection collection7;
        Collection collection8;
        Set set3;
        Set set4;
        String str7;
        String str8;
        String str9;
        Integer num2;
        String str10;
        ImmutableConfig immutableConfig2;
        String str11 = (i5 & 1) != 0 ? immutableConfig.apiKey : str;
        boolean z11 = (i5 & 2) != 0 ? immutableConfig.autoDetectErrors : z;
        ErrorTypes errorTypes3 = (i5 & 4) != 0 ? immutableConfig.enabledErrorTypes : errorTypes;
        boolean z12 = (i5 & 8) != 0 ? immutableConfig.autoTrackSessions : z2;
        ThreadSendPolicy threadSendPolicy3 = (i5 & 16) != 0 ? immutableConfig.sendThreads : threadSendPolicy;
        Collection collection9 = (i5 & 32) != 0 ? immutableConfig.discardClasses : collection;
        Collection collection10 = (i5 & 64) != 0 ? immutableConfig.enabledReleaseStages : collection2;
        Collection collection11 = (i5 & 128) != 0 ? immutableConfig.projectPackages : collection3;
        Set set5 = (i5 & 256) != 0 ? immutableConfig.enabledBreadcrumbTypes : set;
        Set set6 = (i5 & 512) != 0 ? immutableConfig.telemetry : set2;
        String str12 = (i5 & 1024) != 0 ? immutableConfig.releaseStage : str2;
        String str13 = (i5 & 2048) != 0 ? immutableConfig.buildUuid : str3;
        String str14 = (i5 & 4096) != 0 ? immutableConfig.appVersion : str4;
        Integer num3 = (i5 & 8192) != 0 ? immutableConfig.versionCode : num;
        String str15 = str11;
        String str16 = (i5 & 16384) != 0 ? immutableConfig.appType : str5;
        Delivery delivery3 = (i5 & 32768) != 0 ? immutableConfig.delivery : delivery;
        EndpointConfiguration endpointConfiguration3 = (i5 & 65536) != 0 ? immutableConfig.endpoints : endpointConfiguration;
        boolean z13 = (i5 & 131072) != 0 ? immutableConfig.persistUser : z3;
        String str17 = str16;
        long j3 = (i5 & 262144) != 0 ? immutableConfig.launchDurationMillis : j;
        Logger logger3 = (i5 & 524288) != 0 ? immutableConfig.logger : logger;
        int i10 = (i5 & 1048576) != 0 ? immutableConfig.maxBreadcrumbs : i;
        Logger logger4 = logger3;
        int i11 = (i5 & 2097152) != 0 ? immutableConfig.maxPersistedEvents : i2;
        int i12 = (i5 & 4194304) != 0 ? immutableConfig.maxPersistedSessions : i3;
        int i13 = (i5 & 8388608) != 0 ? immutableConfig.maxReportedThreads : i4;
        Lazy lazy3 = (i5 & 16777216) != 0 ? immutableConfig.persistenceDirectory : lazy;
        boolean z14 = (i5 & 33554432) != 0 ? immutableConfig.sendLaunchCrashesSynchronously : z4;
        boolean z15 = (i5 & 67108864) != 0 ? immutableConfig.attemptDeliveryOnCrash : z5;
        PackageInfo packageInfo3 = (i5 & 134217728) != 0 ? immutableConfig.packageInfo : packageInfo;
        ApplicationInfo applicationInfo3 = (i5 & 268435456) != 0 ? immutableConfig.appInfo : applicationInfo;
        if ((i5 & 536870912) != 0) {
            applicationInfo2 = applicationInfo3;
            collection5 = immutableConfig.redactedKeys;
            delivery2 = delivery3;
            endpointConfiguration2 = endpointConfiguration3;
            z6 = z13;
            j2 = j3;
            logger2 = logger4;
            i6 = i11;
            i7 = i12;
            i8 = i13;
            lazy2 = lazy3;
            z7 = z14;
            z8 = z15;
            packageInfo2 = packageInfo3;
            i9 = i10;
            z9 = z11;
            z10 = z12;
            threadSendPolicy2 = threadSendPolicy3;
            collection6 = collection9;
            collection7 = collection10;
            collection8 = collection11;
            set3 = set5;
            set4 = set6;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            num2 = num3;
            str10 = str15;
            str6 = str17;
            immutableConfig2 = immutableConfig;
            errorTypes2 = errorTypes3;
        } else {
            collection5 = collection4;
            applicationInfo2 = applicationInfo3;
            delivery2 = delivery3;
            endpointConfiguration2 = endpointConfiguration3;
            str6 = str17;
            z6 = z13;
            j2 = j3;
            logger2 = logger4;
            i6 = i11;
            i7 = i12;
            i8 = i13;
            lazy2 = lazy3;
            z7 = z14;
            z8 = z15;
            packageInfo2 = packageInfo3;
            i9 = i10;
            z9 = z11;
            errorTypes2 = errorTypes3;
            z10 = z12;
            threadSendPolicy2 = threadSendPolicy3;
            collection6 = collection9;
            collection7 = collection10;
            collection8 = collection11;
            set3 = set5;
            set4 = set6;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            num2 = num3;
            str10 = str15;
            immutableConfig2 = immutableConfig;
        }
        return immutableConfig2.copy(str10, z9, errorTypes2, z10, threadSendPolicy2, collection6, collection7, collection8, set3, set4, str7, str8, str9, num2, str6, delivery2, endpointConfiguration2, z6, j2, logger2, i9, i6, i7, i8, lazy2, z7, z8, packageInfo2, applicationInfo2, collection5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final Set<Telemetry> component10() {
        return this.telemetry;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getBuildUuid() {
        return this.buildUuid;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getAppType() {
        return this.appType;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final Delivery getDelivery() {
        return this.delivery;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final EndpointConfiguration getEndpoints() {
        return this.endpoints;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getPersistUser() {
        return this.persistUser;
    }

    /* renamed from: component19, reason: from getter */
    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAutoDetectErrors() {
        return this.autoDetectErrors;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    /* renamed from: component21, reason: from getter */
    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    /* renamed from: component22, reason: from getter */
    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    /* renamed from: component23, reason: from getter */
    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    /* renamed from: component24, reason: from getter */
    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    @NotNull
    public final Lazy<File> component25() {
        return this.persistenceDirectory;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final ApplicationInfo getAppInfo() {
        return this.appInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ErrorTypes getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    @NotNull
    public final Collection<String> component30() {
        return this.redactedKeys;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ThreadSendPolicy getSendThreads() {
        return this.sendThreads;
    }

    @NotNull
    public final Collection<String> component6() {
        return this.discardClasses;
    }

    @Nullable
    public final Collection<String> component7() {
        return this.enabledReleaseStages;
    }

    @NotNull
    public final Collection<String> component8() {
        return this.projectPackages;
    }

    @Nullable
    public final Set<BreadcrumbType> component9() {
        return this.enabledBreadcrumbTypes;
    }

    @NotNull
    public final ImmutableConfig copy(@NotNull String apiKey, boolean autoDetectErrors, @NotNull ErrorTypes enabledErrorTypes, boolean autoTrackSessions, @NotNull ThreadSendPolicy sendThreads, @NotNull Collection<String> discardClasses, @Nullable Collection<String> enabledReleaseStages, @NotNull Collection<String> projectPackages, @Nullable Set<? extends BreadcrumbType> enabledBreadcrumbTypes, @NotNull Set<? extends Telemetry> telemetry, @Nullable String releaseStage, @Nullable String buildUuid, @Nullable String appVersion, @Nullable Integer versionCode, @Nullable String appType, @NotNull Delivery delivery, @NotNull EndpointConfiguration endpoints, boolean persistUser, long launchDurationMillis, @NotNull Logger logger, int maxBreadcrumbs, int maxPersistedEvents, int maxPersistedSessions, int maxReportedThreads, @NotNull Lazy<? extends File> persistenceDirectory, boolean sendLaunchCrashesSynchronously, boolean attemptDeliveryOnCrash, @Nullable PackageInfo packageInfo, @Nullable ApplicationInfo appInfo, @NotNull Collection<String> redactedKeys) {
        apiKey.getClass();
        enabledErrorTypes.getClass();
        sendThreads.getClass();
        discardClasses.getClass();
        projectPackages.getClass();
        telemetry.getClass();
        delivery.getClass();
        endpoints.getClass();
        logger.getClass();
        persistenceDirectory.getClass();
        redactedKeys.getClass();
        return new ImmutableConfig(apiKey, autoDetectErrors, enabledErrorTypes, autoTrackSessions, sendThreads, discardClasses, enabledReleaseStages, projectPackages, enabledBreadcrumbTypes, telemetry, releaseStage, buildUuid, appVersion, versionCode, appType, delivery, endpoints, persistUser, launchDurationMillis, logger, maxBreadcrumbs, maxPersistedEvents, maxPersistedSessions, maxReportedThreads, persistenceDirectory, sendLaunchCrashesSynchronously, attemptDeliveryOnCrash, packageInfo, appInfo, redactedKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImmutableConfig)) {
            return false;
        }
        ImmutableConfig immutableConfig = (ImmutableConfig) other;
        return Intrinsics.areEqual(this.apiKey, immutableConfig.apiKey) && this.autoDetectErrors == immutableConfig.autoDetectErrors && Intrinsics.areEqual(this.enabledErrorTypes, immutableConfig.enabledErrorTypes) && this.autoTrackSessions == immutableConfig.autoTrackSessions && Intrinsics.areEqual(this.sendThreads, immutableConfig.sendThreads) && Intrinsics.areEqual(this.discardClasses, immutableConfig.discardClasses) && Intrinsics.areEqual(this.enabledReleaseStages, immutableConfig.enabledReleaseStages) && Intrinsics.areEqual(this.projectPackages, immutableConfig.projectPackages) && Intrinsics.areEqual(this.enabledBreadcrumbTypes, immutableConfig.enabledBreadcrumbTypes) && Intrinsics.areEqual(this.telemetry, immutableConfig.telemetry) && Intrinsics.areEqual(this.releaseStage, immutableConfig.releaseStage) && Intrinsics.areEqual(this.buildUuid, immutableConfig.buildUuid) && Intrinsics.areEqual(this.appVersion, immutableConfig.appVersion) && Intrinsics.areEqual(this.versionCode, immutableConfig.versionCode) && Intrinsics.areEqual(this.appType, immutableConfig.appType) && Intrinsics.areEqual(this.delivery, immutableConfig.delivery) && Intrinsics.areEqual(this.endpoints, immutableConfig.endpoints) && this.persistUser == immutableConfig.persistUser && this.launchDurationMillis == immutableConfig.launchDurationMillis && Intrinsics.areEqual(this.logger, immutableConfig.logger) && this.maxBreadcrumbs == immutableConfig.maxBreadcrumbs && this.maxPersistedEvents == immutableConfig.maxPersistedEvents && this.maxPersistedSessions == immutableConfig.maxPersistedSessions && this.maxReportedThreads == immutableConfig.maxReportedThreads && Intrinsics.areEqual(this.persistenceDirectory, immutableConfig.persistenceDirectory) && this.sendLaunchCrashesSynchronously == immutableConfig.sendLaunchCrashesSynchronously && this.attemptDeliveryOnCrash == immutableConfig.attemptDeliveryOnCrash && Intrinsics.areEqual(this.packageInfo, immutableConfig.packageInfo) && Intrinsics.areEqual(this.appInfo, immutableConfig.appInfo) && Intrinsics.areEqual(this.redactedKeys, immutableConfig.redactedKeys);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @Nullable
    public final ApplicationInfo getAppInfo() {
        return this.appInfo;
    }

    @Nullable
    public final String getAppType() {
        return this.appType;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    public final boolean getAutoDetectErrors() {
        return this.autoDetectErrors;
    }

    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    @Nullable
    public final String getBuildUuid() {
        return this.buildUuid;
    }

    @NotNull
    public final Delivery getDelivery() {
        return this.delivery;
    }

    @NotNull
    public final Collection<String> getDiscardClasses() {
        return this.discardClasses;
    }

    @Nullable
    public final Set<BreadcrumbType> getEnabledBreadcrumbTypes() {
        return this.enabledBreadcrumbTypes;
    }

    @NotNull
    public final ErrorTypes getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    @Nullable
    public final Collection<String> getEnabledReleaseStages() {
        return this.enabledReleaseStages;
    }

    @NotNull
    public final EndpointConfiguration getEndpoints() {
        return this.endpoints;
    }

    @JvmName(name = "getErrorApiDeliveryParams")
    @NotNull
    public final DeliveryParams getErrorApiDeliveryParams(@NotNull EventPayload payload) {
        payload.getClass();
        return new DeliveryParams(this.endpoints.getNotify(), DeliveryHeadersKt.errorApiHeaders(payload));
    }

    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    @Nullable
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    public final boolean getPersistUser() {
        return this.persistUser;
    }

    @NotNull
    public final Lazy<File> getPersistenceDirectory() {
        return this.persistenceDirectory;
    }

    @NotNull
    public final Collection<String> getProjectPackages() {
        return this.projectPackages;
    }

    @NotNull
    public final Collection<String> getRedactedKeys() {
        return this.redactedKeys;
    }

    @Nullable
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    @NotNull
    public final ThreadSendPolicy getSendThreads() {
        return this.sendThreads;
    }

    @JvmName(name = "getSessionApiDeliveryParams")
    @NotNull
    public final DeliveryParams getSessionApiDeliveryParams() {
        return new DeliveryParams(this.endpoints.getSessions(), DeliveryHeadersKt.sessionApiHeaders(this.apiKey));
    }

    @NotNull
    public final Set<Telemetry> getTelemetry() {
        return this.telemetry;
    }

    @Nullable
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.apiKey;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.autoDetectErrors;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ErrorTypes errorTypes = this.enabledErrorTypes;
        int hashCode2 = (i2 + (errorTypes != null ? errorTypes.hashCode() : 0)) * 31;
        boolean z2 = this.autoTrackSessions;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        ThreadSendPolicy threadSendPolicy = this.sendThreads;
        int hashCode3 = (i4 + (threadSendPolicy != null ? threadSendPolicy.hashCode() : 0)) * 31;
        Collection<String> collection = this.discardClasses;
        int hashCode4 = (hashCode3 + (collection != null ? collection.hashCode() : 0)) * 31;
        Collection<String> collection2 = this.enabledReleaseStages;
        int hashCode5 = (hashCode4 + (collection2 != null ? collection2.hashCode() : 0)) * 31;
        Collection<String> collection3 = this.projectPackages;
        int hashCode6 = (hashCode5 + (collection3 != null ? collection3.hashCode() : 0)) * 31;
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        Set<Telemetry> set2 = this.telemetry;
        int hashCode8 = (hashCode7 + (set2 != null ? set2.hashCode() : 0)) * 31;
        String str2 = this.releaseStage;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buildUuid;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.appVersion;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.versionCode;
        int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.appType;
        int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Delivery delivery = this.delivery;
        int hashCode14 = (hashCode13 + (delivery != null ? delivery.hashCode() : 0)) * 31;
        EndpointConfiguration endpointConfiguration = this.endpoints;
        int hashCode15 = (hashCode14 + (endpointConfiguration != null ? endpointConfiguration.hashCode() : 0)) * 31;
        boolean z3 = this.persistUser;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        long j = this.launchDurationMillis;
        int i6 = (((hashCode15 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Logger logger = this.logger;
        int hashCode16 = (((((((((i6 + (logger != null ? logger.hashCode() : 0)) * 31) + this.maxBreadcrumbs) * 31) + this.maxPersistedEvents) * 31) + this.maxPersistedSessions) * 31) + this.maxReportedThreads) * 31;
        Lazy<File> lazy = this.persistenceDirectory;
        int hashCode17 = (hashCode16 + (lazy != null ? lazy.hashCode() : 0)) * 31;
        boolean z4 = this.sendLaunchCrashesSynchronously;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode17 + i7) * 31;
        boolean z5 = this.attemptDeliveryOnCrash;
        int i9 = (i8 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.packageInfo;
        int hashCode18 = (i9 + (packageInfo != null ? packageInfo.hashCode() : 0)) * 31;
        ApplicationInfo applicationInfo = this.appInfo;
        int hashCode19 = (hashCode18 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31;
        Collection<String> collection4 = this.redactedKeys;
        return hashCode19 + (collection4 != null ? collection4.hashCode() : 0);
    }

    public final boolean shouldDiscardBreadcrumb(@NotNull BreadcrumbType type) {
        type.getClass();
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        return (set == null || set.contains(type)) ? false : true;
    }

    @VisibleForTesting
    public final boolean shouldDiscardByErrorClass$bugsnag_android_core_release(@NotNull Throwable exc) {
        exc.getClass();
        List<Throwable> safeUnrollCauses = ThrowableUtils.safeUnrollCauses(exc);
        if ((safeUnrollCauses instanceof Collection) && safeUnrollCauses.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = safeUnrollCauses.iterator();
        while (it2.hasNext()) {
            if (shouldDiscardByErrorClass$bugsnag_android_core_release(((Throwable) it2.next()).getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldDiscardByReleaseStage() {
        Collection<String> collection = this.enabledReleaseStages;
        return (collection == null || CollectionsKt.contains(collection, this.releaseStage)) ? false : true;
    }

    public final boolean shouldDiscardError(@NotNull Throwable exc) {
        exc.getClass();
        return shouldDiscardByReleaseStage() || shouldDiscardByErrorClass$bugsnag_android_core_release(exc);
    }

    public final boolean shouldDiscardSession(boolean autoCaptured) {
        if (shouldDiscardByReleaseStage()) {
            return true;
        }
        return autoCaptured && !this.autoTrackSessions;
    }

    @NotNull
    public String toString() {
        return "ImmutableConfig(apiKey=" + this.apiKey + ", autoDetectErrors=" + this.autoDetectErrors + ", enabledErrorTypes=" + this.enabledErrorTypes + ", autoTrackSessions=" + this.autoTrackSessions + ", sendThreads=" + this.sendThreads + ", discardClasses=" + this.discardClasses + ", enabledReleaseStages=" + this.enabledReleaseStages + ", projectPackages=" + this.projectPackages + ", enabledBreadcrumbTypes=" + this.enabledBreadcrumbTypes + ", telemetry=" + this.telemetry + ", releaseStage=" + this.releaseStage + ", buildUuid=" + this.buildUuid + ", appVersion=" + this.appVersion + ", versionCode=" + this.versionCode + ", appType=" + this.appType + ", delivery=" + this.delivery + ", endpoints=" + this.endpoints + ", persistUser=" + this.persistUser + ", launchDurationMillis=" + this.launchDurationMillis + ", logger=" + this.logger + ", maxBreadcrumbs=" + this.maxBreadcrumbs + ", maxPersistedEvents=" + this.maxPersistedEvents + ", maxPersistedSessions=" + this.maxPersistedSessions + ", maxReportedThreads=" + this.maxReportedThreads + ", persistenceDirectory=" + this.persistenceDirectory + ", sendLaunchCrashesSynchronously=" + this.sendLaunchCrashesSynchronously + ", attemptDeliveryOnCrash=" + this.attemptDeliveryOnCrash + ", packageInfo=" + this.packageInfo + ", appInfo=" + this.appInfo + ", redactedKeys=" + this.redactedKeys + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public final boolean shouldDiscardError(@Nullable String errorClass) {
        return shouldDiscardByReleaseStage() || shouldDiscardByErrorClass$bugsnag_android_core_release(errorClass);
    }

    @VisibleForTesting
    public final boolean shouldDiscardByErrorClass$bugsnag_android_core_release(@Nullable String errorClass) {
        return CollectionsKt.contains(this.discardClasses, errorClass);
    }
}
