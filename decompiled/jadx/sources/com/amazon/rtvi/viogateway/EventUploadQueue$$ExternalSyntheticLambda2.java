package com.amazon.rtvi.viogateway;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class EventUploadQueue$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ EventUploadQueue$$ExternalSyntheticLambda2(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean aggregateEnrichments$lambda$9;
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        QueuedEvent queuedEvent = (QueuedEvent) obj;
        switch (i) {
            case 0:
                aggregateEnrichments$lambda$9 = EventUploadQueue.aggregateEnrichments$lambda$9(arrayList, queuedEvent);
                break;
            default:
                aggregateEnrichments$lambda$9 = EventUploadQueue.crossAggregateNewFrameDataWithEnrichments$lambda$23(arrayList, queuedEvent);
                break;
        }
        return Boolean.valueOf(aggregateEnrichments$lambda$9);
    }
}
