package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.dee.app.contacts.common.constants.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/FontUtils;", "", "()V", "DEFAULT_FONT", "", "DEFAULT_FONT_STACKS", "", Constants.LOG_TAG, "TYPEFACE_FONTMAP_FIELD_NAME", "deviceFonts", "getDeviceFonts", "()Ljava/util/List;", "extractValidFont", "font", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class FontUtils {

    @NotNull
    private static final String DEFAULT_FONT = "sans-serif";

    @NotNull
    private static final String TAG = "Mbgl-FontUtils";

    @NotNull
    private static final String TYPEFACE_FONTMAP_FIELD_NAME = "sSystemFontMap";

    @NotNull
    public static final FontUtils INSTANCE = new FontUtils();

    @NotNull
    private static final List<String> DEFAULT_FONT_STACKS = CollectionsKt.listOf((Object[]) new String[]{"sans-serif", "serif", "monospace"});

    private FontUtils() {
    }

    @RequiresApi(21)
    @SuppressLint({"DiscouragedPrivateApi"})
    private final List<String> getDeviceFonts() {
        ArrayList arrayList = new ArrayList();
        try {
            Typeface create = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField(TYPEFACE_FONTMAP_FIELD_NAME);
            declaredField.getClass();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(create);
            obj.getClass();
            arrayList.addAll(((java.util.Map) obj).keySet());
            return arrayList;
        } catch (Exception e) {
            Log.e(TAG, "Couldn't load fonts from Typeface: " + e);
            return arrayList;
        }
    }

    @NotNull
    public final String extractValidFont(@Nullable String font) {
        List<String> deviceFonts = getDeviceFonts();
        if (deviceFonts == null || deviceFonts.isEmpty()) {
            deviceFonts = DEFAULT_FONT_STACKS;
        }
        if (font != null && deviceFonts.contains(font)) {
            return font;
        }
        Log.i(TAG, "Couldn't map font family for local ideograph, using sans-serif instead");
        return "sans-serif";
    }
}
