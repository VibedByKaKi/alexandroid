package org.apache.commons.lang3.concurrent;

import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class MultiBackgroundInitializer$$ExternalSyntheticLambda2 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((BackgroundInitializer) obj).getTaskCount();
    }
}
