package com.amazon.alexa.client.core.messages;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Namespace implements StronglyTypedString {
    public static Namespace create(String str) {
        return new AutoValue_Namespace(str);
    }

    public static Set<Namespace> createMultiple(Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(create(str));
            }
        }
        return hashSet;
    }

    public static TypeAdapter<Namespace> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<Namespace>() { // from class: com.amazon.alexa.client.core.messages.Namespace.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public Namespace instantiate(@NonNull String str) {
                return Namespace.create(str);
            }
        };
    }
}
