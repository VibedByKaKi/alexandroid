package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static List<Boolean> convert(@NonNull boolean[] zArr) {
        if (zArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (zArr.length == 1) {
            return Collections.singletonList(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static Object[] convertListToArray(@NonNull List<Object> list) {
        return list.toArray();
    }

    public static boolean[] toBooleanArray(@NonNull List<Boolean> list) {
        int size = list.size();
        boolean[] zArr = new boolean[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                zArr[i] = list.get(i).booleanValue();
                i++;
            }
        } else {
            Iterator<Boolean> it2 = list.iterator();
            while (it2.hasNext()) {
                zArr[i] = it2.next().booleanValue();
                i++;
            }
        }
        return zArr;
    }

    public static byte[] toByteArray(@NonNull List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                bArr[i] = list.get(i).byteValue();
                i++;
            }
        } else {
            Iterator<Byte> it2 = list.iterator();
            while (it2.hasNext()) {
                bArr[i] = it2.next().byteValue();
                i++;
            }
        }
        return bArr;
    }

    public static double[] toDoubleArray(@NonNull List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                dArr[i] = list.get(i).doubleValue();
                i++;
            }
        } else {
            Iterator<Double> it2 = list.iterator();
            while (it2.hasNext()) {
                dArr[i] = it2.next().doubleValue();
                i++;
            }
        }
        return dArr;
    }

    public static float[] toFloatArray(@NonNull List<Float> list) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                fArr[i] = list.get(i).floatValue();
                i++;
            }
        } else {
            Iterator<Float> it2 = list.iterator();
            while (it2.hasNext()) {
                fArr[i] = it2.next().floatValue();
                i++;
            }
        }
        return fArr;
    }

    public static int[] toIntArray(@NonNull List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                iArr[i] = list.get(i).intValue();
                i++;
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                iArr[i] = it2.next().intValue();
                i++;
            }
        }
        return iArr;
    }

    public static long[] toLongArray(@NonNull List<Long> list) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                jArr[i] = list.get(i).longValue();
                i++;
            }
        } else {
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                jArr[i] = it2.next().longValue();
                i++;
            }
        }
        return jArr;
    }

    public static short[] toShortArray(@NonNull List<Short> list) {
        int size = list.size();
        short[] sArr = new short[size];
        int i = 0;
        if (list instanceof RandomAccess) {
            while (i < size) {
                sArr[i] = list.get(i).shortValue();
                i++;
            }
        } else {
            Iterator<Short> it2 = list.iterator();
            while (it2.hasNext()) {
                sArr[i] = it2.next().shortValue();
                i++;
            }
        }
        return sArr;
    }

    public static List<Byte> convert(@NonNull byte[] bArr) {
        if (bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (bArr.length == 1) {
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List<Character> convert(@NonNull char[] cArr) {
        if (cArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (cArr.length == 1) {
            return Collections.singletonList(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static List<Short> convert(@NonNull short[] sArr) {
        if (sArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (sArr.length == 1) {
            return Collections.singletonList(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static List<Integer> convert(@NonNull int[] iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        int i = 0;
        if (iArr.length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        while (i < length) {
            i = DoubleList$$ExternalSyntheticOutline0.m(iArr[i], arrayList, i, 1);
        }
        return arrayList;
    }

    public static List<Long> convert(@NonNull long[] jArr) {
        if (jArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (jArr.length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List<Float> convert(@NonNull float[] fArr) {
        if (fArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (fArr.length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List<Double> convert(@NonNull double[] dArr) {
        if (dArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (dArr.length == 1) {
            return Collections.singletonList(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List<Object> convert(@NonNull Object[] objArr) {
        return Arrays.asList(objArr);
    }
}
