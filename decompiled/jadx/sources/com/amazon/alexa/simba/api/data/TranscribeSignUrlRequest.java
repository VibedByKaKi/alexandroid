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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/simba/api/data/TranscribeSignUrlRequest;", "Landroid/os/Parcelable;", "locale", "", "(Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AVSMobileFramework-android-suggestions-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class TranscribeSignUrlRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TranscribeSignUrlRequest> CREATOR = new Creator();

    @NotNull
    private final String locale;

    public TranscribeSignUrlRequest(@NotNull String str) {
        str.getClass();
        this.locale = str;
    }

    public static /* synthetic */ TranscribeSignUrlRequest copy$default(TranscribeSignUrlRequest transcribeSignUrlRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcribeSignUrlRequest.locale;
        }
        return transcribeSignUrlRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final TranscribeSignUrlRequest copy(@NotNull String locale) {
        locale.getClass();
        return new TranscribeSignUrlRequest(locale);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TranscribeSignUrlRequest) && Intrinsics.areEqual(this.locale, ((TranscribeSignUrlRequest) other).locale);
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("TranscribeSignUrlRequest(locale=", this.locale, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.locale);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TranscribeSignUrlRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TranscribeSignUrlRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new TranscribeSignUrlRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TranscribeSignUrlRequest[] newArray(int i) {
            return new TranscribeSignUrlRequest[i];
        }
    }
}
