package com.typesafe.config.impl;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigMemorySize;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import com.typesafe.config.Optional;
import defpackage.a$$ExternalSyntheticOutline0;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ConfigBeanImpl {
    public static <T> T createInternal(Config config, Class<T> cls) {
        if (((SimpleConfig) config).root().resolveStatus() != ResolveStatus.RESOLVED) {
            throw new ConfigException.NotResolved("need to Config#resolve() a config before using it to initialize a bean, see the API docs for Config#resolve()");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, ConfigValue> entry : config.root().entrySet()) {
            String key = entry.getKey();
            String camelCase = ConfigImplUtil.toCamelCase(key);
            if (!hashMap2.containsKey(camelCase) || key.equals(camelCase)) {
                hashMap.put(camelCase, (AbstractConfigValue) entry.getValue());
                hashMap2.put(camelCase, key);
            }
        }
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(cls);
            try {
                ArrayList arrayList = new ArrayList();
                for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                    if (propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null) {
                        arrayList.add(propertyDescriptor);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) it2.next();
                    ConfigValueType valueTypeOrNull = getValueTypeOrNull(propertyDescriptor2.getWriteMethod().getParameterTypes()[0]);
                    if (valueTypeOrNull != null) {
                        String str = (String) hashMap2.get(propertyDescriptor2.getName());
                        if (str == null) {
                            str = propertyDescriptor2.getName();
                        }
                        Path newKey = Path.newKey(str);
                        AbstractConfigValue abstractConfigValue = (AbstractConfigValue) hashMap.get(propertyDescriptor2.getName());
                        if (abstractConfigValue != null) {
                            SimpleConfig.checkValid(newKey, valueTypeOrNull, abstractConfigValue, arrayList2);
                        } else if (!isOptionalProperty(cls, propertyDescriptor2)) {
                            SimpleConfig.addMissing(arrayList2, valueTypeOrNull, newKey, config.origin());
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    throw new ConfigException.ValidationFailed(arrayList2);
                }
                T newInstance = cls.newInstance();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    PropertyDescriptor propertyDescriptor3 = (PropertyDescriptor) it3.next();
                    Method writeMethod = propertyDescriptor3.getWriteMethod();
                    Type type = writeMethod.getGenericParameterTypes()[0];
                    Class<?> cls2 = writeMethod.getParameterTypes()[0];
                    String str2 = (String) hashMap2.get(propertyDescriptor3.getName());
                    if (str2 != null) {
                        writeMethod.invoke(newInstance, getValue(cls, type, cls2, config, str2));
                    } else if (!isOptionalProperty(cls, propertyDescriptor3)) {
                        throw new ConfigException.Missing(propertyDescriptor3.getName());
                    }
                }
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new ConfigException.BadBean(cls.getName().concat(" getters and setters are not accessible, they must be for use as a bean"), e);
            } catch (InstantiationException e2) {
                throw new ConfigException.BadBean(cls.getName().concat(" needs a public no-args constructor to be used as a bean"), e2);
            } catch (InvocationTargetException e3) {
                throw new ConfigException.BadBean(ParcelCompat$$ExternalSyntheticOutline0.m((Class) cls, new StringBuilder("Calling bean method on "), " caused an exception"), e3);
            }
        } catch (IntrospectionException e4) {
            throw new ConfigException.BadBean("Could not get bean information for class ".concat(cls.getName()), e4);
        }
    }

    private static Field getField(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    private static Object getListValue(Class<?> cls, Type type, Class<?> cls2, Config config, String str) {
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 == Boolean.class) {
            return config.getBooleanList(str);
        }
        if (type2 == Integer.class) {
            return config.getIntList(str);
        }
        if (type2 == Double.class) {
            return config.getDoubleList(str);
        }
        if (type2 == Long.class) {
            return config.getLongList(str);
        }
        if (type2 == String.class) {
            return config.getStringList(str);
        }
        if (type2 == Duration.class) {
            return config.getDurationList(str);
        }
        if (type2 == ConfigMemorySize.class) {
            return config.getMemorySizeList(str);
        }
        if (type2 == Object.class) {
            return config.getAnyRefList(str);
        }
        if (type2 == Config.class) {
            return config.getConfigList(str);
        }
        if (type2 == ConfigObject.class) {
            return config.getObjectList(str);
        }
        if (type2 == ConfigValue.class) {
            return config.getList(str);
        }
        Class cls3 = (Class) type2;
        if (cls3.isEnum()) {
            return config.getEnumList(cls3, str);
        }
        if (hasAtLeastOneBeanProperty(cls3)) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Config> it2 = config.getConfigList(str).iterator();
            while (it2.hasNext()) {
                arrayList.add(createInternal(it2.next(), cls3));
            }
            return arrayList;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Bean property '", str, "' of class ");
        m2m.append(cls.getName());
        m2m.append(" has unsupported list element type ");
        m2m.append(type2);
        throw new ConfigException.BadBean(m2m.toString());
    }

    private static Object getValue(Class<?> cls, Type type, Class<?> cls2, Config config, String str) {
        if (cls2 == Boolean.class || cls2 == Boolean.TYPE) {
            return Boolean.valueOf(config.getBoolean(str));
        }
        if (cls2 == Integer.class || cls2 == Integer.TYPE) {
            return Integer.valueOf(config.getInt(str));
        }
        if (cls2 == Double.class || cls2 == Double.TYPE) {
            return Double.valueOf(config.getDouble(str));
        }
        if (cls2 == Long.class || cls2 == Long.TYPE) {
            return Long.valueOf(config.getLong(str));
        }
        if (cls2 == String.class) {
            return config.getString(str);
        }
        if (cls2 == Duration.class) {
            return config.getDuration(str);
        }
        if (cls2 == ConfigMemorySize.class) {
            return config.getMemorySize(str);
        }
        if (cls2 == Object.class) {
            return config.getAnyRef(str);
        }
        if (cls2 == List.class) {
            return getListValue(cls, type, cls2, config, str);
        }
        if (cls2 == Map.class) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments[0] == String.class && actualTypeArguments[1] == Object.class) {
                return config.getObject(str).unwrapped();
            }
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Bean property '", str, "' of class ");
            ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) cls, m2m, " has unsupported Map<");
            m2m.append(actualTypeArguments[0]);
            m2m.append(",");
            m2m.append(actualTypeArguments[1]);
            m2m.append(">, only Map<String,Object> is supported right now");
            throw new ConfigException.BadBean(m2m.toString());
        }
        if (cls2 == Config.class) {
            return config.getConfig(str);
        }
        if (cls2 == ConfigObject.class) {
            return config.getObject(str);
        }
        if (cls2 == ConfigValue.class) {
            return config.getValue(str);
        }
        if (cls2 == ConfigList.class) {
            return config.getList(str);
        }
        if (cls2.isEnum()) {
            return config.getEnum(cls2, str);
        }
        if (hasAtLeastOneBeanProperty(cls2)) {
            return createInternal(config.getConfig(str), cls2);
        }
        StringBuilder m2m2 = a$$ExternalSyntheticOutline0.m2m("Bean property ", str, " of class ");
        m2m2.append(cls.getName());
        m2m2.append(" has unsupported type ");
        m2m2.append(type);
        throw new ConfigException.BadBean(m2m2.toString());
    }

    private static ConfigValueType getValueTypeOrNull(Class<?> cls) {
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return ConfigValueType.BOOLEAN;
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == String.class) {
            return ConfigValueType.STRING;
        }
        if (cls == Duration.class || cls == ConfigMemorySize.class) {
            return null;
        }
        if (cls == List.class) {
            return ConfigValueType.LIST;
        }
        if (cls == Map.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == Config.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == ConfigObject.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == ConfigList.class) {
            return ConfigValueType.LIST;
        }
        return null;
    }

    private static boolean hasAtLeastOneBeanProperty(Class<?> cls) {
        try {
            for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(cls).getPropertyDescriptors()) {
                if (propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null) {
                    return true;
                }
            }
        } catch (IntrospectionException unused) {
        }
        return false;
    }

    private static boolean isOptionalProperty(Class cls, PropertyDescriptor propertyDescriptor) {
        return ((Optional[]) getField(cls, propertyDescriptor.getName()).getAnnotationsByType(Optional.class)).length > 0;
    }
}
