package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class Runnables {
    private static final Runnable EMPTY_RUNNABLE = new Runnable() { // from class: com.amazon.coral.google.common.util.concurrent.Runnables.1
        @Override // java.lang.Runnable
        public void run() {
        }
    };

    private Runnables() {
    }

    public static Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }
}
