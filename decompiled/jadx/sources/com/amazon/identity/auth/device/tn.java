package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.TokenManagement;
import com.amazon.identity.mobi.common.utils.SystemWrapper;
import java.util.Map;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class tn extends ContextWrapper {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f981a;

    public tn(Context context) {
        super(context);
        this.f981a = ParcelCompat$$ExternalSyntheticOutline0.m();
    }

    public static tn a(Context context) {
        return context instanceof tn ? (tn) context : new tn(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        x9 x9Var;
        Object systemService = getBaseContext().getSystemService(str);
        if (systemService != null) {
            return systemService;
        }
        Object obj = this.f981a.get(str);
        if (obj == null) {
            if ("dcp_system".equals(str)) {
                obj = new SystemWrapper();
            } else if ("dcp_device_info".equals(str)) {
                obj = pa.a(this);
            } else if ("dcp_account_manager".equals(str)) {
                obj = c1.a(this);
            } else if ("dcp_single_threaded_executor".equals(str)) {
                fh fhVar = fp.f623a;
                obj = Executors.newSingleThreadExecutor(new gh("MAP-ServiceWrappingContextThread"));
            } else if ("dcp_amazon_account_man".equals(str)) {
                obj = new com.amazon.identity.auth.accounts.a(this);
            } else if ("dcp_authenticated_url_connection_factory".equals(str)) {
                obj = new c6();
            } else if ("dcp_token_cache_holder".equals(str)) {
                obj = pp.a(this);
            } else if ("dcp_data_storage_factory".equals(str)) {
                synchronized (x9.class) {
                    try {
                        if (x9.e == null) {
                            x9.e = new x9(this);
                        }
                        x9Var = x9.e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                obj = x9Var;
            } else {
                obj = "sso_map_account_manager_communicator".equals(str) ? new com.amazon.identity.auth.accounts.g(this) : "dcp_token_mangement".equals(str) ? new TokenManagement(this) : "sso_local_datastorage".equals(str) ? com.amazon.identity.auth.device.storage.i.a(this) : "sso_alarm_maanger".equals(str) ? new n3(this) : "sso_platform".equals(str) ? new hl(this) : "sso_webservice_caller_creator".equals(str) ? new c4(this) : "sso_telephony_service".equals(str) ? new cp(this) : "sso_window_manager".equals(str) ? new xr(this) : null;
            }
            this.f981a.put(str, obj);
        }
        return obj;
    }

    public final v9 a() {
        return ((x9) getSystemService("dcp_data_storage_factory")).a();
    }
}
