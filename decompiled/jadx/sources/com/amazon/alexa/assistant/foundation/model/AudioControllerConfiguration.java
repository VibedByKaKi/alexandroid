package com.amazon.alexa.assistant.foundation.model;

import android.media.AudioAttributes;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.session.sessionEvents.StateChangeEventTypes;
import com.facebook.hermes.intl.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0004()*+BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006,"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "", Constants.COLLATION_OPTION_USAGE, "", "contentType", "focusGain", "acceptsDelayedFocusGain", "", "willPauseWhenDucked", "allowBluetooth", "useSpeakerphone", "useCommunicationMode", "<init>", "(IIIZZZZZ)V", "getUsage", "()I", "getContentType", "getFocusGain", "getAcceptsDelayedFocusGain", "()Z", "getWillPauseWhenDucked", "getAllowBluetooth", "getUseSpeakerphone", "getUseCommunicationMode", "toAudioAttributes", "Landroid/media/AudioAttributes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "InterruptOthers", "MixWithOthers", "DuckOthers", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AudioControllerConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean acceptsDelayedFocusGain;
    private final boolean allowBluetooth;
    private final int contentType;
    private final int focusGain;
    private final int usage;
    private final boolean useCommunicationMode;
    private final boolean useSpeakerphone;
    private final boolean willPauseWhenDucked;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration$DuckOthers;", "", "<init>", "()V", "playAndRecord", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "getPlayAndRecord", "()Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", StateChangeEventTypes.PLAYBACK_STATE_CHANGE, "getPlayback", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DuckOthers {

        @NotNull
        public static final DuckOthers INSTANCE = new DuckOthers();

        @NotNull
        private static final AudioControllerConfiguration playAndRecord;

        @NotNull
        private static final AudioControllerConfiguration playback;

        static {
            int i = 1;
            boolean z = true;
            boolean z2 = false;
            playAndRecord = new AudioControllerConfiguration(2, i, 3, true, false, true, z, z2, 128, null);
            playback = new AudioControllerConfiguration(i, 2, 3, true, false, z, z2, false, 128, null);
        }

        private DuckOthers() {
        }

        @NotNull
        public final AudioControllerConfiguration getPlayAndRecord() {
            return playAndRecord;
        }

        @NotNull
        public final AudioControllerConfiguration getPlayback() {
            return playback;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration$InterruptOthers;", "", "<init>", "()V", "playAndRecord", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "getPlayAndRecord", "()Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", StateChangeEventTypes.PLAYBACK_STATE_CHANGE, "getPlayback", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InterruptOthers {

        @NotNull
        public static final InterruptOthers INSTANCE = new InterruptOthers();

        @NotNull
        private static final AudioControllerConfiguration playAndRecord;

        @NotNull
        private static final AudioControllerConfiguration playback;

        static {
            int i = 1;
            boolean z = true;
            boolean z2 = false;
            playAndRecord = new AudioControllerConfiguration(2, i, 1, false, true, true, z, z2, 128, null);
            playback = new AudioControllerConfiguration(i, 2, 1, false, false, z, z2, false, 128, null);
        }

        private InterruptOthers() {
        }

        @NotNull
        public final AudioControllerConfiguration getPlayAndRecord() {
            return playAndRecord;
        }

        @NotNull
        public final AudioControllerConfiguration getPlayback() {
            return playback;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration$MixWithOthers;", "", "<init>", "()V", "playAndRecord", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "getPlayAndRecord", "()Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", StateChangeEventTypes.PLAYBACK_STATE_CHANGE, "getPlayback", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MixWithOthers {

        @NotNull
        public static final MixWithOthers INSTANCE = new MixWithOthers();

        @NotNull
        private static final AudioControllerConfiguration playAndRecord;

        @NotNull
        private static final AudioControllerConfiguration playback;

        static {
            int i = 1;
            boolean z = true;
            boolean z2 = false;
            playAndRecord = new AudioControllerConfiguration(2, i, 3, true, false, true, z, z2, 128, null);
            playback = new AudioControllerConfiguration(i, 2, 3, true, false, z, z2, false, 128, null);
        }

        private MixWithOthers() {
        }

        @NotNull
        public final AudioControllerConfiguration getPlayAndRecord() {
            return playAndRecord;
        }

        @NotNull
        public final AudioControllerConfiguration getPlayback() {
            return playback;
        }
    }

    public /* synthetic */ AudioControllerConfiguration(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? true : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? false : z5);
    }

    public static /* synthetic */ AudioControllerConfiguration copy$default(AudioControllerConfiguration audioControllerConfiguration, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = audioControllerConfiguration.usage;
        }
        if ((i4 & 2) != 0) {
            i2 = audioControllerConfiguration.contentType;
        }
        if ((i4 & 4) != 0) {
            i3 = audioControllerConfiguration.focusGain;
        }
        if ((i4 & 8) != 0) {
            z = audioControllerConfiguration.acceptsDelayedFocusGain;
        }
        if ((i4 & 16) != 0) {
            z2 = audioControllerConfiguration.willPauseWhenDucked;
        }
        if ((i4 & 32) != 0) {
            z3 = audioControllerConfiguration.allowBluetooth;
        }
        if ((i4 & 64) != 0) {
            z4 = audioControllerConfiguration.useSpeakerphone;
        }
        if ((i4 & 128) != 0) {
            z5 = audioControllerConfiguration.useCommunicationMode;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z2;
        boolean z9 = z3;
        return audioControllerConfiguration.copy(i, i2, i3, z, z8, z9, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUsage() {
        return this.usage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFocusGain() {
        return this.focusGain;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAcceptsDelayedFocusGain() {
        return this.acceptsDelayedFocusGain;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getWillPauseWhenDucked() {
        return this.willPauseWhenDucked;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAllowBluetooth() {
        return this.allowBluetooth;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getUseSpeakerphone() {
        return this.useSpeakerphone;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUseCommunicationMode() {
        return this.useCommunicationMode;
    }

    @NotNull
    public final AudioControllerConfiguration copy(int usage, int contentType, int focusGain, boolean acceptsDelayedFocusGain, boolean willPauseWhenDucked, boolean allowBluetooth, boolean useSpeakerphone, boolean useCommunicationMode) {
        return new AudioControllerConfiguration(usage, contentType, focusGain, acceptsDelayedFocusGain, willPauseWhenDucked, allowBluetooth, useSpeakerphone, useCommunicationMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioControllerConfiguration)) {
            return false;
        }
        AudioControllerConfiguration audioControllerConfiguration = (AudioControllerConfiguration) other;
        return this.usage == audioControllerConfiguration.usage && this.contentType == audioControllerConfiguration.contentType && this.focusGain == audioControllerConfiguration.focusGain && this.acceptsDelayedFocusGain == audioControllerConfiguration.acceptsDelayedFocusGain && this.willPauseWhenDucked == audioControllerConfiguration.willPauseWhenDucked && this.allowBluetooth == audioControllerConfiguration.allowBluetooth && this.useSpeakerphone == audioControllerConfiguration.useSpeakerphone && this.useCommunicationMode == audioControllerConfiguration.useCommunicationMode;
    }

    public final boolean getAcceptsDelayedFocusGain() {
        return this.acceptsDelayedFocusGain;
    }

    public final boolean getAllowBluetooth() {
        return this.allowBluetooth;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getFocusGain() {
        return this.focusGain;
    }

    public final int getUsage() {
        return this.usage;
    }

    public final boolean getUseCommunicationMode() {
        return this.useCommunicationMode;
    }

    public final boolean getUseSpeakerphone() {
        return this.useSpeakerphone;
    }

    public final boolean getWillPauseWhenDucked() {
        return this.willPauseWhenDucked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useCommunicationMode) + DoubleList$$ExternalSyntheticOutline0.m(this.useSpeakerphone, DoubleList$$ExternalSyntheticOutline0.m(this.allowBluetooth, DoubleList$$ExternalSyntheticOutline0.m(this.willPauseWhenDucked, DoubleList$$ExternalSyntheticOutline0.m(this.acceptsDelayedFocusGain, ArcMode$$ExternalSyntheticOutline0.m(this.focusGain, ArcMode$$ExternalSyntheticOutline0.m(this.contentType, Integer.hashCode(this.usage) * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final AudioAttributes toAudioAttributes() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.usage).setContentType(this.contentType).build();
        build.getClass();
        return build;
    }

    @NotNull
    public String toString() {
        int i = this.usage;
        int i2 = this.contentType;
        int i3 = this.focusGain;
        boolean z = this.acceptsDelayedFocusGain;
        boolean z2 = this.willPauseWhenDucked;
        boolean z3 = this.allowBluetooth;
        boolean z4 = this.useSpeakerphone;
        boolean z5 = this.useCommunicationMode;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "AudioControllerConfiguration(usage=", ", contentType=", ", focusGain=");
        m29m.append(i3);
        m29m.append(", acceptsDelayedFocusGain=");
        m29m.append(z);
        m29m.append(", willPauseWhenDucked=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m29m, z2, ", allowBluetooth=", z3, ", useSpeakerphone=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(m29m, z4, ", useCommunicationMode=", z5, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0007J\n\u0010\b\u001a\u00020\u0005*\u00020\u0006J\n\u0010\t\u001a\u00020\u0005*\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration$Companion;", "", "<init>", "()V", "isVoiceCommunication", "", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "isMixesWithOthers", "isDucksOthers", "isInterruptsOthers", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isDucksOthers(@NotNull AudioControllerConfiguration audioControllerConfiguration) {
            audioControllerConfiguration.getClass();
            return audioControllerConfiguration.getFocusGain() == 3;
        }

        public final boolean isInterruptsOthers(@NotNull AudioControllerConfiguration audioControllerConfiguration) {
            audioControllerConfiguration.getClass();
            return audioControllerConfiguration.getFocusGain() == 1;
        }

        @Deprecated(message = "Indistinguishable from isDucksOthers() on Android; both test GAIN_TRANSIENT_MAY_DUCK.", replaceWith = @ReplaceWith(expression = "isDucksOthers()", imports = {}))
        public final boolean isMixesWithOthers(@NotNull AudioControllerConfiguration audioControllerConfiguration) {
            audioControllerConfiguration.getClass();
            return isDucksOthers(audioControllerConfiguration);
        }

        public final boolean isVoiceCommunication(@NotNull AudioControllerConfiguration audioControllerConfiguration) {
            audioControllerConfiguration.getClass();
            return audioControllerConfiguration.getUsage() == 2;
        }

        private Companion() {
        }
    }

    public AudioControllerConfiguration(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.usage = i;
        this.contentType = i2;
        this.focusGain = i3;
        this.acceptsDelayedFocusGain = z;
        this.willPauseWhenDucked = z2;
        this.allowBluetooth = z3;
        this.useSpeakerphone = z4;
        this.useCommunicationMode = z5;
    }

    public AudioControllerConfiguration() {
        this(0, 0, 0, false, false, false, false, false, 255, null);
    }
}
