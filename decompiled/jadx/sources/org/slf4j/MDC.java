package org.slf4j;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class MDC {
    static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    static MDCAdapter mdcAdapter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MDCCloseable implements Closeable {
        private final String key;

        private MDCCloseable(String str) {
            this.key = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MDC.remove(this.key);
        }
    }

    static {
        try {
            mdcAdapter = bwCompatibleGetMDCAdapterFromBinder();
        } catch (Exception e) {
            Util.report("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            mdcAdapter = new NOPMDCAdapter();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            Util.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            Util.report("Defaulting to no-operation MDCAdapter implementation.");
            Util.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    private MDC() {
    }

    private static MDCAdapter bwCompatibleGetMDCAdapterFromBinder() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void clear() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.clear();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("key parameter cannot be null");
            return null;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return null;
    }

    public static Map<String, String> getCopyOfContextMap() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return null;
    }

    public static MDCAdapter getMDCAdapter() {
        return mdcAdapter;
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("key parameter cannot be null");
            return;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.put(str, str2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static MDCCloseable putCloseable(String str, String str2) throws IllegalArgumentException {
        put(str, str2);
        return new MDCCloseable(str);
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("key parameter cannot be null");
            return;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.remove(str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static void setContextMap(Map<String, String> map) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.setContextMap(map);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }
}
