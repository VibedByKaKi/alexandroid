package com.amazon.alexa.apl.uioptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "builder", "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams$Builder;", "(Lcom/amazon/alexa/apl/uioptions/AplViewUiParams$Builder;)V", "isBackButtonNeeded", "", "()Z", "isCloseButtonNeeded", "isStatusBarPaddingNeeded", "isVoiceSuppressionNeeded", "describeContents", "", "writeToParcel", "", "flags", "Builder", "CREATOR", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplViewUiParams implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isBackButtonNeeded;
    private final boolean isCloseButtonNeeded;
    private final boolean isStatusBarPaddingNeeded;
    private final boolean isVoiceSuppressionNeeded;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AplViewUiParams(@NotNull Parcel parcel) {
        this(new Builder().isBackButtonNeeded(parcel.readByte() != 0).isCloseButtonNeeded(parcel.readByte() != 0).isStatusBarPaddingNeeded(parcel.readByte() != 0).isVoiceSuppressionNeeded(parcel.readByte() != 0));
        parcel.getClass();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: isBackButtonNeeded, reason: from getter */
    public final boolean getIsBackButtonNeeded() {
        return this.isBackButtonNeeded;
    }

    /* renamed from: isCloseButtonNeeded, reason: from getter */
    public final boolean getIsCloseButtonNeeded() {
        return this.isCloseButtonNeeded;
    }

    /* renamed from: isStatusBarPaddingNeeded, reason: from getter */
    public final boolean getIsStatusBarPaddingNeeded() {
        return this.isStatusBarPaddingNeeded;
    }

    /* renamed from: isVoiceSuppressionNeeded, reason: from getter */
    public final boolean getIsVoiceSuppressionNeeded() {
        return this.isVoiceSuppressionNeeded;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeByte(this.isBackButtonNeeded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCloseButtonNeeded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isStatusBarPaddingNeeded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVoiceSuppressionNeeded ? (byte) 1 : (byte) 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/apl/uioptions/AplViewUiParams$Builder;", "", "()V", "<set-?>", "", "isBackButtonNeeded", "()Z", "isCloseButtonNeeded", "isStatusBarPaddingNeeded", "isVoiceSuppressionNeeded", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean isBackButtonNeeded = true;
        private boolean isCloseButtonNeeded = true;
        private boolean isStatusBarPaddingNeeded = true;
        private boolean isVoiceSuppressionNeeded;

        @NotNull
        public final AplViewUiParams build() {
            return new AplViewUiParams(this, null);
        }

        /* renamed from: isBackButtonNeeded, reason: from getter */
        public final boolean getIsBackButtonNeeded() {
            return this.isBackButtonNeeded;
        }

        /* renamed from: isCloseButtonNeeded, reason: from getter */
        public final boolean getIsCloseButtonNeeded() {
            return this.isCloseButtonNeeded;
        }

        /* renamed from: isStatusBarPaddingNeeded, reason: from getter */
        public final boolean getIsStatusBarPaddingNeeded() {
            return this.isStatusBarPaddingNeeded;
        }

        /* renamed from: isVoiceSuppressionNeeded, reason: from getter */
        public final boolean getIsVoiceSuppressionNeeded() {
            return this.isVoiceSuppressionNeeded;
        }

        @NotNull
        public final Builder isBackButtonNeeded(boolean isBackButtonNeeded) {
            this.isBackButtonNeeded = isBackButtonNeeded;
            return this;
        }

        @NotNull
        public final Builder isCloseButtonNeeded(boolean isCloseButtonNeeded) {
            this.isCloseButtonNeeded = isCloseButtonNeeded;
            return this;
        }

        @NotNull
        public final Builder isStatusBarPaddingNeeded(boolean isStatusBarPaddingNeeded) {
            this.isStatusBarPaddingNeeded = isStatusBarPaddingNeeded;
            return this;
        }

        @NotNull
        public final Builder isVoiceSuppressionNeeded(boolean isVoiceSuppressionNeeded) {
            this.isVoiceSuppressionNeeded = isVoiceSuppressionNeeded;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/apl/uioptions/AplViewUiParams$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.apl.uioptions.AplViewUiParams$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AplViewUiParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AplViewUiParams createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AplViewUiParams(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AplViewUiParams[] newArray(int size) {
            return new AplViewUiParams[size];
        }
    }

    private AplViewUiParams(Builder builder) {
        this.isBackButtonNeeded = builder.getIsBackButtonNeeded();
        this.isCloseButtonNeeded = builder.getIsCloseButtonNeeded();
        this.isStatusBarPaddingNeeded = builder.getIsStatusBarPaddingNeeded();
        this.isVoiceSuppressionNeeded = builder.getIsVoiceSuppressionNeeded();
    }

    public /* synthetic */ AplViewUiParams(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
