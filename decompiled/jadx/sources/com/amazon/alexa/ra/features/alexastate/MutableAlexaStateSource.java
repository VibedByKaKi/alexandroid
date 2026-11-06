package com.amazon.alexa.ra.features.alexastate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaStateExtras;
import com.amazon.alexa.api.compat.model.AlexaStateV2;
import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import com.amazon.alexa.ra.chrome.model.AlexaVoiceInvocationSource;
import com.facebook.react.modules.appstate.AppStateModule;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/amazon/alexa/ra/features/alexastate/MutableAlexaStateSource;", "Lcom/amazon/alexa/ra/chrome/features/alexastate/AlexaStateSourceApi;", "clearPersonality", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "volumeData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_UI_STATE, "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "alexaVoiceInvocationSource", "Lcom/amazon/alexa/ra/chrome/model/AlexaVoiceInvocationSource;", "setAlexaState", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_STATE, "Lcom/amazon/alexa/api/compat/model/AlexaStateV2;", "alexaStateExtras", "Lcom/amazon/alexa/api/compat/model/AlexaStateExtras;", "setVolumeLevel", SystemUiChromeStateObserver.CONTENT_KEY_VOLUME_LEVEL, "getAlexaUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getAlexaVoiceInvocationSource", "getVolumeLevel", "setScreenAnalysisActive", AppStateModule.APP_STATE_ACTIVE, "", "emitAlexaStateUpdates", "listening", "processing", "speaking", "error", "emitAlexaInvocationSource", "wakeWord", "start", "stop", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MutableAlexaStateSource implements AlexaStateSourceApi {

    @NotNull
    private final MutableStateFlow<AlexaUiState> alexaUiState;

    @NotNull
    private final MutableStateFlow<AlexaVoiceInvocationSource> alexaVoiceInvocationSource;

    @NotNull
    private final Function0<Unit> clearPersonality;

    @NotNull
    private final MutableStateFlow<Float> volumeData;
    public static final int $stable = 8;

    @NotNull
    private static final List<AlexaStateV2> ALEXA_LISTENING_STATES = CollectionsKt.listOf((Object[]) new AlexaStateV2[]{AlexaStateV2.LISTENING, AlexaStateV2.PREPARING_TO_LISTEN, AlexaStateV2.FINISHING_LISTENING});

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlexaStateV2.values().length];
            try {
                iArr[AlexaStateV2.LISTENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlexaStateV2.PREPARING_TO_LISTEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlexaStateV2.FINISHING_LISTENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlexaStateV2.SPEAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AlexaStateV2.THINKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AlexaStateV2.IDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AlexaStateV2.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AlexaStateV2.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MutableAlexaStateSource(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.clearPersonality = function0;
        this.volumeData = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.alexaUiState = StateFlowKt.MutableStateFlow(AlexaUiState.IDLE);
        this.alexaVoiceInvocationSource = StateFlowKt.MutableStateFlow(null);
    }

    private final void emitAlexaInvocationSource(boolean wakeWord) {
        MutableStateFlow<AlexaVoiceInvocationSource> mutableStateFlow = this.alexaVoiceInvocationSource;
        if (wakeWord) {
            mutableStateFlow.setValue(AlexaVoiceInvocationSource.WAKE_WORD);
        } else {
            mutableStateFlow.setValue(null);
        }
    }

    private final void emitAlexaStateUpdates(boolean listening, boolean processing, boolean speaking, boolean error) {
        this.alexaUiState.setValue(listening ? AlexaUiState.LISTENING : processing ? AlexaUiState.PROCESSING : speaking ? AlexaUiState.SPEAKING : error ? AlexaUiState.ERROR : AlexaUiState.IDLE);
    }

    public static /* synthetic */ void emitAlexaStateUpdates$default(MutableAlexaStateSource mutableAlexaStateSource, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        mutableAlexaStateSource.emitAlexaStateUpdates(z, z2, z3, z4);
    }

    public static /* synthetic */ void setAlexaState$default(MutableAlexaStateSource mutableAlexaStateSource, AlexaStateV2 alexaStateV2, AlexaStateExtras alexaStateExtras, int i, Object obj) {
        if ((i & 2) != 0) {
            alexaStateExtras = null;
        }
        mutableAlexaStateSource.setAlexaState(alexaStateV2, alexaStateExtras);
    }

    @Override // com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi
    @NotNull
    public StateFlow<AlexaUiState> getAlexaUiState() {
        return FlowKt.asStateFlow(this.alexaUiState);
    }

    @Override // com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi
    @NotNull
    public StateFlow<AlexaVoiceInvocationSource> getAlexaVoiceInvocationSource() {
        return FlowKt.asStateFlow(this.alexaVoiceInvocationSource);
    }

    @Override // com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi
    @NotNull
    public StateFlow<Float> getVolumeLevel() {
        return FlowKt.asStateFlow(this.volumeData);
    }

    public final void setAlexaState(@NotNull AlexaStateV2 alexaState, @Nullable AlexaStateExtras alexaStateExtras) {
        alexaState.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[alexaState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                emitAlexaStateUpdates$default(this, true, false, false, false, 14, null);
                break;
            case 4:
                emitAlexaStateUpdates$default(this, false, false, true, false, 11, null);
                break;
            case 5:
                if (this.alexaUiState.getValue() != AlexaUiState.SCREEN_ANALYSIS) {
                    emitAlexaStateUpdates$default(this, false, true, false, false, 13, null);
                    break;
                }
                break;
            case 6:
                emitAlexaStateUpdates(false, false, false, false);
                this.clearPersonality.invoke();
                break;
            case 7:
                emitAlexaStateUpdates$default(this, false, false, false, true, 7, null);
                break;
            case 8:
                break;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
        }
        if (ALEXA_LISTENING_STATES.contains(alexaState)) {
            if ((alexaStateExtras != null ? alexaStateExtras.getWakeword() : null) != null) {
                emitAlexaInvocationSource(true);
                return;
            }
        }
        emitAlexaInvocationSource(false);
    }

    public final void setScreenAnalysisActive(boolean active) {
        if (active) {
            this.alexaUiState.setValue(AlexaUiState.SCREEN_ANALYSIS);
        }
    }

    public final void setVolumeLevel(float volumeLevel) {
        this.volumeData.setValue(Float.valueOf(volumeLevel));
    }

    @Override // com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi
    public void start() {
    }

    @Override // com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi
    public void stop() {
    }
}
