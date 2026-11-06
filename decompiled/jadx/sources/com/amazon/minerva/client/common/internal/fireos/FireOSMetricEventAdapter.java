package com.amazon.minerva.client.common.internal.fireos;

import android.util.Log;
import com.amazon.minerva.client.api.MetricEvent;
import com.amazon.minerva.client.common.api.Predefined;
import com.amazon.minerva.client.common.internal.MetricEventAdapter;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FireOSMetricEventAdapter implements MetricEventAdapter {
    private static final String TAG = "FireOSMetricEventAdapte";
    private MetricEvent mFireOsMetricEvent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.minerva.client.common.internal.fireos.FireOSMetricEventAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$minerva$client$common$api$Predefined;

        static {
            int[] iArr = new int[Predefined.values().length];
            $SwitchMap$com$amazon$minerva$client$common$api$Predefined = iArr;
            try {
                iArr[Predefined.SOFTWARE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.SOFTWARE_VERSION_FINGERPRINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.OS_FILE_TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.BUILD_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.PLATFORM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.MODEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.DEVICE_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.DEVICE_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.CUSTOMER_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.MARKETPLACE_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.COUNTRY_OF_RESIDENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.DEVICE_LANGUAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.OTA_GROUP_NAME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$Predefined[Predefined.TIME_ZONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public FireOSMetricEventAdapter(String str, String str2, int i) {
        this.mFireOsMetricEvent = new MetricEvent(str, str2, i);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addBoolean(String str, boolean z) {
        this.mFireOsMetricEvent.addBoolean(str, z);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addDouble(String str, double d) {
        this.mFireOsMetricEvent.addDouble(str, d);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addLong(String str, long j) {
        this.mFireOsMetricEvent.addLong(str, j);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addPredefined(Predefined predefined) {
        com.amazon.minerva.client.api.Predefined predefined2;
        switch (AnonymousClass1.$SwitchMap$com$amazon$minerva$client$common$api$Predefined[predefined.ordinal()]) {
            case 1:
                predefined2 = com.amazon.minerva.client.api.Predefined.SOFTWARE_VERSION;
                break;
            case 2:
                predefined2 = com.amazon.minerva.client.api.Predefined.SOFTWARE_VERSION_FINGERPRINT;
                break;
            case 3:
                predefined2 = com.amazon.minerva.client.api.Predefined.OS_FILE_TAG;
                break;
            case 4:
                predefined2 = com.amazon.minerva.client.api.Predefined.BUILD_TYPE;
                break;
            case 5:
                predefined2 = com.amazon.minerva.client.api.Predefined.PLATFORM;
                break;
            case 6:
                predefined2 = com.amazon.minerva.client.api.Predefined.MODEL;
                break;
            case 7:
                predefined2 = com.amazon.minerva.client.api.Predefined.HARDWARE;
                break;
            case 8:
                predefined2 = com.amazon.minerva.client.api.Predefined.DEVICE_TYPE;
                break;
            case 9:
                predefined2 = com.amazon.minerva.client.api.Predefined.DEVICE_ID;
                break;
            case 10:
                predefined2 = com.amazon.minerva.client.api.Predefined.CUSTOMER_ID;
                break;
            case 11:
                predefined2 = com.amazon.minerva.client.api.Predefined.MARKETPLACE_ID;
                break;
            case 12:
                predefined2 = com.amazon.minerva.client.api.Predefined.COUNTRY_OF_RESIDENCE;
                break;
            case 13:
                predefined2 = com.amazon.minerva.client.api.Predefined.DEVICE_LANGUAGE;
                break;
            case 14:
                predefined2 = com.amazon.minerva.client.api.Predefined.OTA_GROUP_NAME;
                break;
            case 15:
                predefined2 = com.amazon.minerva.client.api.Predefined.TIME_ZONE;
                break;
            default:
                Log.e(TAG, "ERROR - " + predefined.name() + " is not supported at this time");
                return;
        }
        this.mFireOsMetricEvent.addPredefined(predefined2);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addString(String str, String str2) {
        this.mFireOsMetricEvent.addString(str, str2);
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addTimestamp(String str, Date date) {
        this.mFireOsMetricEvent.addTimestamp(str, date);
    }

    public MetricEvent getFireOsMetricEvent() {
        return this.mFireOsMetricEvent;
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public String getMetricGroupId() {
        return this.mFireOsMetricEvent.getMetricGroupId();
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public String getSchemaId() {
        return this.mFireOsMetricEvent.getSchemaId();
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public boolean isLowPrioritySet() {
        return this.mFireOsMetricEvent.isLowPrioritySet();
    }

    public void setFireOsMetricEvent(MetricEvent metricEvent) {
        this.mFireOsMetricEvent = metricEvent;
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void setLowPriority() {
        this.mFireOsMetricEvent.setLowPriority();
    }

    @Override // com.amazon.minerva.client.common.internal.MetricEventAdapter
    public void addTimestamp(String str, Date date, TimeZone timeZone) {
        this.mFireOsMetricEvent.addTimestamp(str, date, timeZone);
    }

    public FireOSMetricEventAdapter(String str, String str2) {
        this.mFireOsMetricEvent = new MetricEvent(str, str2);
    }

    public FireOSMetricEventAdapter() {
    }

    public FireOSMetricEventAdapter(MetricEvent metricEvent) {
        this.mFireOsMetricEvent = metricEvent;
    }
}
