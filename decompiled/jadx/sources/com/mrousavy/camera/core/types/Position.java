package com.mrousavy.camera.core.types;

import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalLensFacing;
import com.amazon.alexa.cantilever.HelpConstants;
import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import com.amazon.alexa.voice.utils.RouteHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/core/types/Position;", "Lcom/mrousavy/camera/core/types/JSUnionValue;", "", "unionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnionValue", "()Ljava/lang/String;", "BACK", "FRONT", SuggestionAction.EXTERNAL, "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Position implements JSUnionValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Position[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String unionValue;
    public static final Position BACK = new Position("BACK", 0, HelpConstants.BACK_ACTION);
    public static final Position FRONT = new Position("FRONT", 1, "front");
    public static final Position EXTERNAL = new Position(SuggestionAction.EXTERNAL, 2, RouteHelper.ROUTE_ORIGIN_EXTERNAL);

    private static final /* synthetic */ Position[] $values() {
        return new Position[]{BACK, FRONT, EXTERNAL};
    }

    static {
        Position[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Position(String str, int i, String str2) {
        this.unionValue = str2;
    }

    @NotNull
    public static EnumEntries<Position> getEntries() {
        return $ENTRIES;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) $VALUES.clone();
    }

    @Override // com.mrousavy.camera.core.types.JSUnionValue
    @NotNull
    public String getUnionValue() {
        return this.unionValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/types/Position$Companion;", "", "<init>", "()V", "fromLensFacing", "Lcom/mrousavy/camera/core/types/Position;", "lensFacing", "", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @OptIn(markerClass = {ExperimentalLensFacing.class})
        @NotNull
        public final Position fromLensFacing(int lensFacing) {
            return lensFacing != -1 ? lensFacing != 0 ? lensFacing != 1 ? lensFacing != 2 ? Position.EXTERNAL : Position.EXTERNAL : Position.BACK : Position.FRONT : Position.EXTERNAL;
        }

        private Companion() {
        }
    }
}
