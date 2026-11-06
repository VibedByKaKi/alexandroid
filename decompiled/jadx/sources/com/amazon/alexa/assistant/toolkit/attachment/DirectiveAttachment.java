package com.amazon.alexa.assistant.toolkit.attachment;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;", "", "data", "", "contentId", "", "isFinished", "", "<init>", "([BLjava/lang/String;Z)V", "getData", "()[B", "getContentId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DirectiveAttachment {

    @NotNull
    private final String contentId;

    @NotNull
    private final byte[] data;
    private final boolean isFinished;

    public DirectiveAttachment(@NotNull byte[] bArr, @NotNull String str, boolean z) {
        bArr.getClass();
        str.getClass();
        this.data = bArr;
        this.contentId = str;
        this.isFinished = z;
    }

    public static /* synthetic */ DirectiveAttachment copy$default(DirectiveAttachment directiveAttachment, byte[] bArr, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = directiveAttachment.data;
        }
        if ((i & 2) != 0) {
            str = directiveAttachment.contentId;
        }
        if ((i & 4) != 0) {
            z = directiveAttachment.isFinished;
        }
        return directiveAttachment.copy(bArr, str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @NotNull
    public final DirectiveAttachment copy(@NotNull byte[] data, @NotNull String contentId, boolean isFinished) {
        data.getClass();
        contentId.getClass();
        return new DirectiveAttachment(data, contentId, isFinished);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectiveAttachment)) {
            return false;
        }
        DirectiveAttachment directiveAttachment = (DirectiveAttachment) other;
        return Intrinsics.areEqual(this.data, directiveAttachment.data) && Intrinsics.areEqual(this.contentId, directiveAttachment.contentId) && this.isFinished == directiveAttachment.isFinished;
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFinished) + ArcMode$$ExternalSyntheticOutline0.m(Arrays.hashCode(this.data) * 31, 31, this.contentId);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(this.data);
        String str = this.contentId;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DirectiveAttachment(data=", arrays, ", contentId=", str, ", isFinished="), this.isFinished, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ DirectiveAttachment(byte[] bArr, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, str, (i & 4) != 0 ? true : z);
    }
}
