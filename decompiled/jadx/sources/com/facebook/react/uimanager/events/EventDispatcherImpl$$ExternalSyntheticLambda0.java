package com.facebook.react.uimanager.events;

import com.facebook.react.uimanager.events.EventDispatcherImpl;
import com.facebook.react.uimanager.events.FabricEventDispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class EventDispatcherImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EventDispatcherImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((EventDispatcherImpl) obj).stopFrameCallback();
                break;
            case 1:
                ((EventDispatcherImpl.ScheduleDispatchFrameCallback) obj).maybePost();
                break;
            default:
                ((FabricEventDispatcher.ScheduleDispatchFrameCallback) obj).maybeDispatchBatchedEvents();
                break;
        }
    }
}
