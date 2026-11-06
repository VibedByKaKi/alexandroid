package com.amazon.minerva.transport.direct;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UploadResult {
    private final Category category;
    private final int httpResponseCode;
    private final String message;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Category {
        SUCCESS,
        CLIENT_ERROR,
        SERVER_ERROR,
        NETWORK_ERROR,
        UNEXPECTED
    }

    public UploadResult(Category category, int i, String str) {
        this.category = category;
        this.httpResponseCode = i;
        this.message = str;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    public String getMessage() {
        return this.message;
    }

    public UploadResult(Category category, int i) {
        this(category, i, null);
    }
}
