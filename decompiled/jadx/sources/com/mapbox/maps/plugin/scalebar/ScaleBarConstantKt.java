package com.mapbox.maps.plugin.scalebar;

import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WebServiceErrorDetails;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.google.android.gms.common.util.GmsVersion;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"6\u0010\u000e\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u00100\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"6\u0010\u0014\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u00100\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"<\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u00100\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"FATHOM_UNIT", "", "FEET_PER_FATHOM", "", "FEET_PER_METER", "", "FEET_PER_MILE", "FEET_PER_NAUTICAL_MILE", "FEET_UNIT", "KILOMETER", "KILOMETER_UNIT", "METER_UNIT", "MILE_UNIT", "NAUTICAL_MILE_UNIT", "imperialTable", "", "Landroid/util/Pair;", "kotlin.jvm.PlatformType", "getImperialTable", "()Ljava/util/List;", "metricTable", "getMetricTable", "nauticalTable", "getNauticalTable", "setNauticalTable", "(Ljava/util/List;)V", "plugin-scalebar_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ScaleBarConstantKt {

    @NotNull
    public static final String FATHOM_UNIT = " fth";
    public static final int FEET_PER_FATHOM = 6;
    public static final float FEET_PER_METER = 3.2808f;
    public static final float FEET_PER_NAUTICAL_MILE = 6076.12f;

    @NotNull
    public static final String FEET_UNIT = " ft";
    public static final int KILOMETER = 1000;

    @NotNull
    public static final String KILOMETER_UNIT = " km";

    @NotNull
    public static final String METER_UNIT = " m";

    @NotNull
    public static final String MILE_UNIT = " mi";

    @NotNull
    public static final String NAUTICAL_MILE_UNIT = " nmi";

    @NotNull
    private static final List<Pair<Integer, Integer>> metricTable = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(1, 2), new Pair(2, 2), new Pair(4, 2), new Pair(10, 2), new Pair(20, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(150, 2), new Pair(200, 2), new Pair(300, 3), new Pair(500, 2), new Pair(1000, 2), new Pair(1500, 2), new Pair(3000, 3), new Pair(5000, 2), new Pair(10000, 2), new Pair(Integer.valueOf(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH), 2), new Pair(Integer.valueOf(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT), 3), new Pair(50000, 2), new Pair(100000, 2), new Pair(Integer.valueOf(WebServiceErrorDetails.GET_ACCESS_TOKEN_ERROR_OFFSET), 2), new Pair(300000, 3), new Pair(400000, 2), new Pair(500000, 2), new Pair(600000, 3), new Pair(800000, 2), new Pair(1000000, 2), new Pair(2000000, 2), new Pair(3000000, 3), new Pair(4000000, 2), new Pair(Integer.valueOf(GmsVersion.VERSION_LONGHORN), 2), new Pair(Integer.valueOf(GmsVersion.VERSION_MANCHEGO), 3), new Pair(Integer.valueOf(GmsVersion.VERSION_SAGA), 2), new Pair(10000000, 2), new Pair(12000000, 2), new Pair(15000000, 2)});
    public static final int FEET_PER_MILE = 5280;

    @NotNull
    private static final List<Pair<Integer, Integer>> imperialTable = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(1, 1), new Pair(4, 2), new Pair(6, 2), new Pair(10, 2), new Pair(20, 2), new Pair(30, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(200, 2), new Pair(300, 3), new Pair(400, 2), new Pair(600, 3), new Pair(800, 2), new Pair(1000, 2), new Pair(1320, 2), new Pair(2640, 2), new Pair(Integer.valueOf(FEET_PER_MILE), 2), new Pair(10560, 2), new Pair(15840, 3), new Pair(21120, 2), new Pair(42240, 2), new Pair(63360, 2), new Pair(79200, 3), new Pair(105600, 2), new Pair(158400, 3), new Pair(211200, 2), new Pair(422400, 2), new Pair(633600, 2), new Pair(1056000, 2), new Pair(1584000, 3), new Pair(2112000, 2), new Pair(3168000, 3), new Pair(5280000, 2), new Pair(7920000, 3), new Pair(10560000, 2), new Pair(15840000, 2), new Pair(21120000, 2), new Pair(26400000, 2), new Pair(31680000, 3), new Pair(42240000, 2), new Pair(52800000, 2)});

    @NotNull
    private static List<? extends Pair<Integer, Integer>> nauticalTable = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(6, 2), new Pair(12, 2), new Pair(18, 3), new Pair(30, 2), new Pair(60, 2), new Pair(120, 2), new Pair(180, 3), new Pair(300, 2), new Pair(600, 2), new Pair(1200, 2), new Pair(3038, 2), new Pair(6076, 2), new Pair(12152, 2), new Pair(18228, 3), new Pair(30380, 2), new Pair(60761, 2), new Pair(121522, 2), new Pair(182283, 3), new Pair(303806, 2), new Pair(607612, 2), new Pair(1215224, 2), new Pair(1822836, 3), new Pair(3038060, 2), new Pair(6076120, 2), new Pair(12152240, 2), new Pair(18228360, 3), new Pair(30380600, 2)});

    @NotNull
    public static final List<Pair<Integer, Integer>> getImperialTable() {
        return imperialTable;
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> getMetricTable() {
        return metricTable;
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> getNauticalTable() {
        return nauticalTable;
    }

    public static final void setNauticalTable(@NotNull List<? extends Pair<Integer, Integer>> list) {
        list.getClass();
        nauticalTable = list;
    }
}
