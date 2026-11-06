package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DropShadowEffect {
    private final AnimatableColorValue color;
    private final AnimatableFloatValue direction;
    private final AnimatableFloatValue distance;
    private final AnimatableFloatValue opacity;
    private final AnimatableFloatValue radius;

    public DropShadowEffect(AnimatableColorValue animatableColorValue, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4) {
        this.color = animatableColorValue;
        this.opacity = animatableFloatValue;
        this.direction = animatableFloatValue2;
        this.distance = animatableFloatValue3;
        this.radius = animatableFloatValue4;
    }

    public AnimatableColorValue getColor() {
        return this.color;
    }

    public AnimatableFloatValue getDirection() {
        return this.direction;
    }

    public AnimatableFloatValue getDistance() {
        return this.distance;
    }

    public AnimatableFloatValue getOpacity() {
        return this.opacity;
    }

    public AnimatableFloatValue getRadius() {
        return this.radius;
    }
}
