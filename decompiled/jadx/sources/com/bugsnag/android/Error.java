package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.JsonStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Error implements JsonStream.Streamable {
    private final ErrorInternal impl;
    private final Logger logger;

    public Error(@NonNull ErrorInternal errorInternal, @NonNull Logger logger) {
        this.impl = errorInternal;
        this.logger = logger;
    }

    public static List<Error> createError(@NonNull Throwable th, @NonNull Collection<String> collection, @NonNull Logger logger) {
        return ErrorInternal.INSTANCE.createError(th, collection, logger);
    }

    private void logNull(String str) {
        this.logger.e("Invalid null value supplied to error." + str + ", ignoring");
    }

    @NonNull
    public String getErrorClass() {
        return this.impl.getErrorClass();
    }

    @Nullable
    public String getErrorMessage() {
        return this.impl.getErrorMessage();
    }

    @NonNull
    public List<Stackframe> getStacktrace() {
        return this.impl.getStacktrace();
    }

    @NonNull
    public ErrorType getType() {
        return this.impl.getType();
    }

    public void setErrorClass(@NonNull String str) {
        if (str != null) {
            this.impl.setErrorClass(str);
        } else {
            logNull("errorClass");
        }
    }

    public void setErrorMessage(@Nullable String str) {
        this.impl.setErrorMessage(str);
    }

    public void setType(@NonNull ErrorType errorType) {
        if (errorType != null) {
            this.impl.setType(errorType);
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NonNull JsonStream jsonStream) throws IOException {
        this.impl.toStream(jsonStream);
    }
}
