package org.apache.logging.log4j.message;

import java.util.Map;
import org.apache.logging.log4j.util.PerformanceSensitive;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AsynchronouslyFormattable
@PerformanceSensitive({"allocation"})
/* loaded from: classes11.dex */
public class StringMapMessage extends MapMessage<StringMapMessage, String> {
    private static final long serialVersionUID = 1;

    public StringMapMessage() {
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public StringMapMessage newInstance(Map<String, String> map) {
        return new StringMapMessage(map);
    }

    public StringMapMessage(int i) {
        super(i);
    }

    public StringMapMessage(Map<String, String> map) {
        super(map);
    }
}
