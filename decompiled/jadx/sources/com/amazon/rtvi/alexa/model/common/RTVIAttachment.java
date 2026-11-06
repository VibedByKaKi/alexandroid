package com.amazon.rtvi.alexa.model.common;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/RTVIAttachment;", "", "data", "", "contentType", "", "contentId", "<init>", "([BLjava/lang/String;Ljava/lang/String;)V", "getData", "()[B", "getContentType", "()Ljava/lang/String;", "getContentId", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RTVIAttachment {

    @NotNull
    public static final String CONTENT_TYPE_JPEG = "image/jpeg";

    @NotNull
    public static final String CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";

    @NotNull
    public static final String CONTENT_TYPE_PNG = "image/png";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String contentId;

    @NotNull
    private final String contentType;

    @NotNull
    private final byte[] data;

    public RTVIAttachment(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2) {
        bArr.getClass();
        str.getClass();
        this.data = bArr;
        this.contentType = str;
        this.contentId = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RTVIAttachment)) {
            return false;
        }
        RTVIAttachment rTVIAttachment = (RTVIAttachment) other;
        return Arrays.equals(this.data, rTVIAttachment.data) && Intrinsics.areEqual(this.contentType, rTVIAttachment.contentType) && Intrinsics.areEqual(this.contentId, rTVIAttachment.contentId);
    }

    @Nullable
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(Arrays.hashCode(this.data) * 31, 31, this.contentType);
        String str = this.contentId;
        return m + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int length = this.data.length;
        String str = this.contentType;
        return a$$ExternalSyntheticOutline0.m(TableInfo$$ExternalSyntheticOutline0.m(length, "RTVIAttachment(dataSize=", ", contentType=", str, ", contentId="), this.contentId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/RTVIAttachment$Companion;", "", "<init>", "()V", "CONTENT_TYPE_JPEG", "", "CONTENT_TYPE_PNG", "CONTENT_TYPE_OCTET_STREAM", "fromJpegFrame", "Lcom/amazon/rtvi/alexa/model/common/RTVIAttachment;", "jpegBytes", "", "frameId", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RTVIAttachment fromJpegFrame$default(Companion companion, byte[] bArr, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.fromJpegFrame(bArr, str);
        }

        @NotNull
        public final RTVIAttachment fromJpegFrame(@NotNull byte[] jpegBytes, @Nullable String frameId) {
            jpegBytes.getClass();
            return new RTVIAttachment(jpegBytes, "image/jpeg", frameId);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RTVIAttachment(byte[] bArr, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? "image/jpeg" : str, (i & 4) != 0 ? null : str2);
    }
}
