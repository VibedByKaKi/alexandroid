package com.amazon.deecomms.notifications;

import android.os.Bundle;
import com.amazon.deecomms.common.processor.Processor;
import com.amazon.deecomms.common.processor.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PushProcessor extends Processor<PushProcessStatus, Bundle> {
    private PushProcessor() {
    }

    public static PushProcessor create() {
        return new PushProcessor();
    }

    @Override // com.amazon.deecomms.common.processor.Processor
    public boolean terminateEarly(PushProcessStatus pushProcessStatus) {
        return pushProcessStatus != PushProcessStatus.CONTINUE;
    }

    @Override // com.amazon.deecomms.common.processor.Processor
    public PushProcessor add(Task<PushProcessStatus, Bundle> task) {
        super.add((Task) task);
        return this;
    }
}
