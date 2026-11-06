package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "", "<init>", "()V", "Idle", "Playing", "Paused", "Stopped", "Finished", "BufferUnderrun", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Finished;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Idle;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Paused;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Playing;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Stopped;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExternalMediaPlayerState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BufferUnderrun extends ExternalMediaPlayerState {

        @NotNull
        public static final BufferUnderrun INSTANCE = new BufferUnderrun();

        private BufferUnderrun() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BufferUnderrun);
        }

        public int hashCode() {
            return -1210289037;
        }

        @NotNull
        public String toString() {
            return "BufferUnderrun";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Finished;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Finished extends ExternalMediaPlayerState {

        @NotNull
        public static final Finished INSTANCE = new Finished();

        private Finished() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Finished);
        }

        public int hashCode() {
            return -15655982;
        }

        @NotNull
        public String toString() {
            return "Finished";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Idle;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends ExternalMediaPlayerState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 94260020;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Playing;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "mediaItem", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "offsetInMilliseconds", "", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;J)V", "getMediaItem", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "getOffsetInMilliseconds", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "component2", "copy", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Playing extends ExternalMediaPlayerState {

        @NotNull
        private final MediaItem mediaItem;
        private final long offsetInMilliseconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Playing(@NotNull MediaItem mediaItem, long j) {
            super(null);
            mediaItem.getClass();
            this.mediaItem = mediaItem;
            this.offsetInMilliseconds = j;
        }

        public static /* synthetic */ Playing copy$default(Playing playing, MediaItem mediaItem, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaItem = playing.mediaItem;
            }
            if ((i & 2) != 0) {
                j = playing.offsetInMilliseconds;
            }
            return playing.copy(mediaItem, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        /* renamed from: component2, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final Playing copy(@NotNull MediaItem mediaItem, long offsetInMilliseconds) {
            mediaItem.getClass();
            return new Playing(mediaItem, offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Playing) {
                return Intrinsics.areEqual(this.mediaItem, ((Playing) other).mediaItem);
            }
            return false;
        }

        @NotNull
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return this.mediaItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "Playing(mediaItem=" + this.mediaItem + ", offsetInMilliseconds=" + this.offsetInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ ExternalMediaPlayerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExternalMediaPlayerState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Paused;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "mediaItem", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "offsetInMilliseconds", "", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;J)V", "getMediaItem", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "getOffsetInMilliseconds", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "component2", "copy", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Paused extends ExternalMediaPlayerState {

        @Nullable
        private final MediaItem mediaItem;
        private final long offsetInMilliseconds;

        public /* synthetic */ Paused(MediaItem mediaItem, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mediaItem, j);
        }

        public static /* synthetic */ Paused copy$default(Paused paused, MediaItem mediaItem, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaItem = paused.mediaItem;
            }
            if ((i & 2) != 0) {
                j = paused.offsetInMilliseconds;
            }
            return paused.copy(mediaItem, j);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        /* renamed from: component2, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final Paused copy(@Nullable MediaItem mediaItem, long offsetInMilliseconds) {
            return new Paused(mediaItem, offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return other instanceof Paused;
        }

        @Nullable
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return Reflection.getOrCreateKotlinClass(Paused.class).hashCode();
        }

        @NotNull
        public String toString() {
            return "Paused(mediaItem=" + this.mediaItem + ", offsetInMilliseconds=" + this.offsetInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public Paused(@Nullable MediaItem mediaItem, long j) {
            super(null);
            this.mediaItem = mediaItem;
            this.offsetInMilliseconds = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState$Stopped;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerState;", "mediaItem", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "offsetInMilliseconds", "", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;J)V", "getMediaItem", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/MediaItem;", "getOffsetInMilliseconds", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "component2", "copy", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends ExternalMediaPlayerState {

        @Nullable
        private final MediaItem mediaItem;
        private final long offsetInMilliseconds;

        public /* synthetic */ Stopped(MediaItem mediaItem, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mediaItem, j);
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, MediaItem mediaItem, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaItem = stopped.mediaItem;
            }
            if ((i & 2) != 0) {
                j = stopped.offsetInMilliseconds;
            }
            return stopped.copy(mediaItem, j);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        /* renamed from: component2, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final Stopped copy(@Nullable MediaItem mediaItem, long offsetInMilliseconds) {
            return new Stopped(mediaItem, offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return other instanceof Stopped;
        }

        @Nullable
        public final MediaItem getMediaItem() {
            return this.mediaItem;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return Reflection.getOrCreateKotlinClass(Stopped.class).hashCode();
        }

        @NotNull
        public String toString() {
            return "Stopped(mediaItem=" + this.mediaItem + ", offsetInMilliseconds=" + this.offsetInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public Stopped(@Nullable MediaItem mediaItem, long j) {
            super(null);
            this.mediaItem = mediaItem;
            this.offsetInMilliseconds = j;
        }
    }
}
