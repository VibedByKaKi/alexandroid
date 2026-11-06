package androidx.compose.ui.text.android;

import ai.onnxruntime.BuildConfig;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b\"\u0010\b\u0002\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\n\u001a\u0002H\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001aJ\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006\u000f"}, d2 = {"fastForEach", "", ExifInterface.GPS_DIRECTION_TRUE, "", "action", "Lkotlin/Function1;", "fastMapTo", "C", "R", "", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, ViewProps.TRANSFORM, "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastZipWithNext", "Lkotlin/Function2;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,84:1\n34#1,5:85\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:85,5\n*E\n"})
/* loaded from: classes13.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List<? extends T> list, @NotNull C c, @NotNull Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(function1.invoke(list.get(i)));
        }
        return c;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        BuildConfig buildConfig = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i < lastIndex) {
            i++;
            T t = list.get(i);
            arrayList.add(function2.invoke(buildConfig, t));
            buildConfig = t;
        }
        return arrayList;
    }
}
