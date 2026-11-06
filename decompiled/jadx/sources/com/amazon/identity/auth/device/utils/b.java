package com.amazon.identity.auth.device.utils;

import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.a0;
import com.amazon.identity.auth.device.ar;
import com.amazon.identity.auth.device.yf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f1014a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static Object a(String str, Class cls, Object obj, Class[] clsArr, Object... objArr) {
        try {
            Method a2 = a(cls, str, clsArr);
            if (a2 != null) {
                return a2.invoke(obj, objArr);
            }
            throw new ReflectionHelper$CannotCallMethodException("Method " + str + " cannot be found or accessed!");
        } catch (IllegalAccessException e) {
            throw new ReflectionHelper$CannotCallMethodException("IllegalAccessException calling method", e);
        } catch (IllegalArgumentException e2) {
            throw new ReflectionHelper$CannotCallMethodException("IllegalArguemntException calling method", e2);
        } catch (SecurityException e3) {
            throw new ReflectionHelper$CannotCallMethodException(e3.getMessage(), e3);
        } catch (InvocationTargetException e4) {
            Log.e(yf.a("ReflectionHelper"), "Exception thrown while calling method ".concat(str), e4.getCause());
            throw new ReflectionHelper$CannotCallMethodException("Exception calling method", e4);
        }
    }

    public static Object a(String str, String str2, Class[] clsArr, Object... objArr) {
        Class<?> cls;
        Class cls2;
        if (TextUtils.isEmpty(str2)) {
            cls2 = null;
        } else {
            ar arVar = (ar) f1014a.get(str2);
            if (arVar == null) {
                try {
                    cls = Class.forName(str2);
                } catch (ClassNotFoundException unused) {
                    Log.w(yf.a("ReflectionHelper"), a0.a("Failed to locate class named ", str2, ". If this is not a Kindle device, you can ignore this warning."));
                    cls = null;
                }
                ar arVar2 = new ar(cls);
                f1014a.put(str2, arVar2);
                arVar = arVar2;
            }
            cls2 = (Class) arVar.f522a;
        }
        if (cls2 != null) {
            return a(str, cls2, null, clsArr, objArr);
        }
        String concat = "Cannot find class ".concat(str2);
        Log.e(yf.a("ReflectionHelper"), concat);
        throw new ReflectionHelper$CannotCallMethodException(concat);
    }

    public static Object a(Object obj, String str) {
        try {
            return obj.getClass().getField(str).get(obj);
        } catch (IllegalAccessException e) {
            throw new ReflectionHelper$CannotCallMethodException("Cannot get field because of IllegalAccessException", e);
        } catch (IllegalArgumentException e2) {
            throw new ReflectionHelper$CannotCallMethodException("Cannot get field because of IllegalArgumentException", e2);
        } catch (NoSuchFieldException e3) {
            throw new ReflectionHelper$CannotCallMethodException(a0.a("Field ", str, " cannot be found"), e3);
        } catch (SecurityException e4) {
            throw new ReflectionHelper$CannotCallMethodException("Cannot get field because of a security exception", e4);
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        Method method;
        a aVar = new a(cls, str, clsArr);
        ar arVar = (ar) b.get(aVar);
        if (arVar == null) {
            try {
                method = cls.getMethod(str, clsArr);
            } catch (IllegalArgumentException unused) {
                Log.e(yf.a("ReflectionHelper"), "IllegalArguemntException calling method");
                method = null;
                arVar = new ar(method);
                b.put(aVar, arVar);
                return (Method) arVar.f522a;
            } catch (NoSuchMethodException unused2) {
                Log.e(yf.a("ReflectionHelper"), "Method cannot be found. Are you sure it is public?");
                method = null;
                arVar = new ar(method);
                b.put(aVar, arVar);
                return (Method) arVar.f522a;
            } catch (SecurityException e) {
                Log.e(yf.a("ReflectionHelper"), "Security Exception! Error: " + e.getMessage());
                method = null;
                arVar = new ar(method);
                b.put(aVar, arVar);
                return (Method) arVar.f522a;
            }
            arVar = new ar(method);
            b.put(aVar, arVar);
        }
        return (Method) arVar.f522a;
    }
}
