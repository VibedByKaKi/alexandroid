package com.amazon.coral.util.http.uri;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UriSpecificityShadowMatcherMap$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UriSpecificityShadowMatcherMap f$0;
    public final /* synthetic */ CharSequence f$1;

    public /* synthetic */ UriSpecificityShadowMatcherMap$$ExternalSyntheticLambda0(UriSpecificityShadowMatcherMap uriSpecificityShadowMatcherMap, CharSequence charSequence, int i) {
        this.$r8$classId = i;
        this.f$0 = uriSpecificityShadowMatcherMap;
        this.f$1 = charSequence;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ValuedMatch lambda$matchRegex$1;
        ValuedMatch lambda$matchTree$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$matchRegex$1 = this.f$0.lambda$matchRegex$1(this.f$1);
                return lambda$matchRegex$1;
            default:
                lambda$matchTree$2 = this.f$0.lambda$matchTree$2(this.f$1);
                return lambda$matchTree$2;
        }
    }
}
