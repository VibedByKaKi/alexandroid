package com.amazon.alexa.capabilityagent.cardstudiosurface.gate;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.CardStudioGate;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.ConstantsKt;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/gate/CardStudioSurfaceGate;", "", "deviceTypeProvider", "Lkotlin/Function0;", "", "featureServiceProvider", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "isEnabled", "", "isEnabledOnKhDevice", "service", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CardStudioSurfaceGate {
    public static final int $stable = 0;

    @NotNull
    private final Function0<String> deviceTypeProvider;

    @NotNull
    private final Function0<FeatureServiceV2> featureServiceProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public CardStudioSurfaceGate(@NotNull Function0<String> function0, @NotNull Function0<? extends FeatureServiceV2> function02) {
        function0.getClass();
        function02.getClass();
        this.deviceTypeProvider = function0;
        this.featureServiceProvider = function02;
    }

    private final boolean isEnabledOnKhDevice(FeatureServiceV2 service) {
        String invoke = this.deviceTypeProvider.invoke();
        if (invoke == null) {
            Log.w(ConstantsKt.LOG_TAG, "Device type unavailable; not consulting the KH gate");
            return false;
        }
        if (!Constants.INSTANCE.getKH_DEVICE_TYPES().contains(invoke)) {
            return false;
        }
        String treatment = service.getTreatment("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_MOBILE_CARD_STUDIO_KH", "C_DEFAULT");
        boolean contains = CardStudioGate.INSTANCE.getENABLED_TREATMENTS().contains(treatment);
        Log.i(ConstantsKt.LOG_TAG, "Gate ALEXA_MOBILE_CARD_STUDIO_KH treatment=" + treatment + " enabled=" + contains);
        return contains;
    }

    public final boolean isEnabled() {
        Object m25294constructorimpl;
        FeatureServiceV2 invoke;
        try {
            Result.Companion companion = Result.INSTANCE;
            invoke = this.featureServiceProvider.invoke();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (invoke == null) {
            Log.w(ConstantsKt.LOG_TAG, "Feature service unavailable; treating the gate as off");
            return false;
        }
        String treatment = invoke.getTreatment("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_MOBILE_CARD_STUDIO_ANDROID", "C_DEFAULT");
        boolean contains = CardStudioGate.INSTANCE.getENABLED_TREATMENTS().contains(treatment);
        Log.i(ConstantsKt.LOG_TAG, "Gate ALEXA_MOBILE_CARD_STUDIO_ANDROID treatment=" + treatment + " enabled=" + contains);
        m25294constructorimpl = Result.m25294constructorimpl(Boolean.valueOf(contains || isEnabledOnKhDevice(invoke)));
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Log.e(ConstantsKt.LOG_TAG, "Gate read failed; treating the gate as off", m25297exceptionOrNullimpl);
            m25294constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) m25294constructorimpl).booleanValue();
    }

    public /* synthetic */ CardStudioSurfaceGate(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: com.amazon.alexa.capabilityagent.cardstudiosurface.gate.CardStudioSurfaceGate.1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        } : function0, function02);
    }
}
