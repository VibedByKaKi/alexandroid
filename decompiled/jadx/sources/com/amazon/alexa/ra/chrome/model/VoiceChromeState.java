package com.amazon.alexa.ra.chrome.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.amazon.alexa.mobilytics.event.LogLevel;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\fJ\u000e\u0010&\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010'\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\u0014J\u000e\u0010)\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\n¨\u0006."}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/VoiceChromeState;", "", "<init>", "()V", "_alexaUiState", "Landroidx/compose/runtime/MutableState;", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_UI_STATE, "Lkotlin/Function0;", "getAlexaUiState", "()Lkotlin/jvm/functions/Function0;", "_personalityAnimationInfo", "Lcom/amazon/alexa/ra/chrome/model/PersonalityAnimationInfo;", "personalityAnimationInfoClosure", "getPersonalityAnimationInfoClosure", "_volumeLevel", "", SystemUiChromeStateObserver.CONTENT_KEY_VOLUME_LEVEL, "getVolumeLevel", "_voiceInvocationSource", "Lcom/amazon/alexa/ra/chrome/model/AlexaVoiceInvocationSource;", "voiceInvocationSource", "getVoiceInvocationSource", "_isChromeVisible", "", "isChromeVisible", "_showVoiceModality", "showVoiceModality", "getShowVoiceModality", "_showInternalChrome", "showInternalChrome", "getShowInternalChrome", "_isMuted", "isMuted", "setAlexaUiState", "", "setPersonalityAnimationInfo", LogLevel.INFO, "setVolumeLevel", "setVoiceInvocationSource", "source", "setIsChromeVisible", "setShowInternalChrome", "show", "setIsMuted", "Companion", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceChromeState {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "VoiceChromeState";

    @NotNull
    private final MutableState<Boolean> _isChromeVisible;

    @NotNull
    private final MutableState<Boolean> _isMuted;

    @NotNull
    private final MutableState<Boolean> _showInternalChrome;

    @NotNull
    private final MutableState<Boolean> _showVoiceModality;

    @NotNull
    private final Function0<MutableState<AlexaUiState>> alexaUiState;

    @NotNull
    private final Function0<MutableState<Boolean>> isChromeVisible;

    @NotNull
    private final Function0<MutableState<Boolean>> isMuted;

    @NotNull
    private final Function0<MutableState<PersonalityAnimationInfo>> personalityAnimationInfoClosure;

    @NotNull
    private final Function0<MutableState<Boolean>> showInternalChrome;

    @NotNull
    private final Function0<MutableState<Boolean>> showVoiceModality;

    @NotNull
    private final Function0<MutableState<AlexaVoiceInvocationSource>> voiceInvocationSource;

    @NotNull
    private final Function0<MutableState<Float>> volumeLevel;

    @NotNull
    private final MutableState<AlexaUiState> _alexaUiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AlexaUiState.IDLE, null, 2, null);

    @NotNull
    private final MutableState<PersonalityAnimationInfo> _personalityAnimationInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final MutableState<Float> _volumeLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    @NotNull
    private final MutableState<AlexaVoiceInvocationSource> _voiceInvocationSource = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlexaUiState.values().length];
            try {
                iArr[AlexaUiState.LISTENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlexaUiState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoiceChromeState() {
        final int i = 0;
        this.alexaUiState = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i2 = i;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i2) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        final int i2 = 1;
        this.personalityAnimationInfoClosure = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i2;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        final int i3 = 2;
        this.volumeLevel = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i3;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        final int i4 = 3;
        this.voiceInvocationSource = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i4;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        Boolean bool = Boolean.FALSE;
        this._isChromeVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        final int i5 = 4;
        this.isChromeVisible = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i5;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        this._showVoiceModality = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        final int i6 = 5;
        this.showVoiceModality = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i6;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        this._showInternalChrome = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        final int i7 = 6;
        this.showInternalChrome = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i7;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
        this._isMuted = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        final int i8 = 7;
        this.isMuted = new Function0(this) { // from class: com.amazon.alexa.ra.chrome.model.VoiceChromeState$$ExternalSyntheticLambda0
            public final /* synthetic */ VoiceChromeState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                MutableState mutableState5;
                MutableState mutableState6;
                MutableState mutableState7;
                MutableState mutableState8;
                int i22 = i8;
                VoiceChromeState voiceChromeState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = voiceChromeState._alexaUiState;
                        return mutableState;
                    case 1:
                        mutableState2 = voiceChromeState._personalityAnimationInfo;
                        return mutableState2;
                    case 2:
                        mutableState3 = voiceChromeState._volumeLevel;
                        return mutableState3;
                    case 3:
                        mutableState4 = voiceChromeState._voiceInvocationSource;
                        return mutableState4;
                    case 4:
                        mutableState5 = voiceChromeState._isChromeVisible;
                        return mutableState5;
                    case 5:
                        mutableState6 = voiceChromeState._showVoiceModality;
                        return mutableState6;
                    case 6:
                        mutableState7 = voiceChromeState._showInternalChrome;
                        return mutableState7;
                    default:
                        mutableState8 = voiceChromeState._isMuted;
                        return mutableState8;
                }
            }
        };
    }

    @NotNull
    public final Function0<MutableState<AlexaUiState>> getAlexaUiState() {
        return this.alexaUiState;
    }

    @NotNull
    public final Function0<MutableState<PersonalityAnimationInfo>> getPersonalityAnimationInfoClosure() {
        return this.personalityAnimationInfoClosure;
    }

    @NotNull
    public final Function0<MutableState<Boolean>> getShowInternalChrome() {
        return this.showInternalChrome;
    }

    @NotNull
    public final Function0<MutableState<Boolean>> getShowVoiceModality() {
        return this.showVoiceModality;
    }

    @NotNull
    public final Function0<MutableState<AlexaVoiceInvocationSource>> getVoiceInvocationSource() {
        return this.voiceInvocationSource;
    }

    @NotNull
    public final Function0<MutableState<Float>> getVolumeLevel() {
        return this.volumeLevel;
    }

    @NotNull
    public final Function0<MutableState<Boolean>> isChromeVisible() {
        return this.isChromeVisible;
    }

    @NotNull
    public final Function0<MutableState<Boolean>> isMuted() {
        return this.isMuted;
    }

    public final void setAlexaUiState(@NotNull AlexaUiState alexaUiState) {
        alexaUiState.getClass();
        this._alexaUiState.setValue(alexaUiState);
        int i = WhenMappings.$EnumSwitchMapping$0[alexaUiState.ordinal()];
        if (i == 1) {
            this._showVoiceModality.setValue(Boolean.TRUE);
        } else if (i == 2) {
            this._showVoiceModality.setValue(Boolean.FALSE);
        }
        Boolean value = this._showVoiceModality.getValue();
        alexaUiState.toString();
        Objects.toString(value);
    }

    public final void setIsChromeVisible(boolean isChromeVisible) {
        this._isChromeVisible.setValue(Boolean.valueOf(isChromeVisible));
    }

    public final void setIsMuted(boolean isMuted) {
        this._isMuted.setValue(Boolean.valueOf(isMuted));
    }

    public final void setPersonalityAnimationInfo(@Nullable PersonalityAnimationInfo info) {
        this._personalityAnimationInfo.setValue(info);
    }

    public final void setShowInternalChrome(boolean show) {
        this._showInternalChrome.setValue(Boolean.valueOf(show));
    }

    public final void setVoiceInvocationSource(@Nullable AlexaVoiceInvocationSource source) {
        this._voiceInvocationSource.setValue(source);
    }

    public final void setVolumeLevel(float volumeLevel) {
        this._volumeLevel.setValue(Float.valueOf(volumeLevel));
    }
}
