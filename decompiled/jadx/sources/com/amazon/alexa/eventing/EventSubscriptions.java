package com.amazon.alexa.eventing;

import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/eventing/EventSubscriptions;", "Lcom/amazon/alexa/eventing/EventSubscription;", "()V", "isUnsubscribed", "", "()Z", "subscriptions", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getSubscriptions$AlexaMobileAndroidEventing_release", "()Ljava/util/HashSet;", "setSubscriptions$AlexaMobileAndroidEventing_release", "(Ljava/util/HashSet;)V", "unsubscribed", "getUnsubscribed$AlexaMobileAndroidEventing_release", "setUnsubscribed$AlexaMobileAndroidEventing_release", "(Z)V", BulkOperationType.add, "", EventMetadataType.SUBSCRIPTION, BulkOperationType.remove, "unsubscribe", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventSubscriptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSubscriptions.kt\ncom/amazon/alexa/eventing/EventSubscriptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes17.dex */
public final class EventSubscriptions implements EventSubscription {

    @Nullable
    private HashSet<EventSubscription> subscriptions;
    private volatile boolean unsubscribed;

    public final void add(@NotNull EventSubscription subscription) {
        subscription.getClass();
        if (subscription.isUnsubscribed()) {
            return;
        }
        boolean z = true;
        if (!this.unsubscribed) {
            synchronized (this) {
                try {
                    if (!this.unsubscribed) {
                        HashSet<EventSubscription> hashSet = this.subscriptions;
                        if (hashSet == null) {
                            hashSet = new HashSet<>(4);
                            this.subscriptions = hashSet;
                        }
                        hashSet.add(subscription);
                        z = false;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            subscription.unsubscribe();
        }
    }

    @Nullable
    public final HashSet<EventSubscription> getSubscriptions$AlexaMobileAndroidEventing_release() {
        return this.subscriptions;
    }

    /* renamed from: getUnsubscribed$AlexaMobileAndroidEventing_release, reason: from getter */
    public final boolean getUnsubscribed() {
        return this.unsubscribed;
    }

    @Override // com.amazon.alexa.eventing.EventSubscription
    public boolean isUnsubscribed() {
        return this.unsubscribed;
    }

    public final void remove(@NotNull EventSubscription subscription) {
        boolean z;
        subscription.getClass();
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.unsubscribed) {
            synchronized (this) {
                HashSet<EventSubscription> hashSet = this.subscriptions;
                if (!this.unsubscribed && hashSet != null) {
                    z = hashSet.remove(subscription);
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
        }
        z = false;
        if (z) {
            subscription.unsubscribe();
        }
    }

    public final void setSubscriptions$AlexaMobileAndroidEventing_release(@Nullable HashSet<EventSubscription> hashSet) {
        this.subscriptions = hashSet;
    }

    public final void setUnsubscribed$AlexaMobileAndroidEventing_release(boolean z) {
        this.unsubscribed = z;
    }

    @Override // com.amazon.alexa.eventing.EventSubscription
    public void unsubscribe() {
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.unsubscribed) {
                    return;
                }
                HashSet<EventSubscription> hashSet = this.subscriptions;
                if (hashSet != null) {
                    Iterator<EventSubscription> it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        it2.next().unsubscribe();
                    }
                    this.subscriptions = null;
                }
                this.unsubscribed = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
