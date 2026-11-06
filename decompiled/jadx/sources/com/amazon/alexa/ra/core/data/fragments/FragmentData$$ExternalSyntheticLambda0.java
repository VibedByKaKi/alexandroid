package com.amazon.alexa.ra.core.data.fragments;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FragmentData$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FragmentMetaData f$0;

    public /* synthetic */ FragmentData$$ExternalSyntheticLambda0(FragmentMetaData fragmentMetaData, int i) {
        this.$r8$classId = i;
        this.f$0 = fragmentMetaData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean _init_$lambda$0;
        int i = this.$r8$classId;
        FragmentMetaData fragmentMetaData = this.f$0;
        switch (i) {
            case 0:
                _init_$lambda$0 = FragmentData._init_$lambda$0(fragmentMetaData);
                break;
            default:
                _init_$lambda$0 = FragmentMetaData.isExpired_delegate$lambda$0(fragmentMetaData);
                break;
        }
        return Boolean.valueOf(_init_$lambda$0);
    }
}
