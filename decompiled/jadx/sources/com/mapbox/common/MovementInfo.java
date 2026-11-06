package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class MovementInfo implements Serializable {

    @NonNull
    private final HashMap<MovementMode, Integer> movementMode;

    @NonNull
    private final MovementModeProvider movementProvider;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MovementInfo(@NonNull HashMap<MovementMode, Integer> hashMap, @NonNull MovementModeProvider movementModeProvider) {
        this.movementMode = hashMap;
        this.movementProvider = movementModeProvider;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MovementInfo movementInfo = (MovementInfo) obj;
        return Objects.equals(this.movementMode, movementInfo.movementMode) && Objects.equals(this.movementProvider, movementInfo.movementProvider);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HashMap<MovementMode, Integer> getMovementMode() {
        return this.movementMode;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MovementModeProvider getMovementProvider() {
        return this.movementProvider;
    }

    public int hashCode() {
        return Objects.hash(this.movementMode, this.movementProvider);
    }

    public String toString() {
        return "[movementMode: " + RecordUtils.fieldToString(this.movementMode) + ", movementProvider: " + RecordUtils.fieldToString(this.movementProvider) + MarkdownConstants.RIGHT_BRACKET;
    }
}
