package com.amazon.alexa.hho.navigation.transit.model.request;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "", "startSegmentIndex", "", "segmentLimit", "<init>", "(II)V", "getStartSegmentIndex", "()I", "getSegmentLimit", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ContentFilter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ContentFilter NO_FILTER = new ContentFilter(-1, -1);
    private final int segmentLimit;
    private final int startSegmentIndex;

    public /* synthetic */ ContentFilter(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public static /* synthetic */ ContentFilter copy$default(ContentFilter contentFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = contentFilter.startSegmentIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = contentFilter.segmentLimit;
        }
        return contentFilter.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartSegmentIndex() {
        return this.startSegmentIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSegmentLimit() {
        return this.segmentLimit;
    }

    @NotNull
    public final ContentFilter copy(int startSegmentIndex, int segmentLimit) {
        return new ContentFilter(startSegmentIndex, segmentLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentFilter)) {
            return false;
        }
        ContentFilter contentFilter = (ContentFilter) other;
        return this.startSegmentIndex == contentFilter.startSegmentIndex && this.segmentLimit == contentFilter.segmentLimit;
    }

    public final int getSegmentLimit() {
        return this.segmentLimit;
    }

    public final int getStartSegmentIndex() {
        return this.startSegmentIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.segmentLimit) + (Integer.hashCode(this.startSegmentIndex) * 31);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(this.startSegmentIndex, this.segmentLimit, "ContentFilter(startSegmentIndex=", ", segmentLimit=", MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter$Companion;", "", "<init>", "()V", "NO_FILTER", "Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "getNO_FILTER", "()Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContentFilter getNO_FILTER() {
            return ContentFilter.NO_FILTER;
        }

        private Companion() {
        }
    }

    public ContentFilter(int i, int i2) {
        this.startSegmentIndex = i;
        this.segmentLimit = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ContentFilter() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.hho.navigation.transit.model.request.ContentFilter.<init>():void");
    }
}
