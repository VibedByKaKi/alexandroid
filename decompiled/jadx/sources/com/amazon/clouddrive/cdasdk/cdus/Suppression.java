package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Suppression {
    NONE,
    DEDUPLICATION,
    PROCESSING,
    TRANSCODING,
    ALL;

    public static String serializeList(@NonNull List<Suppression> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i).name());
        }
        return sb.toString();
    }
}
