package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.protobuf.EventProto;
import com.amazon.alexa.mobilytics.protobuf.MobilyticsMessageProto;
import com.amazon.alexa.mobilytics.util.Utils;
import com.google.common.base.Preconditions;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class EventProtobufHandler implements ProtobufHandler {
    private final MobilyticsConfiguration mobilyticsConfiguration;
    private final String serviceName;

    @Inject
    public EventProtobufHandler(@NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        MobilyticsConfiguration mobilyticsConfiguration2 = (MobilyticsConfiguration) Preconditions.checkNotNull(mobilyticsConfiguration);
        this.mobilyticsConfiguration = mobilyticsConfiguration2;
        StringBuilder sb = new StringBuilder();
        sb.append(mobilyticsConfiguration2.serviceName());
        if (mobilyticsConfiguration2.isDebug()) {
            sb.append("_debug");
        }
        this.serviceName = sb.toString();
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.protobufhandlers.ProtobufHandler
    @Nullable
    public MobilyticsMessageProto serialize(@NonNull MobilyticsEvent mobilyticsEvent) {
        EventProto.Builder newBuilder = EventProto.newBuilder();
        newBuilder.setEventId(UUID.randomUUID().toString()).setSourceName(this.serviceName).setEventType(mobilyticsEvent.getEventType()).setEventTimestamp(mobilyticsEvent.getEventTimestamp()).setEventDetails(((DefaultMobilyticsEvent) mobilyticsEvent).serialize()).setApplicationForegrounded(Utils.isAppOnForeground(this.mobilyticsConfiguration.context()));
        return MobilyticsMessageProto.newBuilder().setEvent(newBuilder).build();
    }
}
