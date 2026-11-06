package com.amazon.alexa.accessorykit.accessories.session.system;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.ContainerProvider;
import com.amazon.alexa.accessorykit.accessories.ArrayModelTransformer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class StringArrayModelTransformer implements ArrayModelTransformer<List<String>> {
    private final ContainerProvider containerProvider;

    public StringArrayModelTransformer(ContainerProvider containerProvider) {
        this.containerProvider = containerProvider;
    }

    @Override // com.amazon.alexa.accessorykit.accessories.ArrayModelTransformer
    public List<String> transform(ReadableArray readableArray) {
        Preconditions.notNull(readableArray, "array");
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.accessorykit.accessories.ArrayModelTransformer
    public WritableArray transformToArray(List<String> list) throws NotSerializableException {
        WritableArray array = this.containerProvider.getArray();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            array.pushString(it2.next());
        }
        return array;
    }
}
