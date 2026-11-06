package com.swmansion.rnscreens.gamma.helpers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.content.res.AppCompatResources;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"getSystemDrawableResource", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "iconName", "", "react-native-screens_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SystemDrawableKt {
    @Nullable
    public static final Drawable getSystemDrawableResource(@NotNull Context context, @Nullable String str) {
        context.getClass();
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return AppCompatResources.getDrawable(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
        if (identifier2 > 0) {
            return AppCompatResources.getDrawable(context, identifier2);
        }
        Log.w(TabScreen.TAG, "TabScreen could not resolve drawable resource with the name ".concat(str));
        return null;
    }
}
