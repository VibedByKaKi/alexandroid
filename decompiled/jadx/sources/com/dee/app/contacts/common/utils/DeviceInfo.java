package com.dee.app.contacts.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.dee.app.contacts.common.constants.Constants;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeviceInfo {
    private static final ContactsLogger LOG = ContactsLogger.getLogger(Constants.LOG_TAG, DeviceInfo.class);

    @SuppressLint({"HardwareIds"})
    private String getDSN(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        LOG.d("DSN : " + string);
        return string == null ? "" : string;
    }

    public String getUniqueDeviceId(Context context) {
        String hashCode = Hashing.md5().newHasher().putString((CharSequence) getDSN(context), Charsets.UTF_8).hash().toString();
        LOG.d("hash of DSN : " + hashCode);
        return hashCode;
    }
}
