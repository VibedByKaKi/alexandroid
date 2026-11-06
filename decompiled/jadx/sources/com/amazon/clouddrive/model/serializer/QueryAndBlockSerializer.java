package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.QueryAndBlock;
import com.amazon.clouddrive.model.QueryFilter;
import java.io.IOException;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class QueryAndBlockSerializer implements JsonSerializer<QueryAndBlock> {
    public static final JsonSerializer<QueryAndBlock> INSTANCE = new QueryAndBlockSerializer();

    private QueryAndBlockSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(QueryAndBlock queryAndBlock, JsonGenerator jsonGenerator) throws IOException {
        if (queryAndBlock == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (queryAndBlock.getFilters() == null) {
            jsonGenerator.writeNull();
        } else {
            Iterator<QueryFilter> it2 = queryAndBlock.getFilters().iterator();
            while (it2.hasNext()) {
                QueryFilterSerializer.INSTANCE.serialize(it2.next(), jsonGenerator);
            }
        }
        jsonGenerator.writeEndObject();
    }
}
