package kotlin.time;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.presence.service.PresenceServiceConfiguration;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"shortName", "", "Lkotlin/time/DurationUnit;", "durationUnitByShortName", "durationUnitByIsoChar", "isoChar", "", "isTimeComponent", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes10.dex */
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByIsoChar(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnit.DAYS;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m("Invalid or unsupported duration ISO non-time unit: ", c));
            return null;
        }
        if (c == 'H') {
            return DurationUnit.HOURS;
        }
        if (c == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c == 'S') {
            return DurationUnit.SECONDS;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m("Invalid duration ISO time unit: ", c));
        return null;
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByShortName(@NotNull String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals(PresenceServiceConfiguration.US)) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (str.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        return DurationUnit.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (str.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                return DurationUnit.HOURS;
            }
        } else if (str.equals("d")) {
            return DurationUnit.DAYS;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unknown duration unit short name: ".concat(str));
        return null;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final String shortName(@NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return PresenceServiceConfiguration.US;
            case 3:
                return "ms";
            case 4:
                return CmcdData.Factory.STREAMING_FORMAT_SS;
            case 5:
                return "m";
            case 6:
                return CmcdData.Factory.STREAMING_FORMAT_HLS;
            case 7:
                return "d";
            default:
                PathKt$$ExternalSyntheticBUOutline0.m$3(durationUnit, "Unknown unit: ");
                return null;
        }
    }
}
