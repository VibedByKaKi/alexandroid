package com.amazon.alexa.accessorykit.accessories;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.NotSerializableException;
import java.text.ParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface MapModelTransformer<T> {
    T transform(ReadableMap readableMap) throws ParseException;

    WritableMap transformToMap(T t) throws NotSerializableException;
}
