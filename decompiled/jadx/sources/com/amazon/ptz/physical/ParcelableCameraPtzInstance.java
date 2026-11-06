package com.amazon.ptz.physical;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Nonnull;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ParcelableCameraPtzInstance implements Parcelable {
    public static final Parcelable.Creator<ParcelableCameraPtzInstance> CREATOR = new Parcelable.Creator<ParcelableCameraPtzInstance>() { // from class: com.amazon.ptz.physical.ParcelableCameraPtzInstance.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableCameraPtzInstance createFromParcel(Parcel parcel) {
            return new ParcelableCameraPtzInstance(CameraPtzInstance.values()[parcel.readInt()]);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableCameraPtzInstance[] newArray(int i) {
            return new ParcelableCameraPtzInstance[i];
        }
    };

    @Nonnull
    private final CameraPtzInstance ptzInstance;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ParcelableCameraPtzInstance(@Nonnull CameraPtzInstance cameraPtzInstance) {
        if (cameraPtzInstance != null) {
            this.ptzInstance = cameraPtzInstance;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("ptzInstance is marked non-null but is null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParcelableCameraPtzInstance) {
            return this.ptzInstance.equals(((ParcelableCameraPtzInstance) obj).getPtzInstance());
        }
        return false;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Nonnull
    @Generated
    public CameraPtzInstance getPtzInstance() {
        return this.ptzInstance;
    }

    public int hashCode() {
        return this.ptzInstance.ordinal();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ParcelableCameraPtzInstance(ptzInstance=" + getPtzInstance() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ptzInstance.ordinal());
    }
}
