package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class GlobalTapLatencyMonitor$start$1 extends FunctionReferenceImpl implements Function0<List<? extends View>> {
    public static final GlobalTapLatencyMonitor$start$1 INSTANCE = new GlobalTapLatencyMonitor$start$1();

    public GlobalTapLatencyMonitor$start$1() {
        super(0, SecondaryWindowTrackerKt.class, "globalWindowViews", "globalWindowViews()Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends View> invoke() {
        return SecondaryWindowTrackerKt.globalWindowViews();
    }
}
