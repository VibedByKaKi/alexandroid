package com.amazon.rtcsc.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscVideoEffectRequest implements Parcelable {
    public static final Parcelable.Creator<RtcscVideoEffectRequest> CREATOR = new Parcelable.Creator<RtcscVideoEffectRequest>() { // from class: com.amazon.rtcsc.interfaces.RtcscVideoEffectRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoEffectRequest createFromParcel(Parcel parcel) {
            return new RtcscVideoEffectRequest((RtcscVideoEffect) parcel.readParcelable(RtcscVideoEffect.class.getClassLoader()), parcel.readInt(), (RtcscSide) parcel.readParcelable(RtcscSide.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RtcscVideoEffectRequest[] newArray(int i) {
            return new RtcscVideoEffectRequest[i];
        }
    };
    private final int blurRadius;
    private final RtcscSide side;
    private final RtcscVideoEffect videoEffect;
    private final int videoEffectDurationMs;

    public RtcscVideoEffectRequest(@NonNull RtcscVideoEffect rtcscVideoEffect, int i, @NonNull RtcscSide rtcscSide, int i2) {
        if (rtcscVideoEffect == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("videoEffect is marked non-null but is null");
            throw null;
        }
        if (rtcscSide == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("side is marked non-null but is null");
            throw null;
        }
        this.videoEffect = rtcscVideoEffect;
        this.videoEffectDurationMs = i;
        this.side = rtcscSide;
        this.blurRadius = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBlurRadius() {
        return this.blurRadius;
    }

    public RtcscSide getSide() {
        return this.side;
    }

    public RtcscVideoEffect getVideoEffect() {
        return this.videoEffect;
    }

    public int getVideoEffectDurationMs() {
        return this.videoEffectDurationMs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtcscVideoEffectRequest{videoEffect=");
        sb.append(this.videoEffect);
        sb.append(", videoEffectDurationMs=");
        sb.append(this.videoEffectDurationMs);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", blurRadius=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.blurRadius, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.videoEffect, i);
        parcel.writeInt(this.videoEffectDurationMs);
        parcel.writeParcelable(this.side, i);
        parcel.writeInt(this.blurRadius);
    }
}
