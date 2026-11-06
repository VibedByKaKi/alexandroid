package com.amazon.alexa.ra.core.features.artifact;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision;", "", "AlreadyAttached", "CommitStaged", "Defer", "NotStaged", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$AlreadyAttached;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$CommitStaged;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$Defer;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$NotStaged;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface SilkSendDecision {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$AlreadyAttached;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlreadyAttached implements SilkSendDecision {
        public static final int $stable = 0;

        @NotNull
        public static final AlreadyAttached INSTANCE = new AlreadyAttached();

        private AlreadyAttached() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$CommitStaged;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision;", "mediaInfo", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;)V", "getMediaInfo", "()Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommitStaged implements SilkSendDecision {
        public static final int $stable = LocalMediaInfo.$stable;

        @NotNull
        private final LocalMediaInfo mediaInfo;

        public CommitStaged(@NotNull LocalMediaInfo localMediaInfo) {
            localMediaInfo.getClass();
            this.mediaInfo = localMediaInfo;
        }

        public static /* synthetic */ CommitStaged copy$default(CommitStaged commitStaged, LocalMediaInfo localMediaInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                localMediaInfo = commitStaged.mediaInfo;
            }
            return commitStaged.copy(localMediaInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LocalMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        @NotNull
        public final CommitStaged copy(@NotNull LocalMediaInfo mediaInfo) {
            mediaInfo.getClass();
            return new CommitStaged(mediaInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CommitStaged) && Intrinsics.areEqual(this.mediaInfo, ((CommitStaged) other).mediaInfo);
        }

        @NotNull
        public final LocalMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public int hashCode() {
            return this.mediaInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "CommitStaged(mediaInfo=" + this.mediaInfo + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$Defer;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Defer implements SilkSendDecision {
        public static final int $stable = 0;

        @NotNull
        public static final Defer INSTANCE = new Defer();

        private Defer() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision$NotStaged;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkSendDecision;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotStaged implements SilkSendDecision {
        public static final int $stable = 0;

        @NotNull
        public static final NotStaged INSTANCE = new NotStaged();

        private NotStaged() {
        }
    }
}
