package com.amazon.alexa.ra.sdk;

import com.amazon.alexa.ra.core.data.fragments.FragmentDataOperation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public /* synthetic */ class AlexaServicesWrapper$registerFragmentsListener$3 extends FunctionReferenceImpl implements Function2<String, List<? extends FragmentDataOperation>, Unit> {
    public AlexaServicesWrapper$registerFragmentsListener$3(Object obj) {
        super(2, obj, FragmentsListener.class, "onUpdateFragmentData", "onUpdateFragmentData(Ljava/lang/String;Ljava/util/List;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, List<FragmentDataOperation> list) {
        str.getClass();
        list.getClass();
        ((FragmentsListener) this.receiver).onUpdateFragmentData(str, list);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends FragmentDataOperation> list) {
        invoke2(str, (List<FragmentDataOperation>) list);
        return Unit.INSTANCE;
    }
}
