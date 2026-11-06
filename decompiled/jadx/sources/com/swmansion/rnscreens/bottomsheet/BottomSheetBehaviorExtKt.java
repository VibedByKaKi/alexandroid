package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0007\u001a=\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\u0010\u000b\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u000f\u001ac\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000¨\u0006\u0015"}, d2 = {"updateMetrics", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "maxAllowedHeight", "", "expandedOffsetFromTop", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "useSingleDetent", "forceExpandedState", "", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "useTwoDetents", "state", "firstHeight", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "useThreeDetents", "halfExpandedRatio", "", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "fitToContentsSheetHeight", "react-native-screens_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetBehaviorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetBehaviorExt.kt\ncom/swmansion/rnscreens/bottomsheet/BottomSheetBehaviorExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/* loaded from: classes9.dex */
public final class BottomSheetBehaviorExtKt {
    public static final <T extends View> int fitToContentsSheetHeight(@NotNull BottomSheetBehavior<T> bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        return bottomSheetBehavior.getMaxHeight();
    }

    @NotNull
    public static final <T extends View> BottomSheetBehavior<T> updateMetrics(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2) {
        bottomSheetBehavior.getClass();
        if (num != null) {
            bottomSheetBehavior.setMaxHeight(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setExpandedOffset(num2.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior updateMetrics$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return updateMetrics(bottomSheetBehavior, num, num2);
    }

    @NotNull
    public static final <T extends View> BottomSheetBehavior<T> useSingleDetent(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, boolean z) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        if (z) {
            bottomSheetBehavior.setState(3);
        }
        if (num != null) {
            bottomSheetBehavior.setMaxHeight(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useSingleDetent$default(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return useSingleDetent(bottomSheetBehavior, num, z);
    }

    @NotNull
    public static final <T extends View> BottomSheetBehavior<T> useThreeDetents(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f, @Nullable Integer num4) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(false);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (f != null) {
            bottomSheetBehavior.setHalfExpandedRatio(f.floatValue());
        }
        if (num4 != null) {
            bottomSheetBehavior.setExpandedOffset(num4.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useThreeDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        return useThreeDetents(bottomSheetBehavior, num, num2, num3, f, num4);
    }

    @NotNull
    public static final <T extends View> BottomSheetBehavior<T> useTwoDetents(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(true);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useTwoDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return useTwoDetents(bottomSheetBehavior, num, num2, num3);
    }
}
