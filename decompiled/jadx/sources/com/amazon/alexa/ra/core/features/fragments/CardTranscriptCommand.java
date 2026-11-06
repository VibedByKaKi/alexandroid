package com.amazon.alexa.ra.core.features.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.api.ApiCallback;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/CardTranscriptCommand;", "", "<init>", "()V", "FetchItemFragments", "Lcom/amazon/alexa/ra/core/features/fragments/CardTranscriptCommand$FetchItemFragments;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class CardTranscriptCommand {
    public static final int $stable = 0;

    public /* synthetic */ CardTranscriptCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardTranscriptCommand() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/CardTranscriptCommand$FetchItemFragments;", "Lcom/amazon/alexa/ra/core/features/fragments/CardTranscriptCommand;", "itemId", "", "before", "after", "apiCallback", "Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/api/ApiCallback;)V", "getItemId", "()Ljava/lang/String;", "getBefore", "getAfter", "getApiCallback", "()Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchItemFragments extends CardTranscriptCommand {
        public static final int $stable = 8;

        @Nullable
        private final String after;

        @NotNull
        private final ApiCallback apiCallback;

        @Nullable
        private final String before;

        @NotNull
        private final String itemId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchItemFragments(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull ApiCallback apiCallback) {
            super(null);
            str.getClass();
            apiCallback.getClass();
            this.itemId = str;
            this.before = str2;
            this.after = str3;
            this.apiCallback = apiCallback;
        }

        public static /* synthetic */ FetchItemFragments copy$default(FetchItemFragments fetchItemFragments, String str, String str2, String str3, ApiCallback apiCallback, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchItemFragments.itemId;
            }
            if ((i & 2) != 0) {
                str2 = fetchItemFragments.before;
            }
            if ((i & 4) != 0) {
                str3 = fetchItemFragments.after;
            }
            if ((i & 8) != 0) {
                apiCallback = fetchItemFragments.apiCallback;
            }
            return fetchItemFragments.copy(str, str2, str3, apiCallback);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getBefore() {
            return this.before;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getAfter() {
            return this.after;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ApiCallback getApiCallback() {
            return this.apiCallback;
        }

        @NotNull
        public final FetchItemFragments copy(@NotNull String itemId, @Nullable String before, @Nullable String after, @NotNull ApiCallback apiCallback) {
            itemId.getClass();
            apiCallback.getClass();
            return new FetchItemFragments(itemId, before, after, apiCallback);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchItemFragments)) {
                return false;
            }
            FetchItemFragments fetchItemFragments = (FetchItemFragments) other;
            return Intrinsics.areEqual(this.itemId, fetchItemFragments.itemId) && Intrinsics.areEqual(this.before, fetchItemFragments.before) && Intrinsics.areEqual(this.after, fetchItemFragments.after) && Intrinsics.areEqual(this.apiCallback, fetchItemFragments.apiCallback);
        }

        @Nullable
        public final String getAfter() {
            return this.after;
        }

        @NotNull
        public final ApiCallback getApiCallback() {
            return this.apiCallback;
        }

        @Nullable
        public final String getBefore() {
            return this.before;
        }

        @NotNull
        public final String getItemId() {
            return this.itemId;
        }

        public int hashCode() {
            int hashCode = this.itemId.hashCode() * 31;
            String str = this.before;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.after;
            return this.apiCallback.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.itemId;
            String str2 = this.before;
            String str3 = this.after;
            ApiCallback apiCallback = this.apiCallback;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FetchItemFragments(itemId=", str, ", before=", str2, ", after=");
            m.append(str3);
            m.append(", apiCallback=");
            m.append(apiCallback);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        public /* synthetic */ FetchItemFragments(String str, String str2, String str3, ApiCallback apiCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, apiCallback);
        }
    }
}
