package com.bugsnag.android;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/bugsnag/android/StateEvent;", "", "()V", "AddBreadcrumb", "AddFeatureFlag", "AddMetadata", "ClearFeatureFlag", "ClearFeatureFlags", "ClearMetadataSection", "ClearMetadataValue", "DeliverPending", "Install", "NotifyHandled", "NotifyUnhandled", "PauseSession", "StartSession", "UpdateContext", "UpdateInForeground", "UpdateIsLaunching", "UpdateLastRunInfo", "UpdateMemoryTrimEvent", "UpdateOrientation", "UpdateUser", "Lcom/bugsnag/android/StateEvent$Install;", "Lcom/bugsnag/android/StateEvent$DeliverPending;", "Lcom/bugsnag/android/StateEvent$AddMetadata;", "Lcom/bugsnag/android/StateEvent$ClearMetadataSection;", "Lcom/bugsnag/android/StateEvent$ClearMetadataValue;", "Lcom/bugsnag/android/StateEvent$AddBreadcrumb;", "Lcom/bugsnag/android/StateEvent$NotifyHandled;", "Lcom/bugsnag/android/StateEvent$NotifyUnhandled;", "Lcom/bugsnag/android/StateEvent$PauseSession;", "Lcom/bugsnag/android/StateEvent$StartSession;", "Lcom/bugsnag/android/StateEvent$UpdateContext;", "Lcom/bugsnag/android/StateEvent$UpdateInForeground;", "Lcom/bugsnag/android/StateEvent$UpdateLastRunInfo;", "Lcom/bugsnag/android/StateEvent$UpdateIsLaunching;", "Lcom/bugsnag/android/StateEvent$UpdateOrientation;", "Lcom/bugsnag/android/StateEvent$UpdateUser;", "Lcom/bugsnag/android/StateEvent$UpdateMemoryTrimEvent;", "Lcom/bugsnag/android/StateEvent$AddFeatureFlag;", "Lcom/bugsnag/android/StateEvent$ClearFeatureFlag;", "Lcom/bugsnag/android/StateEvent$ClearFeatureFlags;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public abstract class StateEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0002\u0010\nR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddBreadcrumb;", "Lcom/bugsnag/android/StateEvent;", "message", "", "type", "Lcom/bugsnag/android/BreadcrumbType;", "timestamp", "metadata", "", "", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/lang/String;Ljava/util/Map;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class AddBreadcrumb extends StateEvent {

        @JvmField
        @NotNull
        public final String message;

        @JvmField
        @NotNull
        public final Map<String, Object> metadata;

        @JvmField
        @NotNull
        public final String timestamp;

        @JvmField
        @NotNull
        public final BreadcrumbType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBreadcrumb(@NotNull String str, @NotNull BreadcrumbType breadcrumbType, @NotNull String str2, @NotNull Map<String, Object> map) {
            super(null);
            str.getClass();
            breadcrumbType.getClass();
            str2.getClass();
            map.getClass();
            this.message = str;
            this.type = breadcrumbType;
            this.timestamp = str2;
            this.metadata = map;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddMetadata;", "Lcom/bugsnag/android/StateEvent;", "section", "", "key", "value", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class AddMetadata extends StateEvent {

        @JvmField
        @Nullable
        public final String key;

        @JvmField
        @NotNull
        public final String section;

        @JvmField
        @Nullable
        public final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMetadata(@NotNull String str, @Nullable String str2, @Nullable Object obj) {
            super(null);
            str.getClass();
            this.section = str;
            this.key = str2;
            this.value = obj;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearFeatureFlag;", "Lcom/bugsnag/android/StateEvent;", "name", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class ClearFeatureFlag extends StateEvent {

        @JvmField
        @NotNull
        public final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearFeatureFlag(@NotNull String str) {
            super(null);
            str.getClass();
            this.name = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearFeatureFlags;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class ClearFeatureFlags extends StateEvent {

        @NotNull
        public static final ClearFeatureFlags INSTANCE = new ClearFeatureFlags();

        private ClearFeatureFlags() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearMetadataSection;", "Lcom/bugsnag/android/StateEvent;", "section", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class ClearMetadataSection extends StateEvent {

        @JvmField
        @NotNull
        public final String section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearMetadataSection(@NotNull String str) {
            super(null);
            str.getClass();
            this.section = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearMetadataValue;", "Lcom/bugsnag/android/StateEvent;", "section", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class ClearMetadataValue extends StateEvent {

        @JvmField
        @Nullable
        public final String key;

        @JvmField
        @NotNull
        public final String section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearMetadataValue(@NotNull String str, @Nullable String str2) {
            super(null);
            str.getClass();
            this.section = str;
            this.key = str2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$DeliverPending;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class DeliverPending extends StateEvent {

        @NotNull
        public static final DeliverPending INSTANCE = new DeliverPending();

        private DeliverPending() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/StateEvent$Install;", "Lcom/bugsnag/android/StateEvent;", "apiKey", "", "autoDetectNdkCrashes", "", "appVersion", "buildUuid", "releaseStage", "lastRunInfoPath", "consecutiveLaunchCrashes", "", "sendThreads", "Lcom/bugsnag/android/ThreadSendPolicy;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/bugsnag/android/ThreadSendPolicy;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Install extends StateEvent {

        @JvmField
        @NotNull
        public final String apiKey;

        @JvmField
        @Nullable
        public final String appVersion;

        @JvmField
        public final boolean autoDetectNdkCrashes;

        @JvmField
        @Nullable
        public final String buildUuid;

        @JvmField
        public final int consecutiveLaunchCrashes;

        @JvmField
        @NotNull
        public final String lastRunInfoPath;

        @JvmField
        @Nullable
        public final String releaseStage;

        @JvmField
        @NotNull
        public final ThreadSendPolicy sendThreads;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Install(@NotNull String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, int i, @NotNull ThreadSendPolicy threadSendPolicy) {
            super(null);
            str.getClass();
            str5.getClass();
            threadSendPolicy.getClass();
            this.apiKey = str;
            this.autoDetectNdkCrashes = z;
            this.appVersion = str2;
            this.buildUuid = str3;
            this.releaseStage = str4;
            this.lastRunInfoPath = str5;
            this.consecutiveLaunchCrashes = i;
            this.sendThreads = threadSendPolicy;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$NotifyHandled;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class NotifyHandled extends StateEvent {

        @NotNull
        public static final NotifyHandled INSTANCE = new NotifyHandled();

        private NotifyHandled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$NotifyUnhandled;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class NotifyUnhandled extends StateEvent {

        @NotNull
        public static final NotifyUnhandled INSTANCE = new NotifyUnhandled();

        private NotifyUnhandled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$PauseSession;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class PauseSession extends StateEvent {

        @NotNull
        public static final PauseSession INSTANCE = new PauseSession();

        private PauseSession() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/StateEvent$StartSession;", "Lcom/bugsnag/android/StateEvent;", "id", "", "startedAt", "handledCount", "", "unhandledCount", "(Ljava/lang/String;Ljava/lang/String;II)V", "getUnhandledCount", "()I", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class StartSession extends StateEvent {

        @JvmField
        public final int handledCount;

        @JvmField
        @NotNull
        public final String id;

        @JvmField
        @NotNull
        public final String startedAt;
        private final int unhandledCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartSession(@NotNull String str, @NotNull String str2, int i, int i2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.id = str;
            this.startedAt = str2;
            this.handledCount = i;
            this.unhandledCount = i2;
        }

        public final int getUnhandledCount() {
            return this.unhandledCount;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateContext;", "Lcom/bugsnag/android/StateEvent;", "context", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateContext extends StateEvent {

        @JvmField
        @Nullable
        public final String context;

        public UpdateContext(@Nullable String str) {
            super(null);
            this.context = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateInForeground;", "Lcom/bugsnag/android/StateEvent;", "inForeground", "", "contextActivity", "", "(ZLjava/lang/String;)V", "getContextActivity", "()Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateInForeground extends StateEvent {

        @Nullable
        private final String contextActivity;

        @JvmField
        public final boolean inForeground;

        public UpdateInForeground(boolean z, @Nullable String str) {
            super(null);
            this.inForeground = z;
            this.contextActivity = str;
        }

        @Nullable
        public final String getContextActivity() {
            return this.contextActivity;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateIsLaunching;", "Lcom/bugsnag/android/StateEvent;", "isLaunching", "", "(Z)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateIsLaunching extends StateEvent {

        @JvmField
        public final boolean isLaunching;

        public UpdateIsLaunching(boolean z) {
            super(null);
            this.isLaunching = z;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateLastRunInfo;", "Lcom/bugsnag/android/StateEvent;", "consecutiveLaunchCrashes", "", "(I)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateLastRunInfo extends StateEvent {

        @JvmField
        public final int consecutiveLaunchCrashes;

        public UpdateLastRunInfo(int i) {
            super(null);
            this.consecutiveLaunchCrashes = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateOrientation;", "Lcom/bugsnag/android/StateEvent;", ModelSourceWrapper.ORIENTATION, "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateOrientation extends StateEvent {

        @JvmField
        @Nullable
        public final String orientation;

        public UpdateOrientation(@Nullable String str) {
            super(null);
            this.orientation = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateUser;", "Lcom/bugsnag/android/StateEvent;", "user", "Lcom/bugsnag/android/User;", "(Lcom/bugsnag/android/User;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateUser extends StateEvent {

        @JvmField
        @NotNull
        public final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateUser(@NotNull User user) {
            super(null);
            user.getClass();
            this.user = user;
        }
    }

    private StateEvent() {
    }

    public /* synthetic */ StateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddFeatureFlag;", "Lcom/bugsnag/android/StateEvent;", "name", "", "variant", "(Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class AddFeatureFlag extends StateEvent {

        @JvmField
        @NotNull
        public final String name;

        @JvmField
        @Nullable
        public final String variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlag(@NotNull String str, @Nullable String str2) {
            super(null);
            str.getClass();
            this.name = str;
            this.variant = str2;
        }

        public /* synthetic */ AddFeatureFlag(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateMemoryTrimEvent;", "Lcom/bugsnag/android/StateEvent;", "isLowMemory", "", "memoryTrimLevel", "", "memoryTrimLevelDescription", "", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class UpdateMemoryTrimEvent extends StateEvent {

        @JvmField
        public final boolean isLowMemory;

        @JvmField
        @Nullable
        public final Integer memoryTrimLevel;

        @JvmField
        @NotNull
        public final String memoryTrimLevelDescription;

        public /* synthetic */ UpdateMemoryTrimEvent(boolean z, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "None" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateMemoryTrimEvent(boolean z, @Nullable Integer num, @NotNull String str) {
            super(null);
            str.getClass();
            this.isLowMemory = z;
            this.memoryTrimLevel = num;
            this.memoryTrimLevelDescription = str;
        }
    }
}
