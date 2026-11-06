package com.mapbox.maps.plugin.locationcomponent.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/utils/BitmapUtils;", "", "()V", "equals", "", "bitmap", "Landroid/graphics/Bitmap;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getBitmapFromDrawableRes", "context", "Landroid/content/Context;", "sourceDrawableId", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class BitmapUtils {

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    @VisibleForTesting(otherwise = 2)
    public final boolean equals(@NotNull Bitmap bitmap, @NotNull Bitmap other) {
        bitmap.getClass();
        other.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        ByteBuffer allocate2 = ByteBuffer.allocate(other.getRowBytes() * other.getHeight());
        other.copyPixelsToBuffer(allocate2);
        return Arrays.equals(allocate.array(), allocate2.array());
    }

    @Nullable
    public final Bitmap getBitmapFromDrawableRes(@NotNull Context context, @DrawableRes int sourceDrawableId) {
        context.getClass();
        Drawable drawable = AppCompatResources.getDrawable(context, sourceDrawableId);
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return null;
        }
        Drawable mutate = constantState.newDrawable().mutate();
        mutate.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mutate.draw(canvas);
        return createBitmap;
    }
}
