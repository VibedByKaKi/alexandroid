package com.amazon.comms.models.sip;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.presence.service.PresenceBleService;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StateTransitionTimeoutRule {
    private static final Map<String, List<String>> CONVERSION_MAP = new HashMap();

    @JsonIgnore
    private boolean isHalloV2;
    private List<String> timeoutEndStates;
    private int timeoutInMilliseconds;
    private String timeoutStartState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class StateTransitionTimeoutRuleBuilder {
        private boolean isHalloV2;
        private List<String> timeoutEndStates;
        private int timeoutInMilliseconds;
        private String timeoutStartState;

        public StateTransitionTimeoutRule build() {
            StateTransitionTimeoutRule.CONVERSION_MAP.put("INACTIVE", new ArrayList(Arrays.asList("UNREGISTERED", WifiConnectionState.IDLE, PresenceBleService.ServiceState.STOPPING)));
            StateTransitionTimeoutRule.CONVERSION_MAP.put("CALLING", new ArrayList(Arrays.asList("TRYING", "INVITED")));
            StateTransitionTimeoutRule.CONVERSION_MAP.put("OUTBOUND_RINGING", new ArrayList(Arrays.asList("OUTBOUND_LOCAL_RINGING", "OUTBOUND_PROVIDER_RINGING")));
            StateTransitionTimeoutRule.CONVERSION_MAP.put("INBOUND_RINGING", new ArrayList(Arrays.asList("INBOUND_RINGING")));
            StateTransitionTimeoutRule.CONVERSION_MAP.put("ACTIVE", new ArrayList(Arrays.asList("ACTIVE")));
            return new StateTransitionTimeoutRule(this.timeoutStartState, this.timeoutEndStates, this.timeoutInMilliseconds, this.isHalloV2, 0);
        }

        @JsonIgnore
        public StateTransitionTimeoutRuleBuilder isHalloV2(boolean z) {
            this.isHalloV2 = z;
            return this;
        }

        public StateTransitionTimeoutRuleBuilder timeoutEndStates(List<String> list) {
            this.timeoutEndStates = list;
            return this;
        }

        public StateTransitionTimeoutRuleBuilder timeoutInMilliseconds(int i) {
            this.timeoutInMilliseconds = i;
            return this;
        }

        public StateTransitionTimeoutRuleBuilder timeoutStartState(String str) {
            this.timeoutStartState = str;
            return this;
        }

        public String toString() {
            String str = this.timeoutStartState;
            String valueOf = String.valueOf(this.timeoutEndStates);
            int i = this.timeoutInMilliseconds;
            boolean z = this.isHalloV2;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("StateTransitionTimeoutRule.StateTransitionTimeoutRuleBuilder(timeoutStartState=", str, ", timeoutEndStates=", valueOf, ", timeoutInMilliseconds=");
            m.append(i);
            m.append(", isHalloV2=");
            m.append(z);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }
    }

    private StateTransitionTimeoutRule(String str, List<String> list, int i, boolean z) {
        this.timeoutStartState = str;
        this.timeoutEndStates = list;
        this.timeoutInMilliseconds = i;
        this.isHalloV2 = z;
    }

    public static StateTransitionTimeoutRuleBuilder builder() {
        return new StateTransitionTimeoutRuleBuilder();
    }

    @JsonIgnore
    private List<String> getV2States(String str) {
        return CONVERSION_MAP.get(str);
    }

    public boolean canEqual(Object obj) {
        return obj instanceof StateTransitionTimeoutRule;
    }

    @JsonIgnore
    public Optional<List<StateTransitionTimeoutRule>> convertToHalloV2() {
        if (this.isHalloV2) {
            return Optional.empty();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : getV2States(this.timeoutStartState)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it2 = this.timeoutEndStates.iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(getV2States(it2.next()));
            }
            arrayList.add(builder().timeoutStartState(str).timeoutEndStates(arrayList2).timeoutInMilliseconds(this.timeoutInMilliseconds).isHalloV2(true).build());
        }
        return Optional.of(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateTransitionTimeoutRule)) {
            return false;
        }
        StateTransitionTimeoutRule stateTransitionTimeoutRule = (StateTransitionTimeoutRule) obj;
        if (!stateTransitionTimeoutRule.canEqual(this) || getTimeoutInMilliseconds() != stateTransitionTimeoutRule.getTimeoutInMilliseconds() || getIsHalloV2() != stateTransitionTimeoutRule.getIsHalloV2()) {
            return false;
        }
        String timeoutStartState = getTimeoutStartState();
        String timeoutStartState2 = stateTransitionTimeoutRule.getTimeoutStartState();
        if (timeoutStartState != null ? !timeoutStartState.equals(timeoutStartState2) : timeoutStartState2 != null) {
            return false;
        }
        List<String> timeoutEndStates = getTimeoutEndStates();
        List<String> timeoutEndStates2 = stateTransitionTimeoutRule.getTimeoutEndStates();
        return timeoutEndStates != null ? timeoutEndStates.equals(timeoutEndStates2) : timeoutEndStates2 == null;
    }

    public boolean getIsHalloV2() {
        return this.isHalloV2;
    }

    public List<String> getTimeoutEndStates() {
        return this.timeoutEndStates;
    }

    public int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public String getTimeoutStartState() {
        return this.timeoutStartState;
    }

    public int hashCode() {
        int timeoutInMilliseconds = ((getTimeoutInMilliseconds() + 59) * 59) + (getIsHalloV2() ? 79 : 97);
        String timeoutStartState = getTimeoutStartState();
        int i = timeoutInMilliseconds * 59;
        int hashCode = timeoutStartState == null ? 43 : timeoutStartState.hashCode();
        List<String> timeoutEndStates = getTimeoutEndStates();
        return ((i + hashCode) * 59) + (timeoutEndStates != null ? timeoutEndStates.hashCode() : 43);
    }

    @JsonIgnore
    public void setIsHalloV2(boolean z) {
        this.isHalloV2 = z;
    }

    public void setTimeoutEndStates(List<String> list) {
        this.timeoutEndStates = list;
    }

    public void setTimeoutInMilliseconds(int i) {
        this.timeoutInMilliseconds = i;
    }

    public void setTimeoutStartState(String str) {
        this.timeoutStartState = str;
    }

    public String toString() {
        String timeoutStartState = getTimeoutStartState();
        String valueOf = String.valueOf(getTimeoutEndStates());
        int timeoutInMilliseconds = getTimeoutInMilliseconds();
        boolean isHalloV2 = getIsHalloV2();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("StateTransitionTimeoutRule(timeoutStartState=", timeoutStartState, ", timeoutEndStates=", valueOf, ", timeoutInMilliseconds=");
        m.append(timeoutInMilliseconds);
        m.append(", isHalloV2=");
        m.append(isHalloV2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public StateTransitionTimeoutRule() {
        this.isHalloV2 = false;
    }

    public /* synthetic */ StateTransitionTimeoutRule(String str, List list, int i, boolean z, int i2) {
        this(str, list, i, z);
    }
}
