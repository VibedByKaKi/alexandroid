package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.DoNotMock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use an instance of one of the Finalizable*Reference classes")
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
public interface FinalizableReference {
    void finalizeReferent();
}
