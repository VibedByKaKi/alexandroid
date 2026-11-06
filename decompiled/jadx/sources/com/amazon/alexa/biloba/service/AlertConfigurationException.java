package com.amazon.alexa.biloba.service;

import com.amazon.alexa.biloba.model.AlertErrorCode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertConfigurationException extends Exception {
    private AlertErrorCode alertErrorCode;

    @ErrorCode
    private int errorCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface ErrorCode {
        public static final int CREATE_FAILED = -4;
        public static final int DELETE_FAILED = -5;
        public static final int DOWNLOAD_FAILED = -2;
        public static final int DOWNLOAD_TIMED_OUT = -1;
        public static final int UPDATE_FAILED = -3;
    }

    public AlertConfigurationException(@ErrorCode int i, AlertErrorCode alertErrorCode) {
        this.errorCode = i;
        this.alertErrorCode = alertErrorCode;
    }

    public AlertErrorCode getAlertErrorCode() {
        return this.alertErrorCode;
    }

    @ErrorCode
    public int getErrorCode() {
        return this.errorCode;
    }

    public AlertConfigurationException(@ErrorCode int i) {
        this.errorCode = i;
    }

    public AlertConfigurationException(Throwable th, @ErrorCode int i) {
        super(th);
        this.errorCode = i;
    }

    public AlertConfigurationException(String str, @ErrorCode int i) {
        super(str);
        this.errorCode = i;
    }

    public AlertConfigurationException(String str, Throwable th, @ErrorCode int i) {
        super(str, th);
        this.errorCode = i;
    }
}
