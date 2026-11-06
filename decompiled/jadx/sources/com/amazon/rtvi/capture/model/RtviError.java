package com.amazon.rtvi.capture.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B;\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lcom/amazon/rtvi/capture/model/RtviError;", "Landroid/os/Parcelable;", "version", "", "errorCode", "", "message", "details", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()I", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getDetails", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RtviError implements Parcelable {

    @NotNull
    public static final String ERROR_CAPTURE_FAILED = "CAPTURE_FAILED";

    @NotNull
    public static final String ERROR_CONFIGURATION_INVALID = "CONFIGURATION_INVALID";

    @NotNull
    public static final String ERROR_PERMISSION_DENIED = "PERMISSION_DENIED";

    @NotNull
    public static final String ERROR_RESOURCE_UNAVAILABLE = "RESOURCE_UNAVAILABLE";

    @NotNull
    public static final String ERROR_UNKNOWN = "UNKNOWN";

    @Nullable
    private final String details;

    @NotNull
    private final String errorCode;

    @NotNull
    private final String message;

    @Nullable
    private final String sessionId;
    private final int version;

    @NotNull
    public static final Parcelable.Creator<RtviError> CREATOR = new Creator();

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RtviError(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 1
        L5:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto Lb
            r5 = r0
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L16
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L1c
        L16:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L1c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.rtvi.capture.model.RtviError.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ RtviError copy$default(RtviError rtviError, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rtviError.version;
        }
        if ((i2 & 2) != 0) {
            str = rtviError.errorCode;
        }
        if ((i2 & 4) != 0) {
            str2 = rtviError.message;
        }
        if ((i2 & 8) != 0) {
            str3 = rtviError.details;
        }
        if ((i2 & 16) != 0) {
            str4 = rtviError.sessionId;
        }
        String str5 = str4;
        String str6 = str2;
        return rtviError.copy(i, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final RtviError copy(int version, @NotNull String errorCode, @NotNull String message, @Nullable String details, @Nullable String sessionId) {
        errorCode.getClass();
        message.getClass();
        return new RtviError(version, errorCode, message, details, sessionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtviError)) {
            return false;
        }
        RtviError rtviError = (RtviError) other;
        return this.version == rtviError.version && Intrinsics.areEqual(this.errorCode, rtviError.errorCode) && Intrinsics.areEqual(this.message, rtviError.message) && Intrinsics.areEqual(this.details, rtviError.details) && Intrinsics.areEqual(this.sessionId, rtviError.sessionId);
    }

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(Integer.hashCode(this.version) * 31, 31, this.errorCode), 31, this.message);
        String str = this.details;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.version;
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.details;
        String str4 = this.sessionId;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(i, "RtviError(version=", ", errorCode=", str, ", message=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str2, ", details=", str3, ", sessionId=");
        return a$$ExternalSyntheticOutline0.m(m, str4, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.version);
        dest.writeString(this.errorCode);
        dest.writeString(this.message);
        dest.writeString(this.details);
        dest.writeString(this.sessionId);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RtviError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RtviError createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RtviError(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RtviError[] newArray(int i) {
            return new RtviError[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RtviError(int i, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(i, str, str2, str3, null, 16, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RtviError(@NotNull String str, @NotNull String str2) {
        this(0, str, str2, null, null, 25, null);
        str.getClass();
        str2.getClass();
    }

    @JvmOverloads
    public RtviError(int i, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        str.getClass();
        str2.getClass();
        this.version = i;
        this.errorCode = str;
        this.message = str2;
        this.details = str3;
        this.sessionId = str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RtviError(int i, @NotNull String str, @NotNull String str2) {
        this(i, str, str2, null, null, 24, null);
        str.getClass();
        str2.getClass();
    }
}
