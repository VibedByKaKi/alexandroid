package amazon.speech.simclient.focus.util;

import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class AlexaFocusChannelHelper {
    private static final Map<Integer, String> CHANNEL_MAP;

    static {
        HashMap hashMap = new HashMap();
        CHANNEL_MAP = hashMap;
        hashMap.put(3, "dialog");
        hashMap.put(1, "alert");
        hashMap.put(2, "content");
        hashMap.put(4, CommsFocusConstants.COMMUNICATIONS);
        hashMap.put(51, "inFocus");
    }

    public static String getName(int i) {
        String str = CHANNEL_MAP.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unexpected Channel Value");
        return null;
    }

    public static boolean isValid(int i) {
        return CHANNEL_MAP.get(Integer.valueOf(i)) != null;
    }
}
