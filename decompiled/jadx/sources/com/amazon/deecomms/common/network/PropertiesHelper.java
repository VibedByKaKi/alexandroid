package com.amazon.deecomms.common.network;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.common.Constants;
import java.io.IOException;
import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PropertiesHelper {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, PropertiesHelper.class);
    private static Properties properties;

    private PropertiesHelper() {
    }

    private static synchronized Properties getProperties(Context context) throws Resources.NotFoundException, IOException {
        Properties properties2;
        synchronized (PropertiesHelper.class) {
            try {
                if (properties == null) {
                    Properties properties3 = new Properties();
                    properties = properties3;
                    properties3.load(context.getResources().openRawResource(R.raw.stage));
                }
                properties2 = properties;
            } catch (Throwable th) {
                throw th;
            }
        }
        return properties2;
    }

    public static String getProperty(Context context, String str, String str2) {
        try {
            return getProperties(context).getProperty(str, str2);
        } catch (Resources.NotFoundException e) {
            LOG.e("could not open raw resource stage.properties", e);
            return str2;
        } catch (IOException e2) {
            LOG.e("could not load properties file", e2);
            return str2;
        }
    }

    public static void setProperties(Properties properties2) {
        properties = properties2;
    }

    public static String getProperty(Context context, String str) {
        return getProperty(context, str, null);
    }
}
