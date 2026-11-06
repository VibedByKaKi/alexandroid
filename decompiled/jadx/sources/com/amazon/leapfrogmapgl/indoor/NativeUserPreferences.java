package com.amazon.leapfrogmapgl.indoor;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;", "", "outdoorCameraAsDevicePin", "", "vegetationVisible", "<init>", "(ZZ)V", "getOutdoorCameraAsDevicePin", "()Z", "getVegetationVisible", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeUserPreferences {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final NativeUserPreferences DEFAULT;
    private final boolean outdoorCameraAsDevicePin;
    private final boolean vegetationVisible;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        boolean z = false;
        DEFAULT = new NativeUserPreferences(z, z, 3, defaultConstructorMarker);
    }

    public /* synthetic */ NativeUserPreferences(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public static /* synthetic */ NativeUserPreferences copy$default(NativeUserPreferences nativeUserPreferences, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nativeUserPreferences.outdoorCameraAsDevicePin;
        }
        if ((i & 2) != 0) {
            z2 = nativeUserPreferences.vegetationVisible;
        }
        return nativeUserPreferences.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOutdoorCameraAsDevicePin() {
        return this.outdoorCameraAsDevicePin;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVegetationVisible() {
        return this.vegetationVisible;
    }

    @NotNull
    public final NativeUserPreferences copy(boolean outdoorCameraAsDevicePin, boolean vegetationVisible) {
        return new NativeUserPreferences(outdoorCameraAsDevicePin, vegetationVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeUserPreferences)) {
            return false;
        }
        NativeUserPreferences nativeUserPreferences = (NativeUserPreferences) other;
        return this.outdoorCameraAsDevicePin == nativeUserPreferences.outdoorCameraAsDevicePin && this.vegetationVisible == nativeUserPreferences.vegetationVisible;
    }

    public final boolean getOutdoorCameraAsDevicePin() {
        return this.outdoorCameraAsDevicePin;
    }

    public final boolean getVegetationVisible() {
        return this.vegetationVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.vegetationVisible) + (Boolean.hashCode(this.outdoorCameraAsDevicePin) * 31);
    }

    @NotNull
    public String toString() {
        return "NativeUserPreferences(outdoorCameraAsDevicePin=" + this.outdoorCameraAsDevicePin + ", vegetationVisible=" + this.vegetationVisible + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;", "getDEFAULT", "()Lcom/amazon/leapfrogmapgl/indoor/NativeUserPreferences;", "from", "obj", "Lorg/json/JSONObject;", "parse", "json", "", "booleanOr", "", "key", "fallback", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNativeUserPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeUserPreferences.kt\ncom/amazon/leapfrogmapgl/indoor/NativeUserPreferences$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean booleanOr(JSONObject obj, String key, boolean fallback) {
            Object opt = obj.opt(key);
            Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
            return bool != null ? bool.booleanValue() : fallback;
        }

        @NotNull
        public final NativeUserPreferences from(@NotNull JSONObject obj) {
            obj.getClass();
            return new NativeUserPreferences(booleanOr(obj, "outdoorCameraAsDevicePin", getDEFAULT().getOutdoorCameraAsDevicePin()), booleanOr(obj, "vegetationVisible", getDEFAULT().getVegetationVisible()));
        }

        @NotNull
        public final NativeUserPreferences getDEFAULT() {
            return NativeUserPreferences.DEFAULT;
        }

        @Nullable
        public final NativeUserPreferences parse(@Nullable String json) {
            Object m25294constructorimpl;
            if (json == null) {
                return null;
            }
            if (json.length() <= 0) {
                json = null;
            }
            if (json == null) {
                return null;
            }
            Companion companion = NativeUserPreferences.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(companion.from(new JSONObject(json)));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            return (NativeUserPreferences) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
        }

        private Companion() {
        }
    }

    public NativeUserPreferences(boolean z, boolean z2) {
        this.outdoorCameraAsDevicePin = z;
        this.vegetationVisible = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NativeUserPreferences() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.leapfrogmapgl.indoor.NativeUserPreferences.<init>():void");
    }
}
