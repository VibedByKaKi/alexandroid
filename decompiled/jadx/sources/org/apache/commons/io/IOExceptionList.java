package org.apache.commons.io;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class IOExceptionList extends IOException {
    private static final long serialVersionUID = 1;
    private final List<? extends Throwable> causeList;

    public IOExceptionList(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        this.causeList = list == null ? Collections.EMPTY_LIST : list;
    }

    public <T extends Throwable> T getCause(int i, Class<T> cls) {
        return cls.cast(this.causeList.get(i));
    }

    public <T extends Throwable> List<T> getCauseList() {
        return (List<T>) this.causeList;
    }

    public <T extends Throwable> List<T> getCauseList(Class<T> cls) {
        return (List<T>) this.causeList;
    }

    public <T extends Throwable> T getCause(int i) {
        return (T) this.causeList.get(i);
    }

    public IOExceptionList(List<? extends Throwable> list) {
        this(String.format("%,d exceptions: %s", Integer.valueOf(list == null ? 0 : list.size()), list), list);
    }
}
