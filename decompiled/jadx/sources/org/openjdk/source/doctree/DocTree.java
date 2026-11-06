package org.openjdk.source.doctree;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DocTree {
    <R, D> R accept(DocTreeVisitor<R, D> docTreeVisitor, D d);

    Kind getKind();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        ATTRIBUTE,
        AUTHOR("author"),
        CODE("code"),
        COMMENT,
        DEPRECATED("deprecated"),
        DOC_COMMENT,
        DOC_ROOT("docRoot"),
        END_ELEMENT,
        ENTITY,
        ERRONEOUS,
        EXCEPTION(AuthorizationDelegateAdapter.FAILURE_EXCEPTION),
        HIDDEN("hidden"),
        IDENTIFIER,
        INDEX("index"),
        INHERIT_DOC("inheritDoc"),
        LINK("link"),
        LINK_PLAIN("linkplain"),
        LITERAL("literal"),
        PARAM("param"),
        PROVIDES("provides"),
        REFERENCE,
        RETURN("return"),
        SEE("see"),
        SERIAL("serial"),
        SERIAL_DATA("serialData"),
        SERIAL_FIELD("serialField"),
        SINCE("since"),
        START_ELEMENT,
        TEXT,
        THROWS("throws"),
        UNKNOWN_BLOCK_TAG,
        UNKNOWN_INLINE_TAG,
        USES("uses"),
        VALUE("value"),
        VERSION("version"),
        OTHER;

        public final String tagName;

        Kind() {
            this.tagName = null;
        }

        Kind(String str) {
            this.tagName = str;
        }
    }
}
