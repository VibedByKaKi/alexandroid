package com.amazon.alexa.photos.hva;

import android.content.Context;
import com.amazon.alexa.app.notification.actions.handlers.RemindersHandler;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.notification.actions.reminders.RemindersActionHandler;
import com.amazon.alexa.notification.api.actions.registry.NotificationActionsRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class HVAManager$$ExternalSyntheticLambda0 implements LazyComponent {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HVAManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.protocols.service.api.LazyComponent, javax.inject.Provider
    public final Object get() {
        NotificationActionsRegistry lambda$new$2;
        NotificationActionsRegistry lambda$new$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return (EventBus) ((Lazy) obj).get();
            case 1:
                lambda$new$2 = RemindersHandler.lambda$new$2((NotificationActionsRegistry) obj);
                return lambda$new$2;
            default:
                lambda$new$0 = RemindersActionHandler.lambda$new$0((Context) obj);
                return lambda$new$0;
        }
    }
}
