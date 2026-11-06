package com.amazon.alexa.client.alexaservice.base.system;

import androidx.exifinterface.media.ExifInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum AVSEndpointStage {
    PROD("Prod"),
    GAMMA(ExifInterface.TAG_GAMMA),
    PREPROD("PreProd");

    public final String stageName;

    AVSEndpointStage(String str) {
        this.stageName = str;
    }
}
