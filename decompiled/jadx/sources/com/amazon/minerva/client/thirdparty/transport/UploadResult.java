package com.amazon.minerva.client.thirdparty.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UploadResult {
    public static final String CLIENT_ERROR = "CLIENT_ERROR";
    public static final String NO_CONNECTION = "NO_CONNECTION";
    public static final String SERVER_ERROR = "SERVER_ERROR";
    public static final String SUCCESS = "SUCCESS";
    public static final String UNEXPECTED_ERROR = "UNEXPECTED_ERROR";
    private byte[] responsePayload;
    private String uploadMessage;
    private String uploadStatus;

    public UploadResult(String str, String str2, byte[] bArr) {
        this.uploadStatus = str;
        this.uploadMessage = str2;
        this.responsePayload = bArr;
    }

    public byte[] getResponsePayload() {
        return this.responsePayload;
    }

    public String getUploadMessage() {
        return this.uploadMessage;
    }

    public String getUploadStatus() {
        return this.uploadStatus;
    }

    public UploadResult(String str, String str2) {
        this.uploadStatus = str;
        this.uploadMessage = str2;
    }
}
