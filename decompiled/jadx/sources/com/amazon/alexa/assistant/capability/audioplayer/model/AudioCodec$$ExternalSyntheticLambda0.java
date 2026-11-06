package com.amazon.alexa.assistant.capability.audioplayer.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProvidersAssistantSubcomponent;
import com.amazon.alexa.assistant.capability.alexa.model.AlexaEventPayload;
import com.amazon.alexa.assistant.capability.applicationstatereporter.ApplicationStateReporterCapabilityAgent;
import com.amazon.alexa.assistant.capability.audioplayer.model.AudioPlayerDirectivePayload;
import com.amazon.alexa.assistant.capability.audioplayer.model.AudioPlayerEventPayload;
import com.amazon.alexa.assistant.capability.conversation.model.AddFragmentsPayload;
import com.amazon.alexa.assistant.capability.conversation.model.FragmentDataOperationType;
import com.amazon.alexa.assistant.capability.conversation.model.FragmentUpdateOperationType;
import com.amazon.alexa.assistant.capability.conversation.model.MediaState;
import com.amazon.alexa.assistant.capability.conversation.model.SetExpandPayload;
import com.amazon.alexa.assistant.capability.conversation.model.SmartFragmentCommand;
import com.amazon.alexa.assistant.capability.conversation.model.SupportedContentType;
import com.amazon.alexa.assistant.capability.conversation.model.WindowState;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerEvent;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.MediaItem;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.PlaybackStateReporterCapabilityContext;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AudioCodec$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AudioCodec$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        String _init_$lambda$1;
        KSerializer _init_$_anonymous_2;
        KSerializer _init_$_anonymous_3;
        boolean _init_$lambda$0;
        KSerializer _init_$_anonymous_4;
        KSerializer _init_$_anonymous_5;
        KSerializer _init_$_anonymous_6;
        KSerializer _init_$_anonymous_7;
        KSerializer _init_$_anonymous_8;
        KSerializer _init_$_anonymous_9;
        KSerializer _init_$_anonymous_10;
        KSerializer _init_$_anonymous_11;
        KSerializer _init_$_anonymous_12;
        KSerializer _init_$_anonymous_13;
        KSerializer _init_$_anonymous_14;
        KSerializer _init_$_anonymous_15;
        KSerializer _init_$_anonymous_16;
        KSerializer _init_$_anonymous_17;
        KSerializer _init_$_anonymous_18;
        KSerializer _init_$_anonymous_19;
        KSerializer _init_$_anonymous_20;
        KSerializer _init_$_anonymous_21;
        KSerializer _init_$_anonymous_22;
        KSerializer _init_$_anonymous_23;
        KSerializer _init_$_anonymous_24;
        KSerializer _init_$_anonymous_25;
        KSerializer _init_$_anonymous_26;
        KSerializer _init_$_anonymous_27;
        KSerializer _init_$_anonymous_28;
        switch (this.$r8$classId) {
            case 0:
                _init_$_anonymous_ = AudioCodec._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                _init_$lambda$1 = UserSpeechProvidersAssistantSubcomponent._init_$lambda$1();
                return _init_$lambda$1;
            case 2:
                _init_$_anonymous_2 = AlexaEventPayload._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 3:
                _init_$_anonymous_3 = AlexaEventPayload.StateReport._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 4:
                _init_$lambda$0 = ApplicationStateReporterCapabilityAgent._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$0);
            case 5:
                _init_$_anonymous_4 = AnalyzersEnable._init_$_anonymous_();
                return _init_$_anonymous_4;
            case 6:
                _init_$_anonymous_5 = AudioFormat._init_$_anonymous_();
                return _init_$_anonymous_5;
            case 7:
                _init_$_anonymous_6 = AudioPlayerDirectivePayload._init_$_anonymous_();
                return _init_$_anonymous_6;
            case 8:
                _init_$_anonymous_7 = AudioPlayerDirectivePayload.Stop._init_$_anonymous_();
                return _init_$_anonymous_7;
            case 9:
                _init_$_anonymous_8 = AudioPlayerEventPayload._init_$_anonymous_();
                return _init_$_anonymous_8;
            case 10:
                _init_$_anonymous_9 = AudioPlayerEventPayload.PlaybackQueueCleared._init_$_anonymous_();
                return _init_$_anonymous_9;
            case 11:
                _init_$_anonymous_10 = ClearBehavior._init_$_anonymous_();
                return _init_$_anonymous_10;
            case 12:
                _init_$_anonymous_11 = InterruptedBehavior._init_$_anonymous_();
                return _init_$_anonymous_11;
            case 13:
                _init_$_anonymous_12 = PlayBehavior._init_$_anonymous_();
                return _init_$_anonymous_12;
            case 14:
                _init_$_anonymous_13 = PlaybackErrorType._init_$_anonymous_();
                return _init_$_anonymous_13;
            case 15:
                _init_$_anonymous_14 = PlayerActivity._init_$_anonymous_();
                return _init_$_anonymous_14;
            case 16:
                _init_$_anonymous_15 = AddFragmentsPayload.AdditionalFragments._init_$_anonymous_();
                return _init_$_anonymous_15;
            case 17:
                _init_$_anonymous_16 = AddFragmentsPayload.DisplayHint._init_$_anonymous_();
                return _init_$_anonymous_16;
            case 18:
                _init_$_anonymous_17 = FragmentDataOperationType._init_$_anonymous_();
                return _init_$_anonymous_17;
            case 19:
                _init_$_anonymous_18 = FragmentUpdateOperationType._init_$_anonymous_();
                return _init_$_anonymous_18;
            case 20:
                _init_$_anonymous_19 = MediaState._init_$_anonymous_();
                return _init_$_anonymous_19;
            case 21:
                _init_$_anonymous_20 = SetExpandPayload.ExpandedState._init_$_anonymous_();
                return _init_$_anonymous_20;
            case 22:
                _init_$_anonymous_21 = SmartFragmentCommand._init_$_anonymous_();
                return _init_$_anonymous_21;
            case 23:
                _init_$_anonymous_22 = SmartFragmentCommand.Pressed._init_$_anonymous_();
                return _init_$_anonymous_22;
            case 24:
                _init_$_anonymous_23 = SupportedContentType._init_$_anonymous_();
                return _init_$_anonymous_23;
            case 25:
                _init_$_anonymous_24 = WindowState._init_$_anonymous_();
                return _init_$_anonymous_24;
            case 26:
                _init_$_anonymous_25 = ExternalMediaPlayerEvent.Payload.PlayerEvent.Name._init_$_anonymous_();
                return _init_$_anonymous_25;
            case 27:
                _init_$_anonymous_26 = MediaItem.MediaType._init_$_anonymous_();
                return _init_$_anonymous_26;
            case 28:
                _init_$_anonymous_27 = PlaybackStateReporterCapabilityContext.FavoriteType._init_$_anonymous_();
                return _init_$_anonymous_27;
            default:
                _init_$_anonymous_28 = PlaybackStateReporterCapabilityContext.Media.MediaType._init_$_anonymous_();
                return _init_$_anonymous_28;
        }
    }
}
