package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RetainForClient
@KeepForSdk
/* loaded from: classes7.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object obj) {
        this.zza = obj;
    }

    @NonNull
    @KeepForSdk
    public static <T> T unwrap(@NonNull IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("Unexpected number of IObjectWrapper declared fields: ", length, new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            Single$$ExternalSyntheticBUOutline0.m$3("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            Single$$ExternalSyntheticBUOutline0.m("Could not access the field in remoteBinder.", e);
            return null;
        } catch (NullPointerException e2) {
            Single$$ExternalSyntheticBUOutline0.m("Binder object is null.", e2);
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> IObjectWrapper wrap(@NonNull T t) {
        return new ObjectWrapper(t);
    }
}
