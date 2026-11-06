package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobile.assistant.capabilities.videoexperience.VideoExperienceCapabilityAgent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "", "<init>", "()V", "RepeatMode", "FavoriteStatus", VideoExperienceCapabilityAgent.PLAY_DIRECTIVE, "Stop", "Pause", "Next", "Previous", "Shuffle", "Repeat", "Rewinding", "FastForwarding", "Favorite", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FastForwarding;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Favorite;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Next;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Pause;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Play;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Previous;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Repeat;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Rewinding;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Shuffle;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Stop;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PlaybackControlAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FastForwarding;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FastForwarding extends PlaybackControlAction {

        @NotNull
        public static final FastForwarding INSTANCE = new FastForwarding();

        private FastForwarding() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FastForwarding);
        }

        public int hashCode() {
            return -541027258;
        }

        @NotNull
        public String toString() {
            return "FastForwarding";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Favorite;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "status", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FavoriteStatus;", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FavoriteStatus;)V", "getStatus", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FavoriteStatus;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Favorite extends PlaybackControlAction {

        @NotNull
        private final FavoriteStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Favorite(@NotNull FavoriteStatus favoriteStatus) {
            super(null);
            favoriteStatus.getClass();
            this.status = favoriteStatus;
        }

        public static /* synthetic */ Favorite copy$default(Favorite favorite, FavoriteStatus favoriteStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                favoriteStatus = favorite.status;
            }
            return favorite.copy(favoriteStatus);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FavoriteStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final Favorite copy(@NotNull FavoriteStatus status) {
            status.getClass();
            return new Favorite(status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Favorite) && this.status == ((Favorite) other).status;
        }

        @NotNull
        public final FavoriteStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "Favorite(status=" + this.status + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$FavoriteStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_RATED", "FAVORITED", "UNFAVORITED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FavoriteStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FavoriteStatus[] $VALUES;
        public static final FavoriteStatus NOT_RATED = new FavoriteStatus("NOT_RATED", 0);
        public static final FavoriteStatus FAVORITED = new FavoriteStatus("FAVORITED", 1);
        public static final FavoriteStatus UNFAVORITED = new FavoriteStatus("UNFAVORITED", 2);

        private static final /* synthetic */ FavoriteStatus[] $values() {
            return new FavoriteStatus[]{NOT_RATED, FAVORITED, UNFAVORITED};
        }

        static {
            FavoriteStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FavoriteStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries<FavoriteStatus> getEntries() {
            return $ENTRIES;
        }

        public static FavoriteStatus valueOf(String str) {
            return (FavoriteStatus) Enum.valueOf(FavoriteStatus.class, str);
        }

        public static FavoriteStatus[] values() {
            return (FavoriteStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Next;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Next extends PlaybackControlAction {

        @NotNull
        public static final Next INSTANCE = new Next();

        private Next() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Next);
        }

        public int hashCode() {
            return 905430784;
        }

        @NotNull
        public String toString() {
            return "Next";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Pause;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pause extends PlaybackControlAction {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pause);
        }

        public int hashCode() {
            return -1994691703;
        }

        @NotNull
        public String toString() {
            return "Pause";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Play;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Play extends PlaybackControlAction {

        @NotNull
        public static final Play INSTANCE = new Play();

        private Play() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Play);
        }

        public int hashCode() {
            return 905496385;
        }

        @NotNull
        public String toString() {
            return VideoExperienceCapabilityAgent.PLAY_DIRECTIVE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Previous;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Previous extends PlaybackControlAction {

        @NotNull
        public static final Previous INSTANCE = new Previous();

        private Previous() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Previous);
        }

        public int hashCode() {
            return -1240389500;
        }

        @NotNull
        public String toString() {
            return "Previous";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Repeat;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "mode", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$RepeatMode;", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$RepeatMode;)V", "getMode", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$RepeatMode;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Repeat extends PlaybackControlAction {

        @NotNull
        private final RepeatMode mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Repeat(@NotNull RepeatMode repeatMode) {
            super(null);
            repeatMode.getClass();
            this.mode = repeatMode;
        }

        public static /* synthetic */ Repeat copy$default(Repeat repeat, RepeatMode repeatMode, int i, Object obj) {
            if ((i & 1) != 0) {
                repeatMode = repeat.mode;
            }
            return repeat.copy(repeatMode);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RepeatMode getMode() {
            return this.mode;
        }

        @NotNull
        public final Repeat copy(@NotNull RepeatMode mode) {
            mode.getClass();
            return new Repeat(mode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Repeat) && this.mode == ((Repeat) other).mode;
        }

        @NotNull
        public final RepeatMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        @NotNull
        public String toString() {
            return "Repeat(mode=" + this.mode + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$RepeatMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ONE", "ALL", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RepeatMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RepeatMode[] $VALUES;
        public static final RepeatMode NONE = new RepeatMode("NONE", 0);
        public static final RepeatMode ONE = new RepeatMode("ONE", 1);
        public static final RepeatMode ALL = new RepeatMode("ALL", 2);

        private static final /* synthetic */ RepeatMode[] $values() {
            return new RepeatMode[]{NONE, ONE, ALL};
        }

        static {
            RepeatMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private RepeatMode(String str, int i) {
        }

        @NotNull
        public static EnumEntries<RepeatMode> getEntries() {
            return $ENTRIES;
        }

        public static RepeatMode valueOf(String str) {
            return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        public static RepeatMode[] values() {
            return (RepeatMode[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Rewinding;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rewinding extends PlaybackControlAction {

        @NotNull
        public static final Rewinding INSTANCE = new Rewinding();

        private Rewinding() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Rewinding);
        }

        public int hashCode() {
            return -1871711910;
        }

        @NotNull
        public String toString() {
            return "Rewinding";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Shuffle;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Shuffle extends PlaybackControlAction {
        private final boolean enabled;

        public Shuffle(boolean z) {
            super(null);
            this.enabled = z;
        }

        public static /* synthetic */ Shuffle copy$default(Shuffle shuffle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = shuffle.enabled;
            }
            return shuffle.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final Shuffle copy(boolean enabled) {
            return new Shuffle(enabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Shuffle) && this.enabled == ((Shuffle) other).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("Shuffle(enabled=", MarkdownConstants.RIGHT_PARENTHESIS, this.enabled);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction$Stop;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stop extends PlaybackControlAction {

        @NotNull
        public static final Stop INSTANCE = new Stop();

        private Stop() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Stop);
        }

        public int hashCode() {
            return 905593871;
        }

        @NotNull
        public String toString() {
            return "Stop";
        }
    }

    public /* synthetic */ PlaybackControlAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PlaybackControlAction() {
    }
}
