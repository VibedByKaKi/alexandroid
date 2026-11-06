package com.amazon.alexa.accessory.avsclient.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface JsonConverter {
    <T> T fromJson(String str, Class<T> cls);

    String toJson(Object obj);
}
