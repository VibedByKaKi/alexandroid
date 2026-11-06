package com.amazon.latencyinfra;

import android.util.Log;
import com.amazon.latencyinfra.LatencyReporterArgument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LatencyReporterSet {
    LatencyReporter logReporter;
    LatencyReporter metricsReporter;
    private long originDateInMills;
    private int reporterCount;
    private String testID;
    private Map<String, LatencyReporter> domainReporterCache = new HashMap();
    private Map<String, List<LatencyOutputObject>> latencyCache = new HashMap();
    private boolean isReporterReady = false;
    private boolean hasTestID = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.latencyinfra.LatencyReporterSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$latencyinfra$LatencyReporterType;

        static {
            int[] iArr = new int[LatencyReporterType.values().length];
            $SwitchMap$com$amazon$latencyinfra$LatencyReporterType = iArr;
            try {
                iArr[LatencyReporterType.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$latencyinfra$LatencyReporterType[LatencyReporterType.METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LatencyReporterSet(Long l) {
        this.originDateInMills = l.longValue();
    }

    public void addDefaultReporter(DefaultLatencyReporter defaultLatencyReporter) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$latencyinfra$LatencyReporterType[defaultLatencyReporter.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.w("[Latench Infra]:", "Default latency reporter can only be used to report log or metrics");
            } else if (this.metricsReporter == null) {
                this.metricsReporter = defaultLatencyReporter;
                this.reporterCount++;
            } else {
                Log.w("Latency Infra]:", "Metrics reporter has been registered already");
            }
        } else if (this.logReporter == null) {
            this.logReporter = defaultLatencyReporter;
            this.reporterCount++;
        } else {
            Log.w("Latency Infra]:", "Log reporter has been registered already");
        }
        if (this.reporterCount == 2 && this.hasTestID && !this.isReporterReady) {
            this.isReporterReady = true;
            reportCachedEntries();
        }
    }

    public void addDomainReporter(DomainLatencyReporter domainLatencyReporter) {
        String namespace = domainLatencyReporter.getNamespace();
        this.domainReporterCache.containsKey(namespace);
        this.domainReporterCache.put(namespace, domainLatencyReporter);
    }

    public void reportCachedEntries() {
        String str;
        Iterator<String> it2 = this.latencyCache.keySet().iterator();
        while (it2.hasNext()) {
            for (LatencyOutputObject latencyOutputObject : this.latencyCache.get(it2.next())) {
                LatencyReporterArgument argument = latencyOutputObject.getArgument();
                LatencyRecorderOption options = latencyOutputObject.getOptions();
                if (options.hasPerfTestOption() && (str = this.testID) != null) {
                    argument.setSourceMetaData(str);
                }
                reportWithOptions(argument, options);
            }
            it2.remove();
        }
    }

    public void reportWithOptions(LatencyReporterArgument latencyReporterArgument, LatencyRecorderOption latencyRecorderOption) {
        LatencyReporter latencyReporter;
        LatencyReporter latencyReporter2;
        LatencyReporter latencyReporter3;
        String str;
        if (latencyReporterArgument == null || latencyRecorderOption == null) {
            Log.w("[Latency Infra]: ", "Failed to report, argument or option is null.");
            return;
        }
        String namespace = latencyReporterArgument.getNamespace();
        ArrayList arrayList = new ArrayList();
        arrayList.add(latencyReporterArgument);
        if (latencyRecorderOption.hasFromAppStart()) {
            LatencyReporterArgument.Builder builder = latencyReporterArgument.toBuilder();
            builder.withStartTime(Long.valueOf(this.originDateInMills));
            builder.withName("appStart:" + latencyReporterArgument.getName());
            HashMap hashMap = new HashMap();
            if (latencyReporterArgument.getEvents() != null) {
                for (Map.Entry<String, Long> entry : latencyReporterArgument.getEvents().entrySet()) {
                    hashMap.put("appStart:" + entry.getKey(), entry.getValue());
                }
            }
            builder.withEvents(hashMap);
            arrayList.add(builder.build());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LatencyReporterArgument latencyReporterArgument2 = (LatencyReporterArgument) it2.next();
            if (!this.isReporterReady) {
                if (!this.latencyCache.containsKey(namespace)) {
                    this.latencyCache.put(namespace, new ArrayList());
                }
                List<LatencyOutputObject> list = this.latencyCache.get(namespace);
                list.add(new LatencyOutputObject(latencyReporterArgument2, latencyRecorderOption));
                this.latencyCache.put(namespace, list);
                return;
            }
            if (latencyRecorderOption.hasPerfTestOption() && (str = this.testID) != null) {
                latencyReporterArgument2.setSourceMetaData(str);
            }
            if (latencyRecorderOption.hasNamespaceOption() && (latencyReporter3 = this.domainReporterCache.get(namespace)) != null) {
                latencyReporter3.report(latencyReporterArgument2);
            }
            if (latencyRecorderOption.hasMetricsReporterOption() && (latencyReporter2 = this.metricsReporter) != null) {
                latencyReporter2.report(latencyReporterArgument2);
            }
            if (latencyRecorderOption.hasLogReporterOption() && (latencyReporter = this.logReporter) != null) {
                latencyReporter.report(latencyReporterArgument2);
            }
        }
    }

    public void setTestID(String str) {
        this.hasTestID = true;
        this.testID = str;
        if (this.reporterCount != 2 || this.isReporterReady) {
            return;
        }
        this.isReporterReady = true;
        reportCachedEntries();
    }
}
