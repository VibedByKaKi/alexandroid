package com.amazon.alexa.accessory.speech.events.statereport;

import com.amazon.alexa.accessory.registration.DeviceRegistration;
import com.amazon.alexa.accessory.speech.events.statereport.StateReportEventGenerator;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class StateReportEventGenerator$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StateReportEventGenerator.StateReportInfo f$0;

    public /* synthetic */ StateReportEventGenerator$$ExternalSyntheticLambda1(StateReportEventGenerator.StateReportInfo stateReportInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = stateReportInfo;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        StateReportEventGenerator.StateReportInfo lambda$getStateReportInfoWithDeviceRegistration$4;
        StateReportEventGenerator.StateReportInfo lambda$getStateReportInfoWithSessionInfo$2;
        int i = this.$r8$classId;
        StateReportEventGenerator.StateReportInfo stateReportInfo = this.f$0;
        switch (i) {
            case 0:
                lambda$getStateReportInfoWithDeviceRegistration$4 = StateReportEventGenerator.lambda$getStateReportInfoWithDeviceRegistration$4(stateReportInfo, (DeviceRegistration) obj);
                return lambda$getStateReportInfoWithDeviceRegistration$4;
            default:
                lambda$getStateReportInfoWithSessionInfo$2 = StateReportEventGenerator.lambda$getStateReportInfoWithSessionInfo$2(stateReportInfo, (Set) obj);
                return lambda$getStateReportInfoWithSessionInfo$2;
        }
    }
}
