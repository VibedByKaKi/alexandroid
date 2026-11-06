package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import com.amazon.alexa.pmi.implementation.taplatency.LastRenderHistoryKt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class SmallDisplaySizeQuirk implements Quirk {
    private static final Map<String, Size> MODEL_TO_DISPLAY_SIZE_MAP;
    private static final String TAG = "SmallDisplaySizeQuirk";

    static {
        HashMap hashMap = new HashMap();
        MODEL_TO_DISPLAY_SIZE_MAP = hashMap;
        hashMap.put("REDMI NOTE 8", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2340));
        hashMap.put("REDMI NOTE 7", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2340));
        hashMap.put("SM-A207M", new Size(720, 1560));
        hashMap.put("REDMI NOTE 7S", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2340));
        hashMap.put("SM-A127F", new Size(720, 1600));
        hashMap.put("SM-A536E", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, LastRenderHistoryKt.TTLR_HISTORY_CAPACITY));
        hashMap.put("220233L2I", new Size(720, 1600));
        hashMap.put("V2149", new Size(720, 1600));
        hashMap.put("VIVO 1920", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2340));
        hashMap.put("CPH2223", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, LastRenderHistoryKt.TTLR_HISTORY_CAPACITY));
        hashMap.put("V2029", new Size(720, 1600));
        hashMap.put("CPH1901", new Size(720, 1520));
        hashMap.put("REDMI Y3", new Size(720, 1520));
        hashMap.put("SM-A045M", new Size(720, 1600));
        hashMap.put("SM-A146U", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2408));
        hashMap.put("CPH1909", new Size(720, 1520));
        hashMap.put("NOKIA 4.2", new Size(720, 1520));
        hashMap.put("SM-G960U1", new Size(DateTimeConstants.MINUTES_PER_DAY, 2960));
        hashMap.put("SM-A137F", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, 2408));
        hashMap.put("VIVO 1816", new Size(720, 1520));
        hashMap.put("INFINIX X6817", new Size(720, 1612));
        hashMap.put("SM-A037F", new Size(720, 1600));
        hashMap.put("NOKIA 2.4", new Size(720, 1600));
        hashMap.put("SM-A125M", new Size(720, 1600));
        hashMap.put("INFINIX X670", new Size(LegacyFlags.DEFAULT_SCREEN_WIDTH, LastRenderHistoryKt.TTLR_HISTORY_CAPACITY));
    }

    public static boolean load() {
        return MODEL_TO_DISPLAY_SIZE_MAP.containsKey(Build.MODEL.toUpperCase(Locale.US));
    }

    @NonNull
    public Size getDisplaySize() {
        return MODEL_TO_DISPLAY_SIZE_MAP.get(Build.MODEL.toUpperCase(Locale.US));
    }
}
