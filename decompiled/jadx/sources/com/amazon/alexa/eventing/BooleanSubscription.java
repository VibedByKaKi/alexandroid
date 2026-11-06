package com.amazon.alexa.eventing;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/eventing/BooleanSubscription;", "Lcom/amazon/alexa/eventing/EventSubscription;", "unsubscribe", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "isUnsubscribed", "", "()Z", "unsubscribeRef", "Ljava/util/concurrent/atomic/AtomicReference;", "getUnsubscribeRef$AlexaMobileAndroidEventing_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BooleanSubscription implements EventSubscription {

    @NotNull
    private final AtomicReference<Runnable> unsubscribeRef;

    public BooleanSubscription(@NotNull Runnable runnable) {
        runnable.getClass();
        this.unsubscribeRef = new AtomicReference<>(runnable);
    }

    @NotNull
    public final AtomicReference<Runnable> getUnsubscribeRef$AlexaMobileAndroidEventing_release() {
        return this.unsubscribeRef;
    }

    @Override // com.amazon.alexa.eventing.EventSubscription
    public boolean isUnsubscribed() {
        return this.unsubscribeRef.get() == null;
    }

    @Override // com.amazon.alexa.eventing.EventSubscription
    public void unsubscribe() {
        Runnable andSet;
        if (this.unsubscribeRef.get() == null || (andSet = this.unsubscribeRef.getAndSet(null)) == null) {
            return;
        }
        andSet.run();
    }
}
