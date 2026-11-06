package com.swmansion.rnscreens.gamma.tabs.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0003J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/image/ResourceIdHelper;", "", "<init>", "()V", "idMap", "", "", "", "getIdForResourceType", "context", "Landroid/content/Context;", "name", "type", "getResourceUri", "Landroid/net/Uri;", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabsImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsImageLoader.kt\ncom/swmansion/rnscreens/gamma/tabs/image/ResourceIdHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* loaded from: classes9.dex */
final class ResourceIdHelper {

    @NotNull
    public static final ResourceIdHelper INSTANCE = new ResourceIdHelper();

    @NotNull
    private static final Map<String, Integer> idMap = new LinkedHashMap();

    private ResourceIdHelper() {
    }

    @SuppressLint({"DiscouragedApi"})
    private final int getIdForResourceType(Context context, String name, String type) {
        String replace$default;
        if (name.length() == 0) {
            return -1;
        }
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null);
        String m$1 = a$$ExternalSyntheticOutline0.m$1(type, "/", replace$default);
        synchronized (this) {
            Map<String, Integer> map = idMap;
            Integer num = map.get(m$1);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(replace$default, type, context.getPackageName());
            map.put(m$1, Integer.valueOf(identifier));
            return identifier;
        }
    }

    @Nullable
    public final Uri getResourceUri(@NotNull Context context, @NotNull String name) {
        boolean startsWith$default;
        String removePrefix;
        context.getClass();
        name.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        StringsKt__StringsJVMKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null);
        int idForResourceType = getIdForResourceType(context, name, "drawable");
        if (idForResourceType != 0) {
            return Uri.parse("res:/" + idForResourceType);
        }
        int idForResourceType2 = getIdForResourceType(context, name, "raw");
        if (idForResourceType2 != 0) {
            return Uri.parse("res:/" + idForResourceType2);
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "asset:/", false, 2, null);
        if (!startsWith$default) {
            return Uri.parse("file:///android_asset/".concat(name));
        }
        removePrefix = StringsKt__StringsKt.removePrefix(name, (CharSequence) "asset:/");
        return Uri.parse("file:///android_asset/" + removePrefix);
    }
}
