package com.amazonaws.services.s3.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class NotificationConfigurationStaxUnmarshaller<T extends NotificationConfiguration> implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {
    public abstract T createConfiguration();

    public abstract boolean handleXmlEvent(T t, StaxUnmarshallerContext staxUnmarshallerContext, int i) throws Exception;

    @Override // com.amazonaws.transform.Unmarshaller
    public Map.Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i = currentDepth + 2;
        }
        T createConfiguration = createConfiguration();
        String str = null;
        while (true) {
            int nextEvent = staxUnmarshallerContext.nextEvent();
            if (nextEvent == 1) {
                return null;
            }
            if (nextEvent == 2) {
                if (!handleXmlEvent(createConfiguration, staxUnmarshallerContext, i)) {
                    if (staxUnmarshallerContext.testExpression(JsonDocumentFields.POLICY_ID, i)) {
                        str = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                    } else if (staxUnmarshallerContext.testExpression("Event", i)) {
                        createConfiguration.addEvent(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    } else if (staxUnmarshallerContext.testExpression("Filter", i)) {
                        createConfiguration.setFilter(FilterStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    }
                }
            } else if (nextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return new AbstractMap.SimpleEntry(str, createConfiguration);
            }
        }
    }
}
