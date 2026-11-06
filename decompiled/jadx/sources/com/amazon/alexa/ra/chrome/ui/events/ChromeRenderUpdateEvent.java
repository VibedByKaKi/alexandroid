package com.amazon.alexa.ra.chrome.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "", "<init>", "()V", "OnPersonalityAnimationRenderStart", "OnListeningChromeRenderStart", "OnVoiceChromeShown", "OnVoiceChromeHidden", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public class ChromeRenderUpdateEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent$OnListeningChromeRenderStart;", "Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "chromeRenderStartTime", "", "<init>", "(J)V", "getChromeRenderStartTime", "()J", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnListeningChromeRenderStart extends ChromeRenderUpdateEvent {
        public static final int $stable = 0;
        private final long chromeRenderStartTime;

        public OnListeningChromeRenderStart(long j) {
            this.chromeRenderStartTime = j;
        }

        public final long getChromeRenderStartTime() {
            return this.chromeRenderStartTime;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent$OnPersonalityAnimationRenderStart;", "Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "personalityName", "", "animationStartTime", "", "<init>", "(Ljava/lang/String;J)V", "getPersonalityName", "()Ljava/lang/String;", "getAnimationStartTime", "()J", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPersonalityAnimationRenderStart extends ChromeRenderUpdateEvent {
        public static final int $stable = 0;
        private final long animationStartTime;

        @NotNull
        private final String personalityName;

        public OnPersonalityAnimationRenderStart(@NotNull String str, long j) {
            str.getClass();
            this.personalityName = str;
            this.animationStartTime = j;
        }

        public final long getAnimationStartTime() {
            return this.animationStartTime;
        }

        @NotNull
        public final String getPersonalityName() {
            return this.personalityName;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent$OnVoiceChromeHidden;", "Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnVoiceChromeHidden extends ChromeRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnVoiceChromeHidden INSTANCE = new OnVoiceChromeHidden();

        private OnVoiceChromeHidden() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent$OnVoiceChromeShown;", "Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnVoiceChromeShown extends ChromeRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnVoiceChromeShown INSTANCE = new OnVoiceChromeShown();

        private OnVoiceChromeShown() {
        }
    }
}
