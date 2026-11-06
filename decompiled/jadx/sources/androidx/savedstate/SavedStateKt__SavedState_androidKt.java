package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u001a7\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"SavedState", "Landroid/os/Bundle;", "savedState", "Landroidx/savedstate/SavedState;", "initialState", "", "", "", "builderAction", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "", "Lkotlin/ExtensionFunctionType;", "savedstate"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateKt")
@SourceDebugExtension({"SMAP\nSavedState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,47:1\n126#2:48\n153#2,3:49\n37#3,2:52\n1#4:54\n106#5:55\n106#5:56\n*S KotlinDebug\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n*L\n35#1:48\n35#1:49,3\n35#1:52,2\n38#1:55\n45#1:56\n*E\n"})
/* loaded from: classes14.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    @NotNull
    public static final Bundle savedState(@NotNull Map<String, ? extends Object> map, @NotNull Function1<? super SavedStateWriter, Unit> function1) {
        Pair[] pairArr;
        map.getClass();
        function1.getClass();
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(SavedStateWriter.m8198boximpl(SavedStateWriter.m8200constructorimpl(bundleOf)));
        return bundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Map map, Function1 function1, int i, Object obj) {
        Pair[] pairArr;
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m8111invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m8111invokexApjlu4(Bundle bundle) {
                    bundle.getClass();
                }
            };
        }
        map.getClass();
        function1.getClass();
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(SavedStateWriter.m8198boximpl(SavedStateWriter.m8200constructorimpl(bundleOf)));
        return bundleOf;
    }

    @NotNull
    public static final Bundle savedState(@NotNull Bundle bundle, @NotNull Function1<? super SavedStateWriter, Unit> function1) {
        bundle.getClass();
        function1.getClass();
        Bundle bundle2 = new Bundle(bundle);
        function1.invoke(SavedStateWriter.m8198boximpl(SavedStateWriter.m8200constructorimpl(bundle2)));
        return bundle2;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle bundle, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m8112invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m8112invokexApjlu4(Bundle bundle2) {
                    bundle2.getClass();
                }
            };
        }
        bundle.getClass();
        function1.getClass();
        Bundle bundle2 = new Bundle(bundle);
        function1.invoke(SavedStateWriter.m8198boximpl(SavedStateWriter.m8200constructorimpl(bundle2)));
        return bundle2;
    }
}
