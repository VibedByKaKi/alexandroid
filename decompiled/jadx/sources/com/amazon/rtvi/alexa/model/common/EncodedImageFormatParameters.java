package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/EncodedImageFormatParameters;", "", "preferredEncodedImageFormat", "", "<init>", "(Ljava/lang/String;)V", "getPreferredEncodedImageFormat", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EncodedImageFormatParameters {

    @Nullable
    private final String preferredEncodedImageFormat;

    public /* synthetic */ EncodedImageFormatParameters(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ EncodedImageFormatParameters copy$default(EncodedImageFormatParameters encodedImageFormatParameters, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encodedImageFormatParameters.preferredEncodedImageFormat;
        }
        return encodedImageFormatParameters.copy(str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPreferredEncodedImageFormat() {
        return this.preferredEncodedImageFormat;
    }

    @NotNull
    public final EncodedImageFormatParameters copy(@JsonProperty("preferredEncodedImageFormat") @Nullable String preferredEncodedImageFormat) {
        return new EncodedImageFormatParameters(preferredEncodedImageFormat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EncodedImageFormatParameters) && Intrinsics.areEqual(this.preferredEncodedImageFormat, ((EncodedImageFormatParameters) other).preferredEncodedImageFormat);
    }

    @Nullable
    public final String getPreferredEncodedImageFormat() {
        return this.preferredEncodedImageFormat;
    }

    public int hashCode() {
        String str = this.preferredEncodedImageFormat;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("EncodedImageFormatParameters(preferredEncodedImageFormat=", this.preferredEncodedImageFormat, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public EncodedImageFormatParameters(@JsonProperty("preferredEncodedImageFormat") @Nullable String str) {
        this.preferredEncodedImageFormat = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncodedImageFormatParameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
