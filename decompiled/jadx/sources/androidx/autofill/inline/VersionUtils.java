package androidx.autofill.inline;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.inline.UiVersions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 30)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class VersionUtils {
    private static final String KEY_INLINE_UI_VERSIONS = "androidx.autofill.inline.ui.version:key";

    private VersionUtils() {
    }

    @NonNull
    public static List<String> getSupportedVersions(@NonNull Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_INLINE_UI_VERSIONS);
        if (stringArrayList != null) {
            Iterator<String> it2 = stringArrayList.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (isVersionSupported(next)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public static boolean isVersionSupported(@Nullable String str) {
        return UiVersions.getUiVersions().contains(str);
    }

    @Nullable
    public static Bundle readStyleByVersion(@NonNull Bundle bundle, @NonNull String str) {
        return bundle.getBundle(str);
    }

    public static void writeStylesToBundle(@NonNull List<UiVersions.Style> list, @NonNull Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (UiVersions.Style style : list) {
            String version = style.getVersion();
            arrayList.add(style.getVersion());
            bundle.putBundle(version, style.getBundle());
        }
        bundle.putStringArrayList(KEY_INLINE_UI_VERSIONS, arrayList);
    }

    public static void writeSupportedVersions(@NonNull Bundle bundle) {
        bundle.putStringArrayList(KEY_INLINE_UI_VERSIONS, new ArrayList<>(UiVersions.getUiVersions()));
    }
}
