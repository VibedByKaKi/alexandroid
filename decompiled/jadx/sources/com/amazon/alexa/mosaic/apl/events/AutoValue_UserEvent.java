package com.amazon.alexa.mosaic.apl.events;

import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.events.UserEvent;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_UserEvent extends UserEvent {
    private final List<Object> arguments;
    private final Map<String, Object> components;
    private final Map<String, Object> flags;
    private final Map<String, Object> sources;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UserEvent.Builder {
        private List<Object> arguments;
        private Map<String, Object> components;
        private Map<String, Object> flags;
        private Map<String, Object> sources;

        @Override // com.amazon.alexa.mosaic.apl.events.UserEvent.Builder
        public UserEvent.Builder arguments(List<Object> list) {
            this.arguments = list;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.UserEvent.Builder
        public UserEvent build() {
            return new AutoValue_UserEvent(this.arguments, this.components, this.sources, this.flags, 0);
        }

        @Override // com.amazon.alexa.mosaic.apl.events.UserEvent.Builder
        public UserEvent.Builder components(Map<String, Object> map) {
            this.components = map;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.UserEvent.Builder
        public UserEvent.Builder flags(Map<String, Object> map) {
            this.flags = map;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.UserEvent.Builder
        public UserEvent.Builder sources(Map<String, Object> map) {
            this.sources = map;
            return this;
        }
    }

    private AutoValue_UserEvent(@Nullable List<Object> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2, @Nullable Map<String, Object> map3) {
        this.arguments = list;
        this.components = map;
        this.sources = map2;
        this.flags = map3;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.UserEvent
    @Nullable
    public List<Object> arguments() {
        return this.arguments;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.UserEvent
    @Nullable
    public Map<String, Object> components() {
        return this.components;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserEvent) {
            UserEvent userEvent = (UserEvent) obj;
            List<Object> list = this.arguments;
            if (list != null ? list.equals(userEvent.arguments()) : userEvent.arguments() == null) {
                Map<String, Object> map = this.components;
                if (map != null ? map.equals(userEvent.components()) : userEvent.components() == null) {
                    Map<String, Object> map2 = this.sources;
                    if (map2 != null ? map2.equals(userEvent.sources()) : userEvent.sources() == null) {
                        Map<String, Object> map3 = this.flags;
                        if (map3 != null ? map3.equals(userEvent.flags()) : userEvent.flags() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.UserEvent
    @Nullable
    public Map<String, Object> flags() {
        return this.flags;
    }

    public int hashCode() {
        List<Object> list = this.arguments;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        Map<String, Object> map = this.components;
        int hashCode2 = (hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003;
        Map<String, Object> map2 = this.sources;
        int hashCode3 = (hashCode2 ^ (map2 == null ? 0 : map2.hashCode())) * 1000003;
        Map<String, Object> map3 = this.flags;
        return hashCode3 ^ (map3 != null ? map3.hashCode() : 0);
    }

    @Override // com.amazon.alexa.mosaic.apl.events.UserEvent
    @Nullable
    public Map<String, Object> sources() {
        return this.sources;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserEvent{arguments=");
        sb.append(this.arguments);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(", sources=");
        sb.append(this.sources);
        sb.append(", flags=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.flags, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_UserEvent(List list, Map map, Map map2, Map map3, int i) {
        this(list, map, map2, map3);
    }
}
