package com.amazon.alexa.simba.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/simba/api/data/PostIngestionErrorInfo;", "Landroid/os/Parcelable;", "errorCode", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AVSMobileFramework-android-suggestions-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PostIngestionErrorInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PostIngestionErrorInfo> CREATOR = new Creator();

    @NotNull
    private final String errorCode;

    @NotNull
    private final String errorMessage;

    public PostIngestionErrorInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ PostIngestionErrorInfo copy$default(PostIngestionErrorInfo postIngestionErrorInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postIngestionErrorInfo.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = postIngestionErrorInfo.errorMessage;
        }
        return postIngestionErrorInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final PostIngestionErrorInfo copy(@NotNull String errorCode, @NotNull String errorMessage) {
        errorCode.getClass();
        errorMessage.getClass();
        return new PostIngestionErrorInfo(errorCode, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostIngestionErrorInfo)) {
            return false;
        }
        PostIngestionErrorInfo postIngestionErrorInfo = (PostIngestionErrorInfo) other;
        return Intrinsics.areEqual(this.errorCode, postIngestionErrorInfo.errorCode) && Intrinsics.areEqual(this.errorMessage, postIngestionErrorInfo.errorMessage);
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (this.errorCode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("PostIngestionErrorInfo(errorCode=", this.errorCode, ", errorMessage=", this.errorMessage, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PostIngestionErrorInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostIngestionErrorInfo createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new PostIngestionErrorInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostIngestionErrorInfo[] newArray(int i) {
            return new PostIngestionErrorInfo[i];
        }
    }
}
