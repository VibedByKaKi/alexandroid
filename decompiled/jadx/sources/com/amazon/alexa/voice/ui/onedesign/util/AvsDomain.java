package com.amazon.alexa.voice.ui.onedesign.util;

import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AvsDomain {
    private AvsDomain() {
    }

    public static boolean containsAnyDomain(@Nullable List<CharSequence> list, String... strArr) {
        if (list != null) {
            HashSet hashSet = new HashSet(list);
            for (String str : strArr) {
                if (hashSet.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
