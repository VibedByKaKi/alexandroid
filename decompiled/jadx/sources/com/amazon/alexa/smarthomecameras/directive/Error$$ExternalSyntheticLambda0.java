package com.amazon.alexa.smarthomecameras.directive;

import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.player.VideoPlayer;
import com.amazon.comms.calling.data.dataSource.AppLifeCycleDataSource;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ConflatedBroadcastChannel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Error$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Error$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$06;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_$07;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$08;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_$09;
        JsonObject metricsHeader_delegate$lambda$0;
        ConflatedBroadcastChannel appLifecycleEventChannel_delegate$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                _childSerializers$_anonymous_ = Error._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = Directive.ShowRecordingResults._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_$0 = Directive.ShowRecordingResults._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_$1 = Directive.ShowRecordingResults._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 4:
                _childSerializers$_anonymous_3 = Directive.StartLiveView._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_$02 = Directive.StartLiveView._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 6:
                _childSerializers$_anonymous_4 = Directive.StopLiveView._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 7:
                _childSerializers$_anonymous_5 = DisplayProperties._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 8:
                _childSerializers$_anonymous_$03 = DisplayProperties._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 9:
                _childSerializers$_anonymous_$12 = DisplayProperties._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 10:
                _childSerializers$_anonymous_6 = EventMetadata._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 11:
                _childSerializers$_anonymous_$04 = EventMetadata._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 12:
                _childSerializers$_anonymous_7 = EventTypeResultsMetadata._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 13:
                _childSerializers$_anonymous_$05 = EventTypeResultsMetadata._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 14:
                _childSerializers$_anonymous_$13 = EventTypeResultsMetadata._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 15:
                _childSerializers$_anonymous_8 = LiveViewControllerSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 16:
                _childSerializers$_anonymous_9 = Participants._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 17:
                _childSerializers$_anonymous_$06 = Participants._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$06;
            case 18:
                _childSerializers$_anonymous_10 = RecordingPlaybackSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 19:
                _init_$_anonymous_ = ResultsMetadata._init_$_anonymous_();
                return _init_$_anonymous_;
            case 20:
                _childSerializers$_anonymous_11 = VideoSearchResultsMetadata._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 21:
                _childSerializers$_anonymous_$07 = VideoSearchResultsMetadata._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$07;
            case 22:
                _childSerializers$_anonymous_12 = Viewer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 23:
                _childSerializers$_anonymous_13 = ViewerAudioProperties._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 24:
                _childSerializers$_anonymous_$08 = ViewerAudioProperties._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$08;
            case 25:
                _childSerializers$_anonymous_$14 = ViewerAudioProperties._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$14;
            case 26:
                _childSerializers$_anonymous_14 = ViewerExperience._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 27:
                _childSerializers$_anonymous_$09 = ViewerExperience._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$09;
            case 28:
                metricsHeader_delegate$lambda$0 = VideoPlayer.metricsHeader_delegate$lambda$0();
                return metricsHeader_delegate$lambda$0;
            default:
                appLifecycleEventChannel_delegate$lambda$0 = AppLifeCycleDataSource.appLifecycleEventChannel_delegate$lambda$0();
                return appLifecycleEventChannel_delegate$lambda$0;
        }
    }
}
