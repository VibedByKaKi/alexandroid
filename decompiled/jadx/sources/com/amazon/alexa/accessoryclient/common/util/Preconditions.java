package com.amazon.alexa.accessoryclient.common.util;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/util/Preconditions;", "", "()V", "Companion", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Preconditions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/util/Preconditions$Companion;", "", "()V", "hasLock", "", JoinPoint.SYNCHRONIZATION_LOCK, "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void hasLock(@NotNull Object lock) {
            lock.getClass();
            if (Thread.holdsLock(lock)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$2(DoubleList$$ExternalSyntheticOutline0.m(lock, "Current thread does not have lock "));
        }

        private Companion() {
        }
    }
}
