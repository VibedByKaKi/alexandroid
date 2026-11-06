package chip.platform;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface ChipMdnsCallback {
    void handleServiceBrowse(String[] strArr, String str, long j, long j2);

    void handleServiceResolve(String str, String str2, String str3, String str4, int i, Map<String, byte[]> map, long j, long j2);
}
