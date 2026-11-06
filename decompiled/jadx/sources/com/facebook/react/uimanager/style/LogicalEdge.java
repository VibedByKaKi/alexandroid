package com.facebook.react.uimanager.style;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/style/LogicalEdge;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "LEFT", "RIGHT", "TOP", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "BLOCK_START", "BLOCK_END", "BLOCK", "toSpacingType", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LogicalEdge {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogicalEdge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final LogicalEdge ALL = new LogicalEdge("ALL", 0) { // from class: com.facebook.react.uimanager.style.LogicalEdge.ALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 8;
        }
    };
    public static final LogicalEdge LEFT = new LogicalEdge("LEFT", 1) { // from class: com.facebook.react.uimanager.style.LogicalEdge.LEFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 0;
        }
    };
    public static final LogicalEdge RIGHT = new LogicalEdge("RIGHT", 2) { // from class: com.facebook.react.uimanager.style.LogicalEdge.RIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 2;
        }
    };
    public static final LogicalEdge TOP = new LogicalEdge("TOP", 3) { // from class: com.facebook.react.uimanager.style.LogicalEdge.TOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 1;
        }
    };
    public static final LogicalEdge BOTTOM = new LogicalEdge("BOTTOM", 4) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BOTTOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 3;
        }
    };
    public static final LogicalEdge START = new LogicalEdge("START", 5) { // from class: com.facebook.react.uimanager.style.LogicalEdge.START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 4;
        }
    };
    public static final LogicalEdge END = new LogicalEdge("END", 6) { // from class: com.facebook.react.uimanager.style.LogicalEdge.END
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 5;
        }
    };
    public static final LogicalEdge HORIZONTAL = new LogicalEdge("HORIZONTAL", 7) { // from class: com.facebook.react.uimanager.style.LogicalEdge.HORIZONTAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 6;
        }
    };
    public static final LogicalEdge VERTICAL = new LogicalEdge("VERTICAL", 8) { // from class: com.facebook.react.uimanager.style.LogicalEdge.VERTICAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 7;
        }
    };
    public static final LogicalEdge BLOCK_START = new LogicalEdge("BLOCK_START", 9) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK_START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 11;
        }
    };
    public static final LogicalEdge BLOCK_END = new LogicalEdge("BLOCK_END", 10) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK_END
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 10;
        }
    };
    public static final LogicalEdge BLOCK = new LogicalEdge("BLOCK", 11) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 9;
        }
    };

    private static final /* synthetic */ LogicalEdge[] $values() {
        return new LogicalEdge[]{ALL, LEFT, RIGHT, TOP, BOTTOM, START, END, HORIZONTAL, VERTICAL, BLOCK_START, BLOCK_END, BLOCK};
    }

    static {
        LogicalEdge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ LogicalEdge(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @JvmStatic
    @NotNull
    public static final LogicalEdge fromSpacingType(int i) {
        return INSTANCE.fromSpacingType(i);
    }

    @NotNull
    public static EnumEntries<LogicalEdge> getEntries() {
        return $ENTRIES;
    }

    public static LogicalEdge valueOf(String str) {
        return (LogicalEdge) Enum.valueOf(LogicalEdge.class, str);
    }

    public static LogicalEdge[] values() {
        return (LogicalEdge[]) $VALUES.clone();
    }

    public abstract int toSpacingType();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LogicalEdge$Companion;", "", "<init>", "()V", "fromSpacingType", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "spacingType", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LogicalEdge fromSpacingType(int spacingType) {
            switch (spacingType) {
                case 0:
                    return LogicalEdge.LEFT;
                case 1:
                    return LogicalEdge.TOP;
                case 2:
                    return LogicalEdge.RIGHT;
                case 3:
                    return LogicalEdge.BOTTOM;
                case 4:
                    return LogicalEdge.START;
                case 5:
                    return LogicalEdge.END;
                case 6:
                    return LogicalEdge.HORIZONTAL;
                case 7:
                    return LogicalEdge.VERTICAL;
                case 8:
                    return LogicalEdge.ALL;
                case 9:
                    return LogicalEdge.BLOCK;
                case 10:
                    return LogicalEdge.BLOCK_END;
                case 11:
                    return LogicalEdge.BLOCK_START;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(spacingType, "Unknown spacing type: "));
                    return null;
            }
        }

        private Companion() {
        }
    }

    private LogicalEdge(String str, int i) {
    }
}
