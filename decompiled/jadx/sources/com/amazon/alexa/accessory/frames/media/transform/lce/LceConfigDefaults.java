package com.amazon.alexa.accessory.frames.media.transform.lce;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LceConfigDefaults {
    public static final int BRIGHTNESS_DOWNSAMPLE_SIZE = 64;
    public static final float COMPRESS_H_MAX = 32.0f;
    public static final float COMPRESS_H_MIN = 1.0f;
    public static final float COMPRESS_L_MAX = 767.0f;
    public static final float COMPRESS_L_MIN = 1.0f;
    public static final int DISABLE_FAILURE_THRESHOLD = 5;
    public static final int DISABLE_FAILURE_WINDOW = 10;
    public static final int EARLY_TRIP_FAILURE_THRESHOLD = 1;
    public static final int EARLY_TRIP_FAILURE_WINDOW = 1;
    public static final String[] EARLY_TRIP_RENDERER_PATTERNS = {"(?i).*Adreno\\s*\\(TM\\)\\s*660.*"};
    public static final long ENGINE_INIT_DISABLE_TTL_MS = 7776000000L;
    public static final float FACE_AREA_THRESHOLD = 0.35f;
    public static final float FACE_BASED_LCE_GAMMA = 6.0f;
    public static final float FACE_BASED_LCE_SCALE_FACTOR = 200.0f;
    public static final float FACE_BASED_LCE_THRESHOLD = 0.1f;
    public static final boolean FACE_DETECTION_ENABLED = false;
    public static final float GAIN_H_MAX = 25.0f;
    public static final float GAIN_H_MIN = 1.0f;
    public static final float GAIN_L_MAX = 255.0f;
    public static final float GAIN_L_MIN = 1.0f;
    public static final long GPU_DISABLE_TTL_MS = 2592000000L;
    public static final boolean GPU_HALF_PRECISION = false;
    public static final int GUIDED_FILTER_FAST_SUBSAMPLE = 4;
    public static final int GUIDED_FILTER_RADIUS_REF_HEIGHT = 300;
    public static final float GUIDED_FILTER_RADIUS_SCALE = 30.0f;
    public static final float HIGHLIGHT_RAMP_END = 0.35f;
    public static final float HIGHLIGHT_RAMP_START = 0.08f;
    public static final float MAX_HIGHLIGHT_GAIN = 1.02f;
    public static final long MEMORY_HEADROOM_MARGIN_BYTES = 268435456;
    public static final double MIN_RESOLUTION_MEGAPIXELS = 8.0d;
    public static final String MODEL_BASE_PATH = "lce_models";
    public static final int MODEL_INPUT_SIZE = 32;
    public static final int OOM_DISABLE_FAILURE_THRESHOLD = 3;
    public static final int OOM_DISABLE_FAILURE_WINDOW = 5;
    public static final boolean PERSISTENT_DISABLE_ENFORCEMENT_ENABLED = false;
    public static final long RETOUCHER_GPU_TIMEOUT_MS = 15000;

    private LceConfigDefaults() {
    }
}
