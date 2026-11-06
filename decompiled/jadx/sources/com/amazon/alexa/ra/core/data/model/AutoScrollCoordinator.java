package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/AutoScrollCoordinator;", "", "<init>", "()V", "autoScrollEnabled", "", "shouldScroll", "useCase", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "onManualScrollDetected", "", "onAlexaUiStateChanged", "newState", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "voiceModality", "isAutoScrollEnabled", "()Z", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AutoScrollCoordinator {

    @NotNull
    private static final String TAG = "AutoScrollCoordinator";
    private boolean autoScrollEnabled = true;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AutoScrollPolicy.values().length];
            try {
                iArr[AutoScrollPolicy.FORCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoScrollPolicy.HONOR_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlexaUiState.values().length];
            try {
                iArr2[AlexaUiState.LISTENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AlexaUiState.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: isAutoScrollEnabled, reason: from getter */
    public final boolean getAutoScrollEnabled() {
        return this.autoScrollEnabled;
    }

    public final void onAlexaUiStateChanged(@NotNull AlexaUiState newState, boolean voiceModality) {
        newState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[newState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.autoScrollEnabled = true;
        } else if (voiceModality) {
            this.autoScrollEnabled = true;
        }
    }

    public final void onManualScrollDetected() {
        this.autoScrollEnabled = false;
    }

    public final boolean shouldScroll(@NotNull ScrollUseCase useCase) {
        useCase.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[useCase.getPolicy().ordinal()];
        if (i == 1) {
            useCase.toString();
            return true;
        }
        if (i == 2) {
            useCase.toString();
            return this.autoScrollEnabled;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return false;
    }
}
