package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@Deprecated
/* loaded from: classes8.dex */
public class ComputationException extends RuntimeException {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    public ComputationException(Throwable th) {
        super(th);
    }
}
