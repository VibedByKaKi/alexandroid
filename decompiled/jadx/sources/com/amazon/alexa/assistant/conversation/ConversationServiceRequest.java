package com.amazon.alexa.assistant.conversation;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationExtrasBundleKeys;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsPaginationContextBundleKeys;
import com.amazon.alexa.assistant.foundation.model.Endpoint;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.ra.core.data.repo.RaRepository;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.google.android.gms.actions.SearchIntents;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest;", "", "<init>", "()V", "PaginationToken", "PaginationContext", "AssociatedPersonFilter", "FilterStrategy", "ConversationFilter", "ExclusionFilter", "RetrievalMode", "Payload", "ConversationsQuery", "FragmentsQuery", "SyncQuery", "TopicsQuery", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationServiceRequest {

    @NotNull
    public static final ConversationServiceRequest INSTANCE = new ConversationServiceRequest();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ExclusionFilter;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UNASSOCIATED", RaRepository.TRANSACTIONAL_CONVERSATIONS, "toQueryParameter", "Lkotlin/Pair;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExclusionFilter {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ExclusionFilter[] $VALUES;

        @NotNull
        private final String value;
        public static final ExclusionFilter UNASSOCIATED = new ExclusionFilter("UNASSOCIATED", 0, "UNASSOCIATED");
        public static final ExclusionFilter TRANSACTIONAL = new ExclusionFilter(RaRepository.TRANSACTIONAL_CONVERSATIONS, 1, RaRepository.TRANSACTIONAL_CONVERSATIONS);

        private static final /* synthetic */ ExclusionFilter[] $values() {
            return new ExclusionFilter[]{UNASSOCIATED, TRANSACTIONAL};
        }

        static {
            ExclusionFilter[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ExclusionFilter(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<ExclusionFilter> getEntries() {
            return $ENTRIES;
        }

        public static ExclusionFilter valueOf(String str) {
            return (ExclusionFilter) Enum.valueOf(ExclusionFilter.class, str);
        }

        public static ExclusionFilter[] values() {
            return (ExclusionFilter[]) $VALUES.clone();
        }

        @NotNull
        public final Pair<String, String> toQueryParameter() {
            return TuplesKt.to(AlexaConversationExtrasBundleKeys.EXCLUDES, this.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$voice_release", "()Ljava/lang/String;", "ALL", "INITIATED", "toQueryParameter", "Lkotlin/Pair;", "toQueryParameter$voice_release", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterStrategy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FilterStrategy[] $VALUES;
        public static final FilterStrategy ALL = new FilterStrategy("ALL", 0, "ALL");
        public static final FilterStrategy INITIATED = new FilterStrategy("INITIATED", 1, "INITIATED");

        @NotNull
        private final String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FilterStrategy.values().length];
                try {
                    iArr[FilterStrategy.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FilterStrategy.INITIATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ FilterStrategy[] $values() {
            return new FilterStrategy[]{ALL, INITIATED};
        }

        static {
            FilterStrategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FilterStrategy(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<FilterStrategy> getEntries() {
            return $ENTRIES;
        }

        public static FilterStrategy valueOf(String str) {
            return (FilterStrategy) Enum.valueOf(FilterStrategy.class, str);
        }

        public static FilterStrategy[] values() {
            return (FilterStrategy[]) $VALUES.clone();
        }

        @NotNull
        /* renamed from: getValue$voice_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Nullable
        public final Pair<String, String> toQueryParameter$voice_release() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return null;
            }
            if (i == 2) {
                return TuplesKt.to("filterStrategy", this.value);
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$RetrievalMode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ANCHORED", "SURROUNDING", "toQueryParameter", "Lkotlin/Pair;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetrievalMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RetrievalMode[] $VALUES;
        public static final RetrievalMode ANCHORED = new RetrievalMode("ANCHORED", 0, "ANCHORED");
        public static final RetrievalMode SURROUNDING = new RetrievalMode("SURROUNDING", 1, "SURROUNDING");

        @NotNull
        private final String value;

        private static final /* synthetic */ RetrievalMode[] $values() {
            return new RetrievalMode[]{ANCHORED, SURROUNDING};
        }

        static {
            RetrievalMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private RetrievalMode(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<RetrievalMode> getEntries() {
            return $ENTRIES;
        }

        public static RetrievalMode valueOf(String str) {
            return (RetrievalMode) Enum.valueOf(RetrievalMode.class, str);
        }

        public static RetrievalMode[] values() {
            return (RetrievalMode[]) $VALUES.clone();
        }

        @NotNull
        public final Pair<String, String> toQueryParameter() {
            return TuplesKt.to("pagination.retrievalMode", this.value);
        }
    }

    private ConversationServiceRequest() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationFilter;", "", "strategy", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "<init>", "(Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;)V", "getStrategy", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationFilter {

        @NotNull
        private final FilterStrategy strategy;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final ConversationFilter ALL = new ConversationFilter(FilterStrategy.ALL);

        public /* synthetic */ ConversationFilter(FilterStrategy filterStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FilterStrategy.ALL : filterStrategy);
        }

        public static /* synthetic */ ConversationFilter copy$default(ConversationFilter conversationFilter, FilterStrategy filterStrategy, int i, Object obj) {
            if ((i & 1) != 0) {
                filterStrategy = conversationFilter.strategy;
            }
            return conversationFilter.copy(filterStrategy);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FilterStrategy getStrategy() {
            return this.strategy;
        }

        @NotNull
        public final ConversationFilter copy(@NotNull FilterStrategy strategy) {
            strategy.getClass();
            return new ConversationFilter(strategy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationFilter) && this.strategy == ((ConversationFilter) other).strategy;
        }

        @NotNull
        public final FilterStrategy getStrategy() {
            return this.strategy;
        }

        public int hashCode() {
            return this.strategy.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationFilter(strategy=" + this.strategy + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationFilter$Companion;", "", "<init>", "()V", "ALL", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationFilter;", "getALL", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationFilter;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ConversationFilter getALL() {
                return ConversationFilter.ALL;
            }

            private Companion() {
            }
        }

        public ConversationFilter(@NotNull FilterStrategy filterStrategy) {
            filterStrategy.getClass();
            this.strategy = filterStrategy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConversationFilter() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", "", "<init>", "()V", "toQueryParameters", "", "Lkotlin/Pair;", "", "All", "None", "Filtered", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$All;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$Filtered;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$None;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AssociatedPersonFilter {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$All;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", "<init>", "()V", "toQueryParameters", "", "Lkotlin/Pair;", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class All extends AssociatedPersonFilter {

            @NotNull
            public static final All INSTANCE = new All();

            private All() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof All);
            }

            public int hashCode() {
                return -580509340;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.AssociatedPersonFilter
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                return CollectionsKt.emptyList();
            }

            @NotNull
            public String toString() {
                return "All";
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n0\u0003H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$Filtered;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", AlexaConversationExtrasBundleKeys.PERSON_IDS, "", "", "<init>", "(Ljava/util/List;)V", "getPersonIds", "()Ljava/util/List;", "toQueryParameters", "Lkotlin/Pair;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nConversationServiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$Filtered\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n1563#2:387\n1634#2,3:388\n*S KotlinDebug\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$Filtered\n*L\n106#1:387\n106#1:388,3\n*E\n"})
        public static final /* data */ class Filtered extends AssociatedPersonFilter {

            @NotNull
            private final List<String> personIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Filtered(@NotNull List<String> list) {
                super(null);
                list.getClass();
                this.personIds = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Filtered copy$default(Filtered filtered, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = filtered.personIds;
                }
                return filtered.copy(list);
            }

            @NotNull
            public final List<String> component1() {
                return this.personIds;
            }

            @NotNull
            public final Filtered copy(@NotNull List<String> personIds) {
                personIds.getClass();
                return new Filtered(personIds);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Filtered) && Intrinsics.areEqual(this.personIds, ((Filtered) other).personIds);
            }

            @NotNull
            public final List<String> getPersonIds() {
                return this.personIds;
            }

            public int hashCode() {
                return this.personIds.hashCode();
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.AssociatedPersonFilter
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                List<String> list = this.personIds;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(TuplesKt.to("personId", (String) it2.next()));
                }
                return arrayList;
            }

            @NotNull
            public String toString() {
                return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Filtered(personIds=", MarkdownConstants.RIGHT_PARENTHESIS, this.personIds);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter$None;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", "<init>", "()V", "toQueryParameters", "", "Lkotlin/Pair;", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class None extends AssociatedPersonFilter {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -815530027;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.AssociatedPersonFilter
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                return CollectionsKt.listOf(TuplesKt.to("personId", ""));
            }

            @NotNull
            public String toString() {
                return "None";
            }
        }

        public /* synthetic */ AssociatedPersonFilter(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract List<Pair<String, String>> toQueryParameters();

        private AssociatedPersonFilter() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007H&\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "", "<init>", "()V", "isValid", "", "toQueryParameters", "", "Lkotlin/Pair;", "", "Before", "After", "WithinRange", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$After;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$Before;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$WithinRange;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PaginationContext {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000bH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$After;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "timestamp", "", "<init>", "(Ljava/lang/String;)V", "getTimestamp", "()Ljava/lang/String;", "isValid", "", "toQueryParameters", "", "Lkotlin/Pair;", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class After extends PaginationContext {

            @NotNull
            private final String timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public After(@NotNull String str) {
                super(null);
                str.getClass();
                this.timestamp = str;
            }

            public static /* synthetic */ After copy$default(After after, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = after.timestamp;
                }
                return after.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final After copy(@NotNull String timestamp) {
                timestamp.getClass();
                return new After(timestamp);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof After) && Intrinsics.areEqual(this.timestamp, ((After) other).timestamp);
            }

            @NotNull
            public final String getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return this.timestamp.hashCode();
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            public boolean isValid() {
                boolean isValidRFC3339;
                isValidRFC3339 = ConversationServiceRequestKt.isValidRFC3339(this.timestamp);
                return isValidRFC3339;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                return CollectionsKt.listOf(TuplesKt.to("pagination.after", this.timestamp));
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("After(timestamp=", this.timestamp, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000bH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$Before;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "timestamp", "", "<init>", "(Ljava/lang/String;)V", "getTimestamp", "()Ljava/lang/String;", "isValid", "", "toQueryParameters", "", "Lkotlin/Pair;", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Before extends PaginationContext {

            @NotNull
            private final String timestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Before(@NotNull String str) {
                super(null);
                str.getClass();
                this.timestamp = str;
            }

            public static /* synthetic */ Before copy$default(Before before, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = before.timestamp;
                }
                return before.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final Before copy(@NotNull String timestamp) {
                timestamp.getClass();
                return new Before(timestamp);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Before) && Intrinsics.areEqual(this.timestamp, ((Before) other).timestamp);
            }

            @NotNull
            public final String getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return this.timestamp.hashCode();
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            public boolean isValid() {
                boolean isValidRFC3339;
                isValidRFC3339 = ConversationServiceRequestKt.isValidRFC3339(this.timestamp);
                return isValidRFC3339;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                return CollectionsKt.listOf(TuplesKt.to("pagination.before", this.timestamp));
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("Before(timestamp=", this.timestamp, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\rH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext$WithinRange;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "beforeTimestamp", "", "afterTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBeforeTimestamp", "()Ljava/lang/String;", "getAfterTimestamp", "isValid", "", "toQueryParameters", "", "Lkotlin/Pair;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class WithinRange extends PaginationContext {

            @NotNull
            private final String afterTimestamp;

            @NotNull
            private final String beforeTimestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithinRange(@NotNull String str, @NotNull String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.beforeTimestamp = str;
                this.afterTimestamp = str2;
            }

            public static /* synthetic */ WithinRange copy$default(WithinRange withinRange, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = withinRange.beforeTimestamp;
                }
                if ((i & 2) != 0) {
                    str2 = withinRange.afterTimestamp;
                }
                return withinRange.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBeforeTimestamp() {
                return this.beforeTimestamp;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getAfterTimestamp() {
                return this.afterTimestamp;
            }

            @NotNull
            public final WithinRange copy(@NotNull String beforeTimestamp, @NotNull String afterTimestamp) {
                beforeTimestamp.getClass();
                afterTimestamp.getClass();
                return new WithinRange(beforeTimestamp, afterTimestamp);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithinRange)) {
                    return false;
                }
                WithinRange withinRange = (WithinRange) other;
                return Intrinsics.areEqual(this.beforeTimestamp, withinRange.beforeTimestamp) && Intrinsics.areEqual(this.afterTimestamp, withinRange.afterTimestamp);
            }

            @NotNull
            public final String getAfterTimestamp() {
                return this.afterTimestamp;
            }

            @NotNull
            public final String getBeforeTimestamp() {
                return this.beforeTimestamp;
            }

            public int hashCode() {
                return this.afterTimestamp.hashCode() + (this.beforeTimestamp.hashCode() * 31);
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            public boolean isValid() {
                boolean isValidRFC3339;
                boolean isValidRFC33392;
                isValidRFC3339 = ConversationServiceRequestKt.isValidRFC3339(this.beforeTimestamp);
                if (!isValidRFC3339) {
                    return false;
                }
                isValidRFC33392 = ConversationServiceRequestKt.isValidRFC3339(this.afterTimestamp);
                return isValidRFC33392 && this.beforeTimestamp.compareTo(this.afterTimestamp) > 0;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationContext
            @NotNull
            public List<Pair<String, String>> toQueryParameters() {
                return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("pagination.before", this.beforeTimestamp), TuplesKt.to("pagination.after", this.afterTimestamp)});
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("WithinRange(beforeTimestamp=", this.beforeTimestamp, ", afterTimestamp=", this.afterTimestamp, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        public /* synthetic */ PaginationContext(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean isValid();

        @NotNull
        public abstract List<Pair<String, String>> toQueryParameters();

        private PaginationContext() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "", "<init>", "()V", "token", "", "getToken", "()Ljava/lang/String;", "queryParameterName", "getQueryParameterName", "toQueryParameter", "Lkotlin/Pair;", "Previous", "Next", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken$Next;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken$Previous;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PaginationToken {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken$Next;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "queryParameterName", "getQueryParameterName", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Next extends PaginationToken {

            @NotNull
            private final String queryParameterName;

            @NotNull
            private final String token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Next(@NotNull String str) {
                super(null);
                str.getClass();
                this.token = str;
                this.queryParameterName = "pagination.nextToken";
            }

            public static /* synthetic */ Next copy$default(Next next, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = next.token;
                }
                return next.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getToken() {
                return this.token;
            }

            @NotNull
            public final Next copy(@NotNull String token) {
                token.getClass();
                return new Next(token);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Next) && Intrinsics.areEqual(this.token, ((Next) other).token);
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationToken
            @NotNull
            public String getQueryParameterName() {
                return this.queryParameterName;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationToken
            @NotNull
            public String getToken() {
                return this.token;
            }

            public int hashCode() {
                return this.token.hashCode();
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("Next(token=", this.token, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken$Previous;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "queryParameterName", "getQueryParameterName", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Previous extends PaginationToken {

            @NotNull
            private final String queryParameterName;

            @NotNull
            private final String token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Previous(@NotNull String str) {
                super(null);
                str.getClass();
                this.token = str;
                this.queryParameterName = "pagination.previousToken";
            }

            public static /* synthetic */ Previous copy$default(Previous previous, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = previous.token;
                }
                return previous.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getToken() {
                return this.token;
            }

            @NotNull
            public final Previous copy(@NotNull String token) {
                token.getClass();
                return new Previous(token);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Previous) && Intrinsics.areEqual(this.token, ((Previous) other).token);
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationToken
            @NotNull
            public String getQueryParameterName() {
                return this.queryParameterName;
            }

            @Override // com.amazon.alexa.assistant.conversation.ConversationServiceRequest.PaginationToken
            @NotNull
            public String getToken() {
                return this.token;
            }

            public int hashCode() {
                return this.token.hashCode();
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("Previous(token=", this.token, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        public /* synthetic */ PaginationToken(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract String getQueryParameterName();

        @NotNull
        public abstract String getToken();

        @NotNull
        public final Pair<String, String> toQueryParameter() {
            return TuplesKt.to(getQueryParameterName(), getToken());
        }

        private PaginationToken() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "", "<init>", "()V", "makeUrl", "", MetricKeys.META_ENDPOINT, "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "logStatement", "ListConversations", "ConversationMetadata", "ConversationFragments", "ConversationTopicSegment", "SynchronizeFragments", ConversationCapability.DELETE_CONVERSATIONS_DIRECTIVE, "DeleteConversation", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationFragments;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationMetadata;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationTopicSegment;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$DeleteConversation;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$DeleteConversations;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ListConversations;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$SynchronizeFragments;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Payload {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationFragments;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationId", "", SearchIntents.EXTRA_QUERY, "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery;)V", "getConversationId", "()Ljava/lang/String;", "getQuery", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationFragments extends Payload {

            @NotNull
            private final String conversationId;

            @NotNull
            private final FragmentsQuery query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConversationFragments(@NotNull String str, @NotNull FragmentsQuery fragmentsQuery) {
                super(null);
                str.getClass();
                fragmentsQuery.getClass();
                this.conversationId = str;
                this.query = fragmentsQuery;
            }

            public static /* synthetic */ ConversationFragments copy$default(ConversationFragments conversationFragments, String str, FragmentsQuery fragmentsQuery, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = conversationFragments.conversationId;
                }
                if ((i & 2) != 0) {
                    fragmentsQuery = conversationFragments.query;
                }
                return conversationFragments.copy(str, fragmentsQuery);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final FragmentsQuery getQuery() {
                return this.query;
            }

            @NotNull
            public final ConversationFragments copy(@NotNull String conversationId, @NotNull FragmentsQuery query) {
                conversationId.getClass();
                query.getClass();
                return new ConversationFragments(conversationId, query);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConversationFragments)) {
                    return false;
                }
                ConversationFragments conversationFragments = (ConversationFragments) other;
                return Intrinsics.areEqual(this.conversationId, conversationFragments.conversationId) && Intrinsics.areEqual(this.query, conversationFragments.query);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final FragmentsQuery getQuery() {
                return this.query;
            }

            public int hashCode() {
                return this.query.hashCode() + (this.conversationId.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ConversationFragments(conversationId=" + this.conversationId + ", query=" + this.query + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationMetadata;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationMetadata extends Payload {

            @NotNull
            private final String conversationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConversationMetadata(@NotNull String str) {
                super(null);
                str.getClass();
                this.conversationId = str;
            }

            public static /* synthetic */ ConversationMetadata copy$default(ConversationMetadata conversationMetadata, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = conversationMetadata.conversationId;
                }
                return conversationMetadata.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final ConversationMetadata copy(@NotNull String conversationId) {
                conversationId.getClass();
                return new ConversationMetadata(conversationId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConversationMetadata) && Intrinsics.areEqual(this.conversationId, ((ConversationMetadata) other).conversationId);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            public int hashCode() {
                return this.conversationId.hashCode();
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("ConversationMetadata(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ConversationTopicSegment;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationId", "", SearchIntents.EXTRA_QUERY, "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$TopicsQuery;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$TopicsQuery;)V", "getConversationId", "()Ljava/lang/String;", "getQuery", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$TopicsQuery;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConversationTopicSegment extends Payload {

            @NotNull
            private final String conversationId;

            @NotNull
            private final TopicsQuery query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConversationTopicSegment(@NotNull String str, @NotNull TopicsQuery topicsQuery) {
                super(null);
                str.getClass();
                topicsQuery.getClass();
                this.conversationId = str;
                this.query = topicsQuery;
            }

            public static /* synthetic */ ConversationTopicSegment copy$default(ConversationTopicSegment conversationTopicSegment, String str, TopicsQuery topicsQuery, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = conversationTopicSegment.conversationId;
                }
                if ((i & 2) != 0) {
                    topicsQuery = conversationTopicSegment.query;
                }
                return conversationTopicSegment.copy(str, topicsQuery);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TopicsQuery getQuery() {
                return this.query;
            }

            @NotNull
            public final ConversationTopicSegment copy(@NotNull String conversationId, @NotNull TopicsQuery query) {
                conversationId.getClass();
                query.getClass();
                return new ConversationTopicSegment(conversationId, query);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConversationTopicSegment)) {
                    return false;
                }
                ConversationTopicSegment conversationTopicSegment = (ConversationTopicSegment) other;
                return Intrinsics.areEqual(this.conversationId, conversationTopicSegment.conversationId) && Intrinsics.areEqual(this.query, conversationTopicSegment.query);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final TopicsQuery getQuery() {
                return this.query;
            }

            public int hashCode() {
                return this.query.hashCode() + (this.conversationId.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ConversationTopicSegment(conversationId=" + this.conversationId + ", query=" + this.query + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$DeleteConversation;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DeleteConversation extends Payload {

            @NotNull
            private final String conversationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteConversation(@NotNull String str) {
                super(null);
                str.getClass();
                this.conversationId = str;
            }

            public static /* synthetic */ DeleteConversation copy$default(DeleteConversation deleteConversation, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deleteConversation.conversationId;
                }
                return deleteConversation.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final DeleteConversation copy(@NotNull String conversationId) {
                conversationId.getClass();
                return new DeleteConversation(conversationId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeleteConversation) && Intrinsics.areEqual(this.conversationId, ((DeleteConversation) other).conversationId);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            public int hashCode() {
                return this.conversationId.hashCode();
            }

            @NotNull
            public String toString() {
                return a$$ExternalSyntheticOutline0.m("DeleteConversation(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$DeleteConversations;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationIds", "", "", "<init>", "(Ljava/util/List;)V", "getConversationIds", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DeleteConversations extends Payload {

            @NotNull
            private final List<String> conversationIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteConversations(@NotNull List<String> list) {
                super(null);
                list.getClass();
                this.conversationIds = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DeleteConversations copy$default(DeleteConversations deleteConversations, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = deleteConversations.conversationIds;
                }
                return deleteConversations.copy(list);
            }

            @NotNull
            public final List<String> component1() {
                return this.conversationIds;
            }

            @NotNull
            public final DeleteConversations copy(@NotNull List<String> conversationIds) {
                conversationIds.getClass();
                return new DeleteConversations(conversationIds);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeleteConversations) && Intrinsics.areEqual(this.conversationIds, ((DeleteConversations) other).conversationIds);
            }

            @NotNull
            public final List<String> getConversationIds() {
                return this.conversationIds;
            }

            public int hashCode() {
                return this.conversationIds.hashCode();
            }

            @NotNull
            public String toString() {
                return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("DeleteConversations(conversationIds=", MarkdownConstants.RIGHT_PARENTHESIS, this.conversationIds);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$ListConversations;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", SearchIntents.EXTRA_QUERY, "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery;", "<init>", "(Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery;)V", "getQuery", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ListConversations extends Payload {

            @NotNull
            private final ConversationsQuery query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListConversations(@NotNull ConversationsQuery conversationsQuery) {
                super(null);
                conversationsQuery.getClass();
                this.query = conversationsQuery;
            }

            public static /* synthetic */ ListConversations copy$default(ListConversations listConversations, ConversationsQuery conversationsQuery, int i, Object obj) {
                if ((i & 1) != 0) {
                    conversationsQuery = listConversations.query;
                }
                return listConversations.copy(conversationsQuery);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ConversationsQuery getQuery() {
                return this.query;
            }

            @NotNull
            public final ListConversations copy(@NotNull ConversationsQuery query) {
                query.getClass();
                return new ListConversations(query);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ListConversations) && Intrinsics.areEqual(this.query, ((ListConversations) other).query);
            }

            @NotNull
            public final ConversationsQuery getQuery() {
                return this.query;
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            @NotNull
            public String toString() {
                return "ListConversations(query=" + this.query + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload$SynchronizeFragments;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$Payload;", "conversationId", "", SearchIntents.EXTRA_QUERY, "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$SyncQuery;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$SyncQuery;)V", "getConversationId", "()Ljava/lang/String;", "getQuery", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$SyncQuery;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SynchronizeFragments extends Payload {

            @NotNull
            private final String conversationId;

            @NotNull
            private final SyncQuery query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SynchronizeFragments(@NotNull String str, @NotNull SyncQuery syncQuery) {
                super(null);
                str.getClass();
                syncQuery.getClass();
                this.conversationId = str;
                this.query = syncQuery;
            }

            public static /* synthetic */ SynchronizeFragments copy$default(SynchronizeFragments synchronizeFragments, String str, SyncQuery syncQuery, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = synchronizeFragments.conversationId;
                }
                if ((i & 2) != 0) {
                    syncQuery = synchronizeFragments.query;
                }
                return synchronizeFragments.copy(str, syncQuery);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final SyncQuery getQuery() {
                return this.query;
            }

            @NotNull
            public final SynchronizeFragments copy(@NotNull String conversationId, @NotNull SyncQuery query) {
                conversationId.getClass();
                query.getClass();
                return new SynchronizeFragments(conversationId, query);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SynchronizeFragments)) {
                    return false;
                }
                SynchronizeFragments synchronizeFragments = (SynchronizeFragments) other;
                return Intrinsics.areEqual(this.conversationId, synchronizeFragments.conversationId) && Intrinsics.areEqual(this.query, synchronizeFragments.query);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final SyncQuery getQuery() {
                return this.query;
            }

            public int hashCode() {
                return this.query.hashCode() + (this.conversationId.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "SynchronizeFragments(conversationId=" + this.conversationId + ", query=" + this.query + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        public /* synthetic */ Payload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String logStatement() {
            String str;
            if (this instanceof ListConversations) {
                ListConversations listConversations = (ListConversations) this;
                PaginationToken paginationToken = listConversations.getQuery().getPaginationToken();
                UInt m15024getPaginationMaxResults0hXNFcg = listConversations.getQuery().m15024getPaginationMaxResults0hXNFcg();
                FilterStrategy filterStrategy = listConversations.getQuery().getFilterStrategy();
                if (filterStrategy == null || (str = filterStrategy.getValue()) == null) {
                    str = "none";
                }
                StringBuilder sb = new StringBuilder("listConversations(paginationToken: ");
                sb.append(paginationToken);
                sb.append(" paginationMaxResults: ");
                sb.append(m15024getPaginationMaxResults0hXNFcg);
                sb.append(", filterStrategy: ");
                return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (this instanceof ConversationMetadata) {
                return a$$ExternalSyntheticOutline0.m("conversationMetadata(conversationId: ", ((ConversationMetadata) this).getConversationId(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (this instanceof ConversationFragments) {
                ConversationFragments conversationFragments = (ConversationFragments) this;
                return "conversationFragments(conversationId: " + conversationFragments.getConversationId() + ", paginationContext: " + conversationFragments.getQuery().getPaginationContext() + ", paginationMaxResults: " + conversationFragments.getQuery().m15028getPaginationMaxResults0hXNFcg() + ", retrievalMode: " + conversationFragments.getQuery().getRetrievalMode() + MarkdownConstants.RIGHT_PARENTHESIS;
            }
            if (this instanceof ConversationTopicSegment) {
                ConversationTopicSegment conversationTopicSegment = (ConversationTopicSegment) this;
                return "conversationTopicSegment(conversationId: " + conversationTopicSegment.getConversationId() + ", paginationContext: " + conversationTopicSegment.getQuery().getPaginationContext() + ", paginationMaxResults: " + conversationTopicSegment.getQuery().m15036getPaginationMaxResults0hXNFcg() + MarkdownConstants.RIGHT_PARENTHESIS;
            }
            if (!(this instanceof SynchronizeFragments)) {
                if (this instanceof DeleteConversations) {
                    return a$$ExternalSyntheticOutline0.m(((DeleteConversations) this).getConversationIds().size(), "deleteConversations(conversationIds: ", " ids)");
                }
                if (this instanceof DeleteConversation) {
                    return a$$ExternalSyntheticOutline0.m("deleteConversation(conversationId: ", ((DeleteConversation) this).getConversationId(), MarkdownConstants.RIGHT_PARENTHESIS);
                }
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            SynchronizeFragments synchronizeFragments = (SynchronizeFragments) this;
            String conversationId = synchronizeFragments.getConversationId();
            String syncToken = synchronizeFragments.getQuery().getSyncToken();
            UInt m15032getPaginationMaxResults0hXNFcg = synchronizeFragments.getQuery().m15032getPaginationMaxResults0hXNFcg();
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("synchronizeFragments(conversationId: ", conversationId, ", syncToken: ", syncToken, ", paginationMaxResults: ");
            m.append(m15032getPaginationMaxResults0hXNFcg);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        @NotNull
        public final String makeUrl(@NotNull Endpoint endpoint) {
            endpoint.getClass();
            if (this instanceof ListConversations) {
                return endpoint.conversations(((ListConversations) this).getQuery().toQueryString());
            }
            if (this instanceof ConversationMetadata) {
                return endpoint.conversationMetadata(((ConversationMetadata) this).getConversationId());
            }
            if (this instanceof ConversationFragments) {
                ConversationFragments conversationFragments = (ConversationFragments) this;
                return endpoint.conversationFragments(conversationFragments.getConversationId(), conversationFragments.getQuery().toQueryString());
            }
            if (this instanceof ConversationTopicSegment) {
                ConversationTopicSegment conversationTopicSegment = (ConversationTopicSegment) this;
                return endpoint.conversationFragments(conversationTopicSegment.getConversationId(), "/topics" + conversationTopicSegment.getQuery().toQueryString());
            }
            if (this instanceof SynchronizeFragments) {
                SynchronizeFragments synchronizeFragments = (SynchronizeFragments) this;
                return endpoint.conversationSynchronize(synchronizeFragments.getConversationId(), synchronizeFragments.getQuery().toQueryString());
            }
            if (this instanceof DeleteConversations) {
                return endpoint.deleteConversations();
            }
            if (this instanceof DeleteConversation) {
                return endpoint.deleteConversation(((DeleteConversation) this).getConversationId());
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        private Payload() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u000fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$SyncQuery;", "", "syncToken", "", "paginationMaxResults", "Lkotlin/UInt;", "<init>", "(Ljava/lang/String;Lkotlin/UInt;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSyncToken", "()Ljava/lang/String;", "getPaginationMaxResults-0hXNFcg", "()Lkotlin/UInt;", "toQueryString", "component1", "component2", "component2-0hXNFcg", "copy", "copy-FrkygD8", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationServiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$SyncQuery\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1#2:387\n*E\n"})
    public static final /* data */ class SyncQuery {

        @Nullable
        private final UInt paginationMaxResults;

        @Nullable
        private final String syncToken;

        public /* synthetic */ SyncQuery(String str, UInt uInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uInt, null);
        }

        /* renamed from: copy-FrkygD8$default, reason: not valid java name */
        public static /* synthetic */ SyncQuery m15029copyFrkygD8$default(SyncQuery syncQuery, String str, UInt uInt, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncQuery.syncToken;
            }
            if ((i & 2) != 0) {
                uInt = syncQuery.paginationMaxResults;
            }
            return syncQuery.m15031copyFrkygD8(str, uInt);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getSyncToken() {
            return this.syncToken;
        }

        @Nullable
        /* renamed from: component2-0hXNFcg, reason: not valid java name and from getter */
        public final UInt getPaginationMaxResults() {
            return this.paginationMaxResults;
        }

        @NotNull
        /* renamed from: copy-FrkygD8, reason: not valid java name */
        public final SyncQuery m15031copyFrkygD8(@Nullable String syncToken, @Nullable UInt paginationMaxResults) {
            return new SyncQuery(syncToken, paginationMaxResults, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncQuery)) {
                return false;
            }
            SyncQuery syncQuery = (SyncQuery) other;
            return Intrinsics.areEqual(this.syncToken, syncQuery.syncToken) && Intrinsics.areEqual(this.paginationMaxResults, syncQuery.paginationMaxResults);
        }

        @Nullable
        /* renamed from: getPaginationMaxResults-0hXNFcg, reason: not valid java name */
        public final UInt m15032getPaginationMaxResults0hXNFcg() {
            return this.paginationMaxResults;
        }

        @Nullable
        public final String getSyncToken() {
            return this.syncToken;
        }

        public int hashCode() {
            String str = this.syncToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UInt uInt = this.paginationMaxResults;
            return hashCode + (uInt != null ? UInt.m25401hashCodeimpl(uInt.getData()) : 0);
        }

        @NotNull
        public final String toQueryString() {
            ArrayList arrayList = new ArrayList();
            String str = this.syncToken;
            if (str != null) {
                arrayList.add("token=".concat(str));
            }
            UInt uInt = this.paginationMaxResults;
            if (uInt != null) {
                arrayList.add("pagination.maxResults=" + UInt.m25435toStringimpl(uInt.getData()));
            }
            return arrayList.isEmpty() ? "" : a$$ExternalSyntheticOutline0.m("?", CollectionsKt.joinToString$default(arrayList, WebConstants.UriConstants.AMPERSAND_KEY, null, null, null, 62));
        }

        @NotNull
        public String toString() {
            return "SyncQuery(syncToken=" + this.syncToken + ", paginationMaxResults=" + this.paginationMaxResults + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        private SyncQuery(String str, UInt uInt) {
            this.syncToken = str;
            this.paginationMaxResults = uInt;
        }

        public /* synthetic */ SyncQuery(String str, UInt uInt, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uInt);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0010J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$TopicsQuery;", "", "paginationContext", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "paginationMaxResults", "Lkotlin/UInt;", "<init>", "(Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;Lkotlin/UInt;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPaginationContext", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "getPaginationMaxResults-0hXNFcg", "()Lkotlin/UInt;", "toQueryString", "", "component1", "component2", "component2-0hXNFcg", "copy", "copy-FrkygD8", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationServiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$TopicsQuery\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1#2:387\n*E\n"})
    public static final /* data */ class TopicsQuery {

        @Nullable
        private final PaginationToken paginationContext;

        @Nullable
        private final UInt paginationMaxResults;

        public /* synthetic */ TopicsQuery(PaginationToken paginationToken, UInt uInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paginationToken, (i & 2) != 0 ? null : uInt, null);
        }

        /* renamed from: copy-FrkygD8$default, reason: not valid java name */
        public static /* synthetic */ TopicsQuery m15033copyFrkygD8$default(TopicsQuery topicsQuery, PaginationToken paginationToken, UInt uInt, int i, Object obj) {
            if ((i & 1) != 0) {
                paginationToken = topicsQuery.paginationContext;
            }
            if ((i & 2) != 0) {
                uInt = topicsQuery.paginationMaxResults;
            }
            return topicsQuery.m15035copyFrkygD8(paginationToken, uInt);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final PaginationToken getPaginationContext() {
            return this.paginationContext;
        }

        @Nullable
        /* renamed from: component2-0hXNFcg, reason: not valid java name and from getter */
        public final UInt getPaginationMaxResults() {
            return this.paginationMaxResults;
        }

        @NotNull
        /* renamed from: copy-FrkygD8, reason: not valid java name */
        public final TopicsQuery m15035copyFrkygD8(@Nullable PaginationToken paginationContext, @Nullable UInt paginationMaxResults) {
            return new TopicsQuery(paginationContext, paginationMaxResults, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopicsQuery)) {
                return false;
            }
            TopicsQuery topicsQuery = (TopicsQuery) other;
            return Intrinsics.areEqual(this.paginationContext, topicsQuery.paginationContext) && Intrinsics.areEqual(this.paginationMaxResults, topicsQuery.paginationMaxResults);
        }

        @Nullable
        public final PaginationToken getPaginationContext() {
            return this.paginationContext;
        }

        @Nullable
        /* renamed from: getPaginationMaxResults-0hXNFcg, reason: not valid java name */
        public final UInt m15036getPaginationMaxResults0hXNFcg() {
            return this.paginationMaxResults;
        }

        public int hashCode() {
            PaginationToken paginationToken = this.paginationContext;
            int hashCode = (paginationToken == null ? 0 : paginationToken.hashCode()) * 31;
            UInt uInt = this.paginationMaxResults;
            return hashCode + (uInt != null ? UInt.m25401hashCodeimpl(uInt.getData()) : 0);
        }

        @NotNull
        public final String toQueryString() {
            ArrayList arrayList = new ArrayList();
            PaginationToken paginationToken = this.paginationContext;
            if (paginationToken != null) {
                arrayList.add(paginationToken.getQueryParameterName() + "=" + paginationToken.getToken());
            }
            UInt uInt = this.paginationMaxResults;
            if (uInt != null) {
                arrayList.add("paginationContext.maxResults=" + UInt.m25435toStringimpl(uInt.getData()));
            }
            return arrayList.isEmpty() ? "" : a$$ExternalSyntheticOutline0.m("?", CollectionsKt.joinToString$default(arrayList, WebConstants.UriConstants.AMPERSAND_KEY, null, null, null, 62));
        }

        @NotNull
        public String toString() {
            return "TopicsQuery(paginationContext=" + this.paginationContext + ", paginationMaxResults=" + this.paginationMaxResults + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        private TopicsQuery(PaginationToken paginationToken, UInt uInt) {
            this.paginationContext = paginationToken;
            this.paginationMaxResults = uInt;
        }

        public /* synthetic */ TopicsQuery(PaginationToken paginationToken, UInt uInt, DefaultConstructorMarker defaultConstructorMarker) {
            this(paginationToken, uInt);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery;", "", "paginationContext", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "paginationMaxResults", "Lkotlin/UInt;", AlexaFragmentsPaginationContextBundleKeys.RETRIEVAL_MODE, "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$RetrievalMode;", "<init>", "(Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;Lkotlin/UInt;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$RetrievalMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPaginationContext", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationContext;", "getPaginationMaxResults-0hXNFcg", "()Lkotlin/UInt;", "getRetrievalMode", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$RetrievalMode;", "toQueryString", "", "component1", "component2", "component2-0hXNFcg", "component3", "copy", "copy-SLwFa_Y", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationServiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1563#2:387\n1634#2,3:388\n1#3:391\n*S KotlinDebug\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FragmentsQuery\n*L\n311#1:387\n311#1:388,3\n*E\n"})
    public static final /* data */ class FragmentsQuery {

        @Nullable
        private final PaginationContext paginationContext;

        @Nullable
        private final UInt paginationMaxResults;

        @Nullable
        private final RetrievalMode retrievalMode;

        public /* synthetic */ FragmentsQuery(PaginationContext paginationContext, UInt uInt, RetrievalMode retrievalMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paginationContext, (i & 2) != 0 ? null : uInt, (i & 4) != 0 ? null : retrievalMode, null);
        }

        /* renamed from: copy-SLwFa_Y$default, reason: not valid java name */
        public static /* synthetic */ FragmentsQuery m15025copySLwFa_Y$default(FragmentsQuery fragmentsQuery, PaginationContext paginationContext, UInt uInt, RetrievalMode retrievalMode, int i, Object obj) {
            if ((i & 1) != 0) {
                paginationContext = fragmentsQuery.paginationContext;
            }
            if ((i & 2) != 0) {
                uInt = fragmentsQuery.paginationMaxResults;
            }
            if ((i & 4) != 0) {
                retrievalMode = fragmentsQuery.retrievalMode;
            }
            return fragmentsQuery.m15027copySLwFa_Y(paginationContext, uInt, retrievalMode);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final PaginationContext getPaginationContext() {
            return this.paginationContext;
        }

        @Nullable
        /* renamed from: component2-0hXNFcg, reason: not valid java name and from getter */
        public final UInt getPaginationMaxResults() {
            return this.paginationMaxResults;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final RetrievalMode getRetrievalMode() {
            return this.retrievalMode;
        }

        @NotNull
        /* renamed from: copy-SLwFa_Y, reason: not valid java name */
        public final FragmentsQuery m15027copySLwFa_Y(@Nullable PaginationContext paginationContext, @Nullable UInt paginationMaxResults, @Nullable RetrievalMode retrievalMode) {
            return new FragmentsQuery(paginationContext, paginationMaxResults, retrievalMode, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FragmentsQuery)) {
                return false;
            }
            FragmentsQuery fragmentsQuery = (FragmentsQuery) other;
            return Intrinsics.areEqual(this.paginationContext, fragmentsQuery.paginationContext) && Intrinsics.areEqual(this.paginationMaxResults, fragmentsQuery.paginationMaxResults) && this.retrievalMode == fragmentsQuery.retrievalMode;
        }

        @Nullable
        public final PaginationContext getPaginationContext() {
            return this.paginationContext;
        }

        @Nullable
        /* renamed from: getPaginationMaxResults-0hXNFcg, reason: not valid java name */
        public final UInt m15028getPaginationMaxResults0hXNFcg() {
            return this.paginationMaxResults;
        }

        @Nullable
        public final RetrievalMode getRetrievalMode() {
            return this.retrievalMode;
        }

        public int hashCode() {
            PaginationContext paginationContext = this.paginationContext;
            int hashCode = (paginationContext == null ? 0 : paginationContext.hashCode()) * 31;
            UInt uInt = this.paginationMaxResults;
            int m25401hashCodeimpl = (hashCode + (uInt == null ? 0 : UInt.m25401hashCodeimpl(uInt.getData()))) * 31;
            RetrievalMode retrievalMode = this.retrievalMode;
            return m25401hashCodeimpl + (retrievalMode != null ? retrievalMode.hashCode() : 0);
        }

        @NotNull
        public final String toQueryString() {
            ArrayList arrayList = new ArrayList();
            PaginationContext paginationContext = this.paginationContext;
            if (paginationContext != null) {
                List<Pair<String, String>> queryParameters = paginationContext.toQueryParameters();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(queryParameters, 10));
                Iterator<T> it2 = queryParameters.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    arrayList2.add(pair.getFirst() + "=" + pair.getSecond());
                }
                arrayList.addAll(arrayList2);
            }
            UInt uInt = this.paginationMaxResults;
            if (uInt != null) {
                arrayList.add("pagination.maxResults=" + UInt.m25435toStringimpl(uInt.getData()));
            }
            RetrievalMode retrievalMode = this.retrievalMode;
            if (retrievalMode != null) {
                arrayList.add(((Object) retrievalMode.toQueryParameter().getFirst()) + "=" + ((Object) retrievalMode.toQueryParameter().getSecond()));
            }
            return arrayList.isEmpty() ? "" : a$$ExternalSyntheticOutline0.m("?", CollectionsKt.joinToString$default(arrayList, WebConstants.UriConstants.AMPERSAND_KEY, null, null, null, 62));
        }

        @NotNull
        public String toString() {
            return "FragmentsQuery(paginationContext=" + this.paginationContext + ", paginationMaxResults=" + this.paginationMaxResults + ", retrievalMode=" + this.retrievalMode + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        private FragmentsQuery(PaginationContext paginationContext, UInt uInt, RetrievalMode retrievalMode) {
            this.paginationContext = paginationContext;
            this.paginationMaxResults = uInt;
            this.retrievalMode = retrievalMode;
        }

        public /* synthetic */ FragmentsQuery(PaginationContext paginationContext, UInt uInt, RetrievalMode retrievalMode, DefaultConstructorMarker defaultConstructorMarker) {
            this(paginationContext, uInt, retrievalMode);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery;", "", "associatedPersonFilter", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", "exclusionFilters", "", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ExclusionFilter;", "filterStrategy", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "paginationToken", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "paginationMaxResults", "Lkotlin/UInt;", "<init>", "(Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;Ljava/util/List;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;Lkotlin/UInt;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssociatedPersonFilter", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$AssociatedPersonFilter;", "getExclusionFilters", "()Ljava/util/List;", "getFilterStrategy", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$FilterStrategy;", "getPaginationToken", "()Lcom/amazon/alexa/assistant/conversation/ConversationServiceRequest$PaginationToken;", "getPaginationMaxResults-0hXNFcg", "()Lkotlin/UInt;", "toQueryString", "", "component1", "component2", "component3", "component4", "component5", "component5-0hXNFcg", "copy", "copy-H3638Bo", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationServiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1563#2:387\n1634#2,3:388\n1563#2:391\n1634#2,3:392\n1#3:395\n*S KotlinDebug\n*F\n+ 1 ConversationServiceRequest.kt\ncom/amazon/alexa/assistant/conversation/ConversationServiceRequest$ConversationsQuery\n*L\n281#1:387\n281#1:388,3\n285#1:391\n285#1:392,3\n*E\n"})
    public static final /* data */ class ConversationsQuery {

        @Nullable
        private final AssociatedPersonFilter associatedPersonFilter;

        @Nullable
        private final List<ExclusionFilter> exclusionFilters;

        @Nullable
        private final FilterStrategy filterStrategy;

        @Nullable
        private final UInt paginationMaxResults;

        @Nullable
        private final PaginationToken paginationToken;

        public /* synthetic */ ConversationsQuery(AssociatedPersonFilter associatedPersonFilter, List list, FilterStrategy filterStrategy, PaginationToken paginationToken, UInt uInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : associatedPersonFilter, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : filterStrategy, (i & 8) != 0 ? null : paginationToken, (i & 16) != 0 ? null : uInt, null);
        }

        /* renamed from: copy-H3638Bo$default, reason: not valid java name */
        public static /* synthetic */ ConversationsQuery m15021copyH3638Bo$default(ConversationsQuery conversationsQuery, AssociatedPersonFilter associatedPersonFilter, List list, FilterStrategy filterStrategy, PaginationToken paginationToken, UInt uInt, int i, Object obj) {
            if ((i & 1) != 0) {
                associatedPersonFilter = conversationsQuery.associatedPersonFilter;
            }
            if ((i & 2) != 0) {
                list = conversationsQuery.exclusionFilters;
            }
            if ((i & 4) != 0) {
                filterStrategy = conversationsQuery.filterStrategy;
            }
            if ((i & 8) != 0) {
                paginationToken = conversationsQuery.paginationToken;
            }
            if ((i & 16) != 0) {
                uInt = conversationsQuery.paginationMaxResults;
            }
            UInt uInt2 = uInt;
            FilterStrategy filterStrategy2 = filterStrategy;
            return conversationsQuery.m15023copyH3638Bo(associatedPersonFilter, list, filterStrategy2, paginationToken, uInt2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final AssociatedPersonFilter getAssociatedPersonFilter() {
            return this.associatedPersonFilter;
        }

        @Nullable
        public final List<ExclusionFilter> component2() {
            return this.exclusionFilters;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final FilterStrategy getFilterStrategy() {
            return this.filterStrategy;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final PaginationToken getPaginationToken() {
            return this.paginationToken;
        }

        @Nullable
        /* renamed from: component5-0hXNFcg, reason: not valid java name and from getter */
        public final UInt getPaginationMaxResults() {
            return this.paginationMaxResults;
        }

        @NotNull
        /* renamed from: copy-H3638Bo, reason: not valid java name */
        public final ConversationsQuery m15023copyH3638Bo(@Nullable AssociatedPersonFilter associatedPersonFilter, @Nullable List<? extends ExclusionFilter> exclusionFilters, @Nullable FilterStrategy filterStrategy, @Nullable PaginationToken paginationToken, @Nullable UInt paginationMaxResults) {
            return new ConversationsQuery(associatedPersonFilter, exclusionFilters, filterStrategy, paginationToken, paginationMaxResults, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationsQuery)) {
                return false;
            }
            ConversationsQuery conversationsQuery = (ConversationsQuery) other;
            return Intrinsics.areEqual(this.associatedPersonFilter, conversationsQuery.associatedPersonFilter) && Intrinsics.areEqual(this.exclusionFilters, conversationsQuery.exclusionFilters) && this.filterStrategy == conversationsQuery.filterStrategy && Intrinsics.areEqual(this.paginationToken, conversationsQuery.paginationToken) && Intrinsics.areEqual(this.paginationMaxResults, conversationsQuery.paginationMaxResults);
        }

        @Nullable
        public final AssociatedPersonFilter getAssociatedPersonFilter() {
            return this.associatedPersonFilter;
        }

        @Nullable
        public final List<ExclusionFilter> getExclusionFilters() {
            return this.exclusionFilters;
        }

        @Nullable
        public final FilterStrategy getFilterStrategy() {
            return this.filterStrategy;
        }

        @Nullable
        /* renamed from: getPaginationMaxResults-0hXNFcg, reason: not valid java name */
        public final UInt m15024getPaginationMaxResults0hXNFcg() {
            return this.paginationMaxResults;
        }

        @Nullable
        public final PaginationToken getPaginationToken() {
            return this.paginationToken;
        }

        public int hashCode() {
            AssociatedPersonFilter associatedPersonFilter = this.associatedPersonFilter;
            int hashCode = (associatedPersonFilter == null ? 0 : associatedPersonFilter.hashCode()) * 31;
            List<ExclusionFilter> list = this.exclusionFilters;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            FilterStrategy filterStrategy = this.filterStrategy;
            int hashCode3 = (hashCode2 + (filterStrategy == null ? 0 : filterStrategy.hashCode())) * 31;
            PaginationToken paginationToken = this.paginationToken;
            int hashCode4 = (hashCode3 + (paginationToken == null ? 0 : paginationToken.hashCode())) * 31;
            UInt uInt = this.paginationMaxResults;
            return hashCode4 + (uInt != null ? UInt.m25401hashCodeimpl(uInt.getData()) : 0);
        }

        @NotNull
        public final String toQueryString() {
            Pair<String, String> queryParameter$voice_release;
            ArrayList arrayList = new ArrayList();
            AssociatedPersonFilter associatedPersonFilter = this.associatedPersonFilter;
            if (associatedPersonFilter != null) {
                List<Pair<String, String>> queryParameters = associatedPersonFilter.toQueryParameters();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(queryParameters, 10));
                Iterator<T> it2 = queryParameters.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    arrayList2.add(pair.getFirst() + "=" + pair.getSecond());
                }
                arrayList.addAll(arrayList2);
            }
            List<ExclusionFilter> list = this.exclusionFilters;
            if (list != null) {
                List<ExclusionFilter> list2 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (ExclusionFilter exclusionFilter : list2) {
                    arrayList3.add(((Object) exclusionFilter.toQueryParameter().getFirst()) + "=" + ((Object) exclusionFilter.toQueryParameter().getSecond()));
                }
                arrayList.addAll(arrayList3);
            }
            FilterStrategy filterStrategy = this.filterStrategy;
            if (filterStrategy != null && (queryParameter$voice_release = filterStrategy.toQueryParameter$voice_release()) != null) {
                arrayList.add(((Object) queryParameter$voice_release.getFirst()) + "=" + ((Object) queryParameter$voice_release.getSecond()));
            }
            PaginationToken paginationToken = this.paginationToken;
            if (paginationToken != null) {
                arrayList.add(paginationToken.getQueryParameterName() + "=" + paginationToken.getToken());
            }
            UInt uInt = this.paginationMaxResults;
            if (uInt != null) {
                arrayList.add("pagination.maxResults=" + UInt.m25435toStringimpl(uInt.getData()));
            }
            return arrayList.isEmpty() ? "" : a$$ExternalSyntheticOutline0.m("?", CollectionsKt.joinToString$default(arrayList, WebConstants.UriConstants.AMPERSAND_KEY, null, null, null, 62));
        }

        @NotNull
        public String toString() {
            return "ConversationsQuery(associatedPersonFilter=" + this.associatedPersonFilter + ", exclusionFilters=" + this.exclusionFilters + ", filterStrategy=" + this.filterStrategy + ", paginationToken=" + this.paginationToken + ", paginationMaxResults=" + this.paginationMaxResults + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ConversationsQuery(AssociatedPersonFilter associatedPersonFilter, List<? extends ExclusionFilter> list, FilterStrategy filterStrategy, PaginationToken paginationToken, UInt uInt) {
            this.associatedPersonFilter = associatedPersonFilter;
            this.exclusionFilters = list;
            this.filterStrategy = filterStrategy;
            this.paginationToken = paginationToken;
            this.paginationMaxResults = uInt;
        }

        public /* synthetic */ ConversationsQuery(AssociatedPersonFilter associatedPersonFilter, List list, FilterStrategy filterStrategy, PaginationToken paginationToken, UInt uInt, DefaultConstructorMarker defaultConstructorMarker) {
            this(associatedPersonFilter, list, filterStrategy, paginationToken, uInt);
        }
    }
}
