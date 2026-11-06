package com.amazon.alexa.ra.sdk.fragments;

import com.amazon.alexa.api.compat.model.AlexaFragmentsChunkMetadata;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isLastChunkReceived", "", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AlexaFragmentsChunkMetadataUtilKt {
    public static final boolean isLastChunkReceived(@NotNull AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata) {
        alexaFragmentsChunkMetadata.getClass();
        return alexaFragmentsChunkMetadata.getCurrentChunkIndex() + 1 == alexaFragmentsChunkMetadata.getTotalChunks();
    }
}
