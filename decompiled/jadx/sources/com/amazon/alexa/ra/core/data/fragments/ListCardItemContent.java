package com.amazon.alexa.ra.core.data.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.sharing.api.models.PayloadAttachmentUrl;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ListCardItemContent;", "", "text", "", "subText", PayloadAttachmentUrl.SERIALIZED_NAME_THUMBNAIL_URL, "thumbnailIcon", "thumbnailAltText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubText", "getThumbnailUrl", "getThumbnailIcon", "getThumbnailAltText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ListCardItemContent {
    public static final int $stable = 0;

    @Nullable
    private final String subText;

    @NotNull
    private final String text;

    @Nullable
    private final String thumbnailAltText;

    @Nullable
    private final String thumbnailIcon;

    @Nullable
    private final String thumbnailUrl;

    public /* synthetic */ ListCardItemContent(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ ListCardItemContent copy$default(ListCardItemContent listCardItemContent, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listCardItemContent.text;
        }
        if ((i & 2) != 0) {
            str2 = listCardItemContent.subText;
        }
        if ((i & 4) != 0) {
            str3 = listCardItemContent.thumbnailUrl;
        }
        if ((i & 8) != 0) {
            str4 = listCardItemContent.thumbnailIcon;
        }
        if ((i & 16) != 0) {
            str5 = listCardItemContent.thumbnailAltText;
        }
        String str6 = str5;
        String str7 = str3;
        return listCardItemContent.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getThumbnailIcon() {
        return this.thumbnailIcon;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getThumbnailAltText() {
        return this.thumbnailAltText;
    }

    @NotNull
    public final ListCardItemContent copy(@NotNull String text, @Nullable String subText, @Nullable String thumbnailUrl, @Nullable String thumbnailIcon, @Nullable String thumbnailAltText) {
        text.getClass();
        return new ListCardItemContent(text, subText, thumbnailUrl, thumbnailIcon, thumbnailAltText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListCardItemContent)) {
            return false;
        }
        ListCardItemContent listCardItemContent = (ListCardItemContent) other;
        return Intrinsics.areEqual(this.text, listCardItemContent.text) && Intrinsics.areEqual(this.subText, listCardItemContent.subText) && Intrinsics.areEqual(this.thumbnailUrl, listCardItemContent.thumbnailUrl) && Intrinsics.areEqual(this.thumbnailIcon, listCardItemContent.thumbnailIcon) && Intrinsics.areEqual(this.thumbnailAltText, listCardItemContent.thumbnailAltText);
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getThumbnailAltText() {
        return this.thumbnailAltText;
    }

    @Nullable
    public final String getThumbnailIcon() {
        return this.thumbnailIcon;
    }

    @Nullable
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.subText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbnailUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailIcon;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumbnailAltText;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.subText;
        String str3 = this.thumbnailUrl;
        String str4 = this.thumbnailIcon;
        String str5 = this.thumbnailAltText;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ListCardItemContent(text=", str, ", subText=", str2, ", thumbnailUrl=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", thumbnailIcon=", str4, ", thumbnailAltText=");
        return a$$ExternalSyntheticOutline0.m(m, str5, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ListCardItemContent(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        str.getClass();
        this.text = str;
        this.subText = str2;
        this.thumbnailUrl = str3;
        this.thumbnailIcon = str4;
        this.thumbnailAltText = str5;
    }
}
