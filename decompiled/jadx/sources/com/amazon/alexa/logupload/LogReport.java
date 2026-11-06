package com.amazon.alexa.logupload;

import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface LogReport {
    Request getNetworkRequest() throws LogUploadException;
}
