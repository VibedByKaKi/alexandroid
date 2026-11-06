package com.amazon.alexa.matter.commissioner;

import android.util.Pair;
import chip.devicecontroller.ThreadScanResult;
import chip.devicecontroller.WiFiScanResult;
import com.amazon.alexa.matter.eventbus.schema.CommissioningSessionState;
import com.amazon.alexa.matter.eventbus.schema.State;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WireTypes$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WireTypes$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$asHexString$2;
        Pair lambda$onScanNetworksSuccess$14;
        String lambda$describeList$26;
        String lambda$onScanNetworksSuccess$10;
        Pair lambda$onScanNetworksSuccess$11;
        List lambda$asThreadNetworks$0;
        List lambda$asWiFiNetworks$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$asHexString$2 = WireTypes.lambda$asHexString$2((Byte) obj);
                return lambda$asHexString$2;
            case 1:
                return WireTypes.asNetworkScanResult((WiFiScanResult) obj);
            case 2:
                lambda$onScanNetworksSuccess$14 = MatterSDKCommissioningSession.lambda$onScanNetworksSuccess$14((ThreadScanResult) obj);
                return lambda$onScanNetworksSuccess$14;
            case 3:
                return WireTypes.asNetworkScanResult((ThreadScanResult) obj);
            case 4:
                return WireTypes.asThreadNetwork((ThreadScanResult) obj);
            case 5:
                lambda$describeList$26 = MatterSDKCommissioningSession.lambda$describeList$26((List) obj);
                return lambda$describeList$26;
            case 6:
                lambda$onScanNetworksSuccess$10 = MatterSDKCommissioningSession.lambda$onScanNetworksSuccess$10((byte[]) obj);
                return lambda$onScanNetworksSuccess$10;
            case 7:
                lambda$onScanNetworksSuccess$11 = MatterSDKCommissioningSession.lambda$onScanNetworksSuccess$11((WiFiScanResult) obj);
                return lambda$onScanNetworksSuccess$11;
            case 8:
                lambda$asThreadNetworks$0 = WireTypes.lambda$asThreadNetworks$0((ArrayList) obj);
                return lambda$asThreadNetworks$0;
            case 9:
                return WireTypes.asWiFiNetwork((WiFiScanResult) obj);
            case 10:
                lambda$asWiFiNetworks$1 = WireTypes.lambda$asWiFiNetworks$1((ArrayList) obj);
                return lambda$asWiFiNetworks$1;
            case 11:
                return ((CommissioningSessionState) obj).getState();
            default:
                return ((State) obj).getInProgress();
        }
    }
}
