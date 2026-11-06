package com.amazon.alexa.voice.ui.util;

import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BaseProperty {
    private final List<OnChangedListener> changedListenerList = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnChangedListener {
        void onPropertyChanged();
    }

    public final void addOnChangedListener(OnChangedListener onChangedListener) {
        if (onChangedListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("listener == null");
            return;
        }
        synchronized (this.changedListenerList) {
            this.changedListenerList.add(onChangedListener);
        }
    }

    public final int getOnChangedListenerSize() {
        int size;
        synchronized (this.changedListenerList) {
            size = this.changedListenerList.size();
        }
        return size;
    }

    public final void notifyChanged() {
        synchronized (this.changedListenerList) {
            try {
                for (int size = this.changedListenerList.size() - 1; size >= 0; size--) {
                    this.changedListenerList.get(size).onPropertyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeOnChangedListener(OnChangedListener onChangedListener) {
        if (onChangedListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("listener == null");
            return;
        }
        synchronized (this.changedListenerList) {
            this.changedListenerList.remove(onChangedListener);
        }
    }
}
