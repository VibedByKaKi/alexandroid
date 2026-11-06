package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DynamoDBAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DynamoDBActionJsonMarshaller {
    private static DynamoDBActionJsonMarshaller instance;

    public static DynamoDBActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DynamoDBActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DynamoDBAction dynamoDBAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (dynamoDBAction.getTableName() != null) {
            String tableName = dynamoDBAction.getTableName();
            awsJsonWriter.name("tableName");
            awsJsonWriter.value(tableName);
        }
        if (dynamoDBAction.getRoleArn() != null) {
            String roleArn = dynamoDBAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (dynamoDBAction.getOperation() != null) {
            String operation = dynamoDBAction.getOperation();
            awsJsonWriter.name("operation");
            awsJsonWriter.value(operation);
        }
        if (dynamoDBAction.getHashKeyField() != null) {
            String hashKeyField = dynamoDBAction.getHashKeyField();
            awsJsonWriter.name("hashKeyField");
            awsJsonWriter.value(hashKeyField);
        }
        if (dynamoDBAction.getHashKeyValue() != null) {
            String hashKeyValue = dynamoDBAction.getHashKeyValue();
            awsJsonWriter.name("hashKeyValue");
            awsJsonWriter.value(hashKeyValue);
        }
        if (dynamoDBAction.getHashKeyType() != null) {
            String hashKeyType = dynamoDBAction.getHashKeyType();
            awsJsonWriter.name("hashKeyType");
            awsJsonWriter.value(hashKeyType);
        }
        if (dynamoDBAction.getRangeKeyField() != null) {
            String rangeKeyField = dynamoDBAction.getRangeKeyField();
            awsJsonWriter.name("rangeKeyField");
            awsJsonWriter.value(rangeKeyField);
        }
        if (dynamoDBAction.getRangeKeyValue() != null) {
            String rangeKeyValue = dynamoDBAction.getRangeKeyValue();
            awsJsonWriter.name("rangeKeyValue");
            awsJsonWriter.value(rangeKeyValue);
        }
        if (dynamoDBAction.getRangeKeyType() != null) {
            String rangeKeyType = dynamoDBAction.getRangeKeyType();
            awsJsonWriter.name("rangeKeyType");
            awsJsonWriter.value(rangeKeyType);
        }
        if (dynamoDBAction.getPayloadField() != null) {
            String payloadField = dynamoDBAction.getPayloadField();
            awsJsonWriter.name("payloadField");
            awsJsonWriter.value(payloadField);
        }
        awsJsonWriter.endObject();
    }
}
