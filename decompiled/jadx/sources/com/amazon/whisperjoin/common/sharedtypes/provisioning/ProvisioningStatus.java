package com.amazon.whisperjoin.common.sharedtypes.provisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningStatus implements Parcelable {
    public static final Parcelable.ClassLoaderCreator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.ProvisioningStatus.1
        @Override // android.os.Parcelable.Creator
        public ProvisioningStatus createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ProvisioningStatus(parcel, ProvisioningStatus.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ProvisioningStatus[] newArray(int i) {
            if (i >= 0) {
                return new ProvisioningStatus[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public ProvisioningStatus createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ProvisioningStatus(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private final boolean mInsecureModeSupported;
    private State mState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State implements Parcelable {
        PROVISIONING_SESSION_IDLE(0, "Provisioning Session Idle"),
        WAITING_FOR_PROVISIONER(1, "Wait for Provisioner"),
        AUTHORIZING_PROVISIONER(2, "Authorizing Provisioner"),
        ACTIVELY_PROVISIONING(3, "Actively Provisioning"),
        PROVISIONING_COMPLETE(4, "Provisioning Complete"),
        PROVISIONING_TERMINATED(5, "Provisioning Terminated"),
        CONNECTED_TO_PROVISIONER(6, "Connected to Provisioner"),
        ADVERTISEMENT_TIMEOUT(7, "Advertisement Timeout"),
        PROVISIONING_TIMEOUT(8, "Provisioning Timeout");

        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.ProvisioningStatus.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return State.fromInt(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        private final String mString;
        private final int mValue;

        State(int i, String str) {
            this.mValue = i;
            this.mString = str;
        }

        public static State fromInt(int i) {
            switch (i) {
                case 0:
                    return PROVISIONING_SESSION_IDLE;
                case 1:
                    return WAITING_FOR_PROVISIONER;
                case 2:
                    return AUTHORIZING_PROVISIONER;
                case 3:
                    return ACTIVELY_PROVISIONING;
                case 4:
                    return PROVISIONING_COMPLETE;
                case 5:
                    return PROVISIONING_TERMINATED;
                case 6:
                    return CONNECTED_TO_PROVISIONER;
                case 7:
                    return ADVERTISEMENT_TIMEOUT;
                case 8:
                    return PROVISIONING_TIMEOUT;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3("Unknown State encountered.");
                    return null;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getString() {
            return this.mString;
        }

        public int getValue() {
            return this.mValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mString;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mValue);
        }
    }

    public ProvisioningStatus(Parcel parcel, ClassLoader classLoader) {
        this.mState = (State) parcel.readParcelable(classLoader);
        this.mInsecureModeSupported = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public State getProvisioningState() {
        return this.mState;
    }

    public boolean insecureModeSupported() {
        return this.mInsecureModeSupported;
    }

    public void setProvisioningState(State state) {
        this.mState = state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisioningStatus [state=");
        sb.append(this.mState);
        sb.append(", insecure-mode-supported=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mInsecureModeSupported, MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        } else {
            parcel.writeParcelable(this.mState, i);
            parcel.writeByte(this.mInsecureModeSupported ? (byte) 1 : (byte) 0);
        }
    }

    public ProvisioningStatus(State state, boolean z) {
        this.mState = state;
        this.mInsecureModeSupported = z;
    }
}
