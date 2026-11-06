package com.amazon.alexa.accessorykit.accessories;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.io.NotSerializableException;
import java.text.ParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface ArrayModelTransformer<T> {
    T transform(ReadableArray readableArray) throws ParseException;

    WritableArray transformToArray(T t) throws NotSerializableException;
}
