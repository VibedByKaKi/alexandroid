package kotlinx.metadata.internal.metadata.deserialization;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0000J\u001e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0000J\b\u0010\u0018\u001a\u00020\u0012H&J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0004J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lkotlinx/metadata/internal/metadata/deserialization/BinaryVersion;", "", "numbers", "", "", "([I)V", "major", "getMajor", "()I", "minor", "getMinor", "patch", "getPatch", "rest", "", "getRest", "()Ljava/util/List;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "isAtLeast", "version", "isAtMost", "isCompatible", "isCompatibleTo", "ourVersion", "toArray", "toString", "", "Companion", "metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class BinaryVersion {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_LENGTH = 1024;
    private static final int UNKNOWN = -1;
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    public BinaryVersion(@NotNull int... iArr) {
        List<Integer> emptyList;
        iArr.getClass();
        this.numbers = iArr;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        this.major = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(iArr, 1);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(iArr, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (iArr.length <= 3) {
            emptyList = CollectionsKt.emptyList();
        } else {
            if (iArr.length > 1024) {
                Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            emptyList = CollectionsKt.toList(ArraysKt.asList(iArr).subList(3, iArr.length));
        }
        this.rest = emptyList;
    }

    @JvmStatic
    @Nullable
    public static final int[] parseVersionArray(@NotNull String str) {
        return INSTANCE.parseVersionArray(str);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) other;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    @NotNull
    public final List<Integer> getRest() {
        return this.rest;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = (i * 31) + this.minor + i;
        int i3 = (i2 * 31) + this.patch + i2;
        return this.rest.hashCode() + (i3 * 31) + i3;
    }

    public final boolean isAtLeast(int major, int minor, int patch) {
        int i = this.major;
        if (i > major) {
            return true;
        }
        if (i < major) {
            return false;
        }
        int i2 = this.minor;
        if (i2 > minor) {
            return true;
        }
        return i2 >= minor && this.patch >= patch;
    }

    public final boolean isAtMost(int major, int minor, int patch) {
        int i = this.major;
        if (i < major) {
            return true;
        }
        if (i > major) {
            return false;
        }
        int i2 = this.minor;
        if (i2 < minor) {
            return true;
        }
        return i2 <= minor && this.patch <= patch;
    }

    public abstract boolean isCompatible();

    public final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        ourVersion.getClass();
        int i = this.major;
        return i == 0 ? ourVersion.major == 0 && this.minor == ourVersion.minor : i == ourVersion.major && this.minor <= ourVersion.minor;
    }

    @NotNull
    /* renamed from: toArray, reason: from getter */
    public final int[] getNumbers() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] numbers = getNumbers();
        ArrayList arrayList = new ArrayList();
        int length = numbers.length;
        int i = 0;
        while (i < length) {
            int i2 = numbers[i];
            if (i2 == -1) {
                break;
            }
            i = DoubleList$$ExternalSyntheticOutline0.m(i2, arrayList, i, 1);
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(arrayList, ".", null, null, null, 62);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/metadata/internal/metadata/deserialization/BinaryVersion$Companion;", "", "()V", "MAX_LENGTH", "", "UNKNOWN", "parseVersionArray", "", TypedValues.Custom.S_STRING, "", "metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final int[] parseVersionArray(@NotNull String string) {
            List split$default;
            string.getClass();
            split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, (Object) null);
            List list = split$default;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it2.next());
                if (intOrNull == null) {
                    return null;
                }
                arrayList.add(intOrNull);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            array.getClass();
            return ArraysKt.toIntArray((Integer[]) array);
        }

        private Companion() {
        }
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        version.getClass();
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtMost(@NotNull BinaryVersion version) {
        version.getClass();
        return isAtMost(version.major, version.minor, version.patch);
    }
}
