package com.amazon.alexa.accessorykit.accessories.utils;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.ContainerProvider;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class WritableArrayUtils {
    private WritableArrayUtils() {
    }

    public static <T extends Enum<T>> WritableArray createWritableArray(ContainerProvider containerProvider, List<T> list) {
        Preconditions.notNull(containerProvider, "containerProvider");
        Preconditions.notNull(list, "listOfEnums");
        WritableArray array = containerProvider.getArray();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            array.pushString(it2.next().name());
        }
        return array;
    }
}
