package expo.modules.kotlin.edgeToEdge;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.facebook.react.views.view.WindowUtilKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0003\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001aX\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u00020\b26\u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\n\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0082\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"getEnforceContrastFromTheme", "", "Landroid/app/Activity;", "enforceNavigationBarContrastFromTheme", "", "invokeWindowUtilKtMethod", ExifInterface.GPS_DIRECTION_TRUE, "methodName", "", ElementsRouteKeys.ARGS, "", "Lkotlin/Pair;", "Ljava/lang/Class;", "", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEdgeToEdgePackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdgePackage.kt\nexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackageKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n11228#2:71\n11563#2,3:72\n11228#2:79\n11563#2,3:80\n37#3:75\n36#3,3:76\n37#3:83\n36#3,3:84\n*S KotlinDebug\n*F\n+ 1 EdgeToEdgePackage.kt\nexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackageKt\n*L\n60#1:71\n60#1:72,3\n61#1:79\n61#1:80,3\n60#1:75\n60#1:76,3\n61#1:83\n61#1:84,3\n*E\n"})
/* loaded from: classes9.dex */
public final class EdgeToEdgePackageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void enforceNavigationBarContrastFromTheme(Activity activity) {
        activity.getWindow().setNavigationBarContrastEnforced(getEnforceContrastFromTheme(activity));
    }

    @RequiresApi(29)
    private static final boolean getEnforceContrastFromTheme(Activity activity) {
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.enforceNavigationBarContrast});
        obtainStyledAttributes.getClass();
        try {
            return obtainStyledAttributes.getBoolean(0, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T invokeWindowUtilKtMethod(String str, Pair<? extends Class<?>, ? extends Object>... pairArr) {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i = WindowUtilKt.$r8$clinit;
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<? extends Class<?>, ? extends Object> pair : pairArr) {
                arrayList.add(pair.getFirst());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<? extends Class<?>, ? extends Object> pair2 : pairArr) {
                arrayList2.add(pair2.getSecond());
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            Method declaredMethod = WindowUtilKt.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            m25294constructorimpl = Result.m25294constructorimpl(invoke);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Log.e("EdgeToEdgePackage", "Failed to invoke '" + str + "' on com.facebook.react.views.view.WindowUtilKt", m25297exceptionOrNullimpl);
        }
        if (Result.m25300isFailureimpl(m25294constructorimpl)) {
            return null;
        }
        return (T) m25294constructorimpl;
    }
}
