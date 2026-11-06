package com.amazon.alexa.mobilytics.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadata;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsEvent {
    void appInitEvent();

    String getChannelName();

    @NonNull
    String getComponent();

    @Nullable
    String getContentId();

    @Nullable
    String getContentProvider();

    @Nullable
    String getContentType();

    @Nullable
    String getContentVersion();

    String getEventId();

    @Nullable
    Collection<EventMetadata> getEventMetadata();

    @NonNull
    String getEventName();

    long getEventTimestamp();

    String getEventType();

    @Nullable
    String getInputType();

    String getOwnerIdentifier();

    @Nullable
    String getSourceContext();

    @Nullable
    String getSubComponent();

    void invalidateEvent();

    boolean isAppForegrounded();

    boolean isAppInit();

    Boolean isCustomerEntitledToBenefits();

    boolean isInvalidated();

    @Nullable
    default MobilyticsSession session() {
        return null;
    }

    void setAppForegrounded(boolean z);

    void setChannelName(String str);

    @NonNull
    void setComponent(String str);

    @Nullable
    void setContentId(String str);

    @Nullable
    void setContentProvider(String str);

    @Nullable
    void setContentType(String str);

    @Nullable
    void setContentVersion(String str);

    void setCustomerEntitledToBenefits(Boolean bool);

    @NonNull
    void setEventId(String str);

    @Nullable
    void setEventMetadata(Collection<EventMetadata> collection);

    @NonNull
    void setEventName(String str);

    void setEventTimestamp(long j);

    @Nullable
    void setInputType(String str);

    @Nullable
    void setSourceContext(String str);

    @NonNull
    void setSubComponent(String str);

    long timelineElapsedDuration();

    String timelineId();

    String timelineName();

    String timelineNamespace();

    default void setSession(MobilyticsSession mobilyticsSession) {
    }
}
