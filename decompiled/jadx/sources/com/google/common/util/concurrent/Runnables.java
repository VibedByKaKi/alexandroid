package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
public final class Runnables {
    private static final Runnable EMPTY_RUNNABLE = new Runnables$$ExternalSyntheticLambda0();

    private Runnables() {
    }

    public static Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
    }
}
