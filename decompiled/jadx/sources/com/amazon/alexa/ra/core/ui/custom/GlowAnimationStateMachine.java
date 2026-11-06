package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/GlowAnimationStateMachine;", "", "<init>", "()V", "computeNextStateForAlexaTransition", "Lcom/amazon/alexa/ra/core/ui/custom/GlowAnimationState;", "currentState", "currentAlexaState", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "previousAlexaState", "computeNextStateForAnimationComplete", "computeExpectedTransition", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_UI_STATE, "isAnimationComplete", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class GlowAnimationStateMachine {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GlowAnimationState.values().length];
            try {
                iArr[GlowAnimationState.INGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GlowAnimationState.EGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ GlowAnimationState computeExpectedTransition$default(GlowAnimationStateMachine glowAnimationStateMachine, GlowAnimationState glowAnimationState, AlexaUiState alexaUiState, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return glowAnimationStateMachine.computeExpectedTransition(glowAnimationState, alexaUiState, z);
    }

    @NotNull
    public final GlowAnimationState computeExpectedTransition(@NotNull GlowAnimationState currentState, @NotNull AlexaUiState alexaUiState, boolean isAnimationComplete) {
        currentState.getClass();
        alexaUiState.getClass();
        GlowAnimationState glowAnimationState = GlowAnimationState.INGRESS;
        if (currentState == glowAnimationState && isAnimationComplete) {
            return GlowAnimationState.MODULATION;
        }
        if (currentState == glowAnimationState && alexaUiState == AlexaUiState.LISTENING) {
            return GlowAnimationState.MODULATION;
        }
        if (currentState == GlowAnimationState.EGRESS && alexaUiState == AlexaUiState.LISTENING) {
            return GlowAnimationState.MODULATION;
        }
        GlowAnimationState glowAnimationState2 = GlowAnimationState.MODULATION;
        return currentState == glowAnimationState2 ? glowAnimationState2 : currentState;
    }

    @NotNull
    public final GlowAnimationState computeNextStateForAlexaTransition(@NotNull GlowAnimationState currentState, @NotNull AlexaUiState currentAlexaState, @NotNull AlexaUiState previousAlexaState) {
        currentState.getClass();
        currentAlexaState.getClass();
        previousAlexaState.getClass();
        return (currentAlexaState == AlexaUiState.LISTENING && (currentState == GlowAnimationState.EGRESS || currentState == GlowAnimationState.INGRESS)) ? GlowAnimationState.MODULATION : currentState;
    }

    @NotNull
    public final GlowAnimationState computeNextStateForAnimationComplete(@NotNull GlowAnimationState currentState) {
        currentState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[currentState.ordinal()];
        return i != 1 ? i != 2 ? currentState : GlowAnimationState.EGRESS : GlowAnimationState.MODULATION;
    }
}
