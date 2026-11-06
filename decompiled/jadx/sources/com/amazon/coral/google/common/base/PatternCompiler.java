package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtIncompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface PatternCompiler {
    CommonPattern compile(String str);

    boolean isPcreLike();
}
