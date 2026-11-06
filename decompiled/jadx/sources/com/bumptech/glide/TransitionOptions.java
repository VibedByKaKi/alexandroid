package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private TransitionFactory<? super TranscodeType> transitionFactory = NoTransition.getFactory();

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final CHILD m23873clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @NonNull
    public final CHILD dontTransition() {
        return transition(NoTransition.getFactory());
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionOptions) {
            return Util.bothNullOrEqual(this.transitionFactory, ((TransitionOptions) obj).transitionFactory);
        }
        return false;
    }

    public final TransitionFactory<? super TranscodeType> getTransitionFactory() {
        return this.transitionFactory;
    }

    public int hashCode() {
        TransitionFactory<? super TranscodeType> transitionFactory = this.transitionFactory;
        if (transitionFactory != null) {
            return transitionFactory.hashCode();
        }
        return 0;
    }

    @NonNull
    public final CHILD transition(@NonNull TransitionFactory<? super TranscodeType> transitionFactory) {
        this.transitionFactory = (TransitionFactory) Preconditions.checkNotNull(transitionFactory);
        return self();
    }

    @NonNull
    public final CHILD transition(@NonNull ViewPropertyTransition.Animator animator) {
        return transition(new ViewPropertyAnimationFactory(animator));
    }

    private CHILD self() {
        return this;
    }

    @NonNull
    public final CHILD transition(int i) {
        return transition(new ViewAnimationFactory(i));
    }
}
