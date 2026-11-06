package com.fasterxml.jackson.core;

import java.io.Serializable;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ErrorReportConfiguration implements Serializable {
    private static ErrorReportConfiguration DEFAULT = new ErrorReportConfiguration(256, 500);
    public static final int DEFAULT_MAX_ERROR_TOKEN_LENGTH = 256;
    public static final int DEFAULT_MAX_RAW_CONTENT_LENGTH = 500;
    private static final long serialVersionUID = 1;
    protected final int _maxErrorTokenLength;
    protected final int _maxRawContentLength;

    public ErrorReportConfiguration(int i, int i2) {
        this._maxErrorTokenLength = i;
        this._maxRawContentLength = i2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ErrorReportConfiguration defaults() {
        return DEFAULT;
    }

    public static void overrideDefaultErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        if (errorReportConfiguration == null) {
            DEFAULT = new ErrorReportConfiguration(256, 500);
        } else {
            DEFAULT = errorReportConfiguration;
        }
    }

    public static void validateMaxErrorTokenLength(int i) throws IllegalArgumentException {
        if (i >= 0) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("Value of maxErrorTokenLength (%d) cannot be negative", new Object[]{Integer.valueOf(i)});
    }

    public static void validateMaxRawContentLength(int i) {
        if (i >= 0) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("Value of maxRawContentLength (%d) cannot be negative", new Object[]{Integer.valueOf(i)});
    }

    public int getMaxErrorTokenLength() {
        return this._maxErrorTokenLength;
    }

    public int getMaxRawContentLength() {
        return this._maxRawContentLength;
    }

    public Builder rebuild() {
        return new Builder(this);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int maxErrorTokenLength;
        private int maxRawContentLength;

        public Builder(ErrorReportConfiguration errorReportConfiguration) {
            this.maxErrorTokenLength = errorReportConfiguration._maxErrorTokenLength;
            this.maxRawContentLength = errorReportConfiguration._maxRawContentLength;
        }

        public ErrorReportConfiguration build() {
            return new ErrorReportConfiguration(this.maxErrorTokenLength, this.maxRawContentLength);
        }

        public Builder maxErrorTokenLength(int i) {
            ErrorReportConfiguration.validateMaxErrorTokenLength(i);
            this.maxErrorTokenLength = i;
            return this;
        }

        public Builder maxRawContentLength(int i) {
            ErrorReportConfiguration.validateMaxRawContentLength(i);
            this.maxRawContentLength = i;
            return this;
        }

        public Builder(int i, int i2) {
            this.maxErrorTokenLength = i;
            this.maxRawContentLength = i2;
        }

        public Builder() {
            this(256, 500);
        }
    }
}
