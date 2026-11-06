package com.amazon.alexa.assistant.foundation.audio;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "", "<init>", "()V", "Idle", "Queued", "Dequeued", "Ready", "Playing", "Finished", "NearlyFinished", "Paused", "Stopped", "BufferUnderrun", UploadWorker.FAILED_PREFIX, "MediaServiceWasReset", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Dequeued;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Failed;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Finished;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Idle;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$MediaServiceWasReset;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$NearlyFinished;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Paused;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Playing;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Queued;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Ready;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Stopped;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AudioPlaybackTaskState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BufferUnderrun extends AudioPlaybackTaskState {

        @NotNull
        public static final BufferUnderrun INSTANCE = new BufferUnderrun();

        private BufferUnderrun() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BufferUnderrun);
        }

        public int hashCode() {
            return 1239253675;
        }

        @NotNull
        public String toString() {
            return "BufferUnderrun";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Dequeued;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dequeued extends AudioPlaybackTaskState {

        @NotNull
        public static final Dequeued INSTANCE = new Dequeued();

        private Dequeued() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Dequeued);
        }

        public int hashCode() {
            return -1811061556;
        }

        @NotNull
        public String toString() {
            return "Dequeued";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Failed;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "offsetInMilliseconds", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(JLjava/lang/Exception;)V", "getOffsetInMilliseconds", "()J", "getError", "()Ljava/lang/Exception;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends AudioPlaybackTaskState {

        @NotNull
        private final Exception error;
        private final long offsetInMilliseconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(long j, @NotNull Exception exc) {
            super(null);
            exc.getClass();
            this.offsetInMilliseconds = j;
            this.error = exc;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, long j, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                j = failed.offsetInMilliseconds;
            }
            if ((i & 2) != 0) {
                exc = failed.error;
            }
            return failed.copy(j, exc);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        @NotNull
        public final Failed copy(long offsetInMilliseconds, @NotNull Exception error) {
            error.getClass();
            return new Failed(offsetInMilliseconds, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return this.offsetInMilliseconds == failed.offsetInMilliseconds && Intrinsics.areEqual(this.error, failed.error);
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return this.error.hashCode() + (Long.hashCode(this.offsetInMilliseconds) * 31);
        }

        @NotNull
        public String toString() {
            return "Failed(offsetInMilliseconds=" + this.offsetInMilliseconds + ", error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Finished;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Finished extends AudioPlaybackTaskState {

        @NotNull
        public static final Finished INSTANCE = new Finished();

        private Finished() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Finished);
        }

        public int hashCode() {
            return 833041418;
        }

        @NotNull
        public String toString() {
            return "Finished";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Idle;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends AudioPlaybackTaskState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 1673084780;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$MediaServiceWasReset;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "offsetInMilliseconds", "", "<init>", "(J)V", "getOffsetInMilliseconds", "()J", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MediaServiceWasReset extends AudioPlaybackTaskState {
        private final long offsetInMilliseconds;

        public MediaServiceWasReset(long j) {
            super(null);
            this.offsetInMilliseconds = j;
        }

        public static /* synthetic */ MediaServiceWasReset copy$default(MediaServiceWasReset mediaServiceWasReset, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mediaServiceWasReset.offsetInMilliseconds;
            }
            return mediaServiceWasReset.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final MediaServiceWasReset copy(long offsetInMilliseconds) {
            return new MediaServiceWasReset(offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MediaServiceWasReset) && this.offsetInMilliseconds == ((MediaServiceWasReset) other).offsetInMilliseconds;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return Long.hashCode(this.offsetInMilliseconds);
        }

        @NotNull
        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("MediaServiceWasReset(offsetInMilliseconds=", this.offsetInMilliseconds, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$NearlyFinished;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "offsetInMilliseconds", "", "<init>", "(J)V", "getOffsetInMilliseconds", "()J", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NearlyFinished extends AudioPlaybackTaskState {
        private final long offsetInMilliseconds;

        public NearlyFinished(long j) {
            super(null);
            this.offsetInMilliseconds = j;
        }

        public static /* synthetic */ NearlyFinished copy$default(NearlyFinished nearlyFinished, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = nearlyFinished.offsetInMilliseconds;
            }
            return nearlyFinished.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final NearlyFinished copy(long offsetInMilliseconds) {
            return new NearlyFinished(offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NearlyFinished) && this.offsetInMilliseconds == ((NearlyFinished) other).offsetInMilliseconds;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return Long.hashCode(this.offsetInMilliseconds);
        }

        @NotNull
        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("NearlyFinished(offsetInMilliseconds=", this.offsetInMilliseconds, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Paused;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Paused extends AudioPlaybackTaskState {

        @NotNull
        public static final Paused INSTANCE = new Paused();

        private Paused() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Paused);
        }

        public int hashCode() {
            return 1714623174;
        }

        @NotNull
        public String toString() {
            return "Paused";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Playing;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Playing extends AudioPlaybackTaskState {

        @NotNull
        public static final Playing INSTANCE = new Playing();

        private Playing() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Playing);
        }

        public int hashCode() {
            return 1910344086;
        }

        @NotNull
        public String toString() {
            return "Playing";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Queued;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Queued extends AudioPlaybackTaskState {

        @NotNull
        public static final Queued INSTANCE = new Queued();

        private Queued() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Queued);
        }

        public int hashCode() {
            return 1761248011;
        }

        @NotNull
        public String toString() {
            return "Queued";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Ready;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ready extends AudioPlaybackTaskState {

        @NotNull
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Ready);
        }

        public int hashCode() {
            return 334351627;
        }

        @NotNull
        public String toString() {
            return "Ready";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState$Stopped;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "offsetInMilliseconds", "", "<init>", "(J)V", "getOffsetInMilliseconds", "()J", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends AudioPlaybackTaskState {
        private final long offsetInMilliseconds;

        public Stopped(long j) {
            super(null);
            this.offsetInMilliseconds = j;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stopped.offsetInMilliseconds;
            }
            return stopped.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        @NotNull
        public final Stopped copy(long offsetInMilliseconds) {
            return new Stopped(offsetInMilliseconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stopped) && this.offsetInMilliseconds == ((Stopped) other).offsetInMilliseconds;
        }

        public final long getOffsetInMilliseconds() {
            return this.offsetInMilliseconds;
        }

        public int hashCode() {
            return Long.hashCode(this.offsetInMilliseconds);
        }

        @NotNull
        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("Stopped(offsetInMilliseconds=", this.offsetInMilliseconds, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ AudioPlaybackTaskState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AudioPlaybackTaskState() {
    }
}
