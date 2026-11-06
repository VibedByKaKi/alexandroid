package com.brentvatne.common.api;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.brentvatne.common.toolbox.ReactBridgeUtils;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/brentvatne/common/api/BufferConfig;", "", "<init>", "()V", "cacheSize", "", "getCacheSize", "()I", "setCacheSize", "(I)V", BufferConfig.PROP_BUFFER_CONFIG_MIN_BUFFER_MS, "getMinBufferMs", "setMinBufferMs", BufferConfig.PROP_BUFFER_CONFIG_MAX_BUFFER_MS, "getMaxBufferMs", "setMaxBufferMs", BufferConfig.PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS, "getBufferForPlaybackMs", "setBufferForPlaybackMs", BufferConfig.PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, "getBufferForPlaybackAfterRebufferMs", "setBufferForPlaybackAfterRebufferMs", BufferConfig.PROP_BUFFER_CONFIG_BACK_BUFFER_DURATION_MS, "getBackBufferDurationMs", "setBackBufferDurationMs", BufferConfig.PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT, "", "getMaxHeapAllocationPercent", "()D", "setMaxHeapAllocationPercent", "(D)V", BufferConfig.PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT, "getMinBackBufferMemoryReservePercent", "setMinBackBufferMemoryReservePercent", BufferConfig.PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT, "getMinBufferMemoryReservePercent", "setMinBufferMemoryReservePercent", BufferConfig.PROP_BUFFER_CONFIG_INITIAL_BITRATE, "getInitialBitrate", "setInitialBitrate", BufferConfig.PROP_BUFFER_CONFIG_LIVE, "Lcom/brentvatne/common/api/BufferConfig$Live;", "getLive", "()Lcom/brentvatne/common/api/BufferConfig$Live;", "setLive", "(Lcom/brentvatne/common/api/BufferConfig$Live;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Live", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferConfig {

    @NotNull
    private static final String PROP_BUFFER_CONFIG_BACK_BUFFER_DURATION_MS = "backBufferDurationMs";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_CACHE_SIZE = "cacheSizeMB";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_INITIAL_BITRATE = "initialBitrate";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_LIVE = "live";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT = "maxHeapAllocationPercent";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT = "minBackBufferMemoryReservePercent";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT = "minBufferMemoryReservePercent";

    @NotNull
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private int backBufferDurationMs;
    private int bufferForPlaybackAfterRebufferMs;
    private int bufferForPlaybackMs;
    private int cacheSize;
    private int initialBitrate;

    @NotNull
    private Live live;
    private int maxBufferMs;
    private double maxHeapAllocationPercent;
    private double minBackBufferMemoryReservePercent;
    private double minBufferMemoryReservePercent;
    private int minBufferMs;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int BufferConfigPropUnsetInt = -1;
    private static final double BufferConfigPropUnsetDouble = -1.0d;

    public BufferConfig() {
        int i = BufferConfigPropUnsetInt;
        this.cacheSize = i;
        this.minBufferMs = i;
        this.maxBufferMs = i;
        this.bufferForPlaybackMs = i;
        this.bufferForPlaybackAfterRebufferMs = i;
        this.backBufferDurationMs = i;
        double d = BufferConfigPropUnsetDouble;
        this.maxHeapAllocationPercent = d;
        this.minBackBufferMemoryReservePercent = d;
        this.minBufferMemoryReservePercent = d;
        this.initialBitrate = i;
        this.live = new Live();
    }

    @JvmStatic
    @NotNull
    public static final BufferConfig parse(@Nullable ReadableMap readableMap) {
        return INSTANCE.parse(readableMap);
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof BufferConfig)) {
            BufferConfig bufferConfig = (BufferConfig) other;
            if (this.cacheSize == bufferConfig.cacheSize && this.minBufferMs == bufferConfig.minBufferMs && this.maxBufferMs == bufferConfig.maxBufferMs && this.bufferForPlaybackMs == bufferConfig.bufferForPlaybackMs && this.bufferForPlaybackAfterRebufferMs == bufferConfig.bufferForPlaybackAfterRebufferMs && this.backBufferDurationMs == bufferConfig.backBufferDurationMs && this.maxHeapAllocationPercent == bufferConfig.maxHeapAllocationPercent && this.minBackBufferMemoryReservePercent == bufferConfig.minBackBufferMemoryReservePercent && this.minBufferMemoryReservePercent == bufferConfig.minBufferMemoryReservePercent && this.initialBitrate == bufferConfig.initialBitrate && Intrinsics.areEqual(this.live, bufferConfig.live)) {
                return true;
            }
        }
        return false;
    }

    public final int getBackBufferDurationMs() {
        return this.backBufferDurationMs;
    }

    public final int getBufferForPlaybackAfterRebufferMs() {
        return this.bufferForPlaybackAfterRebufferMs;
    }

    public final int getBufferForPlaybackMs() {
        return this.bufferForPlaybackMs;
    }

    public final int getCacheSize() {
        return this.cacheSize;
    }

    public final int getInitialBitrate() {
        return this.initialBitrate;
    }

    @NotNull
    public final Live getLive() {
        return this.live;
    }

    public final int getMaxBufferMs() {
        return this.maxBufferMs;
    }

    public final double getMaxHeapAllocationPercent() {
        return this.maxHeapAllocationPercent;
    }

    public final double getMinBackBufferMemoryReservePercent() {
        return this.minBackBufferMemoryReservePercent;
    }

    public final double getMinBufferMemoryReservePercent() {
        return this.minBufferMemoryReservePercent;
    }

    public final int getMinBufferMs() {
        return this.minBufferMs;
    }

    public final void setBackBufferDurationMs(int i) {
        this.backBufferDurationMs = i;
    }

    public final void setBufferForPlaybackAfterRebufferMs(int i) {
        this.bufferForPlaybackAfterRebufferMs = i;
    }

    public final void setBufferForPlaybackMs(int i) {
        this.bufferForPlaybackMs = i;
    }

    public final void setCacheSize(int i) {
        this.cacheSize = i;
    }

    public final void setInitialBitrate(int i) {
        this.initialBitrate = i;
    }

    public final void setLive(@NotNull Live live) {
        live.getClass();
        this.live = live;
    }

    public final void setMaxBufferMs(int i) {
        this.maxBufferMs = i;
    }

    public final void setMaxHeapAllocationPercent(double d) {
        this.maxHeapAllocationPercent = d;
    }

    public final void setMinBackBufferMemoryReservePercent(double d) {
        this.minBackBufferMemoryReservePercent = d;
    }

    public final void setMinBufferMemoryReservePercent(double d) {
        this.minBufferMemoryReservePercent = d;
    }

    public final void setMinBufferMs(int i) {
        this.minBufferMs = i;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/brentvatne/common/api/BufferConfig$Live;", "", "<init>", "()V", Live.PROP_BUFFER_CONFIG_LIVE_MAX_PLAYBACK_SPEED, "", "getMaxPlaybackSpeed", "()F", "setMaxPlaybackSpeed", "(F)V", Live.PROP_BUFFER_CONFIG_LIVE_MIN_PLAYBACK_SPEED, "getMinPlaybackSpeed", "setMinPlaybackSpeed", Live.PROP_BUFFER_CONFIG_LIVE_MAX_OFFSET_MS, "", "getMaxOffsetMs", "()J", "setMaxOffsetMs", "(J)V", Live.PROP_BUFFER_CONFIG_LIVE_MIN_OFFSET_MS, "getMinOffsetMs", "setMinOffsetMs", Live.PROP_BUFFER_CONFIG_LIVE_TARGET_OFFSET_MS, "getTargetOffsetMs", "setTargetOffsetMs", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Live {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final String PROP_BUFFER_CONFIG_LIVE_MAX_OFFSET_MS = "maxOffsetMs";

        @NotNull
        private static final String PROP_BUFFER_CONFIG_LIVE_MAX_PLAYBACK_SPEED = "maxPlaybackSpeed";

        @NotNull
        private static final String PROP_BUFFER_CONFIG_LIVE_MIN_OFFSET_MS = "minOffsetMs";

        @NotNull
        private static final String PROP_BUFFER_CONFIG_LIVE_MIN_PLAYBACK_SPEED = "minPlaybackSpeed";

        @NotNull
        private static final String PROP_BUFFER_CONFIG_LIVE_TARGET_OFFSET_MS = "targetOffsetMs";
        private long maxOffsetMs;
        private float maxPlaybackSpeed;
        private long minOffsetMs;
        private float minPlaybackSpeed;
        private long targetOffsetMs;

        public Live() {
            Companion companion = BufferConfig.INSTANCE;
            this.maxPlaybackSpeed = (float) companion.getBufferConfigPropUnsetDouble();
            this.minPlaybackSpeed = (float) companion.getBufferConfigPropUnsetDouble();
            this.maxOffsetMs = companion.getBufferConfigPropUnsetInt();
            this.minOffsetMs = companion.getBufferConfigPropUnsetInt();
            this.targetOffsetMs = companion.getBufferConfigPropUnsetInt();
        }

        @JvmStatic
        @NotNull
        public static final Live parse(@Nullable ReadableMap readableMap) {
            return INSTANCE.parse(readableMap);
        }

        public boolean equals(@Nullable Object other) {
            if (other != null && (other instanceof Live)) {
                Live live = (Live) other;
                if (this.maxPlaybackSpeed == live.maxPlaybackSpeed && this.minPlaybackSpeed == live.minPlaybackSpeed && this.maxOffsetMs == live.maxOffsetMs && this.minOffsetMs == live.minOffsetMs && this.targetOffsetMs == live.targetOffsetMs) {
                    return true;
                }
            }
            return false;
        }

        public final long getMaxOffsetMs() {
            return this.maxOffsetMs;
        }

        public final float getMaxPlaybackSpeed() {
            return this.maxPlaybackSpeed;
        }

        public final long getMinOffsetMs() {
            return this.minOffsetMs;
        }

        public final float getMinPlaybackSpeed() {
            return this.minPlaybackSpeed;
        }

        public final long getTargetOffsetMs() {
            return this.targetOffsetMs;
        }

        public final void setMaxOffsetMs(long j) {
            this.maxOffsetMs = j;
        }

        public final void setMaxPlaybackSpeed(float f) {
            this.maxPlaybackSpeed = f;
        }

        public final void setMinOffsetMs(long j) {
            this.minOffsetMs = j;
        }

        public final void setMinPlaybackSpeed(float f) {
            this.minPlaybackSpeed = f;
        }

        public final void setTargetOffsetMs(long j) {
            this.targetOffsetMs = j;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/brentvatne/common/api/BufferConfig$Live$Companion;", "", "<init>", "()V", "PROP_BUFFER_CONFIG_LIVE_MAX_PLAYBACK_SPEED", "", "PROP_BUFFER_CONFIG_LIVE_MIN_PLAYBACK_SPEED", "PROP_BUFFER_CONFIG_LIVE_MAX_OFFSET_MS", "PROP_BUFFER_CONFIG_LIVE_MIN_OFFSET_MS", "PROP_BUFFER_CONFIG_LIVE_TARGET_OFFSET_MS", "parse", "Lcom/brentvatne/common/api/BufferConfig$Live;", "src", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Live parse(@Nullable ReadableMap src) {
                Live live = new Live();
                Companion companion = BufferConfig.INSTANCE;
                live.setMaxPlaybackSpeed(ReactBridgeUtils.safeGetFloat(src, Live.PROP_BUFFER_CONFIG_LIVE_MAX_PLAYBACK_SPEED, (float) companion.getBufferConfigPropUnsetDouble()));
                live.setMinPlaybackSpeed(ReactBridgeUtils.safeGetFloat(src, Live.PROP_BUFFER_CONFIG_LIVE_MIN_PLAYBACK_SPEED, (float) companion.getBufferConfigPropUnsetDouble()));
                live.setMaxOffsetMs(ReactBridgeUtils.safeGetInt(src, Live.PROP_BUFFER_CONFIG_LIVE_MAX_OFFSET_MS, companion.getBufferConfigPropUnsetInt()));
                live.setMinOffsetMs(ReactBridgeUtils.safeGetInt(src, Live.PROP_BUFFER_CONFIG_LIVE_MIN_OFFSET_MS, companion.getBufferConfigPropUnsetInt()));
                live.setTargetOffsetMs(ReactBridgeUtils.safeGetInt(src, Live.PROP_BUFFER_CONFIG_LIVE_TARGET_OFFSET_MS, companion.getBufferConfigPropUnsetInt()));
                return live;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/brentvatne/common/api/BufferConfig$Companion;", "", "<init>", "()V", "BufferConfigPropUnsetInt", "", "getBufferConfigPropUnsetInt", "()I", "BufferConfigPropUnsetDouble", "", "getBufferConfigPropUnsetDouble", "()D", "PROP_BUFFER_CONFIG_CACHE_SIZE", "", "PROP_BUFFER_CONFIG_MIN_BUFFER_MS", "PROP_BUFFER_CONFIG_MAX_BUFFER_MS", "PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS", "PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT", "PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT", "PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT", "PROP_BUFFER_CONFIG_BACK_BUFFER_DURATION_MS", "PROP_BUFFER_CONFIG_INITIAL_BITRATE", "PROP_BUFFER_CONFIG_LIVE", "parse", "Lcom/brentvatne/common/api/BufferConfig;", "src", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double getBufferConfigPropUnsetDouble() {
            return BufferConfig.BufferConfigPropUnsetDouble;
        }

        public final int getBufferConfigPropUnsetInt() {
            return BufferConfig.BufferConfigPropUnsetInt;
        }

        @JvmStatic
        @NotNull
        public final BufferConfig parse(@Nullable ReadableMap src) {
            BufferConfig bufferConfig = new BufferConfig();
            if (src != null) {
                bufferConfig.setCacheSize(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_CACHE_SIZE, getBufferConfigPropUnsetInt()));
                bufferConfig.setMinBufferMs(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_MIN_BUFFER_MS, getBufferConfigPropUnsetInt()));
                bufferConfig.setMaxBufferMs(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_MAX_BUFFER_MS, getBufferConfigPropUnsetInt()));
                bufferConfig.setBufferForPlaybackMs(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS, getBufferConfigPropUnsetInt()));
                bufferConfig.setBufferForPlaybackAfterRebufferMs(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, getBufferConfigPropUnsetInt()));
                bufferConfig.setMaxHeapAllocationPercent(ReactBridgeUtils.safeGetDouble(src, BufferConfig.PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT, getBufferConfigPropUnsetDouble()));
                bufferConfig.setMinBackBufferMemoryReservePercent(ReactBridgeUtils.safeGetDouble(src, BufferConfig.PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT, getBufferConfigPropUnsetDouble()));
                bufferConfig.setMinBufferMemoryReservePercent(ReactBridgeUtils.safeGetDouble(src, BufferConfig.PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT, getBufferConfigPropUnsetDouble()));
                bufferConfig.setBackBufferDurationMs(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_BACK_BUFFER_DURATION_MS, getBufferConfigPropUnsetInt()));
                bufferConfig.setInitialBitrate(ReactBridgeUtils.safeGetInt(src, BufferConfig.PROP_BUFFER_CONFIG_INITIAL_BITRATE, getBufferConfigPropUnsetInt()));
                bufferConfig.setLive(Live.INSTANCE.parse(src.getMap(BufferConfig.PROP_BUFFER_CONFIG_LIVE)));
            }
            return bufferConfig;
        }

        private Companion() {
        }
    }
}
