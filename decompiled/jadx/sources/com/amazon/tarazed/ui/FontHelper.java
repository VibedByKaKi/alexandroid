package com.amazon.tarazed.ui;

import android.content.res.AssetManager;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/ui/FontHelper;", "", "()V", "excludeExtension", "", "path", "findFontPath", "assetManager", "Landroid/content/res/AssetManager;", "basePath", "fontName", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontHelper.kt\ncom/amazon/tarazed/ui/FontHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n13309#2,2:38\n*S KotlinDebug\n*F\n+ 1 FontHelper.kt\ncom/amazon/tarazed/ui/FontHelper\n*L\n20#1:38,2\n*E\n"})
/* loaded from: classes19.dex */
public final class FontHelper {

    @NotNull
    public static final FontHelper INSTANCE = new FontHelper();

    private FontHelper() {
    }

    private final String excludeExtension(String path) {
        int lastIndexOf$default;
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, '.', 0, false, 6, (Object) null);
        return lastIndexOf$default != -1 ? path.substring(0, lastIndexOf$default) : path;
    }

    @Nullable
    public final String findFontPath(@NotNull AssetManager assetManager, @NotNull String basePath, @NotNull String fontName) {
        assetManager.getClass();
        basePath.getClass();
        fontName.getClass();
        String[] list = assetManager.list(basePath);
        if (list == null) {
            return null;
        }
        for (String str : list) {
            FontHelper fontHelper = INSTANCE;
            str.getClass();
            if (Intrinsics.areEqual(fontHelper.excludeExtension(str), fontName)) {
                return a$$ExternalSyntheticOutline0.m$1(basePath, "/", str);
            }
        }
        return null;
    }
}
