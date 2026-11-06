package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CBLRegistrationDetails implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<CBLRegistrationDetails> CREATOR = new Parcelable.ClassLoaderCreator<CBLRegistrationDetails>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration.CBLRegistrationDetails.1
        @Override // android.os.Parcelable.Creator
        public CBLRegistrationDetails createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new CBLRegistrationDetails(parcel, CBLRegistrationDetails.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public CBLRegistrationDetails[] newArray(int i) {
            if (i >= 0) {
                return new CBLRegistrationDetails[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public CBLRegistrationDetails createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new CBLRegistrationDetails(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String HTTP_CODE_KEY = "http-code";
    private static final String MESSAGE_KEY = "message";
    private static final String STATE_KEY = "state";
    private final Integer mHttpCode;
    private final String mMessage;
    private final State mState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State implements Parcelable {
        NOT_REGISTERED(0, "Not Registered"),
        COMPLETING_REGISTRATION(1, "Completing Registration"),
        REGISTRATION_COMPLETE(2, "Registered"),
        REGISTRATION_FAILED_TOKEN_INVALID(-1, "Registration Failed, Token Invalid"),
        REGISTRATION_FAILED_TOKEN_EXPIRED(-2, "Registration Failed, Token Expired"),
        REGISTRATION_FAILED_SERVER_NOT_REACHABLE(-3, "Registration Failed, Server Not Reachable"),
        REGISTRATION_FAILED_SERVER_ERROR(-4, "Registration Failed, Server Error"),
        REGISTRATION_FAILED_OTHER(-5, "Registration Failed, Other");

        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new Parcelable.ClassLoaderCreator<State>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration.CBLRegistrationDetails.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (parcel != null) {
                    return State.fromInt(parcel.readInt());
                }
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
                if (i >= 0) {
                    return new State[i];
                }
                Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                if (parcel != null) {
                    return State.fromInt(parcel.readInt());
                }
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }
        };
        private String mDescription;
        private final int mValue;

        State(int i, String str) {
            this.mValue = i;
            this.mDescription = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static State fromInt(int i) {
            switch (i) {
                case -5:
                    return REGISTRATION_FAILED_OTHER;
                case -4:
                    return REGISTRATION_FAILED_SERVER_ERROR;
                case -3:
                    return REGISTRATION_FAILED_SERVER_NOT_REACHABLE;
                case -2:
                    return REGISTRATION_FAILED_TOKEN_EXPIRED;
                case -1:
                    return REGISTRATION_FAILED_TOKEN_INVALID;
                case 0:
                    return NOT_REGISTERED;
                case 1:
                    return COMPLETING_REGISTRATION;
                case 2:
                    return REGISTRATION_COMPLETE;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown CBLRegistrationDetails.State: "));
                    return null;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public int getValue() {
            return this.mValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mDescription;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeInt(this.mValue);
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            }
        }
    }

    public CBLRegistrationDetails(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle(classLoader);
        this.mState = (State) readBundle.getParcelable("state");
        this.mMessage = readBundle.getString("message");
        this.mHttpCode = readBundle.containsKey(HTTP_CODE_KEY) ? Integer.valueOf(readBundle.getInt(HTTP_CODE_KEY)) : null;
        validate();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getHttpCode() {
        return this.mHttpCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public State getRegistrationState() {
        return this.mState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CBLRegistrationDetails [state=");
        sb.append(this.mState);
        sb.append(", message=");
        sb.append(this.mMessage);
        sb.append(", http-code=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.mHttpCode, MarkdownConstants.RIGHT_BRACKET);
    }

    public void validate() {
        Integer num = this.mHttpCode;
        if (num == null || num.intValue() >= 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Http code cannot be negative. Please use InputValidator methods to validate parameters.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", this.mState);
        bundle.putString("message", this.mMessage);
        Integer num = this.mHttpCode;
        if (num != null) {
            bundle.putInt(HTTP_CODE_KEY, num.intValue());
        }
        parcel.writeBundle(bundle);
    }

    public CBLRegistrationDetails(State state, String str, Integer num) {
        this.mState = state;
        this.mMessage = str;
        this.mHttpCode = num;
        validate();
    }

    public CBLRegistrationDetails(State state) {
        this(state, null, null);
    }
}
