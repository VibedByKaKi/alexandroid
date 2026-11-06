package com.amazon.apl.viewhost.internal;

import com.amazon.apl.viewhost.internal.message.action.ActionMessageImpl;
import com.amazon.apl.viewhost.message.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MessageHandler f$0;
    public final /* synthetic */ ActionMessageImpl f$1;

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda4(MessageHandler messageHandler, ActionMessageImpl actionMessageImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = messageHandler;
        this.f$1 = actionMessageImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.handleAction(this.f$1);
                break;
            case 1:
                this.f$0.handleAction(this.f$1);
                break;
            case 2:
                this.f$0.handleAction(this.f$1);
                break;
            default:
                this.f$0.handleAction(this.f$1);
                break;
        }
    }
}
