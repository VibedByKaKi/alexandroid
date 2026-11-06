package com.swmansion.gesturehandler.core;

import android.view.VelocityTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0000H\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/swmansion/gesturehandler/core/Vector;", "", "x", "", "y", "<init>", "(DD)V", "getX", "()D", "getY", "unitX", "unitY", "magnitude", "getMagnitude", "computeSimilarity", "vector", "isSimilar", "", "threshold", "Companion", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Vector {
    private static final double MINIMAL_RECOGNIZABLE_MAGNITUDE = 0.1d;
    private final double magnitude;
    private final double unitX;
    private final double unitY;
    private final double x;
    private final double y;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Vector VECTOR_LEFT = new Vector(-1.0d, 0.0d);

    @NotNull
    private static final Vector VECTOR_RIGHT = new Vector(1.0d, 0.0d);

    @NotNull
    private static final Vector VECTOR_UP = new Vector(0.0d, -1.0d);

    @NotNull
    private static final Vector VECTOR_DOWN = new Vector(0.0d, 1.0d);

    @NotNull
    private static final Vector VECTOR_RIGHT_UP = new Vector(1.0d, -1.0d);

    @NotNull
    private static final Vector VECTOR_RIGHT_DOWN = new Vector(1.0d, 1.0d);

    @NotNull
    private static final Vector VECTOR_LEFT_UP = new Vector(-1.0d, -1.0d);

    @NotNull
    private static final Vector VECTOR_LEFT_DOWN = new Vector(-1.0d, 1.0d);

    @NotNull
    private static final Vector VECTOR_ZERO = new Vector(0.0d, 0.0d);

    public Vector(double d, double d2) {
        this.x = d;
        this.y = d2;
        double hypot = Math.hypot(d, d2);
        this.magnitude = hypot;
        boolean z = hypot > 0.1d;
        this.unitX = z ? d / hypot : 0.0d;
        this.unitY = z ? d2 / hypot : 0.0d;
    }

    private final double computeSimilarity(Vector vector) {
        return (this.unitY * vector.unitY) + (this.unitX * vector.unitX);
    }

    public final double getMagnitude() {
        return this.magnitude;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final boolean isSimilar(@NotNull Vector vector, double threshold) {
        vector.getClass();
        return computeSimilarity(vector) > threshold;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/swmansion/gesturehandler/core/Vector$Companion;", "", "<init>", "()V", "VECTOR_LEFT", "Lcom/swmansion/gesturehandler/core/Vector;", "VECTOR_RIGHT", "VECTOR_UP", "VECTOR_DOWN", "VECTOR_RIGHT_UP", "VECTOR_RIGHT_DOWN", "VECTOR_LEFT_UP", "VECTOR_LEFT_DOWN", "VECTOR_ZERO", "MINIMAL_RECOGNIZABLE_MAGNITUDE", "", "fromDirection", "direction", "", "fromVelocity", "tracker", "Landroid/view/VelocityTracker;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Vector fromDirection(int direction) {
            switch (direction) {
                case 1:
                    return Vector.VECTOR_RIGHT;
                case 2:
                    return Vector.VECTOR_LEFT;
                case 3:
                case 7:
                default:
                    return Vector.VECTOR_ZERO;
                case 4:
                    return Vector.VECTOR_UP;
                case 5:
                    return Vector.VECTOR_RIGHT_UP;
                case 6:
                    return Vector.VECTOR_LEFT_UP;
                case 8:
                    return Vector.VECTOR_DOWN;
                case 9:
                    return Vector.VECTOR_RIGHT_DOWN;
                case 10:
                    return Vector.VECTOR_LEFT_DOWN;
            }
        }

        @NotNull
        public final Vector fromVelocity(@NotNull VelocityTracker tracker) {
            tracker.getClass();
            tracker.computeCurrentVelocity(1000);
            return new Vector(tracker.getXVelocity(), tracker.getYVelocity());
        }

        private Companion() {
        }
    }
}
