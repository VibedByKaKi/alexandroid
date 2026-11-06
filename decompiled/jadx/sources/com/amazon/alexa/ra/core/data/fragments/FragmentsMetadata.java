package com.amazon.alexa.ra.core.data.fragments;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsMetadataBundleKeys;
import com.amazon.alexa.ra.core.data.model.Source;
import com.amazon.alexa.ra.core.features.fragments.PaginationContextData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/FragmentsMetadata;", "", "source", "Lcom/amazon/alexa/ra/core/data/model/Source;", "conversationId", "", "paginationContext", "Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "dialogRequestId", "latestAlexaResponseFragmentUri", "displayHint", "purpose", "Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_FRAGMENT_URI, AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_TIMESTAMP, "itemId", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/Source;Ljava/lang/String;Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/Purpose;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Lcom/amazon/alexa/ra/core/data/model/Source;", "getConversationId", "()Ljava/lang/String;", "getPaginationContext", "()Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "getDialogRequestId", "getLatestAlexaResponseFragmentUri", "getDisplayHint", "getPurpose", "()Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", "getLastSignificantTurnFragmentUri", "getLastSignificantTurnTimestamp", "getItemId", "topicId", "getTopicId", "setTopicId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentsMetadata {
    public static final int $stable = 8;

    @Nullable
    private final String conversationId;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String displayHint;

    @Nullable
    private final String itemId;

    @Nullable
    private final String lastSignificantTurnFragmentUri;

    @Nullable
    private final String lastSignificantTurnTimestamp;

    @Nullable
    private final String latestAlexaResponseFragmentUri;

    @Nullable
    private final PaginationContextData paginationContext;

    @Nullable
    private final Purpose purpose;

    @NotNull
    private final Source source;

    @Nullable
    private String topicId;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FragmentsMetadata(com.amazon.alexa.ra.core.data.model.Source r2, java.lang.String r3, com.amazon.alexa.ra.core.features.fragments.PaginationContextData r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.amazon.alexa.ra.core.data.fragments.Purpose r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            com.amazon.alexa.ra.core.data.model.Source r2 = com.amazon.alexa.ra.core.data.model.Source.ALEXA_RESPONSE
        L6:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lc
            r3 = r0
        Lc:
            r13 = r12 & 4
            if (r13 == 0) goto L11
            r4 = r0
        L11:
            r13 = r12 & 8
            if (r13 == 0) goto L16
            r5 = r0
        L16:
            r13 = r12 & 16
            if (r13 == 0) goto L1b
            r6 = r0
        L1b:
            r13 = r12 & 32
            if (r13 == 0) goto L20
            r7 = r0
        L20:
            r13 = r12 & 64
            if (r13 == 0) goto L25
            r8 = r0
        L25:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2a
            r9 = r0
        L2a:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L2f
            r10 = r0
        L2f:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L3f
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4a
        L3f:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.data.fragments.FragmentsMetadata.<init>(com.amazon.alexa.ra.core.data.model.Source, java.lang.String, com.amazon.alexa.ra.core.features.fragments.PaginationContextData, java.lang.String, java.lang.String, java.lang.String, com.amazon.alexa.ra.core.data.fragments.Purpose, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ FragmentsMetadata copy$default(FragmentsMetadata fragmentsMetadata, Source source, String str, PaginationContextData paginationContextData, String str2, String str3, String str4, Purpose purpose, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            source = fragmentsMetadata.source;
        }
        if ((i & 2) != 0) {
            str = fragmentsMetadata.conversationId;
        }
        if ((i & 4) != 0) {
            paginationContextData = fragmentsMetadata.paginationContext;
        }
        if ((i & 8) != 0) {
            str2 = fragmentsMetadata.dialogRequestId;
        }
        if ((i & 16) != 0) {
            str3 = fragmentsMetadata.latestAlexaResponseFragmentUri;
        }
        if ((i & 32) != 0) {
            str4 = fragmentsMetadata.displayHint;
        }
        if ((i & 64) != 0) {
            purpose = fragmentsMetadata.purpose;
        }
        if ((i & 128) != 0) {
            str5 = fragmentsMetadata.lastSignificantTurnFragmentUri;
        }
        if ((i & 256) != 0) {
            str6 = fragmentsMetadata.lastSignificantTurnTimestamp;
        }
        if ((i & 512) != 0) {
            str7 = fragmentsMetadata.itemId;
        }
        String str8 = str6;
        String str9 = str7;
        Purpose purpose2 = purpose;
        String str10 = str5;
        String str11 = str3;
        String str12 = str4;
        return fragmentsMetadata.copy(source, str, paginationContextData, str2, str11, str12, purpose2, str10, str8, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final PaginationContextData getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getLatestAlexaResponseFragmentUri() {
        return this.latestAlexaResponseFragmentUri;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDisplayHint() {
        return this.displayHint;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Purpose getPurpose() {
        return this.purpose;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getLastSignificantTurnFragmentUri() {
        return this.lastSignificantTurnFragmentUri;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getLastSignificantTurnTimestamp() {
        return this.lastSignificantTurnTimestamp;
    }

    @NotNull
    public final FragmentsMetadata copy(@NotNull Source source, @Nullable String conversationId, @Nullable PaginationContextData paginationContext, @Nullable String dialogRequestId, @Nullable String latestAlexaResponseFragmentUri, @Nullable String displayHint, @Nullable Purpose purpose, @Nullable String lastSignificantTurnFragmentUri, @Nullable String lastSignificantTurnTimestamp, @Nullable String itemId) {
        source.getClass();
        return new FragmentsMetadata(source, conversationId, paginationContext, dialogRequestId, latestAlexaResponseFragmentUri, displayHint, purpose, lastSignificantTurnFragmentUri, lastSignificantTurnTimestamp, itemId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentsMetadata)) {
            return false;
        }
        FragmentsMetadata fragmentsMetadata = (FragmentsMetadata) other;
        return this.source == fragmentsMetadata.source && Intrinsics.areEqual(this.conversationId, fragmentsMetadata.conversationId) && Intrinsics.areEqual(this.paginationContext, fragmentsMetadata.paginationContext) && Intrinsics.areEqual(this.dialogRequestId, fragmentsMetadata.dialogRequestId) && Intrinsics.areEqual(this.latestAlexaResponseFragmentUri, fragmentsMetadata.latestAlexaResponseFragmentUri) && Intrinsics.areEqual(this.displayHint, fragmentsMetadata.displayHint) && this.purpose == fragmentsMetadata.purpose && Intrinsics.areEqual(this.lastSignificantTurnFragmentUri, fragmentsMetadata.lastSignificantTurnFragmentUri) && Intrinsics.areEqual(this.lastSignificantTurnTimestamp, fragmentsMetadata.lastSignificantTurnTimestamp) && Intrinsics.areEqual(this.itemId, fragmentsMetadata.itemId);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getDisplayHint() {
        return this.displayHint;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getLastSignificantTurnFragmentUri() {
        return this.lastSignificantTurnFragmentUri;
    }

    @Nullable
    public final String getLastSignificantTurnTimestamp() {
        return this.lastSignificantTurnTimestamp;
    }

    @Nullable
    public final String getLatestAlexaResponseFragmentUri() {
        return this.latestAlexaResponseFragmentUri;
    }

    @Nullable
    public final PaginationContextData getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    public final Purpose getPurpose() {
        return this.purpose;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.conversationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaginationContextData paginationContextData = this.paginationContext;
        int hashCode3 = (hashCode2 + (paginationContextData == null ? 0 : paginationContextData.hashCode())) * 31;
        String str2 = this.dialogRequestId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.latestAlexaResponseFragmentUri;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayHint;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Purpose purpose = this.purpose;
        int hashCode7 = (hashCode6 + (purpose == null ? 0 : purpose.hashCode())) * 31;
        String str5 = this.lastSignificantTurnFragmentUri;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastSignificantTurnTimestamp;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.itemId;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setTopicId(@Nullable String str) {
        this.topicId = str;
    }

    @NotNull
    public String toString() {
        Source source = this.source;
        String str = this.conversationId;
        PaginationContextData paginationContextData = this.paginationContext;
        String str2 = this.dialogRequestId;
        String str3 = this.latestAlexaResponseFragmentUri;
        String str4 = this.displayHint;
        Purpose purpose = this.purpose;
        String str5 = this.lastSignificantTurnFragmentUri;
        String str6 = this.lastSignificantTurnTimestamp;
        String str7 = this.itemId;
        StringBuilder sb = new StringBuilder("FragmentsMetadata(source=");
        sb.append(source);
        sb.append(", conversationId=");
        sb.append(str);
        sb.append(", paginationContext=");
        sb.append(paginationContextData);
        sb.append(", dialogRequestId=");
        sb.append(str2);
        sb.append(", latestAlexaResponseFragmentUri=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str3, ", displayHint=", str4, ", purpose=");
        sb.append(purpose);
        sb.append(", lastSignificantTurnFragmentUri=");
        sb.append(str5);
        sb.append(", lastSignificantTurnTimestamp=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str6, ", itemId=", str7, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public FragmentsMetadata(@NotNull Source source, @Nullable String str, @Nullable PaginationContextData paginationContextData, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Purpose purpose, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        source.getClass();
        this.source = source;
        this.conversationId = str;
        this.paginationContext = paginationContextData;
        this.dialogRequestId = str2;
        this.latestAlexaResponseFragmentUri = str3;
        this.displayHint = str4;
        this.purpose = purpose;
        this.lastSignificantTurnFragmentUri = str5;
        this.lastSignificantTurnTimestamp = str6;
        this.itemId = str7;
    }

    public FragmentsMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
