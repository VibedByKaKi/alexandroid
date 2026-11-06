package com.amazon.alexa.ra.chrome.model;

import com.amazon.alexa.ra.chrome.model.ChromeTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"resolveChrome", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "Lcom/amazon/alexa/ra/chrome/model/VoiceChromeState;", "isLiveModeActive", "", "isMuted", "ui-chrome_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ChromeTargetKt {
    @NotNull
    public static final ChromeTarget resolveChrome(@NotNull VoiceChromeState voiceChromeState, boolean z, boolean z2) {
        voiceChromeState.getClass();
        boolean booleanValue = voiceChromeState.getShowInternalChrome().invoke().getValue().booleanValue();
        return (z && z2 && booleanValue) ? ChromeTarget.Mute.INSTANCE : (z && booleanValue) ? ChromeTarget.Live.INSTANCE : (z || !booleanValue) ? ChromeTarget.None.INSTANCE : ChromeTarget.Standard.INSTANCE;
    }
}
