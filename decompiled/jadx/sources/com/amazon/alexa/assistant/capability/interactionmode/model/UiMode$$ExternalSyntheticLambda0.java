package com.amazon.alexa.assistant.capability.interactionmode.model;

import com.amazon.alexa.assistant.capability.externalmediaplayer.model.PlaybackStateReporterCapabilityContext;
import com.amazon.alexa.assistant.capability.launcher.model.LauncherDirectivePayload;
import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlagsCapabilityAgent;
import com.amazon.alexa.assistant.capability.livepreview.model.TranscriptDirection;
import com.amazon.alexa.assistant.capability.livepreview.model.TranscriptSequence;
import com.amazon.alexa.assistant.capability.playbackcontroller.model.PlaybackControllerEvent;
import com.amazon.alexa.assistant.capability.recommendation.model.ImageType;
import com.amazon.alexa.assistant.capability.speechrecognizer.SpeechRecognizerCapabilityActor;
import com.amazon.alexa.assistant.capability.speechrecognizer.WakeWordEnabledSpeechProvider;
import com.amazon.alexa.assistant.capability.speechrecognizer.model.SpeechConfirmation;
import com.amazon.alexa.assistant.capability.speechrecognizer.model.WakeWordConfirmation;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.VoiceChatExitIntentDetector;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInObserver;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.SpeechModelPriority;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.settingscontroller.WakeWordSettingsControlRequestParser;
import com.amazon.alexa.assistant.capability.system.model.SystemDirectivePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class UiMode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UiMode$$ExternalSyntheticLambda0(int i) {
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
        KSerializer _init_$_anonymous_7;
        KSerializer _init_$_anonymous_8;
        KSerializer _init_$_anonymous_9;
        String _init_$lambda$0;
        KSerializer _init_$_anonymous_10;
        KSerializer _init_$_anonymous_11;
        KSerializer _init_$_anonymous_12;
        KSerializer _init_$_anonymous_13;
        KSerializer _init_$_anonymous_14;
        boolean connectionWaitEnabledProvider$lambda$2;
        KSerializer _init_$_anonymous_15;
        KSerializer _init_$_anonymous_16;
        SelfBargeInObserver.Engine create$lambda$1;
        Unit unit;
        KSerializer _init_$_anonymous_17;
        KSerializer _init_$_anonymous_18;
        KSerializer _init_$_anonymous_19;
        KSerializer _init_$_anonymous_20;
        switch (this.$r8$classId) {
            case 0:
                _init_$_anonymous_ = UiMode._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                _init_$_anonymous_2 = PlaybackStateReporterCapabilityContext.Media.MediaValueType._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 2:
                _init_$_anonymous_3 = PlaybackStateReporterCapabilityContext.Operation._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 3:
                _init_$_anonymous_4 = PlaybackStateReporterCapabilityContext.RepeatType._init_$_anonymous_();
                return _init_$_anonymous_4;
            case 4:
                _init_$_anonymous_5 = PlaybackStateReporterCapabilityContext.ShuffleType._init_$_anonymous_();
                return _init_$_anonymous_5;
            case 5:
                _init_$_anonymous_6 = PlaybackStateReporterCapabilityContext.State._init_$_anonymous_();
                return _init_$_anonymous_6;
            case 6:
                _init_$_anonymous_7 = DistanceUnit._init_$_anonymous_();
                return _init_$_anonymous_7;
            case 7:
                _init_$_anonymous_8 = SupportLevel._init_$_anonymous_();
                return _init_$_anonymous_8;
            case 8:
                _init_$_anonymous_9 = LauncherDirectivePayload._init_$_anonymous_();
                return _init_$_anonymous_9;
            case 9:
                _init_$lambda$0 = LegacyFlagsCapabilityAgent._init_$lambda$0();
                return _init_$lambda$0;
            case 10:
                _init_$_anonymous_10 = TranscriptDirection._init_$_anonymous_();
                return _init_$_anonymous_10;
            case 11:
                _init_$_anonymous_11 = TranscriptSequence._init_$_anonymous_();
                return _init_$_anonymous_11;
            case 12:
                _init_$_anonymous_12 = PlaybackControllerEvent._init_$_anonymous_();
                return _init_$_anonymous_12;
            case 13:
                _init_$_anonymous_13 = PlaybackControllerEvent.EmptyPayload._init_$_anonymous_();
                return _init_$_anonymous_13;
            case 14:
                _init_$_anonymous_14 = ImageType._init_$_anonymous_();
                return _init_$_anonymous_14;
            case 15:
                connectionWaitEnabledProvider$lambda$2 = SpeechRecognizerCapabilityActor.connectionWaitEnabledProvider$lambda$2();
                break;
            case 16:
                connectionWaitEnabledProvider$lambda$2 = SpeechRecognizerCapabilityActor.preserveDialogOnStreamResetEnabledProvider$lambda$3();
                break;
            case 17:
                connectionWaitEnabledProvider$lambda$2 = SpeechRecognizerCapabilityActor.stopCaptureOnFinalPreviewEnabledProvider$lambda$4();
                break;
            case 18:
                connectionWaitEnabledProvider$lambda$2 = SpeechRecognizerCapabilityActor.recoverStaleDownchannelEnabledProvider$lambda$5();
                break;
            case 19:
                connectionWaitEnabledProvider$lambda$2 = WakeWordEnabledSpeechProvider.isVoiceChatRunning$lambda$0();
                break;
            case 20:
                _init_$_anonymous_15 = SpeechConfirmation._init_$_anonymous_();
                return _init_$_anonymous_15;
            case 21:
                _init_$_anonymous_16 = WakeWordConfirmation._init_$_anonymous_();
                return _init_$_anonymous_16;
            case 22:
                connectionWaitEnabledProvider$lambda$2 = VoiceChatExitIntentDetector._init_$lambda$0();
                break;
            case 23:
                create$lambda$1 = SelfBargeInObserver.Companion.create$lambda$1();
                return create$lambda$1;
            case 24:
                unit = Unit.INSTANCE;
                return unit;
            case 25:
                _init_$_anonymous_17 = SpeechModelPriority._init_$_anonymous_();
                return _init_$_anonymous_17;
            case 26:
                connectionWaitEnabledProvider$lambda$2 = WakeWordSettingsControlRequestParser._init_$lambda$0();
                break;
            case 27:
                _init_$_anonymous_18 = SystemDirectivePayload._init_$_anonymous_();
                return _init_$_anonymous_18;
            case 28:
                _init_$_anonymous_19 = SystemDirectivePayload.ReportSoftwareInfo._init_$_anonymous_();
                return _init_$_anonymous_19;
            default:
                _init_$_anonymous_20 = SystemDirectivePayload.ReportState._init_$_anonymous_();
                return _init_$_anonymous_20;
        }
        return Boolean.valueOf(connectionWaitEnabledProvider$lambda$2);
    }
}
