package org.apache.thrift.orig.partial;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Validate {
    private Validate() {
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        org.apache.commons.lang3.Validate.isTrue(z, str, objArr);
    }

    public static void checkGreater(long j, String str, long j2, String str2) {
        checkArgument(j > j2, "'%s' (%s) must be greater than '%s' (%s).", str, Long.valueOf(j), str2, Long.valueOf(j2));
    }

    public static void checkGreaterOrEqual(long j, String str, long j2, String str2) {
        checkArgument(j >= j2, "'%s' (%s) must be greater than or equal to '%s' (%s).", str, Long.valueOf(j), str2, Long.valueOf(j2));
    }

    public static void checkIntegerMultiple(long j, String str, long j2, String str2) {
        checkArgument(j % j2 == 0, "'%s' (%s) must be an integer multiple of '%s' (%s).", str, Long.valueOf(j), str2, Long.valueOf(j2));
    }

    public static void checkLessOrEqual(long j, String str, long j2, String str2) {
        checkArgument(j <= j2, "'%s' (%s) must be less than or equal to '%s' (%s).", str, Long.valueOf(j), str2, Long.valueOf(j2));
    }

    private static void checkNotEmpty(int i, String str) {
        checkArgument(i > 0, "'%s' must have at least one element.", str);
    }

    public static void checkNotNegative(long j, String str) {
        checkArgument(j >= 0, "'%s' must not be negative.", str);
    }

    public static void checkNotNull(Object obj, String str) {
        checkArgument(obj != null, "'%s' must not be null.", str);
    }

    public static void checkNotNullAndNotEmpty(String str, String str2) {
        checkNotNull(str, str2);
        checkArgument(str.length() > 0, "'%s' must not be empty.", str2);
    }

    public static <T> void checkNotNullAndNumberOfElements(Collection<T> collection, int i, String str) {
        checkNotNull(collection, str);
        checkArgument(collection.size() == i, "Number of elements in '%s' must be exactly %s, %s given.", str, Integer.valueOf(i), Integer.valueOf(collection.size()));
    }

    public static void checkPathExists(Path path, String str) {
        checkNotNull(path, str);
        checkArgument(Files.exists(path, new LinkOption[0]), "Path %s (%s) does not exist.", str, path);
    }

    public static void checkPathExistsAsDir(Path path, String str) {
        checkPathExists(path, str);
        checkArgument(Files.isDirectory(path, new LinkOption[0]), "Path %s (%s) must point to a directory.", str, path);
    }

    public static void checkPathExistsAsFile(Path path, String str) {
        checkPathExists(path, str);
        checkArgument(Files.isRegularFile(path, new LinkOption[0]), "Path %s (%s) must point to a file.", str, path);
    }

    public static void checkPositiveInteger(long j, String str) {
        checkArgument(j > 0, "'%s' must be a positive integer.", str);
    }

    public static void checkRequired(boolean z, String str) {
        checkArgument(z, "'%s' is required.", str);
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        org.apache.commons.lang3.Validate.validState(z, str, objArr);
    }

    public static void checkValid(boolean z, String str) {
        checkArgument(z, "'%s' is invalid.", str);
    }

    public static void checkValuesEqual(long j, String str, long j2, String str2) {
        checkArgument(j == j2, "'%s' (%s) must equal '%s' (%s).", str, Long.valueOf(j), str2, Long.valueOf(j2));
    }

    public static void checkWithinRange(long j, String str, long j2, long j3) {
        checkArgument(j >= j2 && j <= j3, "'%s' (%s) must be within the range [%s, %s].", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
    }

    public static void checkValid(boolean z, String str, String str2) {
        checkArgument(z, "'%s' is invalid. Valid values are: %s.", str, str2);
    }

    public static <T> void checkNotNullAndNotEmpty(T[] tArr, String str) {
        checkNotNull(tArr, str);
        checkNotEmpty(tArr.length, str);
    }

    public static void checkNotNullAndNotEmpty(byte[] bArr, String str) {
        checkNotNull(bArr, str);
        checkNotEmpty(bArr.length, str);
    }

    public static void checkNotNullAndNotEmpty(short[] sArr, String str) {
        checkNotNull(sArr, str);
        checkNotEmpty(sArr.length, str);
    }

    public static void checkNotNullAndNotEmpty(int[] iArr, String str) {
        checkNotNull(iArr, str);
        checkNotEmpty(iArr.length, str);
    }

    public static void checkNotNullAndNotEmpty(long[] jArr, String str) {
        checkNotNull(jArr, str);
        checkNotEmpty(jArr.length, str);
    }

    public static <T> void checkNotNullAndNotEmpty(Iterable<T> iterable, String str) {
        checkNotNull(iterable, str);
        checkNotEmpty(iterable.iterator().hasNext() ? 1 : 0, str);
    }

    public static void checkWithinRange(double d, String str, double d2, double d3) {
        checkArgument(d >= d2 && d <= d3, "'%s' (%s) must be within the range [%s, %s].", str, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
    }
}
