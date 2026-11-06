package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.CloudDriveException;
import lombok.Generated;
import retrofit2.HttpException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDUSException extends CloudDriveException {
    private final CDUSError cdusError;

    public CDUSException(@NonNull HttpException httpException, @NonNull CDUSError cDUSError) {
        this(httpException.code(), httpException.message(), cDUSError);
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDUSException;
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDUSException)) {
            return false;
        }
        CDUSException cDUSException = (CDUSException) obj;
        if (!cDUSException.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        CDUSError cdusError = getCdusError();
        CDUSError cdusError2 = cDUSException.getCdusError();
        return cdusError != null ? cdusError.equals(cdusError2) : cdusError2 == null;
    }

    @Generated
    public CDUSError getCdusError() {
        return this.cdusError;
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        CDUSError cdusError = getCdusError();
        return (hashCode * 59) + (cdusError == null ? 43 : cdusError.hashCode());
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException, java.lang.Throwable
    @Generated
    public String toString() {
        return "CDUSException(cdusError=" + getCdusError() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CDUSException(int i, String str, @NonNull CDUSError cDUSError) {
        super(i, str);
        this.cdusError = cDUSError;
    }
}
