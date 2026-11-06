package org.hamcrest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Description {
    public static final Description NONE = new NullDescription();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NullDescription implements Description {
        public String toString() {
            return "";
        }

        @Override // org.hamcrest.Description
        public <T> Description appendValueList(String str, String str2, String str3, T... tArr) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendDescriptionOf(SelfDescribing selfDescribing) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendText(String str) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendValue(Object obj) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable) {
            return this;
        }

        @Override // org.hamcrest.Description
        public <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
            return this;
        }
    }

    Description appendDescriptionOf(SelfDescribing selfDescribing);

    Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable);

    Description appendText(String str);

    Description appendValue(Object obj);

    <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable);

    <T> Description appendValueList(String str, String str2, String str3, T... tArr);
}
