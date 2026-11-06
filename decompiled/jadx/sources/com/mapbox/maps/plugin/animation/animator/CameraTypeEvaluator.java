package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/animation/animator/CameraTypeEvaluator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/animation/TypeEvaluator;", "canSkip", "", "cameraCurrentValue", "", "startValue", "values", "", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Z", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface CameraTypeEvaluator<T> extends TypeEvaluator<T> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T> boolean canSkip(@NotNull CameraTypeEvaluator<T> cameraTypeEvaluator, @NotNull Object obj, @NotNull Object obj2, @NotNull Object[] objArr) {
            obj.getClass();
            obj2.getClass();
            objArr.getClass();
            if (!Intrinsics.areEqual(obj, obj2)) {
                return false;
            }
            for (Object obj3 : objArr) {
                if (!Objects.equals(obj2, obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean canSkip(@NotNull Object cameraCurrentValue, @NotNull Object startValue, @NotNull Object[] values);
}
