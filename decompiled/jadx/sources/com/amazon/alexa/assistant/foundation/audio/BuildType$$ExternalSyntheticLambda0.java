package com.amazon.alexa.assistant.foundation.audio;

import android.media.SoundPool;
import com.amazon.alexa.assistant.capability.system.model.SystemDirectivePayload;
import com.amazon.alexa.assistant.capability.system.model.SystemEventPayload;
import com.amazon.alexa.assistant.capability.system.model.SystemExceptionError;
import com.amazon.alexa.assistant.capability.text.InputTextCapabilityAgent;
import com.amazon.alexa.assistant.earcon.AssistantChimePlayer;
import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.alexa.assistant.foundation.metric.model.MetricInteractionType;
import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import com.amazon.alexa.assistant.foundation.model.SystemLocaleCombination;
import com.amazon.alexa.assistant.metric.fault.RenderFaultTracker;
import com.amazon.alexa.assistant.session.directive.DefaultDirectiveScheduler;
import com.amazon.alexa.assistant.toolkit.ToolkitLayerBuilder;
import com.amazon.alexa.assistant.toolkit.audio.AudioModeMonitor;
import com.amazon.alexa.assistant.toolkit.audio.device.CommunicationDeviceCallbackExecutor;
import com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor.NetworkConnectivityMonitorBuilder;
import com.amazon.alexa.assistant.transport.ConnectionWaiter;
import com.amazon.alexa.assistant.transport.DefaultTransportClient;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.assistant.transport.TransportClient;
import com.amazon.alexa.assistant.transport.TransportClientBuilder;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BuildType$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BuildType$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _init_$_anonymous_3;
        KSerializer _init_$_anonymous_4;
        KSerializer _init_$_anonymous_5;
        KSerializer _init_$_anonymous_6;
        boolean textStreamingEnabledProvider$lambda$0;
        SoundPool _init_$lambda$0;
        KSerializer _init_$_anonymous_7;
        KSerializer _init_$_anonymous_8;
        KSerializer _init_$_anonymous_9;
        KSerializer _init_$_anonymous_10;
        CoroutineDispatcher _init_$lambda$02;
        ExecutorService defaultCallbackExecutor_delegate$lambda$5;
        ExecutorService executor_delegate$lambda$2;
        Unit unit;
        Unit unit2;
        switch (this.$r8$classId) {
            case 0:
                _init_$_anonymous_ = BuildType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                _init_$_anonymous_2 = SystemDirectivePayload.ResetUserInactivity._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 2:
                _init_$_anonymous_3 = SystemDirectivePayload.RevokeAuthorization._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 3:
                _init_$_anonymous_4 = SystemEventPayload._init_$_anonymous_();
                return _init_$_anonymous_4;
            case 4:
                _init_$_anonymous_5 = SystemEventPayload.SynchronizeState._init_$_anonymous_();
                return _init_$_anonymous_5;
            case 5:
                _init_$_anonymous_6 = SystemExceptionError._init_$_anonymous_();
                return _init_$_anonymous_6;
            case 6:
                textStreamingEnabledProvider$lambda$0 = InputTextCapabilityAgent.textStreamingEnabledProvider$lambda$0();
                break;
            case 7:
                textStreamingEnabledProvider$lambda$0 = InputTextCapabilityAgent.connectionWaitEnabledProvider$lambda$1();
                break;
            case 8:
                _init_$lambda$0 = AssistantChimePlayer._init_$lambda$0();
                return _init_$lambda$0;
            case 9:
                _init_$_anonymous_7 = Metric._init_$_anonymous_();
                return _init_$_anonymous_7;
            case 10:
                _init_$_anonymous_8 = MetricInteractionType._init_$_anonymous_();
                return _init_$_anonymous_8;
            case 11:
                _init_$_anonymous_9 = SystemLocale._init_$_anonymous_();
                return _init_$_anonymous_9;
            case 12:
                _init_$_anonymous_10 = SystemLocaleCombination._init_$_anonymous_();
                return _init_$_anonymous_10;
            case 13:
                textStreamingEnabledProvider$lambda$0 = RenderFaultTracker._init_$lambda$0();
                break;
            case 14:
                _init_$lambda$02 = DefaultDirectiveScheduler._init_$lambda$0();
                return _init_$lambda$02;
            case 15:
                textStreamingEnabledProvider$lambda$0 = ToolkitLayerBuilder._init_$lambda$0();
                break;
            case 16:
                defaultCallbackExecutor_delegate$lambda$5 = AudioModeMonitor.defaultCallbackExecutor_delegate$lambda$5();
                return defaultCallbackExecutor_delegate$lambda$5;
            case 17:
                executor_delegate$lambda$2 = CommunicationDeviceCallbackExecutor.executor_delegate$lambda$2();
                return executor_delegate$lambda$2;
            case 18:
                unit = Unit.INSTANCE;
                return unit;
            case 19:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 20:
                textStreamingEnabledProvider$lambda$0 = NetworkConnectivityMonitorBuilder._init_$lambda$0();
                break;
            case 21:
                textStreamingEnabledProvider$lambda$0 = ConnectionWaiter._init_$lambda$0();
                break;
            case 22:
                textStreamingEnabledProvider$lambda$0 = ConnectionWaiter._init_$lambda$1();
                break;
            case 23:
                textStreamingEnabledProvider$lambda$0 = DefaultTransportClient._init_$lambda$0();
                break;
            case 24:
                textStreamingEnabledProvider$lambda$0 = DefaultTransportClient._init_$lambda$1();
                break;
            case 25:
                textStreamingEnabledProvider$lambda$0 = MissingTokenPull._init_$lambda$0();
                break;
            case 26:
                textStreamingEnabledProvider$lambda$0 = TransportClient.DefaultImpls.requestDownchannelRecovery$lambda$0();
                break;
            case 27:
                textStreamingEnabledProvider$lambda$0 = TransportClient.DefaultImpls.requestDownchannelRecovery$lambda$1();
                break;
            case 28:
                textStreamingEnabledProvider$lambda$0 = TransportClientBuilder._init_$lambda$0();
                break;
            default:
                textStreamingEnabledProvider$lambda$0 = TransportClientBuilder._init_$lambda$1();
                break;
        }
        return Boolean.valueOf(textStreamingEnabledProvider$lambda$0);
    }
}
