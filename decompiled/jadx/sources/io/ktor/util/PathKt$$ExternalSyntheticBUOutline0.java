package io.ktor.util;

import java.io.EOFException;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class PathKt$$ExternalSyntheticBUOutline0 {
    public static /* synthetic */ void m(int i, int i2) {
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i + ((Object) " is less than minimum ") + i2 + '.');
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void m$2(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m$4(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void m$1(int i, Object obj, Object obj2, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m$1(int i, String str, Object obj) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void m$1(int i, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void m$1(Object obj) {
        throw new NoSuchElementException("Progression " + obj + ((Object) " is empty."));
    }

    public static /* synthetic */ void m() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void m(int i, int i2, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m$1(Object obj, StringBuilder sb) {
        sb.append(" is less than minimum ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m$1() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        sb.append(obj4);
        sb.append(i);
        sb.append(obj5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void m(int i, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2 + i);
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void m(Object obj, int i, int i2, String str) {
        throw new EOFException(str + i + obj + i2);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }
}
