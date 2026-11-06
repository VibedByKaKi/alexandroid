package com.amazon.dee.app.elements;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.regulator.ViewController;
import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ReactFeatureViewController extends ViewController {
    private static final String LOG_TAG = "com.amazon.dee.app.elements.ReactFeatureViewController";
    public static final String REACT_FEATURE = "REACT_FEATURE";
    public static final String REACT_FEATURE_STATE = "REACT_FEATURE_STATE";

    @Nullable
    ReactFeature reactFeature;

    public static ReactFeatureViewController create(@NonNull ReactFeature reactFeature) {
        Preconditions.checkNotNull(reactFeature, "reactFeature cannot be null");
        ReactFeatureViewController reactFeatureViewController = new ReactFeatureViewController();
        Bundle bundle = new Bundle();
        bundle.putParcelable(REACT_FEATURE, reactFeature);
        reactFeatureViewController.setArguments(bundle);
        return reactFeatureViewController;
    }

    public ReactFeatureManager getReactFeatureManager() {
        return (ReactFeatureManager) getComponent().get(ReactFeatureManager.class);
    }

    @Override // com.amazon.regulator.ViewController
    @SuppressFBWarnings(justification = "The null check immediately precedes the function call", value = {"NP_NULL_PARAM_DEREF"})
    public void onAttach(View view) {
        Objects.toString(this.reactFeature);
        super.onAttach(view);
        if (this.reactFeature != null) {
            getReactFeatureManager().onFeatureResumed(this.reactFeature);
        }
    }

    @Override // com.amazon.regulator.ViewController
    @SuppressFBWarnings(justification = "The null check immediately precedes the function call", value = {"NP_NULL_PARAM_DEREF"})
    public void onCreate() {
        super.onCreate();
        ReactFeature reactFeature = (ReactFeature) getArguments().getParcelable(REACT_FEATURE);
        if (reactFeature != null) {
            this.reactFeature = reactFeature;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("ReactFeature was null.");
        }
    }

    @Override // com.amazon.regulator.ViewController
    @NonNull
    @SuppressFBWarnings(justification = "The null check immediately precedes the function call", value = {"NP_NULL_PARAM_DEREF"})
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        String str = LOG_TAG;
        if (this.reactFeature == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("ReactFeature was null.");
            return null;
        }
        View onFeatureResumed = getReactFeatureManager().onFeatureResumed(this.reactFeature);
        if (onFeatureResumed == null) {
            Log.e(str, "onFeatureResumed returned null, using placeholder for: " + this.reactFeature);
            return new FrameLayout(layoutInflater.getContext());
        }
        ViewParent parent = onFeatureResumed.getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(onFeatureResumed);
        }
        return onFeatureResumed;
    }

    @Override // com.amazon.regulator.ViewController
    @SuppressFBWarnings(justification = "The null check immediately precedes the function call", value = {"NP_NULL_PARAM_DEREF"})
    public void onDestroy() {
        Objects.toString(this.reactFeature);
        super.onDestroy();
        if (this.reactFeature != null) {
            getReactFeatureManager().onFeatureDestroyed(this.reactFeature);
        }
    }

    @Override // com.amazon.regulator.ViewController
    public void onDestroyView(View view) {
        Objects.toString(this.reactFeature);
        super.onDestroyView(view);
    }

    @Override // com.amazon.regulator.ViewController
    @SuppressFBWarnings(justification = "The null check immediately precedes the function call", value = {"NP_NULL_PARAM_DEREF"})
    public void onDetach(View view) {
        Objects.toString(this.reactFeature);
        super.onDetach(view);
        if (this.reactFeature != null) {
            getReactFeatureManager().onFeatureBackgrounded(this.reactFeature);
        }
    }

    @Override // com.amazon.regulator.ViewController
    public void onRestoreViewState(View view, Bundle bundle) {
        super.onRestoreViewState(view, bundle);
    }

    @Override // com.amazon.regulator.ViewController
    public void onSaveViewState(View view, Bundle bundle) {
        Objects.toString(this.reactFeature);
        super.onSaveViewState(view, bundle);
        bundle.putParcelable(REACT_FEATURE_STATE, this.reactFeature);
    }
}
