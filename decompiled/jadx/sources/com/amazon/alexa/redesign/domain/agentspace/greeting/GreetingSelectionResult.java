package com.amazon.alexa.redesign.domain.agentspace.greeting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.entity.agentforward.network.GreetingItemDomain;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult;", "", "item", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "source", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult$Source;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult$Source;)V", "getItem", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "getSource", "()Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult$Source;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", AlexaMetricsConstants.EventConstants.SOURCE, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GreetingSelectionResult {
    public static final int $stable = 8;

    @Nullable
    private final GreetingItemDomain item;

    @NotNull
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult$Source;", "", "<init>", "(Ljava/lang/String;I)V", "PERSONALIZED", "HOLIDAY", "DAYPART", "GENERIC", "BUCKET_STALE", "FALLBACK", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Source {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source PERSONALIZED = new Source("PERSONALIZED", 0);
        public static final Source HOLIDAY = new Source("HOLIDAY", 1);
        public static final Source DAYPART = new Source("DAYPART", 2);
        public static final Source GENERIC = new Source("GENERIC", 3);
        public static final Source BUCKET_STALE = new Source("BUCKET_STALE", 4);
        public static final Source FALLBACK = new Source("FALLBACK", 5);

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{PERSONALIZED, HOLIDAY, DAYPART, GENERIC, BUCKET_STALE, FALLBACK};
        }

        static {
            Source[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Source(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public GreetingSelectionResult(@Nullable GreetingItemDomain greetingItemDomain, @NotNull Source source) {
        source.getClass();
        this.item = greetingItemDomain;
        this.source = source;
    }

    public static /* synthetic */ GreetingSelectionResult copy$default(GreetingSelectionResult greetingSelectionResult, GreetingItemDomain greetingItemDomain, Source source, int i, Object obj) {
        if ((i & 1) != 0) {
            greetingItemDomain = greetingSelectionResult.item;
        }
        if ((i & 2) != 0) {
            source = greetingSelectionResult.source;
        }
        return greetingSelectionResult.copy(greetingItemDomain, source);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final GreetingItemDomain getItem() {
        return this.item;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @NotNull
    public final GreetingSelectionResult copy(@Nullable GreetingItemDomain item, @NotNull Source source) {
        source.getClass();
        return new GreetingSelectionResult(item, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreetingSelectionResult)) {
            return false;
        }
        GreetingSelectionResult greetingSelectionResult = (GreetingSelectionResult) other;
        return Intrinsics.areEqual(this.item, greetingSelectionResult.item) && this.source == greetingSelectionResult.source;
    }

    @Nullable
    public final GreetingItemDomain getItem() {
        return this.item;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    public int hashCode() {
        GreetingItemDomain greetingItemDomain = this.item;
        return this.source.hashCode() + ((greetingItemDomain == null ? 0 : greetingItemDomain.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "GreetingSelectionResult(item=" + this.item + ", source=" + this.source + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
