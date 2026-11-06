package com.amazon.alexa.ra.core.ui.fragments.list;

import com.amazon.alexa.ra.core.data.fragments.Artifact;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda30 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda30(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit FragmentLists_S3D76Zc$lambda$7$lambda$6;
        Object invoke$lambda$9$lambda$8$lambda$0;
        Unit FragmentLists_S3D76Zc$lambda$9$lambda$8;
        switch (this.$r8$classId) {
            case 0:
                FragmentLists_S3D76Zc$lambda$7$lambda$6 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$7$lambda$6((Artifact) obj, (String) obj2);
                return FragmentLists_S3D76Zc$lambda$7$lambda$6;
            case 1:
                invoke$lambda$9$lambda$8$lambda$0 = AlexaResponseFragmentKt$AnimatedLazyRow$2.invoke$lambda$9$lambda$8$lambda$0(((Integer) obj).intValue(), (FragmentData) obj2);
                return invoke$lambda$9$lambda$8$lambda$0;
            default:
                FragmentLists_S3D76Zc$lambda$9$lambda$8 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$9$lambda$8((String) obj, ((Boolean) obj2).booleanValue());
                return FragmentLists_S3D76Zc$lambda$9$lambda$8;
        }
    }
}
