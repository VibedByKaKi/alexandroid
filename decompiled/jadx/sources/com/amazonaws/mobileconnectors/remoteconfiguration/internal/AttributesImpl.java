package com.amazonaws.mobileconnectors.remoteconfiguration.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.amazonaws.mobileconnectors.remoteconfiguration.Attributes;
import com.amazonaws.mobileconnectors.remoteconfiguration.exceptions.RemoteConfigurationException;
import com.amazonaws.mobileconnectors.remoteconfiguration.internal.gear.Checks;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AttributesImpl implements Attributes {
    private static final String KEY_APP_IDENTIFIER = "_applicationIdentifier";
    public static final String KEY_APP_VERSION = "_applicationVersion";
    private static final String KEY_COUNTRY = "_localeCountryCode";
    private static final String KEY_LANGUAGE = "_localeLanguage";
    private static final String KEY_PLATFORM = "_platform";
    private static final int MAX_ALLOWED_CUSTOM_ATTRIBUTES = 100;
    private static final String PLATFORM_ANDROID = "Android";
    private static final String TAG = "AttributesImpl";
    private final ConcurrentMap<String, Object> mCustomAttributes;
    private final String mPackageName;
    private final Integer mPackageVersion;

    public AttributesImpl(Context context) {
        this.mCustomAttributes = new ConcurrentHashMap(5, 0.9f, 1);
        this.mPackageName = context.getPackageName();
        this.mPackageVersion = getPackageVersionCode(context);
    }

    private void addStandardAttributesTo(Map<String, Object> map) {
        map.put(KEY_PLATFORM, getPlatform());
        map.put(KEY_LANGUAGE, getLanguage());
        map.put(KEY_COUNTRY, getCountry());
        map.put(KEY_APP_IDENTIFIER, getPackageName());
        map.put(KEY_APP_VERSION, getPackageVersionCode());
    }

    private synchronized <T> T getObjectPrivate(String str, Class<T> cls) {
        try {
            Checks.checkNotNull(str, "attrKey cannot be null");
            Checks.checkNotNull(cls, "The class cannot be null");
            Object standardAttribute = str.startsWith("_") ? getStandardAttribute(str) : this.mCustomAttributes.get(str);
            if (standardAttribute == null) {
                return null;
            }
            if (cls.isAssignableFrom(standardAttribute.getClass())) {
                return cls.cast(standardAttribute);
            }
            throw new RemoteConfigurationException("Unable to retrieve value associated with attrKey = " + str + " as a " + cls.getSimpleName() + ".");
        } catch (Throwable th) {
            throw th;
        }
    }

    private Object getStandardAttribute(String str) {
        str.getClass();
        switch (str) {
            case "_applicationVersion":
                return getPackageVersionCode();
            case "_localeLanguage":
                return getLanguage();
            case "_localeCountryCode":
                return getCountry();
            case "_applicationIdentifier":
                return getPackageName();
            case "_platform":
                return getPlatform();
            default:
                Log.w(TAG, "Unrecognized standard attribute: ".concat(str));
                return null;
        }
    }

    public static boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        return obj.equals(obj2);
    }

    public static int nullSafeHash(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public void addAttribute(String str, Double d) {
        if (d == null || !(d.isNaN() || d.isInfinite())) {
            addAttributePrivate(str, d);
        } else {
            Gson$$ExternalSyntheticBUOutline0.m((Object) d, "Invalid attribute value: ");
        }
    }

    public synchronized void addAttributePrivate(String str, Object obj) {
        Checks.checkNotNull(str, "attrKey cannot be null");
        Checks.checkNotNull(obj, "attrValue cannot be null");
        Checks.checkArgument(!str.startsWith("_"), "Custom attributes cannot begin with _");
        if (this.mCustomAttributes.size() >= 100) {
            throw new RemoteConfigurationException("Custom attributes limit 100 reached");
        }
        this.mCustomAttributes.put(str, obj);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized AttributesImpl m23760clone() {
        return new AttributesImpl(this.mPackageName, this.mPackageVersion, this.mCustomAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttributesImpl attributesImpl = (AttributesImpl) obj;
        if (nullSafeEquals(this.mCustomAttributes, attributesImpl.mCustomAttributes) && nullSafeEquals(getCountry(), attributesImpl.getCountry()) && nullSafeEquals(getLanguage(), attributesImpl.getLanguage()) && nullSafeEquals(getPlatform(), attributesImpl.getPlatform()) && nullSafeEquals(getPackageName(), attributesImpl.getPackageName())) {
            return nullSafeEquals(getPackageVersionCode(), attributesImpl.getPackageVersionCode());
        }
        return false;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public synchronized Map<String, Object> getAllAttributes() {
        HashMap hashMap;
        hashMap = new HashMap();
        addStandardAttributesTo(hashMap);
        hashMap.putAll(this.mCustomAttributes);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public Boolean getBoolean(String str) {
        return (Boolean) getObjectPrivate(str, Boolean.class);
    }

    public String getCountry() {
        return Locale.getDefault().getCountry();
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public Double getDouble(String str) {
        return (Double) getObjectPrivate(str, Double.class);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public Integer getInt(String str) {
        return (Integer) getObjectPrivate(str, Integer.class);
    }

    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public Long getLong(String str) {
        return (Long) getObjectPrivate(str, Long.class);
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public Integer getPackageVersionCode(Context context) {
        try {
            return Integer.valueOf(context.getPackageManager().getPackageInfo(this.mPackageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.wtf(TAG, "Package not found for: " + this.mPackageName, e);
            return null;
        }
    }

    public String getPlatform() {
        return "Android";
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public String getString(String str) {
        return (String) getObjectPrivate(str, String.class);
    }

    public int hashCode() {
        return nullSafeHash(getPackageVersionCode()) + ((nullSafeHash(getPackageName()) + ((nullSafeHash(getPlatform()) + ((nullSafeHash(getLanguage()) + ((nullSafeHash(getCountry()) + (nullSafeHash(this.mCustomAttributes) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public synchronized Object remove(String str) {
        Checks.checkNotNull(str, "attrKey cannot be null");
        Checks.checkArgument(!str.startsWith("_"), "Unable to delete attributes with _ prefix");
        if (!this.mCustomAttributes.containsKey(str)) {
            return null;
        }
        return this.mCustomAttributes.remove(str);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public void addAttribute(String str, Integer num) {
        addAttributePrivate(str, num);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public void addAttribute(String str, Long l) {
        addAttributePrivate(str, l);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public void addAttribute(String str, String str2) {
        addAttributePrivate(str, str2);
    }

    private AttributesImpl(String str, Integer num, Map<String, Object> map) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(5, 0.9f, 1);
        this.mCustomAttributes = concurrentHashMap;
        this.mPackageName = str;
        this.mPackageVersion = num;
        concurrentHashMap.putAll(map);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Attributes
    public void addAttribute(String str, Boolean bool) {
        addAttributePrivate(str, bool);
    }

    public Integer getPackageVersionCode() {
        return this.mPackageVersion;
    }
}
