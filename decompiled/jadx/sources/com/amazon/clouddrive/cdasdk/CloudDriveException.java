package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;
import retrofit2.HttpException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveException extends RuntimeException {
    private int code;

    @Nullable
    private String message;

    public CloudDriveException(@NonNull HttpException httpException) {
        this(httpException.code(), httpException.message());
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CloudDriveException;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloudDriveException)) {
            return false;
        }
        CloudDriveException cloudDriveException = (CloudDriveException) obj;
        if (!cloudDriveException.canEqual(this) || !super.equals(obj) || getCode() != cloudDriveException.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = cloudDriveException.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @Generated
    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @Nullable
    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public int hashCode() {
        int code = getCode() + (super.hashCode() * 59);
        String message = getMessage();
        return (code * 59) + (message == null ? 43 : message.hashCode());
    }

    @Generated
    public void setCode(int i) {
        this.code = i;
    }

    @Generated
    public void setMessage(@Nullable String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    @Generated
    public String toString() {
        return "CloudDriveException(code=" + getCode() + ", message=" + getMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CloudDriveException(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
