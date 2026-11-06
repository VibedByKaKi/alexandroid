package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.configuration.MigrationBypassPolicyConfig;
import com.amazon.alexa.mobilytics.event.EventType;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MinervaMigrationPolicy {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BypassMatcher {
        private final Set<String> appComponents;
        private final Set<String> eventNames;
        private final Set<String> subComponents;

        private BypassMatcher(Set<String> set, Set<String> set2, Set<String> set3) {
            this.eventNames = set;
            this.appComponents = set2;
            this.subComponents = set3;
        }

        @Nullable
        public static BypassMatcher from(@Nullable MigrationBypassPolicyConfig.BypassRule bypassRule) {
            if (bypassRule == null) {
                return null;
            }
            Set<String> set = toSet(bypassRule.eventNames);
            Set<String> set2 = toSet(bypassRule.appComponents);
            Set<String> set3 = toSet(bypassRule.subComponents);
            if (set.isEmpty() && set2.isEmpty() && set3.isEmpty()) {
                return null;
            }
            return new BypassMatcher(set, set2, set3);
        }

        private static Set<String> toSet(@Nullable List<String> list) {
            return list == null ? Collections.EMPTY_SET : new HashSet(list);
        }
    }

    private MinervaMigrationPolicy() {
    }

    private static boolean contains(Set<String> set, @Nullable String str) {
        return (str == null || str.isEmpty() || !set.contains(str)) ? false : true;
    }

    public static boolean isBypassedEvent(@NonNull MobilyticsEvent mobilyticsEvent, @Nullable BypassMatcher bypassMatcher) {
        if (bypassMatcher == null) {
            return false;
        }
        return contains(bypassMatcher.eventNames, mobilyticsEvent.getEventName()) || contains(bypassMatcher.appComponents, mobilyticsEvent.getComponent()) || contains(bypassMatcher.subComponents, mobilyticsEvent.getSubComponent());
    }

    public static boolean isKeepKinesisEventType(@NonNull MobilyticsEvent mobilyticsEvent) {
        if (!EventType.OPERATIONAL.equals(mobilyticsEvent.getEventType()) || !(mobilyticsEvent instanceof MobilyticsOperationalEvent)) {
            return false;
        }
        String operationalEventType = ((MobilyticsOperationalEvent) mobilyticsEvent).getOperationalEventType();
        if ("error".equals(operationalEventType) || OperationalEventType.DIAGNOSTIC.equals(operationalEventType) || "data".equals(operationalEventType)) {
            return true;
        }
        return OperationalEventType.SESSION.equals(operationalEventType) && "_session.pause".equals(mobilyticsEvent.getEventName());
    }
}
