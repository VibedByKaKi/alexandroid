package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    @NonNull
    public static String nameOf(int i) {
        if (i == 0) {
            return "AUTO";
        }
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown flash mode "));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int valueOf(@Nullable String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("name cannot be null");
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 2527:
                if (str.equals("ON")) {
                    c = 0;
                    break;
                }
                break;
            case 78159:
                if (str.equals("OFF")) {
                    c = 1;
                    break;
                }
                break;
            case 2020783:
                if (str.equals("AUTO")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                Single$$ExternalSyntheticBUOutline0.m$3("Unknown flash mode name ".concat(str));
            case 2:
                return 0;
        }
    }
}
