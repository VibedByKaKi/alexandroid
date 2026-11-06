package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086\b¢\u0006\u0002\u0010\u0007\u001a!\u0010\b\u001a\u00020\t\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0006*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\b¨\u0006\f"}, d2 = {"workDataOf", "Landroidx/work/Data;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroidx/work/Data;", "hasKeyWithValueOfType", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        data.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(str, Object.class);
    }

    @NotNull
    public static final Data workDataOf(@NotNull Pair<String, ? extends Object>... pairArr) {
        pairArr.getClass();
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairArr) {
            builder.put(pair.getFirst(), pair.getSecond());
        }
        Data build = builder.build();
        build.getClass();
        return build;
    }
}
