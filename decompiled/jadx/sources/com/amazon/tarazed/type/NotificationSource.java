package com.amazon.tarazed.type;

import com.amazon.alexa.app.notification.messaging.MobilePushNotificationsRequests;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.whisperjoin.deviceprovisioningservice.smarthome.AssociatedCredentialsSyncService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/tarazed/type/NotificationSource;", "", "metricSuffix", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMetricSuffix", "()Ljava/lang/String;", MobilePushNotificationsRequests.PushNotificationPlatform.ADM, AssociatedCredentialsSyncService.INTENT_EXTRA_SOURCE_VAL_S2DM, "BOB_CENTRAL", Constants.DMPS_FEATURE_NAMESPACE, "ACRS", "UNKNOWN", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class NotificationSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String metricSuffix;
    public static final NotificationSource ADM = new NotificationSource(MobilePushNotificationsRequests.PushNotificationPlatform.ADM, 0, ".ADM");
    public static final NotificationSource S2DM = new NotificationSource(AssociatedCredentialsSyncService.INTENT_EXTRA_SOURCE_VAL_S2DM, 1, ".S2DM");
    public static final NotificationSource BOB_CENTRAL = new NotificationSource("BOB_CENTRAL", 2, ".BobCentral");
    public static final NotificationSource DMPS = new NotificationSource(Constants.DMPS_FEATURE_NAMESPACE, 3, ".DMPS");
    public static final NotificationSource ACRS = new NotificationSource("ACRS", 4, ".ACRS");
    public static final NotificationSource UNKNOWN = new NotificationSource("UNKNOWN", 5, ".Unknown");

    private static final /* synthetic */ NotificationSource[] $values() {
        return new NotificationSource[]{ADM, S2DM, BOB_CENTRAL, DMPS, ACRS, UNKNOWN};
    }

    static {
        NotificationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private NotificationSource(String str, int i, String str2) {
        this.metricSuffix = str2;
    }

    @NotNull
    public static EnumEntries<NotificationSource> getEntries() {
        return $ENTRIES;
    }

    public static NotificationSource valueOf(String str) {
        return (NotificationSource) Enum.valueOf(NotificationSource.class, str);
    }

    public static NotificationSource[] values() {
        return (NotificationSource[]) $VALUES.clone();
    }

    @NotNull
    public final String getMetricSuffix() {
        return this.metricSuffix;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/type/NotificationSource$Companion;", "", "()V", "fromName", "Lcom/amazon/tarazed/type/NotificationSource;", "name", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotificationSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSource.kt\ncom/amazon/tarazed/type/NotificationSource$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n1282#2,2:36\n*S KotlinDebug\n*F\n+ 1 NotificationSource.kt\ncom/amazon/tarazed/type/NotificationSource$Companion\n*L\n32#1:36,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationSource fromName(@Nullable String name) {
            NotificationSource notificationSource;
            NotificationSource[] values = NotificationSource.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notificationSource = null;
                    break;
                }
                notificationSource = values[i];
                if (Intrinsics.areEqual(notificationSource.name(), name)) {
                    break;
                }
                i++;
            }
            return notificationSource == null ? NotificationSource.UNKNOWN : notificationSource;
        }

        private Companion() {
        }
    }
}
