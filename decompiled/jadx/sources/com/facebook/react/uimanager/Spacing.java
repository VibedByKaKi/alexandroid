package com.facebook.react.uimanager;

import com.dee.app.metrics.MetricsConstants;
import com.facebook.yoga.YogaConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/uimanager/Spacing;", "", "defaultValue", "", "spacing", "", "<init>", "(F[F)V", "()V", "(F)V", "original", "(Lcom/facebook/react/uimanager/Spacing;)V", "valueFlags", "", "hasAliasesSet", "", "set", "spacingType", "value", MetricsConstants.Method.CACHE_GET, "getRaw", "reset", "", "getWithFallback", "fallbackType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Spacing {
    public static final int ALL = 8;
    public static final int BLOCK = 9;
    public static final int BLOCK_END = 10;
    public static final int BLOCK_START = 11;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private final float defaultValue;
    private boolean hasAliasesSet;

    @NotNull
    private final float[] spacing;
    private int valueFlags;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] flagsMap = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Spacing(@org.jetbrains.annotations.NotNull com.facebook.react.uimanager.Spacing r4) {
        /*
            r3 = this;
            r4.getClass()
            float r0 = r4.defaultValue
            float[] r1 = r4.spacing
            int r2 = r1.length
            float[] r1 = java.util.Arrays.copyOf(r1, r2)
            r3.<init>(r0, r1)
            int r0 = r4.valueFlags
            r3.valueFlags = r0
            boolean r4 = r4.hasAliasesSet
            r3.hasAliasesSet = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.Spacing.<init>(com.facebook.react.uimanager.Spacing):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float get(int r5) {
        /*
            r4 = this;
            r0 = 4
            if (r5 == r0) goto Lc
            r0 = 5
            if (r5 == r0) goto Lc
            switch(r5) {
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                default: goto L9;
            }
        L9:
            float r0 = r4.defaultValue
            goto Le
        Lc:
            r0 = 2143289344(0x7fc00000, float:NaN)
        Le:
            int r1 = r4.valueFlags
            if (r1 != 0) goto L13
            goto L42
        L13:
            int[] r2 = com.facebook.react.uimanager.Spacing.flagsMap
            r3 = r2[r5]
            r3 = r3 & r1
            if (r3 == 0) goto L1f
            float[] r4 = r4.spacing
            r4 = r4[r5]
            return r4
        L1f:
            boolean r3 = r4.hasAliasesSet
            if (r3 == 0) goto L42
            r3 = 1
            if (r5 == r3) goto L2b
            r3 = 3
            if (r5 == r3) goto L2b
            r5 = 6
            goto L2c
        L2b:
            r5 = 7
        L2c:
            r3 = r2[r5]
            r3 = r3 & r1
            if (r3 == 0) goto L36
            float[] r4 = r4.spacing
            r4 = r4[r5]
            return r4
        L36:
            r5 = 8
            r2 = r2[r5]
            r1 = r1 & r2
            if (r1 == 0) goto L42
            float[] r4 = r4.spacing
            r4 = r4[r5]
            return r4
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.Spacing.get(int):float");
    }

    public final float getRaw(int spacingType) {
        return this.spacing[spacingType];
    }

    public final float getWithFallback(int spacingType, int fallbackType) {
        return (this.valueFlags & flagsMap[spacingType]) != 0 ? this.spacing[spacingType] : get(fallbackType);
    }

    public final void reset() {
        ArraysKt___ArraysJvmKt.fill$default(this.spacing, Float.NaN, 0, 0, 6, (Object) null);
        this.hasAliasesSet = false;
        this.valueFlags = 0;
    }

    public final boolean set(int spacingType, float value) {
        if (FloatUtil.floatsEqual(this.spacing[spacingType], value)) {
            return false;
        }
        this.spacing[spacingType] = value;
        boolean isUndefined = YogaConstants.isUndefined(value);
        int i = this.valueFlags;
        int i2 = isUndefined ? (~flagsMap[spacingType]) & i : flagsMap[spacingType] | i;
        this.valueFlags = i2;
        int[] iArr = flagsMap;
        this.hasAliasesSet = ((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (iArr[6] & i2) == 0 && (i2 & iArr[9]) == 0) ? false : true;
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/Spacing$Companion;", "", "<init>", "()V", "LEFT", "", "TOP", "RIGHT", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "ALL", "BLOCK", "BLOCK_END", "BLOCK_START", "flagsMap", "", "newFullSpacingArray", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] newFullSpacingArray() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private Companion() {
        }
    }

    public Spacing() {
        this(0.0f, INSTANCE.newFullSpacingArray());
    }

    public Spacing(float f) {
        this(f, INSTANCE.newFullSpacingArray());
    }

    public Spacing(float f, @NotNull float[] fArr) {
        fArr.getClass();
        this.defaultValue = f;
        this.spacing = fArr;
    }
}
