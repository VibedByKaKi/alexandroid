package com.amazon.identity.auth.device;

import android.net.Uri;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.identity.auth.device.token.CentralTokenManagementCommunication$GetTokenCommand;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class ff {

    /* renamed from: a, reason: collision with root package name */
    public static final List f620a = Arrays.asList("map_major_version", "map_minor_version", "current_device_type", "dsn_override", "map_sw_version", "map_init_version", "map_brazil_version");
    public static final List b = Arrays.asList("directedId", "namespace", "userdata_account", "token_account", "display_name", "userdata_key", "userdata_value", CentralTokenManagementCommunication$GetTokenCommand.KEY_TOKEN, "token_value", "device_data_key", "device_data_value", "timestamp_key", "deleted_key", "dirty_key");

    public static Uri a(String str, String str2) {
        return Uri.parse(ReactNativeBlobUtilConst.FILE_PREFIX_CONTENT + str + str2);
    }
}
