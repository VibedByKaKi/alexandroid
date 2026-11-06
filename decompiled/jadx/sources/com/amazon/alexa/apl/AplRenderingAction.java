package com.amazon.alexa.apl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/apl/AplRenderingAction;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "mType", "", "mData", "mRequestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMData", "()Ljava/lang/String;", "getMRequestId", "getMType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AplRenderingAction implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String mData;

    @Nullable
    private final String mRequestId;

    @NotNull
    private final String mType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AplRenderingAction(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            r0 = r1
        Lc:
            java.lang.String r2 = r4.readString()
            if (r2 != 0) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            java.lang.String r4 = r4.readString()
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.apl.AplRenderingAction.<init>(android.os.Parcel):void");
    }

    public static /* synthetic */ AplRenderingAction copy$default(AplRenderingAction aplRenderingAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aplRenderingAction.mType;
        }
        if ((i & 2) != 0) {
            str2 = aplRenderingAction.mData;
        }
        if ((i & 4) != 0) {
            str3 = aplRenderingAction.mRequestId;
        }
        return aplRenderingAction.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMType() {
        return this.mType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMData() {
        return this.mData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMRequestId() {
        return this.mRequestId;
    }

    @NotNull
    public final AplRenderingAction copy(@NotNull String mType, @NotNull String mData, @Nullable String mRequestId) {
        mType.getClass();
        mData.getClass();
        return new AplRenderingAction(mType, mData, mRequestId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AplRenderingAction)) {
            return false;
        }
        AplRenderingAction aplRenderingAction = (AplRenderingAction) other;
        return Intrinsics.areEqual(this.mType, aplRenderingAction.mType) && Intrinsics.areEqual(this.mData, aplRenderingAction.mData) && Intrinsics.areEqual(this.mRequestId, aplRenderingAction.mRequestId);
    }

    @NotNull
    public final String getMData() {
        return this.mData;
    }

    @Nullable
    public final String getMRequestId() {
        return this.mRequestId;
    }

    @NotNull
    public final String getMType() {
        return this.mType;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.mType.hashCode() * 31, 31, this.mData);
        String str = this.mRequestId;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.mType;
        String str2 = this.mData;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AplRenderingAction(mType=", str, ", mData=", str2, ", mRequestId="), this.mRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.mType);
        parcel.writeString(this.mData);
        parcel.writeString(this.mRequestId);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/apl/AplRenderingAction$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/amazon/alexa/apl/AplRenderingAction;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/amazon/alexa/apl/AplRenderingAction;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.apl.AplRenderingAction$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AplRenderingAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AplRenderingAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AplRenderingAction(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AplRenderingAction[] newArray(int size) {
            return new AplRenderingAction[size];
        }
    }

    public AplRenderingAction(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.mType = str;
        this.mData = str2;
        this.mRequestId = str3;
    }
}
