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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery;", "", "Uploadable", "TooSmall", "NoContent", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$NoContent;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$TooSmall;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$Uploadable;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface SilkPageQuery {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$NoContent;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoContent implements SilkPageQuery {
        public static final int $stable = 0;

        @NotNull
        public static final NoContent INSTANCE = new NoContent();

        private NoContent() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$TooSmall;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TooSmall implements SilkPageQuery {
        public static final int $stable = 0;

        @NotNull
        public static final TooSmall INSTANCE = new TooSmall();

        private TooSmall() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery$Uploadable;", "Lcom/amazon/alexa/ra/core/features/artifact/SilkPageQuery;", "content", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;)V", "getContent", "()Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Uploadable implements SilkPageQuery {
        public static final int $stable = LocalMediaInfo.$stable;

        @NotNull
        private final LocalMediaInfo content;

        public Uploadable(@NotNull LocalMediaInfo localMediaInfo) {
            localMediaInfo.getClass();
            this.content = localMediaInfo;
        }

        public static /* synthetic */ Uploadable copy$default(Uploadable uploadable, LocalMediaInfo localMediaInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                localMediaInfo = uploadable.content;
            }
            return uploadable.copy(localMediaInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LocalMediaInfo getContent() {
            return this.content;
        }

        @NotNull
        public final Uploadable copy(@NotNull LocalMediaInfo content) {
            content.getClass();
            return new Uploadable(content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Uploadable) && Intrinsics.areEqual(this.content, ((Uploadable) other).content);
        }

        @NotNull
        public final LocalMediaInfo getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public String toString() {
            return "Uploadable(content=" + this.content + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }
}
