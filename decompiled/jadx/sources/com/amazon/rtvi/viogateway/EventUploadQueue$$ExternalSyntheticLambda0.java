package com.amazon.rtvi.viogateway;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class EventUploadQueue$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ QueuedEvent f$0;

    public /* synthetic */ EventUploadQueue$$ExternalSyntheticLambda0(QueuedEvent queuedEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = queuedEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean crossAggregateEnrichmentsIntoFrameData$lambda$12;
        int i = this.$r8$classId;
        QueuedEvent queuedEvent = this.f$0;
        QueuedEvent queuedEvent2 = (QueuedEvent) obj;
        switch (i) {
            case 0:
                crossAggregateEnrichmentsIntoFrameData$lambda$12 = EventUploadQueue.crossAggregateEnrichmentsIntoFrameData$lambda$12(queuedEvent, queuedEvent2);
                break;
            default:
                crossAggregateEnrichmentsIntoFrameData$lambda$12 = EventUploadQueue.evictLowestFrameIndex$lambda$17(queuedEvent, queuedEvent2);
                break;
        }
        return Boolean.valueOf(crossAggregateEnrichmentsIntoFrameData$lambda$12);
    }
}
