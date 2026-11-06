package com.mapbox.geojson.utils;

import androidx.annotation.NonNull;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    @NonNull
    public static List<Point> decode(@NonNull String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        double pow = Math.pow(10.0d, i);
        ArrayList arrayList = new ArrayList((length + 1) / 2);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            int i8 = 1;
            int i9 = 0;
            int i10 = 1;
            while (true) {
                i2 = i4 + 1;
                int charAt = str.charAt(i4) - '@';
                i10 += charAt << i9;
                i9 += 5;
                if (charAt < 31) {
                    break;
                }
                i4 = i2;
            }
            int i11 = ((i10 & 1) != 0 ? ~(i10 >> 1) : i10 >> 1) + i6;
            int i12 = 0;
            while (true) {
                i3 = i2 + 1;
                int charAt2 = str.charAt(i2) - '@';
                i8 += charAt2 << i12;
                i12 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i2 = i3;
            }
            i7 += (i8 & 1) != 0 ? ~(i8 >> 1) : i8 >> 1;
            arrayList.add(Point.fromLngLat(i7 / pow, i11 / pow));
            i5++;
            i6 = i11;
            i4 = i3;
        }
        return arrayList.subList(0, i5);
    }

    @NonNull
    public static double[] decodeToFlattenListOfPoints(@NonNull String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        double pow = Math.pow(10.0d, i);
        double[] dArr = new double[length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            int i8 = 0;
            int i9 = 1;
            while (true) {
                i2 = i4 + 1;
                int charAt = str.charAt(i4) - '@';
                i9 += charAt << i8;
                i8 += 5;
                if (charAt < 31) {
                    break;
                }
                i4 = i2;
            }
            int i10 = ((i9 & 1) != 0 ? ~(i9 >> 1) : i9 >> 1) + i6;
            int i11 = 0;
            int i12 = 1;
            while (true) {
                i3 = i2 + 1;
                int charAt2 = str.charAt(i2) - '@';
                i12 += charAt2 << i11;
                i11 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i2 = i3;
            }
            int i13 = i12 & 1;
            int i14 = i12 >> 1;
            if (i13 != 0) {
                i14 = ~i14;
            }
            i7 += i14;
            int i15 = i5 * 2;
            dArr[i15] = i7 / pow;
            dArr[i15 + 1] = i10 / pow;
            i5++;
            i6 = i10;
            i4 = i3;
        }
        int i16 = i5 * 2;
        double[] dArr2 = new double[i16];
        System.arraycopy(dArr, 0, dArr2, 0, i16);
        return dArr2;
    }

    @NonNull
    public static String encode(@NonNull List<Point> list, int i) {
        StringBuilder sb = new StringBuilder();
        double pow = Math.pow(10.0d, i);
        long j = 0;
        long j2 = 0;
        for (Point point : list) {
            long round = Math.round(point.latitude() * pow);
            long round2 = Math.round(point.longitude() * pow);
            encode(round - j, sb);
            encode(round2 - j2, sb);
            j = round;
            j2 = round2;
        }
        return sb.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (latitude * latitude) + (longitude * longitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (longitude2 != 0.0d || latitude2 != 0.0d) {
            double latitude3 = (((point.latitude() - latitude) * latitude2) + ((point.longitude() - longitude) * longitude2)) / ((latitude2 * latitude2) + (longitude2 * longitude2));
            if (latitude3 > 1.0d) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (latitude3 > 0.0d) {
                longitude += longitude2 * latitude3;
                latitude += latitude2 * latitude3;
            }
        }
        double longitude3 = point.longitude() - longitude;
        double latitude4 = point.latitude() - latitude;
        return (latitude4 * latitude4) + (longitude3 * longitude3);
    }

    @NonNull
    @Deprecated
    public static List<Point> simplify(@NonNull List<Point> list, double d, boolean z) {
        if (list.size() <= 2) {
            return list;
        }
        double d2 = d * d;
        if (!z) {
            list = simplifyRadialDist(list, d2);
        }
        return simplifyDouglasPeucker(list, d2);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i, int i2, double d, List<Point> list2) {
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        double d2 = d;
        for (int i5 = i + 1; i5 < i2; i5++) {
            double sqSegDist = getSqSegDist(list.get(i5), list.get(i), list.get(i2));
            if (sqSegDist > d2) {
                i4 = i5;
                d2 = sqSegDist;
            }
        }
        if (d2 > d) {
            if (i4 - i > 1) {
                List<Point> simplifyDpStep = simplifyDpStep(list, i, i4, d, list2);
                i3 = i4;
                arrayList.addAll(simplifyDpStep);
            } else {
                i3 = i4;
            }
            arrayList.add(list.get(i3));
            if (i2 - i3 > 1) {
                arrayList.addAll(simplifyDpStep(list, i3, i2, d, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i = 1; i < size; i++) {
            point2 = list.get(i);
            if (getSqDist(point2, point) > d) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @NonNull
    @Deprecated
    public static List<Point> simplify(@NonNull List<Point> list, double d) {
        return simplify(list, d, false);
    }

    @NonNull
    @Deprecated
    public static List<Point> simplify(@NonNull List<Point> list, boolean z) {
        return simplify(list, 1.0d, z);
    }

    @NonNull
    @Deprecated
    public static List<Point> simplify(@NonNull List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    @NonNull
    public static String encode(@NonNull double[] dArr, int i) {
        StringBuilder sb = new StringBuilder();
        double pow = Math.pow(10.0d, i);
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (i2 < dArr.length / 2) {
            int i3 = i2 * 2;
            double d = dArr[i3];
            long round = Math.round(dArr[i3 + 1] * pow);
            long round2 = Math.round(d * pow);
            encode(round - j, sb);
            encode(round2 - j2, sb);
            i2++;
            j2 = round2;
            j = round;
        }
        return sb.toString();
    }

    private static void encode(long j, StringBuilder sb) {
        long j2 = j << 1;
        if (j < 0) {
            j2 = ~j2;
        }
        while (j2 >= 32) {
            sb.append(Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        sb.append(Character.toChars((int) (j2 + 63)));
    }
}
