package com.amazon.whisperjoin.deviceprovisioningservice.workflow.state;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Event<T> {
    public final T data;
    public final Throwable error;
    public final State state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        IDLE,
        IN_PROGRESS,
        UPDATE,
        SUCCESS,
        ERROR
    }

    public Event(T t, State state, Throwable th) {
        this.data = t;
        this.state = state;
        this.error = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Event event = (Event) obj;
            T t = this.data;
            T t2 = event.data;
            if (t == null ? t2 != null : !t.equals(t2)) {
                return false;
            }
            Throwable th = this.error;
            Throwable th2 = event.error;
            if (th == null ? th2 != null : !th.equals(th2)) {
                return false;
            }
            if (this.state == event.state) {
                return true;
            }
        }
        return false;
    }

    public T getData() {
        return this.data;
    }

    public Throwable getError() {
        return this.error;
    }

    public State getState() {
        return this.state;
    }

    public int hashCode() {
        T t = this.data;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Throwable th = this.error;
        return this.state.hashCode() + ((hashCode + (th != null ? th.hashCode() : 0)) * 31);
    }

    public boolean isState(State state) {
        return state.equals(this.state);
    }

    public String toString() {
        return "Event{data=" + this.data + ", error=" + this.error + ", state=" + this.state + AbstractJsonLexerKt.END_OBJ;
    }
}
