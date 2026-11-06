package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadata;
import com.amazon.alexa.mobilytics.event.serializer.DefaultEventSerializer;
import com.amazon.alexa.mobilytics.util.Log;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MinervaFullFidelityEmitter {
    private static final String KEY_CUSTOMER_ENTITLED_BENEFIT = "customer.entitlementStatus.benefitsEntitled";
    private static final String KEY_CUSTOMER_IS_ENTITLED = "customer.entitlementStatus.isEntitled";
    private static final String KEY_ROUTING_MODE = "routingMode";
    private static final String KEY_SHOULD_DROP_LATER = "shouldDropLater";

    @NonNull
    private final DefaultEventSerializer eventSerializer;
    private static final String TAG = Log.tag((Class<?>) MinervaFullFidelityEmitter.class);
    private static final Set<String> PRUNED_SUBTREES = Collections.unmodifiableSet(new HashSet(Arrays.asList("event.eventDetails.metadata", "customer.entitlementStatus", "additionalData.additionalCustomer.entitlementStatus")));
    private static final Map<Class<?>, Field[]> FIELD_CACHE = new ConcurrentHashMap();

    @Inject
    public MinervaFullFidelityEmitter(@NonNull DefaultEventSerializer defaultEventSerializer) {
        this.eventSerializer = defaultEventSerializer;
    }

    private static Field[] accessibleFieldsFor(@NonNull Class<?> cls) {
        Field[] fieldArr = FIELD_CACHE.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getDeclaredFields();
            for (Field field : fieldArr) {
                field.setAccessible(true);
            }
            FIELD_CACHE.put(cls, fieldArr);
        }
        return fieldArr;
    }

    private static void flatten(@NonNull JsonNode jsonNode, @NonNull String str, @NonNull MinervaEventChecker minervaEventChecker) {
        String sb;
        if (jsonNode.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> next = fields.next();
                if (str.isEmpty()) {
                    sb = next.getKey();
                } else {
                    StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
                    m1m.append(next.getKey());
                    sb = m1m.toString();
                }
                if (!PRUNED_SUBTREES.contains(sb)) {
                    flatten(next.getValue(), sb, minervaEventChecker);
                }
            }
            return;
        }
        if (str.isEmpty()) {
            Log.w(TAG, "flatten reached scalar leaf with empty prefix; skipping");
            return;
        }
        if (jsonNode.isTextual()) {
            minervaEventChecker.safeAddString(str, jsonNode.asText());
            return;
        }
        if (jsonNode.isBoolean()) {
            minervaEventChecker.safeAddString(str, String.valueOf(jsonNode.asBoolean()));
        } else if (jsonNode.isIntegralNumber()) {
            minervaEventChecker.addLong(str, jsonNode.asLong());
        } else if (jsonNode.isFloatingPointNumber()) {
            minervaEventChecker.addDouble(str, jsonNode.asDouble());
        }
    }

    private static void populateMetadataReflection(@NonNull MinervaEventChecker minervaEventChecker, @NonNull MobilyticsEvent mobilyticsEvent) {
        String metadataType;
        Collection<EventMetadata> eventMetadata = mobilyticsEvent.getEventMetadata();
        if (eventMetadata == null || eventMetadata.isEmpty()) {
            return;
        }
        for (EventMetadata eventMetadata2 : eventMetadata) {
            if (eventMetadata2 != null && (metadataType = eventMetadata2.getMetadataType()) != null && !metadataType.isEmpty()) {
                for (Field field : accessibleFieldsFor(eventMetadata2.getClass())) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && !"metadataType".equals(field.getName()) && !field.isAnnotationPresent(JsonIgnore.class)) {
                        try {
                            Object obj = field.get(eventMetadata2);
                            if (obj != null) {
                                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("metadata.", metadataType, ".");
                                m2m.append(field.getName());
                                String sb = m2m.toString();
                                if (obj instanceof String) {
                                    minervaEventChecker.safeAddString(sb, (String) obj);
                                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                                    minervaEventChecker.addLong(sb, ((Number) obj).longValue());
                                } else if ((obj instanceof Double) || (obj instanceof Float)) {
                                    minervaEventChecker.addDouble(sb, ((Number) obj).doubleValue());
                                } else if (obj instanceof Boolean) {
                                    minervaEventChecker.safeAddString(sb, obj.toString());
                                } else {
                                    Log.d(TAG, "unsupported metadata field type %s for key %s; dropping", obj.getClass().getSimpleName(), sb);
                                }
                            }
                        } catch (IllegalAccessException e) {
                            Log.e(TAG, e, "reflection get failed on %s.%s", eventMetadata2.getClass().getSimpleName(), field.getName());
                        }
                    }
                }
            }
        }
    }

    public void populate(@NonNull MinervaEventChecker minervaEventChecker, @NonNull MobilyticsEvent mobilyticsEvent, @NonNull String str, boolean z, @Nullable Boolean bool, @Nullable String str2) {
        minervaEventChecker.safeAddString(KEY_ROUTING_MODE, str);
        minervaEventChecker.safeAddString(KEY_SHOULD_DROP_LATER, z ? "true" : "false");
        if (bool != null) {
            minervaEventChecker.safeAddString(KEY_CUSTOMER_IS_ENTITLED, String.valueOf(bool));
        }
        if (str2 != null) {
            minervaEventChecker.safeAddString(KEY_CUSTOMER_ENTITLED_BENEFIT, str2);
        }
        flatten(this.eventSerializer.buildFullEventNode(mobilyticsEvent), "", minervaEventChecker);
        populateMetadataReflection(minervaEventChecker, mobilyticsEvent);
    }
}
