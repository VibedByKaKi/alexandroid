package com.amazon.clouddrive.cdasdk.cds;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.CloudDriveException;
import lombok.Generated;
import retrofit2.HttpException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDSException extends CloudDriveException {
    private final CDSError cdsError;

    public CDSException(@NonNull HttpException httpException, @NonNull CDSError cDSError) {
        super(httpException);
        this.cdsError = cDSError;
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDSException;
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDSException)) {
            return false;
        }
        CDSException cDSException = (CDSException) obj;
        if (!cDSException.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        CDSError cdsError = getCdsError();
        CDSError cdsError2 = cDSException.getCdsError();
        return cdsError != null ? cdsError.equals(cdsError2) : cdsError2 == null;
    }

    @Generated
    public CDSError getCdsError() {
        return this.cdsError;
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        CDSError cdsError = getCdsError();
        return (hashCode * 59) + (cdsError == null ? 43 : cdsError.hashCode());
    }

    @Override // com.amazon.clouddrive.cdasdk.CloudDriveException, java.lang.Throwable
    @Generated
    public String toString() {
        return "CDSException(cdsError=" + getCdsError() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
