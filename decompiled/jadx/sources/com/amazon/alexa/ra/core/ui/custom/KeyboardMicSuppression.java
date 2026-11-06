package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/KeyboardMicSuppression;", "", "<init>", "()V", "PRIVATE_IME_OPTIONS", "", "privateImeOptions", "micEnabled", "", "imeOptions", "", "current", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class KeyboardMicSuppression {
    public static final int $stable = 0;

    @NotNull
    public static final KeyboardMicSuppression INSTANCE = new KeyboardMicSuppression();

    @NotNull
    public static final String PRIVATE_IME_OPTIONS = "nm,com.google.android.inputmethod.latin.noMicrophoneKey";

    private KeyboardMicSuppression() {
    }

    public final int imeOptions(int current, boolean micEnabled) {
        return micEnabled ? (-16777217) & current : 16777216 | current;
    }

    @Nullable
    public final String privateImeOptions(boolean micEnabled) {
        if (micEnabled) {
            return null;
        }
        return PRIVATE_IME_OPTIONS;
    }
}
