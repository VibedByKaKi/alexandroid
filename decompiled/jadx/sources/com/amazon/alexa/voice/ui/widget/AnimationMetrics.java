package com.amazon.alexa.voice.ui.widget;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AnimationMetrics {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ListeningState {
        public static final int SCALE_ANIMATOR_DURATION = 66;
        public static final int SCALE_DOWN_ANIMATOR_DURATION = 200;
        public static final Interpolator SCALE_ANIMATOR_INTERPOLATOR = new LinearInterpolator();
        public static final Interpolator SCALE_DOWN_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OpeningState {
        public static final int LEFT_ANIMATOR_DELAY = 0;
        public static final int LEFT_ANIMATOR_DURATION = 500;
        public static final int OPACITY_ANIMATOR_DELAY = 300;
        public static final int OPACITY_ANIMATOR_DURATION = 166;
        public static final int RIGHT_ANIMATOR_DELAY = 0;
        public static final int RIGHT_ANIMATOR_DURATION = 500;
        public static final Interpolator LEFT_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.0f, 0.47f, 0.33f, 1.0f);
        public static final Interpolator RIGHT_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.0f, 0.47f, 0.33f, 1.0f);
        public static final Interpolator OPACITY_ANIMATOR_INTERPOLATOR = new LinearInterpolator();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RespondingState {
        public static final int FIRST_OPACITY_ANIMATOR_DELAY = 0;
        public static final int FIRST_OPACITY_ANIMATOR_DURATION = 916;
        public static final int SECOND_OPACITY_ANIMATOR_DELAY = 916;
        public static final int SECOND_OPACITY_ANIMATOR_DURATION = 916;
        public static final Interpolator FIRST_OPACITY_ANIMATOR_INTERPOLATOR = new PathInterpolator(1.0f, 0.0f, 0.66f, 1.0f);
        public static final Interpolator SECOND_OPACITY_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ThinkingState {
        public static final int FIRST_OPACITY_ANIMATOR_DELAY = 0;
        public static final int FIRST_OPACITY_ANIMATOR_DURATION = 100;
        public static final int SCALE_ANIMATOR_DELAY = 0;
        public static final int SCALE_ANIMATOR_DURATION = 666;
        public static final float SCALE_MAX_VALUE = 1.0f;
        public static final float SCALE_MIN_VALUE = 0.2f;
        public static final int SECOND_OPACITY_ANIMATOR_DELAY = 400;
        public static final int SECOND_OPACITY_ANIMATOR_DURATION = 266;
        public static final Interpolator SCALE_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.17f, 0.04f, 0.33f, 1.0f);
        public static final Interpolator FIRST_OPACITY_ANIMATOR_INTERPOLATOR = new LinearInterpolator();
        public static final Interpolator SECOND_OPACITY_ANIMATOR_INTERPOLATOR = new LinearInterpolator();
    }
}
