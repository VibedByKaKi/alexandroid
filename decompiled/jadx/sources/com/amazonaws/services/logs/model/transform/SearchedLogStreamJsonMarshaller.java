package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.SearchedLogStream;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SearchedLogStreamJsonMarshaller {
    private static SearchedLogStreamJsonMarshaller instance;

    public static SearchedLogStreamJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedLogStreamJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SearchedLogStream searchedLogStream, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (searchedLogStream.getLogStreamName() != null) {
            String logStreamName = searchedLogStream.getLogStreamName();
            awsJsonWriter.name("logStreamName");
            awsJsonWriter.value(logStreamName);
        }
        if (searchedLogStream.getSearchedCompletely() != null) {
            Boolean searchedCompletely = searchedLogStream.getSearchedCompletely();
            awsJsonWriter.name("searchedCompletely");
            awsJsonWriter.value(searchedCompletely.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
