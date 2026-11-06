package expo.modules.core.arguments;

import android.os.Bundle;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ReadableArguments {
    boolean containsKey(String str);

    Object get(String str);

    default ReadableArguments getArguments(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return new MapArguments((Map) obj);
        }
        return null;
    }

    default boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    boolean getBoolean(String str, boolean z);

    default double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    double getDouble(String str, double d);

    default int getInt(String str) {
        return getInt(str, 0);
    }

    int getInt(String str, int i);

    default List getList(String str) {
        return getList(str, null);
    }

    List getList(String str, List list);

    default Map getMap(String str) {
        return getMap(str, null);
    }

    Map getMap(String str, Map map);

    default String getString(String str) {
        return getString(str, null);
    }

    String getString(String str, String str2);

    boolean isEmpty();

    Collection<String> keys();

    int size();

    default Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (String str : keys()) {
            Object obj = get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putParcelableArrayList(str, (ArrayList) obj);
            } else if (obj instanceof Map) {
                bundle.putBundle(str, new MapArguments((Map) obj).toBundle());
            } else {
                if (!(obj instanceof Bundle)) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$1("Could not put a value of ", obj.getClass(), " to bundle.");
                    return null;
                }
                bundle.putBundle(str, (Bundle) obj);
            }
        }
        return bundle;
    }
}
