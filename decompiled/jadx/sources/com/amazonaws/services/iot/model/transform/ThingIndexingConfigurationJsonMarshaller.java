package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Field;
import com.amazonaws.services.iot.model.IndexingFilter;
import com.amazonaws.services.iot.model.ThingIndexingConfiguration;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingIndexingConfigurationJsonMarshaller {
    private static ThingIndexingConfigurationJsonMarshaller instance;

    public static ThingIndexingConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingIndexingConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingIndexingConfiguration thingIndexingConfiguration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingIndexingConfiguration.getThingIndexingMode() != null) {
            String thingIndexingMode = thingIndexingConfiguration.getThingIndexingMode();
            awsJsonWriter.name("thingIndexingMode");
            awsJsonWriter.value(thingIndexingMode);
        }
        if (thingIndexingConfiguration.getThingConnectivityIndexingMode() != null) {
            String thingConnectivityIndexingMode = thingIndexingConfiguration.getThingConnectivityIndexingMode();
            awsJsonWriter.name("thingConnectivityIndexingMode");
            awsJsonWriter.value(thingConnectivityIndexingMode);
        }
        if (thingIndexingConfiguration.getDeviceDefenderIndexingMode() != null) {
            String deviceDefenderIndexingMode = thingIndexingConfiguration.getDeviceDefenderIndexingMode();
            awsJsonWriter.name("deviceDefenderIndexingMode");
            awsJsonWriter.value(deviceDefenderIndexingMode);
        }
        if (thingIndexingConfiguration.getNamedShadowIndexingMode() != null) {
            String namedShadowIndexingMode = thingIndexingConfiguration.getNamedShadowIndexingMode();
            awsJsonWriter.name("namedShadowIndexingMode");
            awsJsonWriter.value(namedShadowIndexingMode);
        }
        if (thingIndexingConfiguration.getManagedFields() != null) {
            List<Field> managedFields = thingIndexingConfiguration.getManagedFields();
            awsJsonWriter.name("managedFields");
            awsJsonWriter.beginArray();
            for (Field field : managedFields) {
                if (field != null) {
                    FieldJsonMarshaller.getInstance().marshall(field, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (thingIndexingConfiguration.getCustomFields() != null) {
            List<Field> customFields = thingIndexingConfiguration.getCustomFields();
            awsJsonWriter.name("customFields");
            awsJsonWriter.beginArray();
            for (Field field2 : customFields) {
                if (field2 != null) {
                    FieldJsonMarshaller.getInstance().marshall(field2, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (thingIndexingConfiguration.getFilter() != null) {
            IndexingFilter filter = thingIndexingConfiguration.getFilter();
            awsJsonWriter.name("filter");
            IndexingFilterJsonMarshaller.getInstance().marshall(filter, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
