package com.amazon.alexa.assistant.capability.conversation.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/PaginationContext;", "", "before", "", "after", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBefore", "()Ljava/lang/String;", "getAfter", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaginationContext {

    @Nullable
    private final String after;

    @Nullable
    private final String before;

    public /* synthetic */ PaginationContext(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ PaginationContext copy$default(PaginationContext paginationContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paginationContext.before;
        }
        if ((i & 2) != 0) {
            str2 = paginationContext.after;
        }
        return paginationContext.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBefore() {
        return this.before;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    @NotNull
    public final PaginationContext copy(@Nullable String before, @Nullable String after) {
        return new PaginationContext(before, after);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationContext)) {
            return false;
        }
        PaginationContext paginationContext = (PaginationContext) other;
        return Intrinsics.areEqual(this.before, paginationContext.before) && Intrinsics.areEqual(this.after, paginationContext.after);
    }

    @Nullable
    public final String getAfter() {
        return this.after;
    }

    @Nullable
    public final String getBefore() {
        return this.before;
    }

    public int hashCode() {
        String str = this.before;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.after;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("PaginationContext(before=", this.before, ", after=", this.after, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public PaginationContext(@Nullable String str, @Nullable String str2) {
        this.before = str;
        this.after = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaginationContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
