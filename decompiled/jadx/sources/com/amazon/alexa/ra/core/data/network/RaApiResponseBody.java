package com.amazon.alexa.ra.core.data.network;

import androidx.compose.runtime.internal.StabilityInferred;
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
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "", "<init>", "()V", "StringContent", "BytesContent", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody$BytesContent;", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody$StringContent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class RaApiResponseBody {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody$BytesContent;", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "content", "", "<init>", "([B)V", "getContent", "()[B", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BytesContent extends RaApiResponseBody {
        public static final int $stable = 8;

        @NotNull
        private final byte[] content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BytesContent(@NotNull byte[] bArr) {
            super(null);
            bArr.getClass();
            this.content = bArr;
        }

        public static /* synthetic */ BytesContent copy$default(BytesContent bytesContent, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = bytesContent.content;
            }
            return bytesContent.copy(bArr);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final byte[] getContent() {
            return this.content;
        }

        @NotNull
        public final BytesContent copy(@NotNull byte[] content) {
            content.getClass();
            return new BytesContent(content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BytesContent) && Intrinsics.areEqual(this.content, ((BytesContent) other).content);
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }

        public int hashCode() {
            return Arrays.hashCode(this.content);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("BytesContent(content=", Arrays.toString(this.content), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody$StringContent;", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StringContent extends RaApiResponseBody {
        public static final int $stable = 0;

        @NotNull
        private final String content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringContent(@NotNull String str) {
            super(null);
            str.getClass();
            this.content = str;
        }

        public static /* synthetic */ StringContent copy$default(StringContent stringContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringContent.content;
            }
            return stringContent.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final StringContent copy(@NotNull String content) {
            content.getClass();
            return new StringContent(content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringContent) && Intrinsics.areEqual(this.content, ((StringContent) other).content);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("StringContent(content=", this.content, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ RaApiResponseBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RaApiResponseBody() {
    }
}
