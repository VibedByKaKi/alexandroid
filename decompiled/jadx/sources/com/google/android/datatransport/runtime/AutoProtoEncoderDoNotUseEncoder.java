package com.google.android.datatransport.runtime;

import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsContract;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {
        static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
        private static final FieldDescriptor WINDOW_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("window"));
        private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(2, FieldDescriptor.builder("logSourceMetrics"));
        private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(3, FieldDescriptor.builder("globalMetrics"));
        private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(4, FieldDescriptor.builder("appNamespace"));

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(WINDOW_DESCRIPTOR, clientMetrics.getWindowInternal());
            objectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, clientMetrics.getAppNamespace());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {
        static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
        private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("storageMetrics"));

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, globalMetrics.getStorageMetricsInternal());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {
        static final LogEventDroppedEncoder INSTANCE = new LogEventDroppedEncoder();
        private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("eventsDroppedCount"));
        private static final FieldDescriptor REASON_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(3, FieldDescriptor.builder("reason"));

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.getReason());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {
        static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
        private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("logSource"));
        private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(2, FieldDescriptor.builder("logEventDropped"));

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logSourceMetrics.getLogSource());
            objectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.getLogEventDroppedList());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.of(ClientMetricsContract.ClientMetricsEntry.VOICE_INTERACTION_METRICS_TABLE_NAME);

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {
        static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
        private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("currentCacheSizeBytes"));
        private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(2, FieldDescriptor.builder("maxCacheSizeBytes"));

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {
        static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
        private static final FieldDescriptor STARTMS_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(1, FieldDescriptor.builder("startMs"));
        private static final FieldDescriptor ENDMS_DESCRIPTOR = RegionDefaults$$ExternalSyntheticOutline0.m(2, FieldDescriptor.builder("endMs"));

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STARTMS_DESCRIPTOR, timeWindow.getStartMs());
            objectEncoderContext.add(ENDMS_DESCRIPTOR, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.INSTANCE);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.INSTANCE);
    }
}
