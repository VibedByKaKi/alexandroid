package com.amazon.identity.auth.device;

import android.text.TextUtils;
import com.amazon.alexa.mobilytics.configuration.Config;
import com.amazon.minerva.client.api.AmazonMinerva;
import com.amazon.minerva.client.api.MetricEvent;
import com.amazon.minerva.client.api.Predefined;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class df extends mg {
    public final MetricEvent l;
    public final og m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(String str, String str2, String str3, String str4, String str5, String str6, Long l, Double d, Boolean bool, String str7, String str8, og ogVar) {
        super(str, str2, str3, str4, str5, str6, l, d, bool, str7, str8);
        boolean z = bg.e;
        if (ogVar == null) {
            this.m = mn.f816a;
        } else {
            this.m = ogVar;
        }
        MetricEvent metricEvent = new MetricEvent(this.m.a(), this.m.b());
        this.l = metricEvent;
        metricEvent.addPredefined(Predefined.PLATFORM);
        metricEvent.addPredefined(Predefined.BUILD_TYPE);
        metricEvent.addPredefined(Predefined.SOFTWARE_VERSION);
        metricEvent.addPredefined(Predefined.MODEL);
        metricEvent.addPredefined(Predefined.HARDWARE);
        metricEvent.addPredefined(Predefined.DEVICE_TYPE);
        metricEvent.addPredefined(Predefined.TIME_ZONE);
        metricEvent.addPredefined(Predefined.MARKETPLACE_ID);
        metricEvent.addPredefined(Predefined.COUNTRY_OF_RESIDENCE);
        metricEvent.addPredefined(Predefined.DEVICE_LANGUAGE);
        metricEvent.addString("map_version", "20260904N");
        metricEvent.addString("client_identifier", this.j);
        metricEvent.addLong("occurrence", 1L);
        if (!oo.e(str)) {
            metricEvent.addString(Config.RouteKeys.EVENT_NAME, str);
        }
        if (!oo.e(str2)) {
            metricEvent.addString("subevent_name", str2);
        }
        if (bool != null) {
            metricEvent.addString("success", bool.toString());
        }
        if (l != null) {
            metricEvent.addLong("count", l.longValue());
        }
        if (d != null) {
            metricEvent.addDouble("duration_ms", d.doubleValue());
        }
        if (!oo.e(str3)) {
            metricEvent.addString("reason_code", str3);
        }
        if (!oo.e(str4)) {
            metricEvent.addString("url", str4);
        }
        if (!oo.e(str5)) {
            metricEvent.addString("config_key", str5);
        }
        if (!oo.e(str6)) {
            metricEvent.addString("config_value", str6);
        }
        if (TextUtils.isEmpty(str8) || !this.m.c()) {
            return;
        }
        metricEvent.addString("counters", str8);
    }

    @Override // com.amazon.identity.auth.device.mg
    public final void a() {
        AmazonMinerva amazonMinerva;
        synchronized (ec.class) {
            try {
                if (ec.f598a == null) {
                    jg.b();
                }
                amazonMinerva = ec.f598a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (amazonMinerva != null) {
            ec.a().record(this.l);
        }
    }
}
