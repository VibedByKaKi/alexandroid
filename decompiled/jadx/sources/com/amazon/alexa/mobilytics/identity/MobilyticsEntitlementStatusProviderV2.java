package com.amazon.alexa.mobilytics.identity;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.identity.message.eventBus.MobilyticsEventBusMessageType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsEntitlementStatusProviderV2 {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface Listener {
        void onEntitlementStatusChanged(@Nullable MobilyticsEntitlementStatus mobilyticsEntitlementStatus);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int ENTITLED = 0;
        public static final int ERROR = 3;
        public static final int NOT_ENTITLED = 1;
        public static final int UNKNOWN = 2;
    }

    void addListener(Listener listener);

    default List<String> getEntitledBenefits() {
        return Collections.EMPTY_LIST;
    }

    @Nullable
    MobilyticsEntitlementStatus getEntitlementStatus();

    default List<String> getPremiumBenefitLabels() {
        return Collections.EMPTY_LIST;
    }

    void onMessageReceived(MobilyticsEventBusMessageType mobilyticsEventBusMessageType);

    void onUserChanged(@Nullable MobilyticsUser mobilyticsUser);

    void removeListener(Listener listener);
}
