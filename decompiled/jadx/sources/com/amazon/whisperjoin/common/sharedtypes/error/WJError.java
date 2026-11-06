package com.amazon.whisperjoin.common.sharedtypes.error;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Objects;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WJError extends Exception implements Parcelable {
    public static final Parcelable.Creator<WJError> CREATOR = new Parcelable.Creator<WJError>() { // from class: com.amazon.whisperjoin.common.sharedtypes.error.WJError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WJError createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WJError(parcel);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WJError[] newArray(int i) {
            if (i >= 0) {
                return new WJError[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }
    };
    private final int mDomain;
    private final int mErrorDetails;
    private final int mErrorType;
    private final int mResolution;

    public WJError(Parcel parcel) {
        this.mDomain = parcel.readInt();
        this.mErrorType = parcel.readInt();
        this.mErrorDetails = parcel.readInt();
        this.mResolution = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WJError wJError = (WJError) obj;
            if (this.mDomain == wJError.mDomain && this.mErrorType == wJError.mErrorType && this.mErrorDetails == wJError.mErrorDetails && this.mResolution == wJError.mResolution) {
                return true;
            }
        }
        return false;
    }

    public int getDomain() {
        return this.mDomain;
    }

    public String getErrorCode() {
        Locale locale = Locale.ENGLISH;
        int domain = getDomain();
        int errorType = getErrorType();
        int errorDetails = getErrorDetails();
        int resolution = getResolution();
        StringBuilder sb = new StringBuilder();
        sb.append(domain);
        sb.append(":");
        sb.append(errorType);
        sb.append(":");
        sb.append(errorDetails);
        return TableInfo$$ExternalSyntheticOutline0.m(":", resolution, sb);
    }

    public int getErrorDetails() {
        return this.mErrorDetails;
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public int getResolution() {
        return this.mResolution;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDomain), Integer.valueOf(this.mErrorType), Integer.valueOf(this.mErrorDetails), Integer.valueOf(this.mResolution));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "WJError [" + getErrorCode() + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mDomain);
        parcel.writeInt(this.mErrorType);
        parcel.writeInt(this.mErrorDetails);
        parcel.writeInt(this.mResolution);
    }

    public WJError(int i, int i2, int i3, int i4) {
        this.mDomain = i;
        this.mErrorType = i2;
        this.mErrorDetails = i3;
        this.mResolution = i4;
    }

    public WJError(int i, int i2, int i3) {
        this(i, i2, CommonErrorDetails.NONE, i3);
    }
}
