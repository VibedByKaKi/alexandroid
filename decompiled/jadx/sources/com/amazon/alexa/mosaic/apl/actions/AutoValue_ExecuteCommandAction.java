package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.ExecuteCommandAction;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_ExecuteCommandAction extends ExecuteCommandAction {
    private final String commands;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ExecuteCommandAction.Builder {
        private String commands;

        @Override // com.amazon.alexa.mosaic.apl.actions.ExecuteCommandAction.Builder
        public ExecuteCommandAction build() {
            String str = this.commands;
            if (str != null) {
                return new AutoValue_ExecuteCommandAction(str, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: commands");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.ExecuteCommandAction.Builder
        public ExecuteCommandAction.Builder commands(String str) {
            if (str != null) {
                this.commands = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null commands");
            return null;
        }
    }

    private AutoValue_ExecuteCommandAction(String str) {
        this.commands = str;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.ExecuteCommandAction
    public String commands() {
        return this.commands;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExecuteCommandAction) {
            return this.commands.equals(((ExecuteCommandAction) obj).commands());
        }
        return false;
    }

    public int hashCode() {
        return this.commands.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ExecuteCommandAction{commands="), this.commands, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ExecuteCommandAction(String str, int i) {
        this(str);
    }
}
