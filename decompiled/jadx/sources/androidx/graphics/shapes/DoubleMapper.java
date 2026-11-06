package androidx.graphics.shapes;

import androidx.collection.MutableFloatList;
import com.amazon.alexa.auth.BuildConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB1\u0012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/graphics/shapes/DoubleMapper;", "", "mappings", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "sourceValues", "Landroidx/collection/MutableFloatList;", "targetValues", BuildConfig.FLAVOR_authType, "x", "mapBack", "Companion", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DoubleMapper {

    @JvmField
    @NotNull
    public static final DoubleMapper Identity;

    @NotNull
    private final MutableFloatList sourceValues;

    @NotNull
    private final MutableFloatList targetValues;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Pair pair = TuplesKt.to(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        Identity = new DoubleMapper(pair, TuplesKt.to(valueOf2, valueOf2));
    }

    public DoubleMapper(@NotNull Pair<Float, Float>... pairArr) {
        pairArr.getClass();
        this.sourceValues = new MutableFloatList(pairArr.length);
        this.targetValues = new MutableFloatList(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (true) {
            MutableFloatList mutableFloatList = this.sourceValues;
            if (i >= length) {
                FloatMappingKt.validateProgress(mutableFloatList);
                FloatMappingKt.validateProgress(this.targetValues);
                return;
            } else {
                mutableFloatList.add(pairArr[i].getFirst().floatValue());
                this.targetValues.add(pairArr[i].getSecond().floatValue());
                i++;
            }
        }
    }

    public final float map(float x) {
        return FloatMappingKt.linearMap(this.sourceValues, this.targetValues, x);
    }

    public final float mapBack(float x) {
        return FloatMappingKt.linearMap(this.targetValues, this.sourceValues, x);
    }
}
