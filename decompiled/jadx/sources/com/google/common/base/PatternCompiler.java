package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.RestrictedApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
/* loaded from: classes8.dex */
interface PatternCompiler {
    @RestrictedApi(allowedOnPath = ".*/com/google/common/base/.*", explanation = "PatternCompiler is an implementation detail of com.google.common.base")
    CommonPattern compile(String str);

    @RestrictedApi(allowedOnPath = ".*/com/google/common/base/.*", explanation = "PatternCompiler is an implementation detail of com.google.common.base")
    boolean isPcreLike();
}
