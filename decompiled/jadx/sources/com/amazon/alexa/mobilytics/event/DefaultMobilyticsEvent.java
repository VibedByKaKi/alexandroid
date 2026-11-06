package com.amazon.alexa.mobilytics.event;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent;
import com.amazon.alexa.mobilytics.event.metadata.DefaultEventMetadata;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadata;
import com.amazon.alexa.mobilytics.protobuf.EventDetailsProto;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class DefaultMobilyticsEvent<T extends DefaultMobilyticsEvent<?>> implements MobilyticsEvent {

    @JsonProperty
    private String appComponent;
    private String channelName;
    private String contentId;
    private String contentProvider;
    private String contentType;
    private String contentVersion;
    private transient String customerEntitledBenefit;
    private transient String eventId;
    private String eventName;
    protected transient long eventTimestamp;
    private String inputType;
    private transient boolean isAppForegrounded;
    private transient boolean isAppInit;
    private transient Boolean isCustomerEntitledToBenefits;
    private transient boolean isInvalidated;
    private Collection<EventMetadata> metadata;
    private String ownerIdentifier;
    private transient Collection<String> premiumBenefitLabels;

    @JsonIgnore
    private transient String routingMode;
    private transient MobilyticsSession session;
    private String sourceContext;
    private String subComponent;
    private Long timelineElapsedDuration;
    protected String timelineId;
    protected String timelineName;
    protected String timelineNamespace;

    public DefaultMobilyticsEvent(@NonNull String str, @Nullable String str2) {
        this.eventTimestamp = System.currentTimeMillis();
        Preconditions.checkArgument(!TextUtils.isEmpty(str));
        this.appComponent = str;
        this.subComponent = str2;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void appInitEvent() {
        this.isAppInit = true;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getChannelName() {
        return this.channelName;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @NonNull
    @JsonIgnore
    public String getComponent() {
        return this.appComponent;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getContentId() {
        return this.contentId;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getContentProvider() {
        return this.contentProvider;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getContentVersion() {
        return this.contentVersion;
    }

    @JsonIgnore
    public String getCustomerEntitledBenefit() {
        return this.customerEntitledBenefit;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public String getEventId() {
        return this.eventId;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public Collection<EventMetadata> getEventMetadata() {
        return this.metadata;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @NonNull
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public long getEventTimestamp() {
        return this.eventTimestamp;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public abstract String getEventType();

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getInputType() {
        return this.inputType;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    @JsonIgnore
    public Collection<String> getPremiumBenefitLabels() {
        return this.premiumBenefitLabels;
    }

    @JsonIgnore
    public String getRoutingMode() {
        return this.routingMode;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String getSourceContext() {
        return this.sourceContext;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @Nullable
    public String getSubComponent() {
        return this.subComponent;
    }

    public abstract T getThis();

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void invalidateEvent() {
        this.isInvalidated = true;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public boolean isAppForegrounded() {
        return this.isAppForegrounded;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public boolean isAppInit() {
        return this.isAppInit;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public Boolean isCustomerEntitledToBenefits() {
        return this.isCustomerEntitledToBenefits;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    public EventDetailsProto.Builder serialize() {
        EventDetailsProto.Builder newBuilder = EventDetailsProto.newBuilder();
        newBuilder.setEventName(this.eventName);
        newBuilder.setAppComponent(this.appComponent);
        if (!TextUtils.isEmpty(this.subComponent)) {
            newBuilder.setSubComponent(this.subComponent);
        }
        if (!TextUtils.isEmpty(this.channelName)) {
            newBuilder.setChannelName(this.channelName);
        }
        if (!TextUtils.isEmpty(this.sourceContext)) {
            newBuilder.setSourceContext(this.sourceContext);
        }
        if (!TextUtils.isEmpty(this.inputType)) {
            newBuilder.setInputType(this.inputType);
        }
        if (!TextUtils.isEmpty(this.contentId)) {
            newBuilder.setContentId(this.contentId);
        }
        if (!TextUtils.isEmpty(this.contentType)) {
            newBuilder.setContentType(this.contentType);
        }
        if (!TextUtils.isEmpty(this.contentVersion)) {
            newBuilder.setContentVersion(this.contentVersion);
        }
        if (!TextUtils.isEmpty(this.contentProvider)) {
            newBuilder.setContentProvider(this.contentProvider);
        }
        if (this.metadata != null) {
            EventDetailsProto.Metadata.Builder newBuilder2 = EventDetailsProto.Metadata.newBuilder();
            Iterator<EventMetadata> it2 = this.metadata.iterator();
            while (it2.hasNext()) {
                newBuilder2.mergeFrom(((DefaultEventMetadata) it2.next()).serialize());
            }
            newBuilder.setMetadata(newBuilder2);
        }
        String str = this.timelineId;
        if (str != null) {
            newBuilder.setTimelineId(str);
        }
        String str2 = this.timelineName;
        if (str2 != null) {
            newBuilder.setTimelineName(str2);
        }
        String str3 = this.timelineNamespace;
        if (str3 != null) {
            newBuilder.setTimelineNamespace(str3);
        }
        if (this.timelineElapsedDuration != null) {
            newBuilder.setTimelineElapsedDuration(r1.longValue());
        }
        String str4 = this.ownerIdentifier;
        if (str4 != null) {
            newBuilder.setOwnerIdentifier(str4);
        }
        return newBuilder;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @Nullable
    @JsonIgnore
    public MobilyticsSession session() {
        return this.session;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setAppForegrounded(boolean z) {
        this.isAppForegrounded = z;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setChannelName(String str) {
        this.channelName = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setComponent(String str) {
        this.appComponent = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setContentId(String str) {
        this.contentId = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setContentProvider(String str) {
        this.contentProvider = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setContentVersion(String str) {
        this.contentVersion = str;
    }

    public void setCustomerEntitledBenefit(String str) {
        this.customerEntitledBenefit = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setCustomerEntitledToBenefits(Boolean bool) {
        this.isCustomerEntitledToBenefits = bool;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setEventId(String str) {
        this.eventId = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @Nullable
    public void setEventMetadata(Collection<EventMetadata> collection) {
        this.metadata = collection;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setEventName(String str) {
        this.eventName = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setEventTimestamp(long j) {
        this.eventTimestamp = j;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setInputType(String str) {
        this.inputType = str;
    }

    public void setPremiumBenefitLabels(Collection<String> collection) {
        this.premiumBenefitLabels = collection;
    }

    public void setRoutingMode(String str) {
        this.routingMode = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setSession(MobilyticsSession mobilyticsSession) {
        this.session = mobilyticsSession;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setSourceContext(String str) {
        this.sourceContext = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public void setSubComponent(String str) {
        this.subComponent = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public long timelineElapsedDuration() {
        return this.timelineElapsedDuration.longValue();
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String timelineId() {
        return this.timelineId;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String timelineName() {
        return this.timelineName;
    }

    @Override // com.amazon.alexa.mobilytics.event.MobilyticsEvent
    public String timelineNamespace() {
        return this.timelineNamespace;
    }

    public T withChannelName(String str) {
        this.channelName = str;
        return getThis();
    }

    /* renamed from: withContentId */
    public T withContentId2(@Nullable String str) {
        this.contentId = str;
        return getThis();
    }

    public T withContentProvider(@Nullable String str) {
        this.contentProvider = str;
        return getThis();
    }

    /* renamed from: withContentType */
    public T withContentType2(@Nullable String str) {
        this.contentType = str;
        return getThis();
    }

    public T withContentVersion(@Nullable String str) {
        this.contentVersion = str;
        return getThis();
    }

    public T withEventMetadata(Collection<EventMetadata> collection) {
        this.metadata = collection;
        return getThis();
    }

    /* renamed from: withInputType */
    public T withInputType2(@Nullable String str) {
        this.inputType = str;
        return getThis();
    }

    public T withOwnerIdentifier(String str) {
        this.ownerIdentifier = str;
        return getThis();
    }

    /* renamed from: withSourceContext */
    public T withSourceContext2(@Nullable String str) {
        this.sourceContext = str;
        return getThis();
    }

    public void timelineId(String str) {
        this.timelineId = str;
    }

    public void timelineName(String str) {
        this.timelineName = str;
    }

    public void timelineNamespace(String str) {
        this.timelineNamespace = str;
    }

    public void timelineElapsedDuration(long j) {
        this.timelineElapsedDuration = Long.valueOf(j);
    }

    public DefaultMobilyticsEvent(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        this(str);
        Preconditions.checkArgument(!TextUtils.isEmpty(str2));
        this.appComponent = str2;
        this.subComponent = str3;
    }

    public DefaultMobilyticsEvent(@NonNull String str, @NonNull String str2, @Nullable String str3, String str4) {
        this(str);
        Preconditions.checkArgument(!TextUtils.isEmpty(str2));
        this.appComponent = str2;
        this.subComponent = str3;
        this.ownerIdentifier = str4;
    }

    public DefaultMobilyticsEvent(@NonNull String str) {
        this.eventTimestamp = System.currentTimeMillis();
        Preconditions.checkArgument(!TextUtils.isEmpty(str));
        this.eventName = str;
    }
}
