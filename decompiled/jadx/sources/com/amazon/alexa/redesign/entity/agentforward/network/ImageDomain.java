package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageDomain;", "", "type", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageTypeDomain;", ViewProps.ACCESSIBILITY_LABEL, "", "source", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageTypeDomain;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ImageTypeDomain;", "getAccessibilityLabel", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ImageDomain {
    public static final int $stable = 0;

    @Nullable
    private final String accessibilityLabel;

    @Nullable
    private final String source;

    @Nullable
    private final ImageTypeDomain type;

    public /* synthetic */ ImageDomain(ImageTypeDomain imageTypeDomain, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageTypeDomain, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ ImageDomain copy$default(ImageDomain imageDomain, ImageTypeDomain imageTypeDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            imageTypeDomain = imageDomain.type;
        }
        if ((i & 2) != 0) {
            str = imageDomain.accessibilityLabel;
        }
        if ((i & 4) != 0) {
            str2 = imageDomain.source;
        }
        return imageDomain.copy(imageTypeDomain, str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ImageTypeDomain getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final ImageDomain copy(@Nullable ImageTypeDomain type, @Nullable String accessibilityLabel, @Nullable String source) {
        return new ImageDomain(type, accessibilityLabel, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDomain)) {
            return false;
        }
        ImageDomain imageDomain = (ImageDomain) other;
        return this.type == imageDomain.type && Intrinsics.areEqual(this.accessibilityLabel, imageDomain.accessibilityLabel) && Intrinsics.areEqual(this.source, imageDomain.source);
    }

    @Nullable
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final ImageTypeDomain getType() {
        return this.type;
    }

    public int hashCode() {
        ImageTypeDomain imageTypeDomain = this.type;
        int hashCode = (imageTypeDomain == null ? 0 : imageTypeDomain.hashCode()) * 31;
        String str = this.accessibilityLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageTypeDomain imageTypeDomain = this.type;
        String str = this.accessibilityLabel;
        String str2 = this.source;
        StringBuilder sb = new StringBuilder("ImageDomain(type=");
        sb.append(imageTypeDomain);
        sb.append(", accessibilityLabel=");
        sb.append(str);
        sb.append(", source=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ImageDomain(@Nullable ImageTypeDomain imageTypeDomain, @Nullable String str, @Nullable String str2) {
        this.type = imageTypeDomain;
        this.accessibilityLabel = str;
        this.source = str2;
    }

    public ImageDomain() {
        this(null, null, null, 7, null);
    }
}
