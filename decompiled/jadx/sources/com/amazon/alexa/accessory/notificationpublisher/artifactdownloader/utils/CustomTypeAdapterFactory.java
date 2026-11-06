package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.utils;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GsonTypeAdapterFactory
/* loaded from: classes15.dex */
public abstract class CustomTypeAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_CustomTypeAdapterFactory();
    }
}
