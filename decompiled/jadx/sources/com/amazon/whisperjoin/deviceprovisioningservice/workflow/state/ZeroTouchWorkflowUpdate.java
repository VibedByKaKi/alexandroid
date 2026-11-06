package com.amazon.whisperjoin.deviceprovisioningservice.workflow.state;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Objects;
import java.util.Locale;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ZeroTouchWorkflowUpdate {
    private final String mLocalWorkflowIdentifier;
    private final Radio mRadio;
    private final State mState;
    private final Throwable mThrowable;
    private final WorkflowType mWorkflowType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mLocalWorkflowIdentifier;
        private Radio mRadio;
        private State mState;
        private Throwable mThrowable;
        private WorkflowType mWorkflowType;

        public ZeroTouchWorkflowUpdate createZeroTouchWorkflowUpdate() {
            return new ZeroTouchWorkflowUpdate(this.mState, this.mRadio, this.mWorkflowType, this.mLocalWorkflowIdentifier, this.mThrowable, 0);
        }

        public Builder setLocalWorkflowIdentifier(String str) {
            this.mLocalWorkflowIdentifier = str;
            return this;
        }

        public Builder setRadio(Radio radio) {
            this.mRadio = radio;
            return this;
        }

        public Builder setState(State state) {
            this.mState = state;
            return this;
        }

        public Builder setThrowable(Throwable th) {
            this.mThrowable = th;
            return this;
        }

        public Builder setWorkflowType(WorkflowType workflowType) {
            this.mWorkflowType = workflowType;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Radio {
        BLE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        PREPARING,
        CONNECTING,
        PROVISIONING,
        SUCCESS,
        FAILURE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WorkflowType {
        WSS,
        PHILIPS_ZIGBEE
    }

    private ZeroTouchWorkflowUpdate(State state, Radio radio, WorkflowType workflowType, String str, @Nullable Throwable th) {
        this.mState = state;
        this.mRadio = radio;
        this.mWorkflowType = workflowType;
        this.mLocalWorkflowIdentifier = str;
        this.mThrowable = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ZeroTouchWorkflowUpdate zeroTouchWorkflowUpdate = (ZeroTouchWorkflowUpdate) obj;
            if (this.mState == zeroTouchWorkflowUpdate.mState && this.mRadio == zeroTouchWorkflowUpdate.mRadio && this.mWorkflowType == zeroTouchWorkflowUpdate.mWorkflowType && Objects.equal(this.mLocalWorkflowIdentifier, zeroTouchWorkflowUpdate.mLocalWorkflowIdentifier) && Objects.equal(this.mThrowable, zeroTouchWorkflowUpdate.mThrowable)) {
                return true;
            }
        }
        return false;
    }

    public String getFriendlyMessage() {
        Locale locale = Locale.ENGLISH;
        State state = this.mState;
        String name = this.mWorkflowType.name();
        String name2 = this.mRadio.name();
        String str = this.mLocalWorkflowIdentifier;
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        sb.append(state);
        sb.append("] [");
        sb.append(name);
        sb.append("-");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, name2, "-", str, MarkdownConstants.RIGHT_BRACKET);
    }

    public String getLocalWorkflowIdentifier() {
        return this.mLocalWorkflowIdentifier;
    }

    public Radio getRadio() {
        return this.mRadio;
    }

    public State getState() {
        return this.mState;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public WorkflowType getWorkflowType() {
        return this.mWorkflowType;
    }

    public int hashCode() {
        return Objects.hashCode(this.mState, this.mRadio, this.mWorkflowType, this.mLocalWorkflowIdentifier, this.mThrowable);
    }

    public String toString() {
        return "ZeroTouchWorkflowUpdate{mState=" + this.mState + ", mRadio=" + this.mRadio + ", mWorkflowType=" + this.mWorkflowType + ", mLocalWorkflowIdentifier='" + this.mLocalWorkflowIdentifier + "', mThrowable=" + this.mThrowable + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ ZeroTouchWorkflowUpdate(State state, Radio radio, WorkflowType workflowType, String str, Throwable th, int i) {
        this(state, radio, workflowType, str, th);
    }
}
