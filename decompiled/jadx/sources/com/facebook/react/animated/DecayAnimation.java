package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/animated/DecayAnimation;", "Lcom/facebook/react/animated/AnimationDriver;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "velocity", "", "deceleration", "startFrameTimeMillis", "", "fromValue", "lastValue", "iterations", "", "currentLoop", "resetConfig", "", "runAnimationStep", "frameTimeNanos", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDecayAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecayAnimation.kt\ncom/facebook/react/animated/DecayAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes20.dex */
public final class DecayAnimation extends AnimationDriver {
    private int currentLoop;
    private double deceleration;
    private double fromValue;
    private int iterations;
    private double lastValue;
    private long startFrameTimeMillis;
    private double velocity;

    public DecayAnimation(@NotNull ReadableMap readableMap) {
        readableMap.getClass();
        this.startFrameTimeMillis = -1L;
        this.iterations = 1;
        this.currentLoop = 1;
        resetConfig(readableMap);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(@NotNull ReadableMap config) {
        config.getClass();
        this.velocity = config.getDouble("velocity");
        this.deceleration = config.getDouble("deceleration");
        this.startFrameTimeMillis = -1L;
        this.fromValue = 0.0d;
        this.lastValue = 0.0d;
        int i = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i;
        this.currentLoop = 1;
        this.hasFinished = i == 0;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long frameTimeNanos) {
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Animated value should not be null");
            return;
        }
        long j = frameTimeNanos / 1000000;
        if (this.startFrameTimeMillis == -1) {
            this.startFrameTimeMillis = j - 16;
            double d = this.fromValue;
            if (d == this.lastValue) {
                this.fromValue = valueAnimatedNode.nodeValue;
            } else {
                valueAnimatedNode.nodeValue = d;
            }
            this.lastValue = valueAnimatedNode.nodeValue;
        }
        double d2 = this.fromValue;
        double d3 = this.velocity;
        double d4 = 1;
        double d5 = this.deceleration;
        double exp = ((d4 - Math.exp((-(d4 - d5)) * (j - this.startFrameTimeMillis))) * (d3 / (d4 - d5))) + d2;
        if (Math.abs(this.lastValue - exp) < 0.1d) {
            int i = this.iterations;
            if (i != -1 && this.currentLoop >= i) {
                this.hasFinished = true;
                return;
            } else {
                this.startFrameTimeMillis = -1L;
                this.currentLoop++;
            }
        }
        this.lastValue = exp;
        valueAnimatedNode.nodeValue = exp;
    }
}
