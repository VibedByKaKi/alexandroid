package com.amazon.dee.app.elements;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
class ReactFeatureImpl implements ReactFeature {
    public static final Parcelable.Creator<ReactFeatureImpl> CREATOR = new Parcelable.Creator<ReactFeatureImpl>() { // from class: com.amazon.dee.app.elements.ReactFeatureImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactFeatureImpl createFromParcel(Parcel parcel) {
            return new ReactFeatureImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactFeatureImpl[] newArray(int i) {
            return new ReactFeatureImpl[i];
        }
    };

    @NonNull
    String appName;

    @NonNull
    String instanceId;

    @Nullable
    Bundle launchOptions;

    public ReactFeatureImpl(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!TextUtils.isEmpty(str2), "AppName cannot be empty.");
        this.instanceId = str;
        this.appName = str2;
        this.launchOptions = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactFeatureImpl) {
            return Objects.equals(this.instanceId, ((ReactFeatureImpl) obj).instanceId);
        }
        return false;
    }

    @Override // com.amazon.dee.app.elements.ReactFeature
    @NonNull
    public String getAppName() {
        return this.appName;
    }

    @Override // com.amazon.dee.app.elements.ReactFeature
    @NonNull
    public String getInstanceId() {
        return this.instanceId;
    }

    @Override // com.amazon.dee.app.elements.ReactFeature
    @Nullable
    public Bundle getLaunchOptions() {
        return this.launchOptions;
    }

    public int hashCode() {
        return Objects.hash(this.instanceId);
    }

    public String toString() {
        return "ReactFeatureImpl{instanceId='" + this.instanceId + "', appName='" + this.appName + "', launchOptions=" + this.launchOptions + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.instanceId);
        parcel.writeString(this.appName);
        parcel.writeBundle(this.launchOptions);
    }

    public ReactFeatureImpl(Parcel parcel) {
        this.instanceId = parcel.readString();
        this.appName = parcel.readString();
        this.launchOptions = parcel.readBundle();
    }
}
