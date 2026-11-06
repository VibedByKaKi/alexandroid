package com.amazon.alexa.accessorykit.focusfilter;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.ContainerProvider;
import com.amazon.alexa.accessorykit.accessories.MapModelTransformer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.NotSerializableException;
import java.text.ParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class FocusFilterInfoTransformer implements MapModelTransformer<String> {
    private static final String VALUE = "value";
    private final ContainerProvider containerProvider;

    public FocusFilterInfoTransformer(ContainerProvider containerProvider) {
        this.containerProvider = containerProvider;
    }

    @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
    public String transform(ReadableMap readableMap) throws ParseException {
        throw new ParseException("Not yet implemented", 0);
    }

    @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
    public WritableMap transformToMap(String str) throws NotSerializableException {
        Preconditions.notNull(str, "value");
        WritableMap map = this.containerProvider.getMap();
        map.putString("value", str);
        return map;
    }
}
