package chip.platform;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ChipMdnsCallbackImpl implements ChipMdnsCallback {
    public byte[] getTextEntryData(Map<String, byte[]> map, String str) {
        return map.get(str);
    }

    public String[] getTextEntryKeys(Map<String, byte[]> map) {
        return (String[]) map.keySet().toArray(new String[map.size()]);
    }

    @Override // chip.platform.ChipMdnsCallback
    public native void handleServiceBrowse(String[] strArr, String str, long j, long j2);

    @Override // chip.platform.ChipMdnsCallback
    public native void handleServiceResolve(String str, String str2, String str3, String str4, int i, Map<String, byte[]> map, long j, long j2);
}
