package com.amazon.alexa.ra.core.ui.navigation;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import com.amazon.alexa.ra.core.data.model.InputBarEvents;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.ui.navigation.RaRoute;
import com.amazon.alexa.ra.features.fragments.FragmentsSource;
import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaRoute$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RaRoute$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RaRoute.RouteBehavior _init_$lambda$0;
        Unit _init_$lambda$02;
        Unit _init_$lambda$6;
        RaRoute.RouteBehavior conversationHistory$lambda$3;
        RaRoute.RouteBehavior overFlowScreen$lambda$2;
        RaRoute.RouteBehavior _init_$lambda$03;
        Unit _init_$lambda$04;
        Unit pixelCopier$lambda$3;
        boolean compressor$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                _init_$lambda$0 = RaRoute._init_$lambda$0((String) obj, (Bundle) obj2, (String) obj3, (Bundle) obj4);
                return _init_$lambda$0;
            case 1:
                _init_$lambda$02 = InputBarEvents._init_$lambda$0((String) obj, (LocalMediaInfo) obj2, ((Long) obj3).longValue(), (String) obj4);
                return _init_$lambda$02;
            case 2:
                _init_$lambda$6 = InputBarEvents._init_$lambda$6((Uri) obj, (String) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                return _init_$lambda$6;
            case 3:
                conversationHistory$lambda$3 = RaRoute.Companion.conversationHistory$lambda$3((String) obj, (Bundle) obj2, (String) obj3, (Bundle) obj4);
                return conversationHistory$lambda$3;
            case 4:
                overFlowScreen$lambda$2 = RaRoute.Companion.overFlowScreen$lambda$2((String) obj, (Bundle) obj2, (String) obj3, (Bundle) obj4);
                return overFlowScreen$lambda$2;
            case 5:
                _init_$lambda$03 = RaRoute.RaRouteData._init_$lambda$0((String) obj, (Bundle) obj2, (String) obj3, (Bundle) obj4);
                return _init_$lambda$03;
            case 6:
                _init_$lambda$04 = FragmentsSource._init_$lambda$0((CoreUiEventName) obj, ((Integer) obj2).intValue(), (String) obj3, (Map) obj4);
                return _init_$lambda$04;
            case 7:
                pixelCopier$lambda$3 = ScreenSnapshotModule.pixelCopier$lambda$3((Window) obj, (Bitmap) obj2, (Handler) obj3, (Function1) obj4);
                return pixelCopier$lambda$3;
            default:
                compressor$lambda$1 = ScreenSnapshotModule.compressor$lambda$1((Bitmap) obj, (Bitmap.CompressFormat) obj2, ((Integer) obj3).intValue(), (OutputStream) obj4);
                return Boolean.valueOf(compressor$lambda$1);
        }
    }
}
