package com.dee.app.http.listener;

import android.content.Context;
import android.net.Uri;
import com.amazon.alexa.accessory.frames.media.viewer.ImageDisplayView;
import com.amazon.alexa.accessory.speech.AccessoryUserSpeechProvider;
import com.amazon.alexa.accessory.speechapi.speech.AlexaResponseCoordinationCallbacks;
import com.amazon.alexa.accessory.speechapi.speech.ResponseCoordinationPolicy;
import okhttp3.Call;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class NetworkMetricsEventListenerReporter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ NetworkMetricsEventListenerReporter$$ExternalSyntheticLambda0(AccessoryUserSpeechProvider accessoryUserSpeechProvider, long j, ResponseCoordinationPolicy responseCoordinationPolicy, AlexaResponseCoordinationCallbacks alexaResponseCoordinationCallbacks) {
        this.$r8$classId = 2;
        this.f$0 = accessoryUserSpeechProvider;
        this.f$3 = j;
        this.f$1 = responseCoordinationPolicy;
        this.f$2 = alexaResponseCoordinationCallbacks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((NetworkMetricsEventListenerReporter) this.f$0).lambda$submitLatencyMetric$0((String) this.f$1, (Call) this.f$2, this.f$3);
                break;
            case 1:
                ((ImageDisplayView) this.f$0).lambda$loadMedia$1((Context) this.f$1, (Uri) this.f$2, this.f$3);
                break;
            default:
                ((AccessoryUserSpeechProvider) this.f$0).lambda$onDialogTurnReserveResponse$18(this.f$3, (ResponseCoordinationPolicy) this.f$1, (AlexaResponseCoordinationCallbacks) this.f$2);
                break;
        }
    }

    public /* synthetic */ NetworkMetricsEventListenerReporter$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }
}
