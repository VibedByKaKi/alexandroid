package com.mapbox.maps.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/DistanceUnits;", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;)V", "ordinal", "", "getOrdinal$annotations", "()V", "getOrdinal", "()I", "getValue", "()Ljava/lang/String;", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DistanceUnits implements Parcelable {
    private final int ordinal;

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DistanceUnits> CREATOR = new Creator();

    @JvmField
    @NotNull
    public static final DistanceUnits METRIC = new DistanceUnits("metric");

    @JvmField
    @NotNull
    public static final DistanceUnits IMPERIAL = new DistanceUnits("imperial");

    @JvmField
    @NotNull
    public static final DistanceUnits NAUTICAL = new DistanceUnits("nautical");

    public DistanceUnits(@NotNull String str) {
        int i;
        str.getClass();
        this.value = str;
        int hashCode = str.hashCode();
        if (hashCode == -1077545552) {
            if (str.equals("metric")) {
                i = 0;
            }
            i = -1;
        } else if (hashCode != -431614405) {
            if (hashCode == 2084085079 && str.equals("nautical")) {
                i = 2;
            }
            i = -1;
        } else {
            if (str.equals("imperial")) {
                i = 1;
            }
            i = -1;
        }
        this.ordinal = i;
    }

    @JvmStatic
    @NotNull
    public static final DistanceUnits valueOf(@NotNull String str) {
        return INSTANCE.valueOf(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof DistanceUnits) && Intrinsics.areEqual(this.value, ((DistanceUnits) other).value);
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.value, new StringBuilder("DistanceUnits(value="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.value);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/plugin/DistanceUnits$Companion;", "", "()V", "IMPERIAL", "Lcom/mapbox/maps/plugin/DistanceUnits;", "METRIC", "NAUTICAL", "valueOf", "value", "", "values", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DistanceUnits valueOf(@NotNull String value) {
            value.getClass();
            int hashCode = value.hashCode();
            if (hashCode != -2024216144) {
                if (hashCode != -1428255401) {
                    if (hashCode == 351012411 && value.equals("IMPERIAL")) {
                        return DistanceUnits.IMPERIAL;
                    }
                } else if (value.equals("NAUTICAL")) {
                    return DistanceUnits.NAUTICAL;
                }
            } else if (value.equals("METRIC")) {
                return DistanceUnits.METRIC;
            }
            Single$$ExternalSyntheticBUOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, "DistanceUnits.valueOf does not support [", value));
            return null;
        }

        @NotNull
        public final List<DistanceUnits> values() {
            return CollectionsKt.listOf((Object[]) new DistanceUnits[]{DistanceUnits.METRIC, DistanceUnits.IMPERIAL, DistanceUnits.NAUTICAL});
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DistanceUnits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DistanceUnits createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new DistanceUnits(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DistanceUnits[] newArray(int i) {
            return new DistanceUnits[i];
        }
    }

    public static /* synthetic */ void getOrdinal$annotations() {
    }
}
