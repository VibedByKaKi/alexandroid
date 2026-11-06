package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
enum ApiType_ArtifactDownloadListenerMessageType implements AlexaMessageType {
    UNKNOWN,
    ON_ARTIFACT_DOWNLOAD_SUCCESS_JAVA_UTIL_LOCALE,
    ON_ARTIFACT_ALREADY_UP_TO_DATE_JAVA_UTIL_LOCALE,
    ON_ARTIFACT_DOWNLOAD_FAILURE_COM_AMAZON_ALEXA_API_ARTIFACT_DOWNLOAD_LISTENER_FAILURE;

    public static ApiType_ArtifactDownloadListenerMessageType fromOrdinal(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "ordinal ", " is out of bound"));
        return null;
    }
}
